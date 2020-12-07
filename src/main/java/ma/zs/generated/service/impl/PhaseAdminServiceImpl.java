package ma.zs.generated.service.impl;

import ma.zs.generated.bean.PhaseAdmin;
import ma.zs.generated.dao.PhaseAdminDao;
import ma.zs.generated.service.facade.PhaseAdminService;
import ma.zs.generated.ws.rest.provided.vo.PhaseAdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class PhaseAdminServiceImpl extends AbstractService<PhaseAdmin> implements PhaseAdminService {

    @Autowired
    private PhaseAdminDao phaseAdminDao;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<PhaseAdmin> findAll() {
        return phaseAdminDao.findAll();
    }

    @Override
    public PhaseAdmin findByLibelle(String libelle) {
        if (libelle == null)
            return null;
        return phaseAdminDao.findByLibelle(libelle);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return phaseAdminDao.deleteByLibelle(libelle);
    }

    @Override
    public PhaseAdmin findById(Long id) {
        if (id == null)
            return null;
        return phaseAdminDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        phaseAdminDao.deleteById(id);
    }

    @Override
    public PhaseAdmin save(PhaseAdmin phaseAdmin) {
        PhaseAdmin foundedPhaseAdmin = findByLibelle(phaseAdmin.getLibelle());
        if (foundedPhaseAdmin != null)
            return null;
        PhaseAdmin savedPhaseAdmin = phaseAdminDao.save(phaseAdmin);
        return savedPhaseAdmin;
    }

    @Override
    public PhaseAdmin update(PhaseAdmin phaseAdmin) {
        PhaseAdmin foundedPhaseAdmin = findById(phaseAdmin.getId());
        if (foundedPhaseAdmin == null)
            return null;
        prepareUpdate(phaseAdmin);
        return phaseAdminDao.save(phaseAdmin);

    }

    @Override
    @Transactional
    public int delete(PhaseAdmin phaseAdmin) {

        if (phaseAdmin.getLibelle() == null)
            return -1;

        PhaseAdmin foundedPhaseAdmin = findByLibelle(phaseAdmin.getLibelle());
        if (foundedPhaseAdmin == null)
            return -1;
        phaseAdminDao.delete(foundedPhaseAdmin);
        return 1;
    }


    public List<PhaseAdmin> findByCriteria(PhaseAdminVo phaseAdminVo) {
        String query = "SELECT o FROM PhaseAdmin o where 1=1 ";
        query += addConstraint("o", "libelle", "LIKE", phaseAdminVo.getLibelle());

        query += addConstraint("o", "libelleArab", "LIKE", phaseAdminVo.getLibelleArab());

        query += addConstraint("o", "id", "=", phaseAdminVo.getId());
        return entityManager.createQuery(query).getResultList();
    }


}
