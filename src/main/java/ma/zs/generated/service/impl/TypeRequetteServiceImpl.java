package ma.zs.generated.service.impl;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.bean.TypeRequette;
import ma.zs.generated.dao.NatureClientDao;
import ma.zs.generated.dao.TypeRequetteDao;
import ma.zs.generated.service.facade.NatureClientService;
import ma.zs.generated.service.facade.TypeRequetteService;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import ma.zs.generated.ws.rest.provided.vo.TypeRequetteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TypeRequetteServiceImpl extends AbstractService<TypeRequette> implements TypeRequetteService {

    @Autowired
    private TypeRequetteDao typeRequetteDao;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<TypeRequette> findAll() {
        return typeRequetteDao.findAll();
    }

    @Override
    public TypeRequette findByLibelle(String libelle) {
        if (libelle == null)
            return null;
        return typeRequetteDao.findByLibelle(libelle);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return typeRequetteDao.deleteByLibelle(libelle);
    }

    @Override
    public TypeRequette findById(Long id) {
        if (id == null)
            return null;
        return typeRequetteDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        typeRequetteDao.deleteById(id);
    }

    @Override
    public TypeRequette save(TypeRequette typeRequette) {
        TypeRequette foundedTypeRequette = findByLibelle(typeRequette.getLibelle());
        if (foundedTypeRequette != null)
            return null;
        TypeRequette savedTypeRequette = typeRequetteDao.save(typeRequette);
        return savedTypeRequette;
    }

    @Override
    public TypeRequette update(TypeRequette typeRequette) {
        TypeRequette foundedTypeRequette = findById(typeRequette.getId());
        if (foundedTypeRequette == null)
            return null;
        prepareUpdate(typeRequette);
        return typeRequetteDao.save(typeRequette);

    }

    @Override
    @Transactional
    public int delete(TypeRequette typeRequette) {

        if (typeRequette.getLibelle() == null)
            return -1;

        TypeRequette foundedTypeRequette = findByLibelle(typeRequette.getLibelle());
        if (foundedTypeRequette == null)
            return -1;
        typeRequetteDao.delete(foundedTypeRequette);
        return 1;
    }


    public List<TypeRequette> findByCriteria(TypeRequetteVo typeRequetteVo) {
        String query = "SELECT o FROM TypeRequette o where 1=1 ";
        query += addConstraint("o", "libelle", "LIKE", typeRequetteVo.getLibelle());

        query += addConstraint("o", "libelleArab", "LIKE", typeRequetteVo.getLibelleArab());

        query += addConstraint("o", "id", "=", typeRequetteVo.getId());
        return entityManager.createQuery(query).getResultList();
    }


}
