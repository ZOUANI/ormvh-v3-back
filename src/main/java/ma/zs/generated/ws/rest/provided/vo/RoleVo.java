package  ma.zs.generated.ws.rest.provided.vo;

import java.util.Date;

public class RoleVo {

     private String updatedAt ;
   
     private String authority ;
   
     private String createdAt ;
   
     private String id ;
   

	private UserVo updatedByVo ;
	private UserVo createdByVo ;


     private String updatedAtMax ;
     private String updatedAtMin ;
     private String createdAtMax ;
     private String createdAtMin ;

 public RoleVo(){
       super();
     }


     public String getUpdatedAt(){
          return this.updatedAt;
     }
      public void setUpdatedAt(String updatedAt){
          this.updatedAt = updatedAt;
     }


     public String getAuthority(){
          return this.authority;
     }
      public void setAuthority(String authority){
          this.authority = authority;
     }


     public String getCreatedAt(){
          return this.createdAt;
     }
      public void setCreatedAt(String createdAt){
          this.createdAt = createdAt;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
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
     
     
     

      public UserVo getUpdatedByVo(){
          return this.updatedByVo;
     }
       
     public void setUpdatedByVo(UserVo updatedByVo){
          this.updatedByVo = updatedByVo;
     }
   
      public UserVo getCreatedByVo(){
          return this.createdByVo;
     }
       
     public void setCreatedByVo(UserVo createdByVo){
          this.createdByVo = createdByVo;
     }
   




}