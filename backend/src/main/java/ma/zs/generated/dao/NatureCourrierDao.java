package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.NatureCourrier;


@Repository
public interface NatureCourrierDao extends JpaRepository<NatureCourrier,Long> {

	NatureCourrier findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<NatureCourrier> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<NatureCourrier> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<NatureCourrier> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<NatureCourrier> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}