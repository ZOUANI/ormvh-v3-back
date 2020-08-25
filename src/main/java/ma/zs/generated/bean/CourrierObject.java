package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.User;

@Entity
public class CourrierObject {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date createdAt ;
     @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss.SSS")
     @Temporal(TemporalType.TIMESTAMP)
     private Date updatedAt ;
     private String titleArab ;
     private String code ;
     private String title ;
     @ManyToOne
	private User createdBy ;
     @ManyToOne
	private User updatedBy ;

     public CourrierObject(){
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

	

	public CourrierObject(Long id, Date createdAt, Date updatedAt, String titleArab, String code, String title, User createdBy, User updatedBy) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.titleArab = titleArab;
		this.code = code;
		this.title = title;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "CourrierObject [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", titleArab="
				+ titleArab + ", code=" + code + ", title=" + title 
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}



}

