package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Subdivision;


@Repository
public interface SubdivisionDao extends JpaRepository<Subdivision,Long> {

	Subdivision findByTitle(String title);
       int deleteByTitle(String title);

       List<Subdivision> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Subdivision> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Subdivision> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Subdivision> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}