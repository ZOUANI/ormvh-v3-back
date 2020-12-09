package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.NatureCourrier; 
import ma.zs.generated.ws.rest.provided.vo.NatureCourrierVo;

@Component 
public class NatureCourrierConverter extends AbstractConverter<NatureCourrier,NatureCourrierVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
    private Boolean createdBy;
    private Boolean updatedBy;

	public  NatureCourrierConverter(){
		init(true);
	}

	@Override 
 	public NatureCourrier toItem(NatureCourrierVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	NatureCourrier item = new NatureCourrier();
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
			 if(StringUtil.isNotEmpty(vo.getDelai()))
                  item.setDelai(NumberUtil.toDouble(vo.getDelai()));
			 if(StringUtil.isNotEmpty(vo.getRelance()))
                  item.setRelance(NumberUtil.toDouble(vo.getRelance()));
			 if(StringUtil.isNotEmpty(vo.getLibelleArab()))
                  item.setLibelleArab(vo.getLibelleArab());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getLibelle()))
                  item.setLibelle(vo.getLibelle());
			 if(StringUtil.isNotEmpty(vo.getCategorie()))
                 item.setCategorie(NumberUtil.toInt(vo.getCategorie()));

//             if(vo.getCreatedByVo()!=null && this.createdBy)
//			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
//             if(vo.getUpdatedByVo()!=null && this.updatedBy)
//			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;
//

		return item;
 		}
 	}

 	 @Override 
 	public NatureCourrierVo toVo(NatureCourrier item) {
 		if (item == null) {
    		return null;
      	} else {
			NatureCourrierVo vo = new NatureCourrierVo();

			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
			 if(item.getDelai()!=null)
				vo.setDelai(NumberUtil.toString(item.getDelai()));
			 if(item.getRelance()!=null)
				vo.setRelance(NumberUtil.toString(item.getRelance()));
			if(StringUtil.isNotEmpty(item.getLibelleArab()))
				vo.setLibelleArab(item.getLibelleArab());
			
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
			 if(item.getCategorie()!=null)
				vo.setCategorie(NumberUtil.toString(item.getCategorie()));
            
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