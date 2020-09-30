package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import ma.zs.generated.bean.CourrierObject;
import ma.zs.generated.bean.Voie;
import ma.zs.generated.bean.NatureCourrier;
import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.Expeditor;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.bean.Evaluation;
import ma.zs.generated.bean.ExpeditorType;
import ma.zs.generated.bean.Subdivision;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.bean.User;

@Entity
public class Courrier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String instruction;
    private String expediteurDesc;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentAt;
    private String destinataireDesc;
    private String destinataireVille;
    private Double relance;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRelance;
    private Boolean accuse;
    private Boolean reponse;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAccuse;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReponse;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedAt;
    private String idCourrier;
    private String subject;
    private String description;
    @ManyToOne
    private EtatCourrier etatCourrier;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    private Double delai;
    private String type;
    @OneToMany
    private List<CourrierPieceJoint> courriersPieceJoint = new ArrayList<CourrierPieceJoint>();

    @ManyToOne
    private CourrierObject courrierObject;
    @ManyToOne
    private Voie voie;
    @ManyToOne
    private NatureCourrier natureCourrier;
    @ManyToOne
    private Courrier linkedTo;
    @ManyToOne
    private Expeditor expeditor;
    @ManyToOne
    private Expeditor destinator;
    @ManyToOne
    private LeService coordinator;
    @ManyToOne
    private LeService emetteur;
    @ManyToOne
    private Evaluation evaluation;
    @ManyToOne
    private ExpeditorType expeditorType;
    @ManyToOne
    private Subdivision subdivision;
    @ManyToOne
    private Status status;
    @ManyToOne
    private TypeCourrier typeCourrier;
    @ManyToOne
    private User createdBy;
    @ManyToOne
    private User updatedBy;
    @OneToMany(mappedBy = "courrier",cascade = CascadeType.REMOVE)
    private List<Task> tasks;
    @OneToMany(mappedBy = "courrier")
    private List<CourrierServiceItem> courrierServiceItems;

    public EtatCourrier getEtatCourrier() {
        return etatCourrier;
    }

    public void setEtatCourrier(EtatCourrier etatCourrier) {
        this.etatCourrier = etatCourrier;
    }

    public Boolean getAccuse() {
        return accuse;
    }

    public Boolean getReponse() {
        return reponse;
    }



    public Courrier() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Courrier)) {
            return false;
        }
        return id != null && id.equals(((Courrier) o).id);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Double getDelai() {
        return this.delai;
    }

    public void setDelai(Double delai) {
        this.delai = delai;
    }

    public Double getRelance() {
        return this.relance;
    }

    public void setRelance(Double relance) {
        this.relance = relance;
    }

    public Date getDateRelance() {
        return this.dateRelance;
    }

    public void setDateRelance(Date dateRelance) {
        this.dateRelance = dateRelance;
    }

    public Boolean isAccuse() {
        return this.accuse;
    }

    public void setAccuse(Boolean accuse) {
        this.accuse = accuse;
    }

    public Boolean isReponse() {
        return this.reponse;
    }

    public void setReponse(Boolean reponse) {
        this.reponse = reponse;
    }

    public Date getDateAccuse() {
        return this.dateAccuse;
    }

    public void setDateAccuse(Date dateAccuse) {
        this.dateAccuse = dateAccuse;
    }

    public Date getDateReponse() {
        return this.dateReponse;
    }

    public void setDateReponse(Date dateReponse) {
        this.dateReponse = dateReponse;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TypeCourrier getTypeCourrier() {
        return this.typeCourrier;
    }

    public void setTypeCourrier(TypeCourrier typeCourrier) {
        this.typeCourrier = typeCourrier;
    }

    public Date getReceivedAt() {
        return this.receivedAt;
    }

    public void setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt;
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

    public Date getSentAt() {
        return this.sentAt;
    }

    public void setSentAt(Date sentAt) {
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

    public CourrierObject getCourrierObject() {
        return this.courrierObject;
    }

    public void setCourrierObject(CourrierObject courrierObject) {
        this.courrierObject = courrierObject;
    }

    public Voie getVoie() {
        return this.voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public NatureCourrier getNatureCourrier() {
        return this.natureCourrier;
    }

    public void setNatureCourrier(NatureCourrier natureCourrier) {
        this.natureCourrier = natureCourrier;
    }

    public Courrier getLinkedTo() {
        return this.linkedTo;
    }

    public void setLinkedTo(Courrier linkedTo) {
        this.linkedTo = linkedTo;
    }

    public Expeditor getExpeditor() {
        return this.expeditor;
    }

    public void setExpeditor(Expeditor expeditor) {
        this.expeditor = expeditor;
    }

    public Expeditor getDestinator() {
        return this.destinator;
    }

    public void setDestinator(Expeditor destinator) {
        this.destinator = destinator;
    }

    public LeService getCoordinator() {
        return this.coordinator;
    }

    public void setCoordinator(LeService coordinator) {
        this.coordinator = coordinator;
    }

    public LeService getEmetteur() {
        return this.emetteur;
    }

    public void setEmetteur(LeService emetteur) {
        this.emetteur = emetteur;
    }

    public Evaluation getEvaluation() {
        return this.evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public ExpeditorType getExpeditorType() {
        return this.expeditorType;
    }

    public void setExpeditorType(ExpeditorType expeditorType) {
        this.expeditorType = expeditorType;
    }

    public Subdivision getSubdivision() {
        return this.subdivision;
    }

    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<CourrierServiceItem> getCourrierServiceItems() {
        return this.courrierServiceItems;
    }
    public List<CourrierPieceJoint> getCourriersPieceJoint() {
		return courriersPieceJoint;
	}

	public void setCourriersPieceJoint(List<CourrierPieceJoint> courriersPieceJoint) {
		this.courriersPieceJoint = courriersPieceJoint;
	}
    public void setCourrierServiceItems(List<CourrierServiceItem> courrierServiceItems) {
        this.courrierServiceItems = courrierServiceItems;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}

