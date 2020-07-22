package  ma.zs.generated.ws.rest.provided.vo;

import java.util.Date;

public class VoieVo {

     private String createdAt ;
   
     private String updatedAt ;
   
     private String libelleArab ;
   
     private String code ;
   
     private String id ;
   
     private String libelle ;
   

	private UserVo createdByVo ;
	private UserVo updatedByVo ;


     private String createdAtMax ;
     private String createdAtMin ;
     private String updatedAtMax ;
     private String updatedAtMin ;

 public VoieVo(){
       super();
     }


     public String getCreatedAt(){
          return this.createdAt;
     }
      public void setCreatedAt(String createdAt){
          this.createdAt = createdAt;
     }


     public String getUpdatedAt(){
          return this.updatedAt;
     }
      public void setUpdatedAt(String updatedAt){
          this.updatedAt = updatedAt;
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


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     public String getLibelle(){
          return this.libelle;
     }
      public void setLibelle(String libelle){
          this.libelle = libelle;
     }



      public String getCreatedAtMax(){
          return this.createdAtMax;
     }
     
      public String getCreatedAtMin(){
          return this.createdAtMin;
     }

     public void setCreatedAtMax(String createdAtMax){
          this.createdAtMax = createdAtMax;
     }

     public void setCreatedAtMin(String createdAtMin){
          this.createdAtMin = createdAtMin;
     }
     
     

      public String getUpdatedAtMax(){
          return this.updatedAtMax;
     }
     
      public String getUpdatedAtMin(){
          return this.updatedAtMin;
     }

     public void setUpdatedAtMax(String updatedAtMax){
          this.updatedAtMax = updatedAtMax;
     }

     public void setUpdatedAtMin(String updatedAtMin){
          this.updatedAtMin = updatedAtMin;
     }
     
     
     

      public UserVo getCreatedByVo(){
          return this.createdByVo;
     }
       
     public void setCreatedByVo(UserVo createdByVo){
          this.createdByVo = createdByVo;
     }
   
      public UserVo getUpdatedByVo(){
          return this.updatedByVo;
     }
       
     public void setUpdatedByVo(UserVo updatedByVo){
          this.updatedByVo = updatedByVo;
     }
   




}