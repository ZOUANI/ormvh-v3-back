package ma.zs.generated.ws.rest.provided.vo;

import java.util.ArrayList;
import java.util.List;

import ma.zs.generated.bean.CourrierPieceJoint;
import ma.zs.generated.bean.PhaseAdmin;
import org.springframework.web.multipart.MultipartFile;

public class CourrierVo {


    private String sujet;

    private String instruction;

    private String expediteurDesc;

    private String sentAt;

    private String trimestre;
    private String annee;

    private String destinataireDesc;

    private String destinataireVille;

    private String relance;

    private String dateRelance;

    private String accuse;

    private String reponse;

    private String dateAccuse;

    private String dateReponse;

    private String dateTraitement;

    private String receivedAt;

    private String id;

    private String idCourrier;

    private String subject;

    private String description;

    private String createdAt;

    private String updatedAt;

    private String delai;
    private String type;

    private PhaseAdminVo phaseAdminVo;
    private NatureClientVo natureClientVo;

    private CourrierObjectVo courrierObjectVo;
    private VoieVo voieVo;
    private NatureCourrierVo natureCourrierVo;
    private CourrierVo linkedToVo;
    private ExpeditorVo expeditorVo;
    private ExpeditorVo destinatorVo;
    private LeServiceVo coordinatorVo;
    private LeServiceVo emetteurVo;
    private EvaluationVo evaluationVo;
    private SubdivisionVo subdivisionVo;
    private StatusVo statusVo;
    private TypeCourrierVo typeCourrierVo;
    private UserVo createdByVo;
    private UserVo updatedByVo;
    private EtatCourrierVo etatCourrierVo;
    private TypeRequetteVo typeRequetteVo;

    private UserVo chef;
    private String length;

    private List<TaskVo> tasksVo;
    private List<CourrierServiceItemVo> courrierServiceItemsVo;

    private String sentAtMax;
    private String sentAtMin;
    private String relanceMax;
    private String relanceMin;
    private String dateRelanceMax;
    private String dateRelanceMin;
    private String dateAccuseMax;
    private String dateAccuseMin;
    private String dateReponseMax;
    private String dateReponseMin;
    private String receivedAtMax;
    private String receivedAtMin;
    private String createdAtMax;
    private String createdAtMin;
    private String updatedAtMax;
    private String updatedAtMin;
    private String delaiMax;
    private String delaiMin;

    public String getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(String dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public CourrierVo() {
        super();
    }


    public String getInstruction() {
        return this.instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }


    public String getExpediteurDesc() {
        return this.expediteurDesc;
    }

    public void setExpediteurDesc(String expediteurDesc) {
        this.expediteurDesc = expediteurDesc;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getSentAt() {
        return this.sentAt;
    }

    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }


    public String getDestinataireDesc() {
        return this.destinataireDesc;
    }

    public void setDestinataireDesc(String destinataireDesc) {
        this.destinataireDesc = destinataireDesc;
    }


    public String getDestinataireVille() {
        return this.destinataireVille;
    }

    public void setDestinataireVille(String destinataireVille) {
        this.destinataireVille = destinataireVille;
    }


    public String getRelance() {
        return this.relance;
    }

    public void setRelance(String relance) {
        this.relance = relance;
    }


    public String getDateRelance() {
        return this.dateRelance;
    }

    public void setDateRelance(String dateRelance) {
        this.dateRelance = dateRelance;
    }


    public String getAccuse() {
        return this.accuse;
    }

    public void setAccuse(String accuse) {
        this.accuse = accuse;
    }


    public String getReponse() {
        return this.reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }


    public String getDateAccuse() {
        return this.dateAccuse;
    }

    public void setDateAccuse(String dateAccuse) {
        this.dateAccuse = dateAccuse;
    }


    public String getDateReponse() {
        return this.dateReponse;
    }

    public void setDateReponse(String dateReponse) {
        this.dateReponse = dateReponse;
    }


    public String getReceivedAt() {
        return this.receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getIdCourrier() {
        return this.idCourrier;
    }

    public void setIdCourrier(String idCourrier) {
        this.idCourrier = idCourrier;
    }


    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    public String getDelai() {
        return this.delai;
    }

    public void setDelai(String delai) {
        this.delai = delai;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public String getSentAtMax() {
        return this.sentAtMax;
    }

    public String getSentAtMin() {
        return this.sentAtMin;
    }

    public void setSentAtMax(String sentAtMax) {
        this.sentAtMax = sentAtMax;
    }

    public void setSentAtMin(String sentAtMin) {
        this.sentAtMin = sentAtMin;
    }


    public String getRelanceMax() {
        return this.relanceMax;
    }

    public String getRelanceMin() {
        return this.relanceMin;
    }

    public void setRelanceMax(String relanceMax) {
        this.relanceMax = relanceMax;
    }

    public void setRelanceMin(String relanceMin) {
        this.relanceMin = relanceMin;
    }


    public String getDateRelanceMax() {
        return this.dateRelanceMax;
    }

    public String getDateRelanceMin() {
        return this.dateRelanceMin;
    }

    public void setDateRelanceMax(String dateRelanceMax) {
        this.dateRelanceMax = dateRelanceMax;
    }

    public void setDateRelanceMin(String dateRelanceMin) {
        this.dateRelanceMin = dateRelanceMin;
    }


    public String getDateAccuseMax() {
        return this.dateAccuseMax;
    }

    public String getDateAccuseMin() {
        return this.dateAccuseMin;
    }

    public void setDateAccuseMax(String dateAccuseMax) {
        this.dateAccuseMax = dateAccuseMax;
    }

    public void setDateAccuseMin(String dateAccuseMin) {
        this.dateAccuseMin = dateAccuseMin;
    }


    public String getDateReponseMax() {
        return this.dateReponseMax;
    }

    public String getDateReponseMin() {
        return this.dateReponseMin;
    }

    public void setDateReponseMax(String dateReponseMax) {
        this.dateReponseMax = dateReponseMax;
    }

    public void setDateReponseMin(String dateReponseMin) {
        this.dateReponseMin = dateReponseMin;
    }


    public String getReceivedAtMax() {
        return this.receivedAtMax;
    }

    public String getReceivedAtMin() {
        return this.receivedAtMin;
    }

    public void setReceivedAtMax(String receivedAtMax) {
        this.receivedAtMax = receivedAtMax;
    }

    public void setReceivedAtMin(String receivedAtMin) {
        this.receivedAtMin = receivedAtMin;
    }


    public String getCreatedAtMax() {
        return this.createdAtMax;
    }

    public String getCreatedAtMin() {
        return this.createdAtMin;
    }

    public void setCreatedAtMax(String createdAtMax) {
        this.createdAtMax = createdAtMax;
    }

    public void setCreatedAtMin(String createdAtMin) {
        this.createdAtMin = createdAtMin;
    }


    public String getUpdatedAtMax() {
        return this.updatedAtMax;
    }

    public String getUpdatedAtMin() {
        return this.updatedAtMin;
    }

    public void setUpdatedAtMax(String updatedAtMax) {
        this.updatedAtMax = updatedAtMax;
    }

    public void setUpdatedAtMin(String updatedAtMin) {
        this.updatedAtMin = updatedAtMin;
    }


    public String getDelaiMax() {
        return this.delaiMax;
    }

    public String getDelaiMin() {
        return this.delaiMin;
    }

    public void setDelaiMax(String delaiMax) {
        this.delaiMax = delaiMax;
    }

    public void setDelaiMin(String delaiMin) {
        this.delaiMin = delaiMin;
    }


    public CourrierObjectVo getCourrierObjectVo() {
        return this.courrierObjectVo;
    }

    public void setCourrierObjectVo(CourrierObjectVo courrierObjectVo) {
        this.courrierObjectVo = courrierObjectVo;
    }

    public VoieVo getVoieVo() {
        return this.voieVo;
    }

    public void setVoieVo(VoieVo voieVo) {
        this.voieVo = voieVo;
    }

    public NatureCourrierVo getNatureCourrierVo() {
        return this.natureCourrierVo;
    }

    public void setNatureCourrierVo(NatureCourrierVo natureCourrierVo) {
        this.natureCourrierVo = natureCourrierVo;
    }

    public CourrierVo getLinkedToVo() {
        return this.linkedToVo;
    }

    public void setLinkedToVo(CourrierVo linkedToVo) {
        this.linkedToVo = linkedToVo;
    }

    public ExpeditorVo getExpeditorVo() {
        return this.expeditorVo;
    }

    public void setExpeditorVo(ExpeditorVo expeditorVo) {
        this.expeditorVo = expeditorVo;
    }

    public ExpeditorVo getDestinatorVo() {
        return this.destinatorVo;
    }

    public void setDestinatorVo(ExpeditorVo destinatorVo) {
        this.destinatorVo = destinatorVo;
    }

    public LeServiceVo getCoordinatorVo() {
        return this.coordinatorVo;
    }

    public void setCoordinatorVo(LeServiceVo coordinatorVo) {
        this.coordinatorVo = coordinatorVo;
    }

    public LeServiceVo getEmetteurVo() {
        return this.emetteurVo;
    }

    public void setEmetteurVo(LeServiceVo emetteurVo) {
        this.emetteurVo = emetteurVo;
    }

    public EvaluationVo getEvaluationVo() {
        return this.evaluationVo;
    }

    public void setEvaluationVo(EvaluationVo evaluationVo) {
        this.evaluationVo = evaluationVo;
    }


    public SubdivisionVo getSubdivisionVo() {
        return this.subdivisionVo;
    }

    public void setSubdivisionVo(SubdivisionVo subdivisionVo) {
        this.subdivisionVo = subdivisionVo;
    }

    public StatusVo getStatusVo() {
        return this.statusVo;
    }

    public void setStatusVo(StatusVo statusVo) {
        this.statusVo = statusVo;
    }

    public TypeCourrierVo getTypeCourrierVo() {
        return this.typeCourrierVo;
    }

    public void setTypeCourrierVo(TypeCourrierVo typeCourrierVo) {
        this.typeCourrierVo = typeCourrierVo;
    }

    public UserVo getCreatedByVo() {
        return this.createdByVo;
    }

    public void setCreatedByVo(UserVo createdByVo) {
        this.createdByVo = createdByVo;
    }

    public UserVo getUpdatedByVo() {
        return this.updatedByVo;
    }

    public void setUpdatedByVo(UserVo updatedByVo) {
        this.updatedByVo = updatedByVo;
    }

    public UserVo getChef() {
        return chef;
    }

    public void setChef(UserVo chef) {
        this.chef = chef;
    }

    public List<TaskVo> getTasksVo() {
        return this.tasksVo;
    }

    public void setTasksVo(List<TaskVo> tasksVo) {
        this.tasksVo = tasksVo;
    }

    public List<CourrierServiceItemVo> getCourrierServiceItemsVo() {
        return this.courrierServiceItemsVo;
    }

    public void setCourrierServiceItemsVo(List<CourrierServiceItemVo> courrierServiceItemsVo) {
        this.courrierServiceItemsVo = courrierServiceItemsVo;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public PhaseAdminVo getPhaseAdminVo() {
        return phaseAdminVo;
    }

    public void setPhaseAdminVo(PhaseAdminVo phaseAdminVo) {
        this.phaseAdminVo = phaseAdminVo;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public NatureClientVo getNatureClientVo() {
        return natureClientVo;
    }

    public void setNatureClientVo(NatureClientVo natureClientVo) {
        this.natureClientVo = natureClientVo;
    }

    public TypeRequetteVo getTypeRequetteVo() {
        return typeRequetteVo;
    }

    public void setTypeRequetteVo(TypeRequetteVo typeRequetteVo) {
        this.typeRequetteVo = typeRequetteVo;
    }

    public EtatCourrierVo getEtatCourrierVo() {
        return etatCourrierVo;
    }

    public void setEtatCourrierVo(EtatCourrierVo etatCourrierVo) {
        this.etatCourrierVo = etatCourrierVo;
    }

    @Override
    public String toString() {
        return "CourrierVo{" +
                "sujet='" + sujet + '\'' +
                ", instruction='" + instruction + '\'' +
                ", expediteurDesc='" + expediteurDesc + '\'' +
                ", sentAt='" + sentAt + '\'' +
                ", trimestre='" + trimestre + '\'' +
                ", destinataireDesc='" + destinataireDesc + '\'' +
                ", destinataireVille='" + destinataireVille + '\'' +
                ", relance='" + relance + '\'' +
                ", dateRelance='" + dateRelance + '\'' +
                ", accuse='" + accuse + '\'' +
                ", reponse='" + reponse + '\'' +
                ", dateAccuse='" + dateAccuse + '\'' +
                ", dateReponse='" + dateReponse + '\'' +
                ", dateTraitement='" + dateTraitement + '\'' +
                ", receivedAt='" + receivedAt + '\'' +
                ", id='" + id + '\'' +
                ", idCourrier='" + idCourrier + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", delai='" + delai + '\'' +
                ", type='" + type + '\'' +
                ", phaseAdminVo=" + phaseAdminVo +
                ", natureClientVo=" + natureClientVo +
                ", courrierObjectVo=" + courrierObjectVo +
                ", voieVo=" + voieVo +
                ", natureCourrierVo=" + natureCourrierVo +
                ", linkedToVo=" + linkedToVo +
                ", expeditorVo=" + expeditorVo +
                ", destinatorVo=" + destinatorVo +
                ", coordinatorVo=" + coordinatorVo +
                ", emetteurVo=" + emetteurVo +
                ", evaluationVo=" + evaluationVo +
                ", subdivisionVo=" + subdivisionVo +
                ", statusVo=" + statusVo +
                ", typeCourrierVo=" + typeCourrierVo +
                ", createdByVo=" + createdByVo +
                ", updatedByVo=" + updatedByVo +
                ", etatCourrierVo=" + etatCourrierVo +
                ", typeRequetteVo=" + typeRequetteVo +
                ", chef=" + chef +
                ", length='" + length + '\'' +
                ", tasksVo=" + tasksVo +
                ", courrierServiceItemsVo=" + courrierServiceItemsVo +
                ", sentAtMax='" + sentAtMax + '\'' +
                ", sentAtMin='" + sentAtMin + '\'' +
                ", relanceMax='" + relanceMax + '\'' +
                ", relanceMin='" + relanceMin + '\'' +
                ", dateRelanceMax='" + dateRelanceMax + '\'' +
                ", dateRelanceMin='" + dateRelanceMin + '\'' +
                ", dateAccuseMax='" + dateAccuseMax + '\'' +
                ", dateAccuseMin='" + dateAccuseMin + '\'' +
                ", dateReponseMax='" + dateReponseMax + '\'' +
                ", dateReponseMin='" + dateReponseMin + '\'' +
                ", receivedAtMax='" + receivedAtMax + '\'' +
                ", receivedAtMin='" + receivedAtMin + '\'' +
                ", createdAtMax='" + createdAtMax + '\'' +
                ", createdAtMin='" + createdAtMin + '\'' +
                ", updatedAtMax='" + updatedAtMax + '\'' +
                ", updatedAtMin='" + updatedAtMin + '\'' +
                ", delaiMax='" + delaiMax + '\'' +
                ", delaiMin='" + delaiMin + '\'' +
                '}';
    }
}