package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.CourrierServiceItem; 
import ma.zs.generated.ws.rest.provided.vo.CourrierServiceItemVo;

@Component 
public class CourrierServiceItemConverter extends AbstractConverter<CourrierServiceItem,CourrierServiceItemVo>{ 
	
	   @Autowired
         private CourrierConverter courrierConverter ;
	   @Autowired
         private LeServiceConverter leServiceConverter ;
    private Boolean courrier;
    private Boolean service;

	public  CourrierServiceItemConverter(){
		init(true);
	}

	@Override 
 	public CourrierServiceItem toItem(CourrierServiceItemVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	CourrierServiceItem item = new CourrierServiceItem();
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getCourrierVo()!=null && this.courrier)
			     item.setCourrier(courrierConverter.toItem(vo.getCourrierVo())) ;
             if(vo.getServiceVo()!=null && this.service)
			     item.setService(leServiceConverter.toItem(vo.getServiceVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public CourrierServiceItemVo toVo(CourrierServiceItem item) {
 		if (item == null) {
    		return null;
      	} else {
			CourrierServiceItemVo vo = new CourrierServiceItemVo();

			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getCourrier()!=null && this.courrier) {
				   vo.setCourrierVo(courrierConverter.toVo(item.getCourrier())) ;
			   } 
            if(item.getService()!=null && this.service) {
				   vo.setServiceVo(leServiceConverter.toVo(item.getService())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       courrier = value;
       service = value;
	}


	

	
	   public CourrierConverter getCourrierConverter(){
		return this.courrierConverter;
	}  
        public void setCourrierConverter(CourrierConverter courrierConverter ){
		 this.courrierConverter = courrierConverter;
	}  
	   public LeServiceConverter getLeServiceConverter(){
		return this.leServiceConverter;
	}  
        public void setLeServiceConverter(LeServiceConverter leServiceConverter ){
		 this.leServiceConverter = leServiceConverter;
	}  
	
	 public boolean  isCourrier(){
		  return this.courrier;
	 }
	 public void  setCourrier(boolean courrier){
		   this.courrier = courrier;
	 }
	 public boolean  isService(){
		  return this.service;
	 }
	 public void  setService(boolean service){
		   this.service = service;
	 }
}