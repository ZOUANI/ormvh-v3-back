package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.ModelLettreReponse; 
import ma.zs.generated.ws.rest.provided.vo.ModelLettreReponseVo;

@Component 
public class ModelLettreReponseConverter extends AbstractConverter<ModelLettreReponse,ModelLettreReponseVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
	   @Autowired
         private CategorieModelLettreReponseConverter categorieModelLettreReponseConverter ;
    private Boolean categorieModelLettreReponse;
    private Boolean createdBy;
    private Boolean updatedBy;

	public  ModelLettreReponseConverter(){
		init(true);
	}

	@Override 
 	public ModelLettreReponse toItem(ModelLettreReponseVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	ModelLettreReponse item = new ModelLettreReponse();
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
			 if(StringUtil.isNotEmpty(vo.getLibelleArab()))
                  item.setLibelleArab(vo.getLibelleArab());
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
			 if(StringUtil.isNotEmpty(vo.getChemin()))
                  item.setChemin(vo.getChemin());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getLibelle()))
                  item.setLibelle(vo.getLibelle());
             if(vo.getCategorieModelLettreReponseVo()!=null && this.categorieModelLettreReponse)
			     item.setCategorieModelLettreReponse(categorieModelLettreReponseConverter.toItem(vo.getCategorieModelLettreReponseVo())) ;
             if(vo.getCreatedByVo()!=null && this.createdBy)
			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
             if(vo.getUpdatedByVo()!=null && this.updatedBy)
			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public ModelLettreReponseVo toVo(ModelLettreReponse item) {
 		if (item == null) {
    		return null;
      	} else {
			ModelLettreReponseVo vo = new ModelLettreReponseVo();

            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
			if(StringUtil.isNotEmpty(item.getLibelleArab()))
				vo.setLibelleArab(item.getLibelleArab());
			
			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
			if(StringUtil.isNotEmpty(item.getChemin()))
				vo.setChemin(item.getChemin());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getLibelle()))
				vo.setLibelle(item.getLibelle());
			
            if(item.getCategorieModelLettreReponse()!=null && this.categorieModelLettreReponse) {
				   vo.setCategorieModelLettreReponseVo(categorieModelLettreReponseConverter.toVo(item.getCategorieModelLettreReponse())) ;
			   } 
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
       categorieModelLettreReponse = value;
       createdBy = value;
       updatedBy = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
	}  
	   public CategorieModelLettreReponseConverter getCategorieModelLettreReponseConverter(){
		return this.categorieModelLettreReponseConverter;
	}  
        public void setCategorieModelLettreReponseConverter(CategorieModelLettreReponseConverter categorieModelLettreReponseConverter ){
		 this.categorieModelLettreReponseConverter = categorieModelLettreReponseConverter;
	}  
	
	 public boolean  isCategorieModelLettreReponse(){
		  return this.categorieModelLettreReponse;
	 }
	 public void  setCategorieModelLettreReponse(boolean categorieModelLettreReponse){
		   this.categorieModelLettreReponse = categorieModelLettreReponse;
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