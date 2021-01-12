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
import com.fasterxml.jackson.annotation.JsonManagedReference;
import ma.zs.generated.bean.User;

@Entity
public class LeService {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String description ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date createdAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date updatedAt ;
     private String libelleArab ;
     private String code ;
     private String title ;
     @ManyToOne
 	private User chef;


	@ManyToOne
	private User createdBy ;
     @ManyToOne
	private User updatedBy ;

     public LeService(){
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
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
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
     public User getChef() {
		return chef;
	}

	public void setChef(User chef) {
		this.chef = chef;
	}

     
     @Override
     public boolean equals(Object o) {
         if (this == o) {
             return true;
         }
         if (!(o instanceof LeService)) {
             return false;
         }
         return id != null && id.equals(((LeService) o).id);
     }


}

