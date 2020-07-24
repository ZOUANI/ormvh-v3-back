package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.Voie;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.VoieDao;
import ma.zs.generated.service.facade.VoieService;
import ma.zs.generated.service.facade.UserService;

import ma.zs.generated.ws.rest.provided.vo.VoieVo;
import ma.zs.generated.service.util.*;

@Service
public class VoieServiceImpl extends AbstractService<Voie> implements VoieService {

    @Autowired
    private VoieDao voieDao;

    @Autowired
    private UserService userService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Voie> findAll() {
        return voieDao.findAll();
    }

    @Override
    public List<Voie> findByCreatedByUsername(String username) {
        return voieDao.findByCreatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByCreatedByUsername(String username) {
        return voieDao.deleteByCreatedByUsername(username);
    }

    @Override
    public List<Voie> findByCreatedById(Long id) {
        return voieDao.findByCreatedById(id);

    }

    @Override
    @Transactional
    public int deleteByCreatedById(Long id) {
        return voieDao.deleteByCreatedById(id);

    }

    @Override
    public List<Voie> findByUpdatedByUsername(String username) {
        return voieDao.findByUpdatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByUpdatedByUsername(String username) {
        return voieDao.deleteByUpdatedByUsername(username);
    }

    @Override
    public List<Voie> findByUpdatedById(Long id) {
        return voieDao.findByUpdatedById(id);

    }

    @Override
    @Transactional
    public int deleteByUpdatedById(Long id) {
        return voieDao.deleteByUpdatedById(id);

    }

    @Override
    public Voie findByLibelle(String libelle) {
        if (libelle == null)
            return null;
        return voieDao.findByLibelle(libelle);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return voieDao.deleteByLibelle(libelle);
    }

    @Override
    public Voie findById(Long id) {
        if (id == null)
            return null;
        return voieDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        voieDao.deleteById(id);
    }

    @Override
    public Voie save(Voie voie) {
        Voie foundedVoie = findByLibelle(voie.getLibelle());
        if (foundedVoie != null)
            return null;


        Voie savedVoie = voieDao.save(voie);
        return savedVoie;
    }

    @Override
    public Voie update(Voie voie) {
        Voie foundedVoie = findById(voie.getId());
        if (foundedVoie == null)
            return null;

        return voieDao.save(voie);

    }

    @Override
    @Transactional
    public int delete(Voie voie) {

        if (voie.getLibelle() == null)
            return -1;

        Voie foundedVoie = findByLibelle(voie.getLibelle());
        if (foundedVoie == null)
            return -1;
        voieDao.delete(foundedVoie);
        return 1;
    }


    public List<Voie> findByCriteria(VoieVo voieVo) {
        String query = "SELECT o FROM Voie o where 1=1 ";
        query += addConstraintDate("o", "createdAt", "=", voieVo.getCreatedAt());
        query += addConstraintDate("o", "updatedAt", "=", voieVo.getUpdatedAt());
        query += addConstraint("o", "libelleArab", "LIKE", voieVo.getLibelleArab());

        query += addConstraint("o", "code", "LIKE", voieVo.getCode());

        query += addConstraint("o", "id", "=", voieVo.getId());
        query += addConstraint("o", "libelle", "LIKE", voieVo.getLibelle());

        query += addConstraintMinMaxDate("o", "createdAt", voieVo.getCreatedAtMin(), voieVo.getCreatedAtMax());
        query += addConstraintMinMaxDate("o", "updatedAt", voieVo.getUpdatedAtMin(), voieVo.getUpdatedAtMax());
        if (voieVo.getCreatedByVo() != null) {
            query += addConstraint("o", "createdBy.id", "=", voieVo.getCreatedByVo().getId());
            query += addConstraint("o", "createdBy.username", "LIKE", voieVo.getCreatedByVo().getUsername());
        }

        if (voieVo.getUpdatedByVo() != null) {
            query += addConstraint("o", "updatedBy.id", "=", voieVo.getUpdatedByVo().getId());
            query += addConstraint("o", "updatedBy.username", "LIKE", voieVo.getUpdatedByVo().getUsername());
        }

        return entityManager.createQuery(query).getResultList();
    }


}
