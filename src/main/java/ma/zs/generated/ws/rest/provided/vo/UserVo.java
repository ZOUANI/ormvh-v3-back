package  ma.zs.generated.ws.rest.provided.vo;

import java.util.Collection;
import java.util.List;
import java.util.Date;

public class UserVo {

     private String credentialsNonExpired ;
   
     private String enabled ;
   
     private String createdAt ;
   
     private String updatedAt ;
   
     private String email ;
   
     private String accountNonExpired ;
   
     private String accountNonLocked ;
   
     private String id ;
   
     private String username ;
   
     private String password ;
   

	private UserVo createdByVo ;
	private UserVo updatedByVo ;

     private Collection<RoleVo> rolesVo ;

     private String createdAtMax ;
     private String createdAtMin ;
     private String updatedAtMax ;
     private String updatedAtMin ;

 public UserVo(){
       super();
     }


     public String getCredentialsNonExpired(){
          return this.credentialsNonExpired;
     }
      public void setCredentialsNonExpired(String credentialsNonExpired){
          this.credentialsNonExpired = credentialsNonExpired;
     }


     public String getEnabled(){
          return this.enabled;
     }
      public void setEnabled(String enabled){
          this.enabled = enabled;
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


     public String getEmail(){
          return this.email;
     }
      public void setEmail(String email){
          this.email = email;
     }


     public String getAccountNonExpired(){
          return this.accountNonExpired;
     }
      public void setAccountNonExpired(String accountNonExpired){
          this.accountNonExpired = accountNonExpired;
     }


     public String getAccountNonLocked(){
          return this.accountNonLocked;
     }
      public void setAccountNonLocked(String accountNonLocked){
          this.accountNonLocked = accountNonLocked;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     public String getUsername(){
          return this.username;
     }
      public void setUsername(String username){
          this.username = username;
     }


     public String getPassword(){
          return this.password;
     }
      public void setPassword(String password){
          this.password = password;
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
   

      public Collection<RoleVo> getRolesVo(){
          return this.rolesVo;
     }
       
     public void setRolesVo(Collection<RoleVo> rolesVo){
          this.rolesVo = rolesVo;
     }



}