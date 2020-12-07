package ma.zs.generated.dao;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.bean.TypeRequette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeRequetteDao extends JpaRepository<TypeRequette,Long> {

    TypeRequette findByLibelle(String libelle);
       int deleteByLibelle(String libelle);


}