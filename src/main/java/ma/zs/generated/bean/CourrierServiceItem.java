package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.LeService;

@Entity
public class CourrierServiceItem {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;


     @ManyToOne
	private Courrier courrier ;
     @ManyToOne
	private LeService service ;
     private boolean coordinateur;


     public boolean isCoordinateur() {
          return coordinateur;
     }

     public void setCoordinateur(boolean coordinateur) {
          this.coordinateur = coordinateur;
     }

     public CourrierServiceItem(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public Courrier getCourrier(){
          return this.courrier;
     }
     public void setCourrier(Courrier courrier){
          this.courrier = courrier;
     }
     public LeService getService(){
          return this.service;
     }
     public void setService(LeService service){
          this.service = service;
     }

     @Override
     public String toString() {
          return "CourrierServiceItem{" +
                  "id=" + id +
                  ", courrier-id-courrier=" + courrier.getIdCourrier() +
                  ", courrier-id=" + courrier.getId() +
                  ", service=" + service.getTitle() +
                  ", coordinateur=" + coordinateur +
                  '}';
     }
}

