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
import ma.zs.generated.bean.Sexe;
import ma.zs.generated.bean.Nationality;
import ma.zs.generated.bean.User;

@Entity
public class Expeditor {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String adress ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date createdAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date updatedAt ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date dateNaissance ;
     private String code ;
     private String description ;
     @ManyToOne
     private ExpeditorType expeditorType ; // typeExpidteiur
     private Integer age ;
     private String title ;
     private String titleArab ;

     @ManyToOne
	private Sexe sexe ;
     @ManyToOne
	private Nationality nationality ;
     @ManyToOne
	private User createdBy ;
     @ManyToOne
	private User updatedBy ;

     public Expeditor(){
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
     public String getTitleArab(){
          return this.titleArab;
     }
     public void setTitleArab(String titleArab){
          this.titleArab = titleArab;
     }
     public String getCode(){
          return this.code;
     }
     public void setCode(String code){
          this.code = code;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }

     public ExpeditorType getExpeditorType() {
          return expeditorType;
     }

     public void setExpeditorType(ExpeditorType expeditorType) {
          this.expeditorType = expeditorType;
     }

     public Integer getAge(){
          return this.age;
     }
     public void setAge(Integer age){
          this.age = age;
     }
     public Sexe getSexe(){
          return this.sexe;
     }
     public void setSexe(Sexe sexe){
          this.sexe = sexe;
     }
     public Nationality getNationality(){
          return this.nationality;
     }
     public void setNationality(Nationality nationality){
          this.nationality = nationality;
     }
     public String getAdress(){
          return this.adress;
     }
     public void setAdress(String adress){
          this.adress = adress;
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

     public Date getDateNaissance() {
          return dateNaissance;
     }

     public void setDateNaissance(Date dateNaissance) {
          this.dateNaissance = dateNaissance;
     }
}

