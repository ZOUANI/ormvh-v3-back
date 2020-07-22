package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.LeService;


@Repository
public interface LeServiceDao extends JpaRepository<LeService,Long> {

	LeService findByTitle(String title);
       int deleteByTitle(String title);

       List<LeService> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<LeService> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<LeService> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<LeService> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}