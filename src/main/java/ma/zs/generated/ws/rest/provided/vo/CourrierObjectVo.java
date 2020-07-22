package  ma.zs.generated.ws.rest.provided.vo;


public class CourrierObjectVo {

     private String createdAt ;
   
     private String updatedAt ;
   
     private String titleArab ;
   
     private String code ;
   
     private String id ;
   
     private String title ;
   

	private UserVo createdByVo ;
	private UserVo updatedByVo ;


     private String createdAtMax ;
     private String createdAtMin ;
     private String updatedAtMax ;
     private String updatedAtMin ;

 public CourrierObjectVo(){
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


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     public String getTitle(){
          return this.title;
     }
      public void setTitle(String title){
          this.title = title;
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