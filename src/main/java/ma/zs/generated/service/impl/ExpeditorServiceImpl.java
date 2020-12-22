package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.Expeditor;
import ma.zs.generated.bean.Sexe;
import ma.zs.generated.bean.Nationality;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.ExpeditorDao;
import ma.zs.generated.service.facade.ExpeditorService;
import ma.zs.generated.service.facade.UserService;
import ma.zs.generated.service.facade.SexeService;
import ma.zs.generated.service.facade.NationalityService;

import ma.zs.generated.ws.rest.provided.vo.ExpeditorVo;
import ma.zs.generated.service.util.*;

@Service
public class ExpeditorServiceImpl extends AbstractService<Expeditor> implements ExpeditorService {

    @Autowired
    private ExpeditorDao expeditorDao;

    @Autowired
    private UserService userService;
    @Autowired
    private SexeService sexeService;
    @Autowired
    private NationalityService nationalityService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Expeditor> findAll() {
        return expeditorDao.findAll();
    }

    @Override
    public List<Expeditor> findBySexeLibelle(String libelle) {
        return expeditorDao.findBySexeLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteBySexeLibelle(String libelle) {
        return expeditorDao.deleteBySexeLibelle(libelle);
    }

    @Override
    public List<Expeditor> findBySexeId(Long id) {
        return expeditorDao.findBySexeId(id);

    }

    @Override
    @Transactional
    public int deleteBySexeId(Long id) {
        return expeditorDao.deleteBySexeId(id);

    }

    @Override
    public List<Expeditor> findByNationalityLibelle(String libelle) {
        return expeditorDao.findByNationalityLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByNationalityLibelle(String libelle) {
        return expeditorDao.deleteByNationalityLibelle(libelle);
    }

    @Override
    public List<Expeditor> findByNationalityId(Long id) {
        return expeditorDao.findByNationalityId(id);

    }

    @Override
    @Transactional
    public int deleteByNationalityId(Long id) {
        return expeditorDao.deleteByNationalityId(id);

    }

    @Override
    public List<Expeditor> findByCreatedByUsername(String username) {
        return expeditorDao.findByCreatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByCreatedByUsername(String username) {
        return expeditorDao.deleteByCreatedByUsername(username);
    }

    @Override
    public List<Expeditor> findByCreatedById(Long id) {
        return expeditorDao.findByCreatedById(id);

    }

    @Override
    @Transactional
    public int deleteByCreatedById(Long id) {
        return expeditorDao.deleteByCreatedById(id);

    }

    @Override
    public List<Expeditor> findByUpdatedByUsername(String username) {
        return expeditorDao.findByUpdatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByUpdatedByUsername(String username) {
        return expeditorDao.deleteByUpdatedByUsername(username);
    }

    @Override
    public List<Expeditor> findByUpdatedById(Long id) {
        return expeditorDao.findByUpdatedById(id);

    }

    @Override
    @Transactional
    public int deleteByUpdatedById(Long id) {
        return expeditorDao.deleteByUpdatedById(id);

    }

    @Override
    public Expeditor findByTitle(String title) {
        if (title == null)
            return null;
        return expeditorDao.findByTitle(title);
    }


    @Override
    @Transactional
    public int deleteByTitle(String title) {
        return expeditorDao.deleteByTitle(title);
    }

    @Override
    public Expeditor findById(Long id) {
        if (id == null)
            return null;
        return expeditorDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        expeditorDao.deleteById(id);
    }

    @Override
    public Expeditor save(Expeditor expeditor) {
        Expeditor foundedExpeditor = findByTitle(expeditor.getTitle());
        if (foundedExpeditor != null)
            return null;

        if (expeditor.getSexe() != null) {
            Sexe sexe = sexeService.findByLibelle(expeditor.getSexe().getLibelle());

            expeditor.setSexe(sexe);
        }

        if (expeditor.getNationality() != null) {
            Nationality nationality = nationalityService.findByLibelle(expeditor.getNationality().getLibelle());

            expeditor.setNationality(nationality);
        }
        if (DateUtil.getAge(expeditor.getDateNaissance()) != expeditor.getAge()) {


            expeditor.setAge(DateUtil.getAge(expeditor.getDateNaissance()));
        }


        Expeditor savedExpeditor = expeditorDao.save(expeditor);
        return savedExpeditor;
    }


    @Override
    public Expeditor update(Expeditor expeditor) {
        Expeditor foundedExpeditor = findById(expeditor.getId());
        if (foundedExpeditor == null)
            return null;
        prepareUpdate(expeditor);
        if (DateUtil.getAge(expeditor.getDateNaissance()) != expeditor.getAge()) {


            expeditor.setAge(DateUtil.getAge(expeditor.getDateNaissance()));
        }
        return expeditorDao.save(expeditor);

    }

    @Override
    @Transactional
    public int delete(Expeditor expeditor) {

        if (expeditor.getTitle() == null)
            return -1;

        Expeditor foundedExpeditor = findByTitle(expeditor.getTitle());
        if (foundedExpeditor == null)
            return -1;
        expeditorDao.delete(foundedExpeditor);
        return 1;
    }


    public List<Expeditor> findByCriteria(ExpeditorVo expeditorVo) {
        String query = "SELECT o FROM Expeditor o where 1=1 ";
        query += addConstraint("o", "adress", "LIKE", expeditorVo.getAdress());

        query += addConstraintDate("o", "createdAt", "=", expeditorVo.getCreatedAt());
        query += addConstraintDate("o", "updatedAt", "=", expeditorVo.getUpdatedAt());
        query += addConstraint("o", "code", "LIKE", expeditorVo.getCode());

        query += addConstraint("o", "description", "LIKE", expeditorVo.getDescription());


        query += addConstraint("o", "age", "=", expeditorVo.getAge());
        query += addConstraint("o", "id", "=", expeditorVo.getId());
        query += addConstraint("o", "title", "LIKE", expeditorVo.getTitle());

        query += addConstraint("o", "titleArab", "LIKE", expeditorVo.getTitleArab());

        query += addConstraintMinMaxDate("o", "createdAt", expeditorVo.getCreatedAtMin(), expeditorVo.getCreatedAtMax());
        query += addConstraintMinMaxDate("o", "updatedAt", expeditorVo.getUpdatedAtMin(), expeditorVo.getUpdatedAtMax());
        query += addConstraintMinMax("o", "age", expeditorVo.getAgeMin(), expeditorVo.getAgeMax());
        if (expeditorVo.getSexeVo() != null) {
            query += addConstraint("o", "sexe.id", "=", expeditorVo.getSexeVo().getId());
            query += addConstraint("o", "sexe.libelle", "LIKE", expeditorVo.getSexeVo().getLibelle());
        }

        if (expeditorVo.getNationalityVo() != null) {
            query += addConstraint("o", "nationality.id", "=", expeditorVo.getNationalityVo().getId());
            query += addConstraint("o", "nationality.libelle", "LIKE", expeditorVo.getNationalityVo().getLibelle());
        }

        if (expeditorVo.getCreatedByVo() != null) {
            query += addConstraint("o", "createdBy.id", "=", expeditorVo.getCreatedByVo().getId());
            query += addConstraint("o", "createdBy.username", "LIKE", expeditorVo.getCreatedByVo().getUsername());
        }

        if (expeditorVo.getUpdatedByVo() != null) {
            query += addConstraint("o", "updatedBy.id", "=", expeditorVo.getUpdatedByVo().getId());
            query += addConstraint("o", "updatedBy.username", "LIKE", expeditorVo.getUpdatedByVo().getUsername());
        }

        return entityManager.createQuery(query).getResultList();
    }


}
