package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Task;


@Repository
public interface TaskDao extends JpaRepository<Task,Long> {

	Task findByTitle(String title);
       int deleteByTitle(String title);

       List<Task> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Task> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);
       List<Task> findByCourrierIdCourrier(String idCourrier);
       int deleteByCourrierIdCourrier(String idCourrier);       
       List<Task> findByCourrierId(Long id);
       int deleteByCourrierId(Long id);
       List<Task> findByAssigneUsername(String username);
       int deleteByAssigneUsername(String username);       
       List<Task> findByAssigneId(Long id);
       int deleteByAssigneId(Long id);
       List<Task> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Task> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Task> findByStatusLibelle(String libelle);
       int deleteByStatusLibelle(String libelle);       
       List<Task> findByStatusId(Long id);
       int deleteByStatusId(Long id);

}