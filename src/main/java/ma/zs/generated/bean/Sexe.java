package ma.zs.generated.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Sexe {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String libelle ;
     private String libelleArab ;


     public Sexe(){
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



}

