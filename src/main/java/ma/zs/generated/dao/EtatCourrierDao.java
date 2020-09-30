package ma.zs.generated.dao;

import ma.zs.generated.bean.EtatCourrier;
import ma.zs.generated.bean.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtatCourrierDao extends JpaRepository<EtatCourrier,Long> {

    EtatCourrier findByLibelle(String libelle);
       int deleteByLibelle(String libelle);


}