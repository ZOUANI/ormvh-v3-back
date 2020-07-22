package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Evaluation;


@Repository
public interface EvaluationDao extends JpaRepository<Evaluation,Long> {

	Evaluation findByTitle(String title);
       int deleteByTitle(String title);

       List<Evaluation> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Evaluation> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Evaluation> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Evaluation> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}