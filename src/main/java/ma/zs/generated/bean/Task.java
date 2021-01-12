package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Courrier;

import ma.zs.generated.bean.Status;

@Entity
public class Task {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date createdAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date updatedAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date assignedAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date dateAccuse ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date dateReponse ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date processedAt ;
     private Double delai ;
     private Double relance ;
     private Boolean accuse ;
     private Boolean reponse ;
     private String title ;
     private String description ;
     private String observation ;

     @ManyToOne
	private User updatedBy ;
     @ManyToOne
	private Courrier courrier ;
     @ManyToOne
	private User assigne ;
     @ManyToOne
	private User createdBy ;
     @ManyToOne
	private Status status ;

     public Task(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getTitle(){
          return this.title;
     }
     public void setTitle(String title){
          this.title = title;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }
     public String getObservation(){
          return this.observation;
     }
     public void setObservation(String observation){
          this.observation = observation;
     }
     public Status getStatus(){
          return this.status;
     }
     public void setStatus(Status status){
          this.status = status;
     }
     public Double getDelai(){
          return this.delai;
     }
     public void setDelai(Double delai){
          this.delai = delai;
     }
     public Double getRelance(){
          return this.relance;
     }
     public void setRelance(Double relance){
          this.relance = relance;
     }
    public Boolean isAccuse(){
          return this.accuse;
     }
       public void setAccuse(Boolean accuse){
          this.accuse = accuse;
     }
    public Boolean isReponse(){
          return this.reponse;
     }
       public void setReponse(Boolean reponse){
          this.reponse = reponse;
     }
     public Date getDateAccuse(){
          return this.dateAccuse;
     }
     public void setDateAccuse(Date dateAccuse){
          this.dateAccuse = dateAccuse;
     }
     public Date getDateReponse(){
          return this.dateReponse;
     }
     public void setDateReponse(Date dateReponse){
          this.dateReponse = dateReponse;
     }
     public Date getCreatedAt(){
          return this.createdAt;
     }
     public void setCreatedAt(Date createdAt){
          this.createdAt = createdAt;
     }
     public Date getUpdatedAt(){
          return this.updatedAt;
     }
     public void setUpdatedAt(Date updatedAt){
          this.updatedAt = updatedAt;
     }
     public Date getAssignedAt(){
          return this.assignedAt;
     }
     public void setAssignedAt(Date assignedAt){
          this.assignedAt = assignedAt;
     }
     public Date getProcessedAt(){
          return this.processedAt;
     }
     public void setProcessedAt(Date processedAt){
          this.processedAt = processedAt;
     }
     public User getCreatedBy(){
          return this.createdBy;
     }
     public void setCreatedBy(User createdBy){
          this.createdBy = createdBy;
     }
     public User getUpdatedBy(){
          return this.updatedBy;
     }
     public void setUpdatedBy(User updatedBy){
          this.updatedBy = updatedBy;
     }
     public Courrier getCourrier(){
          return this.courrier;
     }
     public void setCourrier(Courrier courrier){
          this.courrier = courrier;
     }
     public User getAssigne(){
          return this.assigne;
     }
     public void setAssigne(User assigne){
          this.assigne = assigne;
     }



}

