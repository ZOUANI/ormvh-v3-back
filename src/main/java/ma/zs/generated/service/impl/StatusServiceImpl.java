package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.StatusDao;
import ma.zs.generated.service.facade.StatusService;
import ma.zs.generated.service.facade.UserService;

import ma.zs.generated.ws.rest.provided.vo.StatusVo;
import ma.zs.generated.service.util.*;

@Service
public class StatusServiceImpl extends AbstractService<Status> implements StatusService {

    @Autowired
    private StatusDao statusDao;

    @Autowired
    private UserService userService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Status> findAll() {
        return statusDao.findAll();
    }

    @Override
    public List<Status> findByCreatedByUsername(String username) {
        return statusDao.findByCreatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByCreatedByUsername(String username) {
        return statusDao.deleteByCreatedByUsername(username);
    }

    @Override
    public List<Status> findByCreatedById(Long id) {
        return statusDao.findByCreatedById(id);

    }

    @Override
    @Transactional
    public int deleteByCreatedById(Long id) {
        return statusDao.deleteByCreatedById(id);

    }

    @Override
    public List<Status> findByUpdatedByUsername(String username) {
        return statusDao.findByUpdatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByUpdatedByUsername(String username) {
        return statusDao.deleteByUpdatedByUsername(username);
    }

    @Override
    public List<Status> findByUpdatedById(Long id) {
        return statusDao.findByUpdatedById(id);

    }

    @Override
    @Transactional
    public int deleteByUpdatedById(Long id) {
        return statusDao.deleteByUpdatedById(id);

    }

    @Override
    public Status findByLibelle(String libelle) {
        if (libelle == null)
            return null;
        return statusDao.findByLibelle(libelle);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return statusDao.deleteByLibelle(libelle);
    }

    @Override
    public Status findById(Long id) {
        if (id == null)
            return null;
        return statusDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        statusDao.deleteById(id);
    }

    @Override
    public Status save(Status status) {
        Status foundedStatus = findByLibelle(status.getLibelle());
        if (foundedStatus != null)
            return null;


        Status savedStatus = statusDao.save(status);
        return savedStatus;
    }

    @Override
    public List<Status> create(List<Status> statuss) {
        List<Status> list = new ArrayList<Status>();
        for (Status status : statuss) {
            list.add(save(status));
        }
        return list;
    }


    @Override
    public Status update(Status status) {
        Status foundedStatus = findById(status.getId());
        if (foundedStatus == null)
            return null;
        prepareUpdate(status);
        return statusDao.save(status);

    }

    @Override
    @Transactional
    public int delete(Status status) {

        if (status.getLibelle() == null)
            return -1;

        Status foundedStatus = findByLibelle(status.getLibelle());
        if (foundedStatus == null)
            return -1;
        statusDao.delete(foundedStatus);
        return 1;
    }


    public List<Status> findByCriteria(StatusVo statusVo) {
        String query = "SELECT o FROM Status o where 1=1 ";
        query += addConstraintDate("o", "createdAt", "=", statusVo.getCreatedAt());
        query += addConstraintDate("o", "updatedAt", "=", statusVo.getUpdatedAt());
        query += addConstraint("o", "libelleArab", "LIKE", statusVo.getLibelleArab());

        query += addConstraint("o", "code", "LIKE", statusVo.getCode());

        query += addConstraint("o", "id", "=", statusVo.getId());
        query += addConstraint("o", "libelle", "LIKE", statusVo.getLibelle());

        query += addConstraintMinMaxDate("o", "createdAt", statusVo.getCreatedAtMin(), statusVo.getCreatedAtMax());
        query += addConstraintMinMaxDate("o", "updatedAt", statusVo.getUpdatedAtMin(), statusVo.getUpdatedAtMax());
        if (statusVo.getCreatedByVo() != null) {
            query += addConstraint("o", "createdBy.id", "=", statusVo.getCreatedByVo().getId());
            query += addConstraint("o", "createdBy.username", "LIKE", statusVo.getCreatedByVo().getUsername());
        }

        if (statusVo.getUpdatedByVo() != null) {
            query += addConstraint("o", "updatedBy.id", "=", statusVo.getUpdatedByVo().getId());
            query += addConstraint("o", "updatedBy.username", "LIKE", statusVo.getUpdatedByVo().getUsername());
        }

        return entityManager.createQuery(query).getResultList();
    }
    
 	@Override
public List<Status> findStatusByCode() {
return statusDao.findStatusByCode();
}

    @Override
    public Status findByCode(String code) {
        return statusDao.findByCode(code);
    }




}
