package ma.zs.generated.service.impl;

import ma.zs.generated.bean.EtatCourrier;
import ma.zs.generated.dao.EtatCourrierDao;
import ma.zs.generated.service.facade.EtatCourrierService;
import ma.zs.generated.ws.rest.provided.vo.EtatCourrierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class EtatCourrierServiceImpl extends AbstractService<EtatCourrier> implements EtatCourrierService {

    @Autowired
    private EtatCourrierDao etatCourrierDao;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<EtatCourrier> findAll() {
        return etatCourrierDao.findAll();
    }

    @Override
    public EtatCourrier findByLibelle(String libelle) {
        if (libelle == null)
            return null;
        return etatCourrierDao.findByLibelle(libelle);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatCourrierDao.deleteByLibelle(libelle);
    }

    @Override
    public EtatCourrier findById(Long id) {
        if (id == null)
            return null;
        return etatCourrierDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        etatCourrierDao.deleteById(id);
    }

    @Override
    public EtatCourrier save(EtatCourrier EtatCourrier) {
        EtatCourrier foundedEtatCourrier = findByLibelle(EtatCourrier.getLibelle());
        if (foundedEtatCourrier != null)
            return null;
        EtatCourrier savedEtatCourrier = etatCourrierDao.save(EtatCourrier);
        return savedEtatCourrier;
    }

    @Override
    public EtatCourrier update(EtatCourrier EtatCourrier) {
        EtatCourrier foundedEtatCourrier = findById(EtatCourrier.getId());
        if (foundedEtatCourrier == null)
            return null;
        prepareUpdate(EtatCourrier);
        return etatCourrierDao.save(EtatCourrier);

    }

    @Override
    @Transactional
    public int delete(EtatCourrier EtatCourrier) {

        if (EtatCourrier.getLibelle() == null)
            return -1;

        EtatCourrier foundedEtatCourrier = findByLibelle(EtatCourrier.getLibelle());
        if (foundedEtatCourrier == null)
            return -1;
        etatCourrierDao.delete(foundedEtatCourrier);
        return 1;
    }


    public List<EtatCourrier> findByCriteria(EtatCourrierVo etatCourrierVo) {
        String query = "SELECT o FROM EtatCourrier o where 1=1 ";
        query += addConstraint("o", "libelle", "LIKE", etatCourrierVo.getLibelle());

        query += addConstraint("o", "libelleArab", "LIKE", etatCourrierVo.getLibelleArab());

        query += addConstraint("o", "id", "=", etatCourrierVo.getId());
        return entityManager.createQuery(query).getResultList();
    }


}
