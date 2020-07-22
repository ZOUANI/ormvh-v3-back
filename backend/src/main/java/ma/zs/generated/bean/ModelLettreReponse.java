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
import ma.zs.generated.bean.CategorieModelLettreReponse;
import ma.zs.generated.bean.User;

@Entity
public class ModelLettreReponse {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date createdAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date updatedAt ;
     private String libelleArab ;
     private String code ;
     private String chemin ;
     private String libelle ;

     @ManyToOne
	private CategorieModelLettreReponse categorieModelLettreReponse ;
     @ManyToOne
	private User createdBy ;
     @ManyToOne
	private User updatedBy ;

     public ModelLettreReponse(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getLibelle(){
          return this.libelle;
     }
     public void setLibelle(String libelle){
          this.libelle = libelle;
     }
     public String getLibelleArab(){
          return this.libelleArab;
     }
     public void setLibelleArab(String libelleArab){
          this.libelleArab = libelleArab;
     }
     public String getCode(){
          return this.code;
     }
     public void setCode(String code){
          this.code = code;
     }
     public String getChemin(){
          return this.chemin;
     }
     public void setChemin(String chemin){
          this.chemin = chemin;
     }
     public CategorieModelLettreReponse getCategorieModelLettreReponse(){
          return this.categorieModelLettreReponse;
     }
     public void setCategorieModelLettreReponse(CategorieModelLettreReponse categorieModelLettreReponse){
          this.categorieModelLettreReponse = categorieModelLettreReponse;
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



}

