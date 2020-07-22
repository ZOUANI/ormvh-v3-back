package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.CourrierObject;


@Repository
public interface CourrierObjectDao extends JpaRepository<CourrierObject,Long> {

	CourrierObject findByTitle(String title);
       int deleteByTitle(String title);

       List<CourrierObject> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<CourrierObject> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<CourrierObject> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<CourrierObject> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}