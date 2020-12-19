package  ma.zs.generated.ws.rest.provided.vo;


import java.util.Objects;

public class CourrierServiceItemVo {

     private String id ;
   

	private CourrierVo courrierVo ;
	private LeServiceVo serviceVo ;
    private boolean coordinateur;



 public CourrierServiceItemVo(){
       super();
     }

    public boolean isCoordinateur() {
        return coordinateur;
    }

    public void setCoordinateur(boolean coordinateur) {
        this.coordinateur = coordinateur;
    }

    public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public CourrierVo getCourrierVo(){
          return this.courrierVo;
     }
       
     public void setCourrierVo(CourrierVo courrierVo){
          this.courrierVo = courrierVo;
     }
   
      public LeServiceVo getServiceVo(){
          return this.serviceVo;
     }
       
     public void setServiceVo(LeServiceVo serviceVo){
          this.serviceVo = serviceVo;
     }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourrierServiceItemVo that = (CourrierServiceItemVo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(serviceVo, that.serviceVo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceVo);
    }
}