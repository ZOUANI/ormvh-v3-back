package ma.zs.generated.ws.rest.provided.converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ma.zs.generated.bean.*;
import ma.zs.generated.ws.rest.provided.vo.CourrierServiceItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.generated.service.util.DateUtil;
import ma.zs.generated.service.util.ListUtil;
import ma.zs.generated.service.util.NumberUtil;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.CourrierVo;
import ma.zs.generated.ws.rest.provided.vo.LeServiceVo;

@Component
public class CourrierConverter extends AbstractConverter<Courrier, CourrierVo> {

    @Autowired
    private EtatCourrierConverter etatCourrierConverter;
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private ExpeditorTypeConverter expeditorTypeConverter;
    @Autowired
    private StatusConverter statusConverter;
    @Autowired
    private TaskConverter taskConverter;
    @Autowired
    private NatureCourrierConverter natureCourrierConverter;
    @Autowired
    private CourrierServiceItemConverter courrierServiceItemConverter;
    @Autowired
    private EvaluationConverter evaluationConverter;
    @Autowired
    private CourrierObjectConverter courrierObjectConverter;
    @Autowired
    private SubdivisionConverter subdivisionConverter;

    @Autowired
    private NatureClientConverter natureClientConverter;
    @Autowired
    private PhaseAdminConverter phaseAdminConverter;
    @Autowired
    private TypeRequetteConverter typeRequetteConverter;

    @Autowired
    private ExpeditorConverter expeditorConverter;
    @Autowired
    private TypeCourrierConverter typeCourrierConverter;
    @Autowired
    private VoieConverter voieConverter;
    @Autowired
    private LeServiceConverter leServiceConverter;
    private Boolean courrierObject;
    private Boolean voie;
    private Boolean natureCourrier;
    private Boolean linkedTo;
    private Boolean expeditor;
    private Boolean destinator;
    private Boolean coordinator;
    private Boolean emetteur;
    private Boolean evaluation;
    private Boolean expeditorType;
    private Boolean subdivision;
    private Boolean status;
    private Boolean typeCourrier;
    private Boolean phaseAdmin;
    private Boolean natureClient;
    private Boolean createdBy;
    private Boolean updatedBy;
    private Boolean etatCourrier;
    private Boolean tasks;
    private Boolean sujet;
    private Boolean typeRequette;


    private Boolean courrierServiceItems;
    private List<CourrierPieceJoint> courrierPieceJoints = new ArrayList<CourrierPieceJoint>();


    public CourrierConverter() {
        init(true);
    }

    @Override
    public Courrier toItem(CourrierVo vo) {
        if (vo == null) {
            return null;
        } else {
            Courrier item = new Courrier();
            if (StringUtil.isNotEmpty(vo.getSujet()))
                item.setSujet(vo.getSujet());
            if (StringUtil.isNotEmpty(vo.getTrimestre()))
                item.setTrimestre(NumberUtil.toInt(vo.getTrimestre()));
            if (StringUtil.isNotEmpty(vo.getInstruction()))
                item.setInstruction(vo.getInstruction());
            if (StringUtil.isNotEmpty(vo.getExpediteurDesc()))
                item.setExpediteurDesc(vo.getExpediteurDesc());
            if (StringUtil.isNotEmpty(vo.getDateTraitement()))
                item.setDateTraitement(DateUtil.parse(vo.getDateTraitement()));
            if (StringUtil.isNotEmpty(vo.getSentAt()))
                item.setSentAt(DateUtil.parse(vo.getSentAt()));
            if (StringUtil.isNotEmpty(vo.getDestinataireDesc()))
                item.setDestinataireDesc(vo.getDestinataireDesc());
            if (StringUtil.isNotEmpty(vo.getDestinataireVille()))
                item.setDestinataireVille(vo.getDestinataireVille());
            if (StringUtil.isNotEmpty(vo.getRelance()))
                item.setRelance(NumberUtil.toDouble(vo.getRelance()));
            if (StringUtil.isNotEmpty(vo.getDateRelance()))
                item.setDateRelance(DateUtil.parse(vo.getDateRelance()));
            if (StringUtil.isNotEmpty(vo.getAccuse()))
                item.setAccuse(NumberUtil.toBoolean(vo.getAccuse()));
            if (StringUtil.isNotEmpty(vo.getReponse()))
                item.setReponse(NumberUtil.toBoolean(vo.getReponse()));
            if (StringUtil.isNotEmpty(vo.getDateAccuse()))
                item.setDateAccuse(DateUtil.parse(vo.getDateAccuse()));
            if (StringUtil.isNotEmpty(vo.getDateReponse()))
                item.setDateReponse(DateUtil.parse(vo.getDateReponse()));
            if (StringUtil.isNotEmpty(vo.getReceivedAt()))
                item.setReceivedAt(DateUtil.parse(vo.getReceivedAt()));
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getIdCourrier()))
                item.setIdCourrier(vo.getIdCourrier());
            if (StringUtil.isNotEmpty(vo.getSubject()))
                item.setSubject(vo.getSubject());
            if (StringUtil.isNotEmpty(vo.getDescription()))
                item.setDescription(vo.getDescription());
            if (StringUtil.isNotEmpty(vo.getCreatedAt()))
                item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
            if (StringUtil.isNotEmpty(vo.getUpdatedAt()))
                item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));

            if (StringUtil.isNotEmpty(vo.getSentAt()))
                item.setSentAt(DateUtil.parse(vo.getSentAt()));

            if (StringUtil.isNotEmpty(vo.getDelai()))
                item.setDelai(NumberUtil.toDouble(vo.getDelai()));

            if (vo.getNatureClientVo() != null && this.natureClient)
                item.setNatureClient(natureClientConverter.toItem(vo.getNatureClientVo()));


            if (vo.getTypeRequetteVo() != null && this.typeRequette)
                item.setTypeRequette(typeRequetteConverter.toItem(vo.getTypeRequetteVo()));

            if (vo.getPhaseAdminVo() != null && this.phaseAdmin)
                item.setPhaseAdmin(phaseAdminConverter.toItem(vo.getPhaseAdminVo()));


            if (vo.getCourrierObjectVo() != null && this.courrierObject)
                item.setCourrierObject(courrierObjectConverter.toItem(vo.getCourrierObjectVo()));
            if (vo.getVoieVo() != null && this.voie)
                item.setVoie(voieConverter.toItem(vo.getVoieVo()));
            if (vo.getNatureCourrierVo() != null && this.natureCourrier)
                item.setNatureCourrier(natureCourrierConverter.toItem(vo.getNatureCourrierVo()));
            if (vo.getLinkedToVo() != null && this.linkedTo)
                item.setLinkedTo(toItem(vo.getLinkedToVo()));
            if (vo.getExpeditorVo() != null && this.expeditor)
                item.setExpeditor(expeditorConverter.toItem(vo.getExpeditorVo()));
            if (vo.getDestinatorVo() != null && this.destinator)
                item.setDestinator(expeditorConverter.toItem(vo.getDestinatorVo()));
            if (vo.getCoordinatorVo() != null && this.coordinator)
                item.setCoordinator(leServiceConverter.toItem(vo.getCoordinatorVo()));
            if (vo.getEmetteurVo() != null && this.emetteur)
                item.setEmetteur(leServiceConverter.toItem(vo.getEmetteurVo()));
            if (vo.getEvaluationVo() != null && this.evaluation)
                item.setEvaluation(evaluationConverter.toItem(vo.getEvaluationVo()));

            if (vo.getSubdivisionVo() != null && this.subdivision)
                item.setSubdivision(subdivisionConverter.toItem(vo.getSubdivisionVo()));
            if (vo.getStatusVo() != null && this.status)
                item.setStatus(statusConverter.toItem(vo.getStatusVo()));
            if (vo.getTypeCourrierVo() != null && this.typeCourrier)
                item.setTypeCourrier(typeCourrierConverter.toItem(vo.getTypeCourrierVo()));
            if (vo.getCreatedByVo() != null && this.createdBy)
                item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo()));
            if (vo.getUpdatedByVo() != null && this.updatedBy)
                item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo()));

            if (vo.getEtatCourrierVo() != null && this.etatCourrier)
                item.setEtatCourrier(etatCourrierConverter.toItem(vo.getEtatCourrierVo()));

            if (ListUtil.isNotEmpty(vo.getTasksVo()) && this.tasks)
                item.setTasks(taskConverter.toItem(vo.getTasksVo()));

            if (ListUtil.isNotEmpty(vo.getCourrierServiceItemsVo()) && this.courrierServiceItems) {
                List<CourrierServiceItemVo> list = vo.getCourrierServiceItemsVo().stream().filter(distinctByKey(p -> p.getServiceVo().getId())).collect(Collectors.toList());
                System.out.println(" haaaa list.size() = " + list.size());
                item.setCourrierServiceItems(courrierServiceItemConverter.toItem(list));
            }
            if (ListUtil.isNotEmpty(vo.getCourrierPieceJoints())) {
                List<CourrierPieceJoint> list = vo.getCourrierPieceJoints();
                System.out.println(" haaaa list.size() = " + list.size());
                vo.getCourrierPieceJoints().stream().forEach(e-> {
                            try {
                                byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.home") + "/pieces-jointes/" + e.getChemin()));
                                e.setContenu(bytes);
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                        }
                );
                item.setCourriersPieceJoint(courrierPieceJoints);
            }

            return item;
        }
    }

    public <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    @Override
    public CourrierVo toVo(Courrier item) {
        if (item == null) {
            return null;
        } else {
            CourrierVo vo = new CourrierVo();

            if (StringUtil.isNotEmpty(item.getSujet()))
                vo.setSujet(item.getSujet());


            if (StringUtil.isNotEmpty(item.getType()))
                vo.setType(item.getType());


            if (StringUtil.isNotEmpty(item.getInstruction()))
                vo.setInstruction(item.getInstruction());

            if (StringUtil.isNotEmpty(item.getExpediteurDesc()))
                vo.setExpediteurDesc(item.getExpediteurDesc());

            if (item.getSentAt() != null)
                vo.setSentAt(DateUtil.formateDate(item.getSentAt()));
            if (StringUtil.isNotEmpty(item.getDestinataireDesc()))
                vo.setDestinataireDesc(item.getDestinataireDesc());

            if (StringUtil.isNotEmpty(item.getDestinataireVille()))
                vo.setDestinataireVille(item.getDestinataireVille());
            if (item.getTrimestre() != null)
                vo.setTrimestre(NumberUtil.toString(item.getTrimestre()));
            if (item.getRelance() != null)
                vo.setRelance(NumberUtil.toString(item.getRelance()));
            if (item.getDateRelance() != null)
                vo.setDateRelance(DateUtil.formateDate(item.getDateRelance()));
            if (item.isAccuse() != null)
                vo.setAccuse(NumberUtil.toString(item.isAccuse()));
            if (item.isReponse() != null)
                vo.setReponse(NumberUtil.toString(item.isReponse()));
            if (item.getDateAccuse() != null)
                vo.setDateAccuse(DateUtil.formateDate(item.getDateAccuse()));
            if (item.getDateReponse() != null)
                vo.setDateReponse(DateUtil.formateDate(item.getDateReponse()));
            if (item.getReceivedAt() != null)
                vo.setReceivedAt(DateUtil.formateDate(item.getReceivedAt()));
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));
            if (StringUtil.isNotEmpty(item.getIdCourrier()))
                vo.setIdCourrier(item.getIdCourrier());

            if (StringUtil.isNotEmpty(item.getSubject()))
                vo.setSubject(item.getSubject());

            if (StringUtil.isNotEmpty(item.getDescription()))
                vo.setDescription(item.getDescription());

            if (item.getDateTraitement() != null)
                vo.setDateTraitement(DateUtil.formateDate(item.getDateTraitement()));

            if (item.getCreatedAt() != null)
                vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));
            if (item.getUpdatedAt() != null)
                vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));

            if (item.getSentAt() != null)
                vo.setSentAt(DateUtil.formateDate(item.getSentAt()));


            if (item.getDelai() != null)
                vo.setDelai(NumberUtil.toString(item.getDelai()));

            if (item.getNatureClient() != null && this.natureClient) {
                vo.setNatureClientVo(natureClientConverter.toVo(item.getNatureClient()));
            }
            if (item.getTypeRequette() != null && this.typeRequette) {
                vo.setTypeRequetteVo(typeRequetteConverter.toVo(item.getTypeRequette()));
            }

            if (item.getPhaseAdmin() != null && this.phaseAdmin) {
                vo.setPhaseAdminVo(phaseAdminConverter.toVo(item.getPhaseAdmin()));
            }


            if (item.getCourrierObject() != null && this.courrierObject) {
                vo.setCourrierObjectVo(courrierObjectConverter.toVo(item.getCourrierObject()));
            }
            if (item.getEtatCourrier() != null && this.etatCourrier) {
                vo.setEtatCourrierVo(etatCourrierConverter.toVo(item.getEtatCourrier()));
            }
            if (item.getVoie() != null && this.voie) {
                vo.setVoieVo(voieConverter.toVo(item.getVoie()));
            }
            if (item.getNatureCourrier() != null && this.natureCourrier) {
                vo.setNatureCourrierVo(natureCourrierConverter.toVo(item.getNatureCourrier()));
            }
            if (item.getLinkedTo() != null && this.linkedTo) {
                this.setLinkedTo(false);
                vo.setLinkedToVo(toVo(item.getLinkedTo()));
                this.setLinkedTo(true);
            }
            if (item.getExpeditor() != null && this.expeditor) {
                vo.setExpeditorVo(expeditorConverter.toVo(item.getExpeditor()));
            }
            if (item.getDestinator() != null && this.destinator) {
                vo.setDestinatorVo(expeditorConverter.toVo(item.getDestinator()));
            }
            if (item.getCoordinator() != null && this.coordinator) {
                vo.setCoordinatorVo(leServiceConverter.toVo(item.getCoordinator()));
            }
            if (item.getEmetteur() != null && this.emetteur) {
                vo.setEmetteurVo(leServiceConverter.toVo(item.getEmetteur()));
            }
            if (item.getEvaluation() != null && this.evaluation) {
                vo.setEvaluationVo(evaluationConverter.toVo(item.getEvaluation()));
            }

            if (item.getSubdivision() != null && this.subdivision) {
                vo.setSubdivisionVo(subdivisionConverter.toVo(item.getSubdivision()));
            }
            if (item.getStatus() != null && this.status) {
                vo.setStatusVo(statusConverter.toVo(item.getStatus()));
            }
            if (item.getTypeCourrier() != null && this.typeCourrier) {
                vo.setTypeCourrierVo(typeCourrierConverter.toVo(item.getTypeCourrier()));
            }
            if (item.getCreatedBy() != null && this.createdBy) {
                vo.setCreatedByVo(userConverter.toVo(item.getCreatedBy()));
            }
            if (item.getUpdatedBy() != null && this.updatedBy) {
                vo.setUpdatedByVo(userConverter.toVo(item.getUpdatedBy()));
            }
            if (ListUtil.isNotEmpty(item.getTasks()) && this.tasks) {

                taskConverter.setCourrier(false);
                vo.setTasksVo(taskConverter.toVo(item.getTasks()));
                taskConverter.setCourrier(true);
            }
            if (ListUtil.isNotEmpty(item.getCourrierServiceItems()) && this.courrierServiceItems) {

                courrierServiceItemConverter.setCourrier(false);
                vo.setCourrierServiceItemsVo(courrierServiceItemConverter.toVo(item.getCourrierServiceItems()));
                courrierServiceItemConverter.setCourrier(true);
            }

            return vo;

        }
    }

    public void init(Boolean value) {
        courrierObject = value;
        voie = value;
        natureCourrier = value;
        linkedTo = value;
        expeditor = value;
        destinator = value;
        coordinator = value;
        emetteur = value;
        evaluation = value;
        expeditorType = value;
        subdivision = value;
        status = value;
        typeCourrier = value;
        createdBy = value;
        updatedBy = value;
        tasks = value;
        courrierServiceItems = value;
        etatCourrier = value;
        natureClient = value;
        phaseAdmin = value;
        sujet = value;
        typeRequette = value;
    }

    public UserConverter getUserConverter() {
        return this.userConverter;
    }

    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public ExpeditorTypeConverter getExpeditorTypeConverter() {
        return this.expeditorTypeConverter;
    }

    public void setExpeditorTypeConverter(ExpeditorTypeConverter expeditorTypeConverter) {
        this.expeditorTypeConverter = expeditorTypeConverter;
    }

    public StatusConverter getStatusConverter() {
        return this.statusConverter;
    }

    public void setStatusConverter(StatusConverter statusConverter) {
        this.statusConverter = statusConverter;
    }

    public TaskConverter getTaskConverter() {
        return this.taskConverter;
    }

    public void setTaskConverter(TaskConverter taskConverter) {
        this.taskConverter = taskConverter;
    }

    public NatureCourrierConverter getNatureCourrierConverter() {
        return this.natureCourrierConverter;
    }

    public void setNatureCourrierConverter(NatureCourrierConverter natureCourrierConverter) {
        this.natureCourrierConverter = natureCourrierConverter;
    }

    public CourrierServiceItemConverter getCourrierServiceItemConverter() {
        return this.courrierServiceItemConverter;
    }

    public void setCourrierServiceItemConverter(CourrierServiceItemConverter courrierServiceItemConverter) {
        this.courrierServiceItemConverter = courrierServiceItemConverter;
    }

    public EvaluationConverter getEvaluationConverter() {
        return this.evaluationConverter;
    }

    public void setEvaluationConverter(EvaluationConverter evaluationConverter) {
        this.evaluationConverter = evaluationConverter;
    }

    public CourrierObjectConverter getCourrierObjectConverter() {
        return this.courrierObjectConverter;
    }

    public void setCourrierObjectConverter(CourrierObjectConverter courrierObjectConverter) {
        this.courrierObjectConverter = courrierObjectConverter;
    }

    public SubdivisionConverter getSubdivisionConverter() {
        return this.subdivisionConverter;
    }

    public void setSubdivisionConverter(SubdivisionConverter subdivisionConverter) {
        this.subdivisionConverter = subdivisionConverter;
    }

    public ExpeditorConverter getExpeditorConverter() {
        return this.expeditorConverter;
    }

    public void setExpeditorConverter(ExpeditorConverter expeditorConverter) {
        this.expeditorConverter = expeditorConverter;
    }

    public TypeCourrierConverter getTypeCourrierConverter() {
        return this.typeCourrierConverter;
    }

    public void setTypeCourrierConverter(TypeCourrierConverter typeCourrierConverter) {
        this.typeCourrierConverter = typeCourrierConverter;
    }

    public VoieConverter getVoieConverter() {
        return this.voieConverter;
    }

    public void setVoieConverter(VoieConverter voieConverter) {
        this.voieConverter = voieConverter;
    }

    public LeServiceConverter getLeServiceConverter() {
        return this.leServiceConverter;
    }

    public void setLeServiceConverter(LeServiceConverter leServiceConverter) {
        this.leServiceConverter = leServiceConverter;
    }

    public boolean isCourrierObject() {
        return this.courrierObject;
    }

    public void setCourrierObject(boolean courrierObject) {
        this.courrierObject = courrierObject;
    }

    public boolean isVoie() {
        return this.voie;
    }

    public void setVoie(boolean voie) {
        this.voie = voie;
    }

    public boolean isNatureCourrier() {
        return this.natureCourrier;
    }

    public void setNatureCourrier(boolean natureCourrier) {
        this.natureCourrier = natureCourrier;
    }

    public boolean isLinkedTo() {
        return this.linkedTo;
    }

    public void setLinkedTo(boolean linkedTo) {
        this.linkedTo = linkedTo;
    }

    public boolean isExpeditor() {
        return this.expeditor;
    }

    public void setExpeditor(boolean expeditor) {
        this.expeditor = expeditor;
    }

    public boolean isDestinator() {
        return this.destinator;
    }

    public void setDestinator(boolean destinator) {
        this.destinator = destinator;
    }

    public boolean isCoordinator() {
        return this.coordinator;
    }

    public void setCoordinator(boolean coordinator) {
        this.coordinator = coordinator;
    }

    public boolean isEmetteur() {
        return this.emetteur;
    }

    public void setEmetteur(boolean emetteur) {
        this.emetteur = emetteur;
    }

    public boolean isEvaluation() {
        return this.evaluation;
    }

    public void setEvaluation(boolean evaluation) {
        this.evaluation = evaluation;
    }

    public boolean isExpeditorType() {
        return this.expeditorType;
    }

    public void setExpeditorType(boolean expeditorType) {
        this.expeditorType = expeditorType;
    }

    public boolean isSubdivision() {
        return this.subdivision;
    }

    public void setSubdivision(boolean subdivision) {
        this.subdivision = subdivision;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isTypeCourrier() {
        return this.typeCourrier;
    }

    public void setTypeCourrier(boolean typeCourrier) {
        this.typeCourrier = typeCourrier;
    }

    public boolean isCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(boolean createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(boolean updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean isTasks() {
        return this.tasks;
    }

    public void setTasks(Boolean tasks) {
        this.tasks = tasks;
    }

    public Boolean isCourrierServiceItems() {
        return this.courrierServiceItems;
    }

    public void setCourrierServiceItems(Boolean courrierServiceItems) {
        this.courrierServiceItems = courrierServiceItems;
    }

    public Map<LeServiceVo, List<CourrierVo>> convertMapToVo(Map<LeService, List<Courrier>> map) {
        Map<LeServiceVo, List<CourrierVo>> mapVo = new HashMap();
        for (Map.Entry<LeService, List<Courrier>> entry : map.entrySet()) {
            mapVo.put(leServiceConverter.toVo(entry.getKey()), toVo(entry.getValue()));
        }

        return mapVo;

    }
}