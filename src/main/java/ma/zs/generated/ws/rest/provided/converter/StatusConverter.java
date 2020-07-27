package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Status; 
import ma.zs.generated.ws.rest.provided.vo.StatusVo;

@Component 
public class StatusConverter extends AbstractConverter<Status,StatusVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
    private Boolean createdBy;
    private Boolean updatedBy;

	public  StatusConverter(){
		init(true);
	}

	@Override 
 	public Status toItem(StatusVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Status item = new Status();
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
			 if(StringUtil.isNotEmpty(vo.getLibelleArab()))
                  item.setLibelleArab(vo.getLibelleArab());
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
		if(StringUtil.isNotEmpty(vo.getColor()))
			item.setColor(vo.getColor());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getLibelle()))
                  item.setLibelle(vo.getLibelle());
//             if(vo.getCreatedByVo()!=null && this.createdBy)
//			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
//             if(vo.getUpdatedByVo()!=null && this.updatedBy)
//			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public StatusVo toVo(Status item) {
 		if (item == null) {
    		return null;
      	} else {
			StatusVo vo = new StatusVo();

            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
			if(StringUtil.isNotEmpty(item.getLibelleArab()))
				vo.setLibelleArab(item.getLibelleArab());
			
			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());

			if(StringUtil.isNotEmpty(item.getColor()))
				vo.setColor(item.getColor());

			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getLibelle()))
				vo.setLibelle(item.getLibelle());
			
            if(item.getCreatedBy()!=null && this.createdBy) {
				   vo.setCreatedByVo(userConverter.toVo(item.getCreatedBy())) ;
			   } 
            if(item.getUpdatedBy()!=null && this.updatedBy) {
				   vo.setUpdatedByVo(userConverter.toVo(item.getUpdatedBy())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       createdBy = value;
       updatedBy = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
	}  
	
	 public boolean  isCreatedBy(){
		  return this.createdBy;
	 }
	 public void  setCreatedBy(boolean createdBy){
		   this.createdBy = createdBy;
	 }
	 public boolean  isUpdatedBy(){
		  return this.updatedBy;
	 }
	 public void  setUpdatedBy(boolean updatedBy){
		   this.updatedBy = updatedBy;
	 }
}