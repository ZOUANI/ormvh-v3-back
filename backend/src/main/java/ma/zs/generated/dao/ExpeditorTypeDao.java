package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.ExpeditorType;


@Repository
public interface ExpeditorTypeDao extends JpaRepository<ExpeditorType,Long> {

	ExpeditorType findByTitle(String title);
       int deleteByTitle(String title);

       List<ExpeditorType> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<ExpeditorType> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<ExpeditorType> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<ExpeditorType> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}