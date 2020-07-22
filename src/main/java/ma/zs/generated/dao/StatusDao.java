package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Status;


@Repository
public interface StatusDao extends JpaRepository<Status,Long> {

	Status findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<Status> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Status> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Status> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Status> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}