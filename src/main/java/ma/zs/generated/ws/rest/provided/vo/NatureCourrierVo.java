package  ma.zs.generated.ws.rest.provided.vo;

import java.util.Date;

public class NatureCourrierVo {

     private String code ;
   
     private String createdAt ;
   
     private String updatedAt ;
   
     private String delai ;
   
     private String relance ;
   
     private String libelleArab ;
   
     private String id ;
   
     private String libelle ;
   

	private UserVo createdByVo ;
	private UserVo updatedByVo ;


     private String createdAtMax ;
     private String createdAtMin ;
     private String updatedAtMax ;
     private String updatedAtMin ;
     private String delaiMax ;
     private String delaiMin ;
     private String relanceMax ;
     private String relanceMin ;
     
     private String categorie;



public NatureCourrierVo(){
       super();
     }


     public String getCode(){
          return this.code;
     }
      public void setCode(String code){
          this.code = code;
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


     public String getDelai(){
          return this.delai;
     }
      public void setDelai(String delai){
          this.delai = delai;
     }


     public String getRelance(){
          return this.relance;
     }
      public void setRelance(String relance){
          this.relance = relance;
     }


     public String getLibelleArab(){
          return this.libelleArab;
     }
      public void setLibelleArab(String libelleArab){
          this.libelleArab = libelleArab;
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
     
     

      public String getDelaiMax(){
          return this.delaiMax;
     }
     
      public String getDelaiMin(){
          return this.delaiMin;
     }

     public void setDelaiMax(String delaiMax){
          this.delaiMax = delaiMax;
     }

     public void setDelaiMin(String delaiMin){
          this.delaiMin = delaiMin;
     }
     
     

      public String getRelanceMax(){
          return this.relanceMax;
     }
     
      public String getRelanceMin(){
          return this.relanceMin;
     }

     public void setRelanceMax(String relanceMax){
          this.relanceMax = relanceMax;
     }

     public void setRelanceMin(String relanceMin){
          this.relanceMin = relanceMin;
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
   

 	public String getCategorie() {
 		return categorie;
 	}

 	public void setCategorie(String categorie) {
 		this.categorie = categorie;
 	}




}