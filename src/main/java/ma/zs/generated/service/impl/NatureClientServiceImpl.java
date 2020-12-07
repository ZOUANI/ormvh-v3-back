package ma.zs.generated.service.impl;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.dao.NatureClientDao;
import ma.zs.generated.service.facade.NatureClientService;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class NatureClientServiceImpl extends AbstractService<NatureClient> implements NatureClientService {

    @Autowired
    private NatureClientDao natureClientDao;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<NatureClient> findAll() {
        return natureClientDao.findAll();
    }

    @Override
    public NatureClient findByLibelle(String libelle) {
        if (libelle == null)
            return null;
        return natureClientDao.findByLibelle(libelle);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return natureClientDao.deleteByLibelle(libelle);
    }

    @Override
    public NatureClient findById(Long id) {
        if (id == null)
            return null;
        return natureClientDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        natureClientDao.deleteById(id);
    }

    @Override
    public NatureClient save(NatureClient natureClient) {
        NatureClient foundedNatureClient = findByLibelle(natureClient.getLibelle());
        if (foundedNatureClient != null)
            return null;
        NatureClient savedNatureClient = natureClientDao.save(natureClient);
        return savedNatureClient;
    }

    @Override
    public NatureClient update(NatureClient natureClient) {
        NatureClient foundedNatureClient = findById(natureClient.getId());
        if (foundedNatureClient == null)
            return null;
        prepareUpdate(natureClient);
        return natureClientDao.save(natureClient);

    }

    @Override
    @Transactional
    public int delete(NatureClient natureClient) {

        if (natureClient.getLibelle() == null)
            return -1;

        NatureClient foundedNatureClient = findByLibelle(natureClient.getLibelle());
        if (foundedNatureClient == null)
            return -1;
        natureClientDao.delete(foundedNatureClient);
        return 1;
    }


    public List<NatureClient> findByCriteria(NatureClientVo natureClientVo) {
        String query = "SELECT o FROM NatureClient o where 1=1 ";
        query += addConstraint("o", "libelle", "LIKE", natureClientVo.getLibelle());

        query += addConstraint("o", "libelleArab", "LIKE", natureClientVo.getLibelleArab());

        query += addConstraint("o", "id", "=", natureClientVo.getId());
        return entityManager.createQuery(query).getResultList();
    }


}
