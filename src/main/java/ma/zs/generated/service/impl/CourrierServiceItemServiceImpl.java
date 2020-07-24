package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.CourrierServiceItem;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.dao.CourrierServiceItemDao;
import ma.zs.generated.service.facade.CourrierServiceItemService;
import ma.zs.generated.service.facade.LeServiceService;

import ma.zs.generated.ws.rest.provided.vo.CourrierServiceItemVo;
import ma.zs.generated.service.util.*;

@Service
public class CourrierServiceItemServiceImpl extends AbstractService<CourrierServiceItem> implements CourrierServiceItemService {

    @Autowired
    private CourrierServiceItemDao courrierServiceItemDao;


    @Autowired
    private LeServiceService leServiceService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<CourrierServiceItem> findAll() {
        return courrierServiceItemDao.findAll();
    }

    @Override
    public List<CourrierServiceItem> findByCourrierIdCourrier(String idCourrier) {
        return courrierServiceItemDao.findByCourrierIdCourrier(idCourrier);
    }

    @Override
    @Transactional
    public int deleteByCourrierIdCourrier(String idCourrier) {
        return courrierServiceItemDao.deleteByCourrierIdCourrier(idCourrier);
    }

    @Override
    public List<CourrierServiceItem> findByCourrierId(Long id) {
        return courrierServiceItemDao.findByCourrierId(id);

    }

    @Override
    @Transactional
    public int deleteByCourrierId(Long id) {
        return courrierServiceItemDao.deleteByCourrierId(id);

    }

    @Override
    public List<CourrierServiceItem> findByServiceTitle(String title) {
        return courrierServiceItemDao.findByServiceTitle(title);
    }

    @Override
    @Transactional
    public int deleteByServiceTitle(String title) {
        return courrierServiceItemDao.deleteByServiceTitle(title);
    }

    @Override
    public List<CourrierServiceItem> findByServiceId(Long id) {
        return courrierServiceItemDao.findByServiceId(id);

    }

    @Override
    @Transactional
    public int deleteByServiceId(Long id) {
        return courrierServiceItemDao.deleteByServiceId(id);

    }


    @Override
    public CourrierServiceItem findById(Long id) {
        if (id == null)
            return null;
        return courrierServiceItemDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        courrierServiceItemDao.deleteById(id);
    }

    @Override
    public CourrierServiceItem save(CourrierServiceItem courrierServiceItem) {

        if (courrierServiceItem.getService() != null) {
            LeService service = leServiceService.findByTitle(courrierServiceItem.getService().getTitle());
            courrierServiceItem.setService(service);
        }

        CourrierServiceItem savedCourrierServiceItem = courrierServiceItemDao.save(courrierServiceItem);
        return savedCourrierServiceItem;
    }


    @Override
    public CourrierServiceItem update(CourrierServiceItem courrierServiceItem) {


        CourrierServiceItem foundedCourrierServiceItem = findById(courrierServiceItem.getId());
        if (foundedCourrierServiceItem == null)
            return null;

        return courrierServiceItemDao.save(courrierServiceItem);

    }

    @Override
    @Transactional
    public int delete(CourrierServiceItem courrierServiceItem) {

        if (courrierServiceItem.getId() == null)
            return -1;
        CourrierServiceItem foundedCourrierServiceItem = findById(courrierServiceItem.getId());
        if (foundedCourrierServiceItem == null)
            return -1;
        courrierServiceItemDao.delete(foundedCourrierServiceItem);
        return 1;
    }


    public List<CourrierServiceItem> findByCriteria(CourrierServiceItemVo courrierServiceItemVo) {
        String query = "SELECT o FROM CourrierServiceItem o where 1=1 ";
        query += addConstraint("o", "id", "=", courrierServiceItemVo.getId());
        if (courrierServiceItemVo.getCourrierVo() != null) {
            query += addConstraint("o", "courrier.id", "=", courrierServiceItemVo.getCourrierVo().getId());
            query += addConstraint("o", "courrier.idCourrier", "LIKE", courrierServiceItemVo.getCourrierVo().getIdCourrier());
        }

        if (courrierServiceItemVo.getServiceVo() != null) {
            query += addConstraint("o", "service.id", "=", courrierServiceItemVo.getServiceVo().getId());
            query += addConstraint("o", "service.title", "LIKE", courrierServiceItemVo.getServiceVo().getTitle());
        }

        return entityManager.createQuery(query).getResultList();
    }


}
