package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Bordereau;


@Repository
public interface BordereauDao extends JpaRepository<Bordereau,Long> {

	Bordereau findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<Bordereau> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Bordereau> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Bordereau> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Bordereau> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}