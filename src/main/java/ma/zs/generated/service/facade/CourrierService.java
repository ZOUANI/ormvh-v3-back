package ma.zs.generated.service.facade;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.mail.MessagingException;

import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;
import org.springframework.web.multipart.MultipartFile;

import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.ws.rest.provided.vo.CourrierVo;

public interface CourrierService {



    int uploadFiles(List<MultipartFile> files, String idCourrier) throws IOException;

    int uploadFilesTraite(List<MultipartFile> files, String idCourrier) throws IOException;
    int uploadFilesReponse(List<MultipartFile> files, String idCourrier) throws IOException;

    /**
     * find all Courrier in database
     *
     * @return List<Courrier> , If database is empty return  null.
     */
    List<Courrier> findAll();

    List<Courrier> findByAccuse(Boolean accuse);

    Long countByAccuse(Boolean accuse);

    Long countByReponse(Boolean accuse);

    long count();

    Long countByTypeCourrierLibelle(String typeCourrier_libelle);

    Long countByStatusLibelle(String libelle);

    List<Courrier> findByReponse(Boolean reponse);

    Long countByCreatedAt(Date createdAt);

    Long countByCreatedAtBetween(Date createdAt, Date createdAt2);

    Long countByTypeCourrierLibelleAndCreatedAt(String typeCourrier_libelle, Date createdAt);

    Long countByTypeCourrierLibelleAndCreatedAtBetween(String typeCourrier_libelle, Date createdAt, Date createdAt2);

    Long countByAccuseAndCreatedAt(Boolean accuse, Date createdAt);

    Long countByAccuseAndCreatedAtBetween(Boolean accuse, Date createdAt, Date createdAt2);

    Long countByReponseAndCreatedAt(Boolean reponse, Date createdAt);

    Long countByReponseAndCreatedAtBetween(Boolean reponse, Date createdAt, Date createdAt2);

    Long countByStatusLibelleAndCreatedAt(String status_libelle, Date createdAt);

    Long countByStatusLibelleAndCreatedAtBetween(String status_libelle, Date createdAt, Date createdAt2);


    public List<Long> getStat(Date dateMin, Date dateMax, String titleCoordinator);


    // public List<Long> getStatsLeServiceCoordinator(Date dateMin, Date dateMax, String leServiceCoordinatorTitle);

    /**
     * find Courrier from database by idCourrier (reference)
     *
     * @param idCourrier - reference of Courrier
     * @return the founded Courrier , If no Courrier were
     * found in database return  null.
     */
    Courrier findByIdCourrier(String idCourrier);

    /**
     * find Courrier from database by id (id)
     *
     * @param id - id of Courrier
     * @return the founded  Courrier , If no Courrier were
     * found in database return  null.
     */
    Courrier findById(Long id);

    /**
     * delete Courrier from database
     *
     * @param id - id of Courrier to be deleted
     */
    void deleteById(Long id);

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


    Set<Courrier> findByLinkedToId(Long id);

    int deleteByLinkedToId(Long id);


    Set<Courrier> findAllLinked(Long id);

    /**
     * get all Linked Courier
     *
     * @param id the id of the entity.
     */
    Set<Courrier> findAllLinkedToCourrier(Long id);


    /**
     * get all Linked Courier
     *
     * @param id the id of the entity.
     */
    Set<Courrier> findAllLinkedByCourrier(Long id);


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

    /**
     * create Courrier in database
     *
     * @param courrier - Courrier to be created
     * @return the created Courrier, If the Courrier can't be created return null.
     */
    Courrier create(Courrier courrier);

    /**
     * create list Courrier in database
     *
     * @param courriers - list of Courrier to be created
     * @return the created Courrier list
     */
    List<Courrier> create(List<Courrier> courriers);

    /**
     * update Courrier in database
     *
     * @param courrier - Courrier to be updated
     * @return the updated Courrier, If the Courrier can't be updated return null.
     */
    Courrier update(Courrier courrier);

    /**
     * delete Courrier from database
     *
     * @param courrier - Courrier to be deleted
     * @return 1 if Courrier deleted successfully, If the Courrier can't be deleted return negative int
     */
    int delete(Courrier courrier);


    /**
     * delete Courrier from database by idCourrier (reference)
     *
     * @param idCourrier - reference of Courrier to be deleted
     * @return 1 if Courrier deleted successfully
     */
    int deleteByIdCourrier(String idCourrier);


    /**
     * search for Courrier in by some criteria
     *
     * @return the searhed list Courrier
     */
    List<Courrier> findByCriteria(CourrierVo courrierVo);

    String generateIdCourrier();

    int reservation(Courrier courrier, String idCourier, int nbr, String description);

    String verifyIdCourier(String IdCourier);

    /**
     * @return
     */
    Map<LeService, List<Courrier>> findCourrierSusceptibleRelance(CourrierVo courrierVo);


    /**
     * @param to
     * @param subject
     * @param content
     * @return
     * @throws MessagingException
     */
    int sendCourrierRedirection(String to, String subject, String content) throws MessagingException;

    /**
     * @param courriers
     * @return
     * @throws MessagingException
     */
    int sendCourrierRelance(List<Courrier> courriers) throws MessagingException;

}