package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import ma.zs.generated.bean.Courrier;


@Repository
public interface CourrierDao extends JpaRepository<Courrier,Long> {

	Courrier findByIdCourrier(String idCourrier);
       int deleteByIdCourrier(String idCourrier);
       
       Optional<Courrier> findTopByOrderByIdDesc();
       

       List<Courrier> findByCourrierObjectTitle(String title);
       int deleteByCourrierObjectTitle(String title);       
       List<Courrier> findByCourrierObjectId(Long id);
       int deleteByCourrierObjectId(Long id);
       List<Courrier> findByVoieLibelle(String libelle);
       int deleteByVoieLibelle(String libelle);       
       List<Courrier> findByVoieId(Long id);
       int deleteByVoieId(Long id);
       List<Courrier> findByNatureCourrierLibelle(String libelle);
       int deleteByNatureCourrierLibelle(String libelle);       
       List<Courrier> findByNatureCourrierId(Long id);
       int deleteByNatureCourrierId(Long id);
       List<Courrier> findByLinkedToIdCourrier(String idCourrier);
       int deleteByLinkedToIdCourrier(String idCourrier);       
       List<Courrier> findByLinkedToId(Long id);
       int deleteByLinkedToId(Long id);
       List<Courrier> findByExpeditorTitle(String title);
       int deleteByExpeditorTitle(String title);       
       List<Courrier> findByExpeditorId(Long id);
       int deleteByExpeditorId(Long id);
       List<Courrier> findByDestinatorTitle(String title);
       int deleteByDestinatorTitle(String title);       
       List<Courrier> findByDestinatorId(Long id);
       int deleteByDestinatorId(Long id);
       List<Courrier> findByCoordinatorTitle(String title);
       int deleteByCoordinatorTitle(String title);       
       List<Courrier> findByCoordinatorId(Long id);
       int deleteByCoordinatorId(Long id);
       List<Courrier> findByEmetteurTitle(String title);
       int deleteByEmetteurTitle(String title);       
       List<Courrier> findByEmetteurId(Long id);
       int deleteByEmetteurId(Long id);
       List<Courrier> findByEvaluationTitle(String title);
       int deleteByEvaluationTitle(String title);       
       List<Courrier> findByEvaluationId(Long id);
       int deleteByEvaluationId(Long id);
       List<Courrier> findByExpeditorTypeTitle(String title);
       int deleteByExpeditorTypeTitle(String title);       
       List<Courrier> findByExpeditorTypeId(Long id);
       int deleteByExpeditorTypeId(Long id);
       List<Courrier> findBySubdivisionTitle(String title);
       int deleteBySubdivisionTitle(String title);       
       List<Courrier> findBySubdivisionId(Long id);
       int deleteBySubdivisionId(Long id);
       List<Courrier> findByStatusLibelle(String libelle);
       int deleteByStatusLibelle(String libelle);       
       List<Courrier> findByStatusId(Long id);
       int deleteByStatusId(Long id);
       List<Courrier> findByTypeCourrierLibelle(String libelle);
       int deleteByTypeCourrierLibelle(String libelle);       
       List<Courrier> findByTypeCourrierId(Long id);
       int deleteByTypeCourrierId(Long id);
       List<Courrier> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Courrier> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Courrier> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Courrier> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);



}