package ma.zs.generated.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.CourrierObject;
import ma.zs.generated.bean.Voie;
import ma.zs.generated.bean.NatureCourrier;
import ma.zs.generated.bean.Expeditor;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.bean.Evaluation;
import ma.zs.generated.bean.ExpeditorType;
import ma.zs.generated.bean.Subdivision;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.bean.Task;
import ma.zs.generated.bean.CourrierServiceItem;
import ma.zs.generated.dao.CourrierDao;
import ma.zs.generated.service.facade.CourrierService;
import ma.zs.generated.service.facade.ExpeditorTypeService;
import ma.zs.generated.service.facade.StatusService;
import ma.zs.generated.service.facade.TaskService;
import ma.zs.generated.service.facade.NatureCourrierService;
import ma.zs.generated.service.facade.CourrierServiceItemService;
import ma.zs.generated.service.facade.EvaluationService;
import ma.zs.generated.service.facade.CourrierObjectService;
import ma.zs.generated.service.facade.SubdivisionService;
import ma.zs.generated.service.facade.ExpeditorService;
import ma.zs.generated.service.facade.TypeCourrierService;
import ma.zs.generated.service.facade.VoieService;
import ma.zs.generated.service.facade.LeServiceService;

import ma.zs.generated.ws.rest.provided.vo.CourrierVo;
import ma.zs.generated.service.util.*;

@Service
public class CourrierServiceImpl extends  AbstractService<Courrier> implements CourrierService {

    @Autowired
    private CourrierDao courrierDao;


    @Autowired
    private ExpeditorTypeService expeditorTypeService;
    @Autowired
    private StatusService statusService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private NatureCourrierService natureCourrierService;
    @Autowired
    private CourrierServiceItemService courrierServiceItemService;
    @Autowired
    private EvaluationService evaluationService;
    @Autowired
    private CourrierObjectService courrierObjectService;
    @Autowired
    private SubdivisionService subdivisionService;
    @Autowired
    private ExpeditorService expeditorService;
    @Autowired
    private TypeCourrierService typeCourrierService;
    @Autowired
    private VoieService voieService;
    @Autowired
    private LeServiceService leServiceService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Courrier> findAll() {
        return courrierDao.findAll();
    }

    @Override
    public List<Courrier> findByAccuse(Boolean accuse) {
        return courrierDao.findByAccuse(accuse);
    }

    @Override
    public List<Courrier> findByReponse(Boolean reponse) {
        return courrierDao.findByReponse(reponse);
    }

    @Override
    public List<Courrier> findByCourrierObjectTitle(String title) {
        return courrierDao.findByCourrierObjectTitle(title);
    }

    @Override
    @Transactional
    public int deleteByCourrierObjectTitle(String title) {
        return courrierDao.deleteByCourrierObjectTitle(title);
    }

    @Override
    public List<Courrier> findByCourrierObjectId(Long id) {
        return courrierDao.findByCourrierObjectId(id);

    }

    @Override
    @Transactional
    public int deleteByCourrierObjectId(Long id) {
        return courrierDao.deleteByCourrierObjectId(id);

    }

    @Override
    public List<Courrier> findByVoieLibelle(String libelle) {
        return courrierDao.findByVoieLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByVoieLibelle(String libelle) {
        return courrierDao.deleteByVoieLibelle(libelle);
    }

    @Override
    public List<Courrier> findByVoieId(Long id) {
        return courrierDao.findByVoieId(id);

    }

    @Override
    @Transactional
    public int deleteByVoieId(Long id) {
        return courrierDao.deleteByVoieId(id);

    }

    @Override
    public List<Courrier> findByNatureCourrierLibelle(String libelle) {
        return courrierDao.findByNatureCourrierLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByNatureCourrierLibelle(String libelle) {
        return courrierDao.deleteByNatureCourrierLibelle(libelle);
    }

    @Override
    public List<Courrier> findByNatureCourrierId(Long id) {
        return courrierDao.findByNatureCourrierId(id);

    }

    @Override
    @Transactional
    public int deleteByNatureCourrierId(Long id) {
        return courrierDao.deleteByNatureCourrierId(id);

    }

    @Override
    public List<Courrier> findByLinkedToIdCourrier(String idCourrier) {
        return courrierDao.findByLinkedToIdCourrier(idCourrier);
    }

    @Override
    @Transactional
    public int deleteByLinkedToIdCourrier(String idCourrier) {
        return courrierDao.deleteByLinkedToIdCourrier(idCourrier);
    }

    @Override
    public List<Courrier> findByLinkedToId(Long id) {
        return courrierDao.findByLinkedToId(id);

    }

    @Override
    @Transactional
    public int deleteByLinkedToId(Long id) {
        return courrierDao.deleteByLinkedToId(id);

    }

    @Override
    public List<Courrier> findByExpeditorTitle(String title) {
        return courrierDao.findByExpeditorTitle(title);
    }

    @Override
    @Transactional
    public int deleteByExpeditorTitle(String title) {
        return courrierDao.deleteByExpeditorTitle(title);
    }

    @Override
    public List<Courrier> findByExpeditorId(Long id) {
        return courrierDao.findByExpeditorId(id);

    }

    @Override
    @Transactional
    public int deleteByExpeditorId(Long id) {
        return courrierDao.deleteByExpeditorId(id);

    }

    @Override
    public List<Courrier> findByDestinatorTitle(String title) {
        return courrierDao.findByDestinatorTitle(title);
    }

    @Override
    @Transactional
    public int deleteByDestinatorTitle(String title) {
        return courrierDao.deleteByDestinatorTitle(title);
    }

    @Override
    public List<Courrier> findByDestinatorId(Long id) {
        return courrierDao.findByDestinatorId(id);

    }

    @Override
    @Transactional
    public int deleteByDestinatorId(Long id) {
        return courrierDao.deleteByDestinatorId(id);

    }

    @Override
    public List<Courrier> findByCoordinatorTitle(String title) {
        return courrierDao.findByCoordinatorTitle(title);
    }

    @Override
    @Transactional
    public int deleteByCoordinatorTitle(String title) {
        return courrierDao.deleteByCoordinatorTitle(title);
    }

    @Override
    public List<Courrier> findByCoordinatorId(Long id) {
        return courrierDao.findByCoordinatorId(id);

    }

    @Override
    @Transactional
    public int deleteByCoordinatorId(Long id) {
        return courrierDao.deleteByCoordinatorId(id);

    }

    @Override
    public List<Courrier> findByEmetteurTitle(String title) {
        return courrierDao.findByEmetteurTitle(title);
    }

    @Override
    @Transactional
    public int deleteByEmetteurTitle(String title) {
        return courrierDao.deleteByEmetteurTitle(title);
    }

    @Override
    public List<Courrier> findByEmetteurId(Long id) {
        return courrierDao.findByEmetteurId(id);

    }

    @Override
    @Transactional
    public int deleteByEmetteurId(Long id) {
        return courrierDao.deleteByEmetteurId(id);

    }

    @Override
    public List<Courrier> findByEvaluationTitle(String title) {
        return courrierDao.findByEvaluationTitle(title);
    }

    @Override
    @Transactional
    public int deleteByEvaluationTitle(String title) {
        return courrierDao.deleteByEvaluationTitle(title);
    }

    @Override
    public List<Courrier> findByEvaluationId(Long id) {
        return courrierDao.findByEvaluationId(id);

    }

    @Override
    @Transactional
    public int deleteByEvaluationId(Long id) {
        return courrierDao.deleteByEvaluationId(id);

    }

    @Override
    public List<Courrier> findByExpeditorTypeTitle(String title) {
        return courrierDao.findByExpeditorTypeTitle(title);
    }

    @Override
    @Transactional
    public int deleteByExpeditorTypeTitle(String title) {
        return courrierDao.deleteByExpeditorTypeTitle(title);
    }

    @Override
    public List<Courrier> findByExpeditorTypeId(Long id) {
        return courrierDao.findByExpeditorTypeId(id);

    }

    @Override
    @Transactional
    public int deleteByExpeditorTypeId(Long id) {
        return courrierDao.deleteByExpeditorTypeId(id);

    }

    @Override
    public List<Courrier> findBySubdivisionTitle(String title) {
        return courrierDao.findBySubdivisionTitle(title);
    }

    @Override
    @Transactional
    public int deleteBySubdivisionTitle(String title) {
        return courrierDao.deleteBySubdivisionTitle(title);
    }

    @Override
    public List<Courrier> findBySubdivisionId(Long id) {
        return courrierDao.findBySubdivisionId(id);

    }

    @Override
    @Transactional
    public int deleteBySubdivisionId(Long id) {
        return courrierDao.deleteBySubdivisionId(id);

    }

    @Override
    public List<Courrier> findByStatusLibelle(String libelle) {
        return courrierDao.findByStatusLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByStatusLibelle(String libelle) {
        return courrierDao.deleteByStatusLibelle(libelle);
    }

    @Override
    public List<Courrier> findByStatusId(Long id) {
        return courrierDao.findByStatusId(id);

    }

    @Override
    @Transactional
    public int deleteByStatusId(Long id) {
        return courrierDao.deleteByStatusId(id);

    }

    @Override
    public List<Courrier> findByTypeCourrierLibelle(String libelle) {
        return courrierDao.findByTypeCourrierLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByTypeCourrierLibelle(String libelle) {
        return courrierDao.deleteByTypeCourrierLibelle(libelle);
    }

    @Override
    public List<Courrier> findByTypeCourrierId(Long id) {
        return courrierDao.findByTypeCourrierId(id);

    }

    @Override
    @Transactional
    public int deleteByTypeCourrierId(Long id) {
        return courrierDao.deleteByTypeCourrierId(id);

    }

    @Override
    public List<Courrier> findByCreatedByUsername(String username) {
        return courrierDao.findByCreatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByCreatedByUsername(String username) {
        return courrierDao.deleteByCreatedByUsername(username);
    }

    @Override
    public List<Courrier> findByCreatedById(Long id) {
        return courrierDao.findByCreatedById(id);

    }

    @Override
    @Transactional
    public int deleteByCreatedById(Long id) {
        return courrierDao.deleteByCreatedById(id);

    }

    @Override
    public List<Courrier> findByUpdatedByUsername(String username) {
        return courrierDao.findByUpdatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByUpdatedByUsername(String username) {
        return courrierDao.deleteByUpdatedByUsername(username);
    }

    @Override
    public List<Courrier> findByUpdatedById(Long id) {
        return courrierDao.findByUpdatedById(id);

    }

    @Override
    @Transactional
    public int deleteByUpdatedById(Long id) {
        return courrierDao.deleteByUpdatedById(id);

    }

    @Override
    public Courrier findByIdCourrier(String idCourrier) {
        if (idCourrier == null)
            return null;

        return courrierDao.findByIdCourrier(idCourrier);
    }


    @Override
    @Transactional
    public int deleteByIdCourrier(String idCourrier) {
        return courrierDao.deleteByIdCourrier(idCourrier);
    }

    @Override
    public Courrier findById(Long id) {
        if (id == null)
            return null;
        return courrierDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        taskService.deleteByCourrierId(id);
        courrierServiceItemService.deleteByCourrierId(id);
        courrierDao.deleteById(id);
    }

    private void prepareCourrierId(Courrier courrier) {
        Optional<Courrier> last = courrierDao.findTopByOrderByIdDesc();
        int num = 0;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (last.isPresent()) {
            try {
                String value = last.get().getIdCourrier();
                if (value != null) {
                    String[] split = value.split("_");
                    num = Integer.parseInt(split[0]);
                }
            } catch (NumberFormatException e) {
                System.out.println("We can catch the NumberFormatException");
            }

            String format = String.format("%06d", ++num);
            String numOrder = format + "_" + year;
            courrier.setIdCourrier(numOrder);

        }

    }

    @Override
    public Courrier save(Courrier courrier) {
        //prepareCourrierId(courrier);
        if (courrier.getCourrierObject() != null) {
            CourrierObject courrierObject = courrierObjectService.findByTitle(courrier.getCourrierObject().getTitle());
            courrier.setCourrierObject(courrierObject);
        }

        if (courrier.getVoie() != null) {
            Voie voie = voieService.findByLibelle(courrier.getVoie().getLibelle());
            courrier.setVoie(voie);
        }

        if (courrier.getNatureCourrier() != null) {
            NatureCourrier natureCourrier = natureCourrierService.findByLibelle(courrier.getNatureCourrier().getLibelle());
            courrier.setNatureCourrier(natureCourrier);
        }

        if (courrier.getLinkedTo() != null) {
            Courrier linkedTo = findByIdCourrier(courrier.getLinkedTo().getIdCourrier());
            courrier.setLinkedTo(linkedTo);
        }

        if (courrier.getExpeditor() != null) {
            Expeditor expeditor = expeditorService.findByTitle(courrier.getExpeditor().getTitle());
            courrier.setExpeditor(expeditor);
        }

        if (courrier.getDestinator() != null) {
            Expeditor destinator = expeditorService.findByTitle(courrier.getDestinator().getTitle());
            courrier.setDestinator(destinator);
        }

        if (courrier.getCoordinator() != null) {
            LeService coordinator = leServiceService.findByTitle(courrier.getCoordinator().getTitle());
            courrier.setCoordinator(coordinator);
        }

        if (courrier.getEmetteur() != null) {
            LeService emetteur = leServiceService.findByTitle(courrier.getEmetteur().getTitle());
            courrier.setEmetteur(emetteur);
        }

        if (courrier.getEvaluation() != null) {
            Evaluation evaluation = evaluationService.findByTitle(courrier.getEvaluation().getTitle());

            courrier.setEvaluation(evaluation);
        }

        if (courrier.getExpeditorType() != null) {
            ExpeditorType expeditorType = expeditorTypeService.findByTitle(courrier.getExpeditorType().getTitle());
            courrier.setExpeditorType(expeditorType);
        }

        if (courrier.getSubdivision() != null) {
            Subdivision subdivision = subdivisionService.findByTitle(courrier.getSubdivision().getTitle());
            courrier.setSubdivision(subdivision);
        }

        if (courrier.getStatus() != null) {
            Status status = statusService.findByLibelle(courrier.getStatus().getLibelle());
            courrier.setStatus(status);
        }

        if (courrier.getTypeCourrier() != null) {
            TypeCourrier typeCourrier = typeCourrierService.findByLibelle(courrier.getTypeCourrier().getLibelle());
            courrier.setTypeCourrier(typeCourrier);
        }


        Courrier savedCourrier = courrierDao.save(courrier);
        if (ListUtil.isNotEmpty(courrier.getTasks())) {
            savedCourrier.setTasks(taskService.create(prepareTasks(savedCourrier, courrier.getTasks())));
        }
        if (ListUtil.isNotEmpty(courrier.getCourrierServiceItems())) {
            savedCourrier.setCourrierServiceItems(courrierServiceItemService.create(prepareCourrierServiceItems(savedCourrier, courrier.getCourrierServiceItems())));
        }
        return savedCourrier;
    }



    private List<Task> prepareTasks(Courrier courrier, List<Task> tasks) {
        for (Task task : tasks) {
            task.setCourrier(courrier);
        }
        return tasks;
    }

    private List<CourrierServiceItem> prepareCourrierServiceItems(Courrier courrier, List<CourrierServiceItem> courrierServiceItems) {
        for (CourrierServiceItem courrierServiceItem : courrierServiceItems) {
            courrierServiceItem.setCourrier(courrier);
        }
        return courrierServiceItems;
    }

    @Override
    public Courrier update(Courrier courrier) {


        Courrier foundedCourrier = findById(courrier.getId());
        if (foundedCourrier == null)
            return null;

        return courrierDao.save(courrier);

    }

    @Override
    @Transactional
    public int delete(Courrier courrier) {

        if (courrier.getIdCourrier() == null)
            return -1;

        Courrier foundedCourrier = findByIdCourrier(courrier.getIdCourrier());
        if (foundedCourrier == null)
            return -1;
        courrierDao.delete(foundedCourrier);
        return 1;
    }


    public List<Courrier> findByCriteria(CourrierVo courrierVo) {
        String query = "SELECT o FROM Courrier o where 1=1 ";
        query += addConstraint("o", "instruction", "LIKE", courrierVo.getInstruction());

        query += addConstraint("o", "expediteurDesc", "LIKE", courrierVo.getExpediteurDesc());

        query += addConstraintDate("o", "sentAt", "=", courrierVo.getSentAt());
        query += addConstraint("o", "destinataireDesc", "LIKE", courrierVo.getDestinataireDesc());

        query += addConstraint("o", "destinataireVille", "LIKE", courrierVo.getDestinataireVille());

        query += addConstraint("o", "relance", "=", courrierVo.getRelance());
        query += addConstraintDate("o", "dateRelance", "=", courrierVo.getDateRelance());
        query += addConstraint("o", "accuse", "=", courrierVo.getAccuse());
        query += addConstraint("o", "reponse", "=", courrierVo.getReponse());
        query += addConstraintDate("o", "dateAccuse", "=", courrierVo.getDateAccuse());
        query += addConstraintDate("o", "dateReponse", "=", courrierVo.getDateReponse());
        query += addConstraintDate("o", "receivedAt", "=", courrierVo.getReceivedAt());
        query += addConstraint("o", "id", "=", courrierVo.getId());
        query += addConstraint("o", "idCourrier", "LIKE", courrierVo.getIdCourrier());

        query += addConstraint("o", "subject", "LIKE", courrierVo.getSubject());

        query += addConstraint("o", "description", "LIKE", courrierVo.getDescription());

        query += addConstraintDate("o", "createdAt", "=", courrierVo.getCreatedAt());
        query += addConstraintDate("o", "updatedAt", "=", courrierVo.getUpdatedAt());
        query += addConstraint("o", "delai", "=", courrierVo.getDelai());
        query += addConstraintMinMaxDate("o", "sentAt", courrierVo.getSentAtMin(), courrierVo.getSentAtMax());
        query += addConstraintMinMax("o", "relance", courrierVo.getRelanceMin(), courrierVo.getRelanceMax());
        query += addConstraintMinMaxDate("o", "dateRelance", courrierVo.getDateRelanceMin(), courrierVo.getDateRelanceMax());
        query += addConstraintMinMaxDate("o", "dateAccuse", courrierVo.getDateAccuseMin(), courrierVo.getDateAccuseMax());
        query += addConstraintMinMaxDate("o", "dateReponse", courrierVo.getDateReponseMin(), courrierVo.getDateReponseMax());
        query += addConstraintMinMaxDate("o", "receivedAt", courrierVo.getReceivedAtMin(), courrierVo.getReceivedAtMax());
        query += addConstraintMinMaxDate("o", "createdAt", courrierVo.getCreatedAtMin(), courrierVo.getCreatedAtMax());
        query += addConstraintMinMaxDate("o", "updatedAt", courrierVo.getUpdatedAtMin(), courrierVo.getUpdatedAtMax());
        query += addConstraintMinMax("o", "delai", courrierVo.getDelaiMin(), courrierVo.getDelaiMax());
        if (courrierVo.getCourrierObjectVo() != null) {
            query += addConstraint("o", "courrierObject.id", "=", courrierVo.getCourrierObjectVo().getId());
            query += addConstraint("o", "courrierObject.title", "LIKE", courrierVo.getCourrierObjectVo().getTitle());
        }

        if (courrierVo.getVoieVo() != null) {
            query += addConstraint("o", "voie.id", "=", courrierVo.getVoieVo().getId());
            query += addConstraint("o", "voie.libelle", "LIKE", courrierVo.getVoieVo().getLibelle());
        }

        if (courrierVo.getNatureCourrierVo() != null) {
            query += addConstraint("o", "natureCourrier.id", "=", courrierVo.getNatureCourrierVo().getId());
            query += addConstraint("o", "natureCourrier.libelle", "LIKE", courrierVo.getNatureCourrierVo().getLibelle());
        }

        if (courrierVo.getLinkedToVo() != null) {
            query += addConstraint("o", "linkedTo.id", "=", courrierVo.getLinkedToVo().getId());
            query += addConstraint("o", "linkedTo.idCourrier", "LIKE", courrierVo.getLinkedToVo().getIdCourrier());
        }

        if (courrierVo.getExpeditorVo() != null) {
            query += addConstraint("o", "expeditor.id", "=", courrierVo.getExpeditorVo().getId());
            query += addConstraint("o", "expeditor.title", "LIKE", courrierVo.getExpeditorVo().getTitle());
        }

        if (courrierVo.getDestinatorVo() != null) {
            query += addConstraint("o", "destinator.id", "=", courrierVo.getDestinatorVo().getId());
            query += addConstraint("o", "destinator.title", "LIKE", courrierVo.getDestinatorVo().getTitle());
        }

        if (courrierVo.getCoordinatorVo() != null) {
            query += addConstraint("o", "coordinator.id", "=", courrierVo.getCoordinatorVo().getId());
            query += addConstraint("o", "coordinator.title", "LIKE", courrierVo.getCoordinatorVo().getTitle());
        }

        if (courrierVo.getEmetteurVo() != null) {
            query += addConstraint("o", "emetteur.id", "=", courrierVo.getEmetteurVo().getId());
            query += addConstraint("o", "emetteur.title", "LIKE", courrierVo.getEmetteurVo().getTitle());
        }

        if (courrierVo.getEvaluationVo() != null) {
            query += addConstraint("o", "evaluation.id", "=", courrierVo.getEvaluationVo().getId());
            query += addConstraint("o", "evaluation.title", "LIKE", courrierVo.getEvaluationVo().getTitle());
        }

        if (courrierVo.getExpeditorTypeVo() != null) {
            query += addConstraint("o", "expeditorType.id", "=", courrierVo.getExpeditorTypeVo().getId());
            query += addConstraint("o", "expeditorType.title", "LIKE", courrierVo.getExpeditorTypeVo().getTitle());
        }

        if (courrierVo.getSubdivisionVo() != null) {
            query += addConstraint("o", "subdivision.id", "=", courrierVo.getSubdivisionVo().getId());
            query += addConstraint("o", "subdivision.title", "LIKE", courrierVo.getSubdivisionVo().getTitle());
        }

        if (courrierVo.getStatusVo() != null) {
            query += addConstraint("o", "status.id", "=", courrierVo.getStatusVo().getId());
            query += addConstraint("o", "status.libelle", "LIKE", courrierVo.getStatusVo().getLibelle());
        }

        if (courrierVo.getTypeCourrierVo() != null) {
            query += addConstraint("o", "typeCourrier.id", "=", courrierVo.getTypeCourrierVo().getId());
            query += addConstraint("o", "typeCourrier.libelle", "LIKE", courrierVo.getTypeCourrierVo().getLibelle());
        }

        if (courrierVo.getCreatedByVo() != null) {
            query += addConstraint("o", "createdBy.id", "=", courrierVo.getCreatedByVo().getId());
            query += addConstraint("o", "createdBy.username", "LIKE", courrierVo.getCreatedByVo().getUsername());
        }

        if (courrierVo.getUpdatedByVo() != null) {
            query += addConstraint("o", "updatedBy.id", "=", courrierVo.getUpdatedByVo().getId());
            query += addConstraint("o", "updatedBy.username", "LIKE", courrierVo.getUpdatedByVo().getUsername());
        }

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public String generateIdCourrier() {
        Optional<Courrier> last = courrierDao.findTopByOrderByIdDesc();
        int num = 0;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (last.isPresent()) {
            String value = last.get().getIdCourrier();
            if (value != null) {
                String[] split = value.split("_");
                num = Integer.parseInt(split[0]);
            }
        }
        String format = String.format("%06d", ++num);
        String numOrder = format + "_" + year;
        return numOrder;

    }

    @Override
    public int reservation(Courrier courrier, String idCourier, int nbr) {

        String onlyNumericText = idCourier.replaceAll("[^\\w\\s\\.]", "");
        String firstSixChar = onlyNumericText.substring(0, 6);
        String year = onlyNumericText.substring(7, 11);
        int id = Integer.parseInt(firstSixChar);

        for (int i = 0; i < nbr; i++) {
            String idCourrierNew = String.format("%06d", ++id) + '_' + year;
            courrier = new Courrier();
            courrier.setIdCourrier(idCourrierNew);
//			TypeCourrier tc = typeCourrierService.findByCode("brouillant");
//			courrier.setTypeCourrier(tc);
            create(courrier);
        }

        return 1;
    }

}
