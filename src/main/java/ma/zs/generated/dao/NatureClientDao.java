package ma.zs.generated.dao;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.bean.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NatureClientDao extends JpaRepository<NatureClient,Long> {

    NatureClient findByLibelle(String libelle);
       int deleteByLibelle(String libelle);


}