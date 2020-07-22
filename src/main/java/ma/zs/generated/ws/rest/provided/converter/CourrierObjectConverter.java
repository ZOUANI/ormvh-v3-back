package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.CourrierObject; 
import ma.zs.generated.ws.rest.provided.vo.CourrierObjectVo;

@Component 
public class CourrierObjectConverter extends AbstractConverter<CourrierObject,CourrierObjectVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
    private Boolean createdBy;
    private Boolean updatedBy;

	public  CourrierObjectConverter(){
		init(true);
	}

	@Override 
 	public CourrierObject toItem(CourrierObjectVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	CourrierObject item = new CourrierObject();
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
			 if(StringUtil.isNotEmpty(vo.getTitleArab()))
                  item.setTitleArab(vo.getTitleArab());
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getTitle()))
                  item.setTitle(vo.getTitle());
//             if(vo.getCreatedByVo()!=null && this.createdBy)
//			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
//             if(vo.getUpdatedByVo()!=null && this.updatedBy)
//			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public CourrierObjectVo toVo(CourrierObject item) {
 		if (item == null) {
    		return null;
      	} else {
			CourrierObjectVo vo = new CourrierObjectVo();

            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
			if(StringUtil.isNotEmpty(item.getTitleArab()))
				vo.setTitleArab(item.getTitleArab());
			
			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getTitle()))
				vo.setTitle(item.getTitle());
			
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