package ma.zs.generated.dao;

import ma.zs.generated.bean.PhaseAdmin;
import ma.zs.generated.bean.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhaseAdminDao extends JpaRepository<PhaseAdmin,Long> {

    PhaseAdmin findByLibelle(String libelle);
       int deleteByLibelle(String libelle);


}