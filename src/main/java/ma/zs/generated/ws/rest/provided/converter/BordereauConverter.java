package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Bordereau; 
import ma.zs.generated.ws.rest.provided.vo.BordereauVo;

@Component 
public class BordereauConverter extends AbstractConverter<Bordereau,BordereauVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
    private Boolean createdBy;
    private Boolean updatedBy;

	public  BordereauConverter(){
		init(true);
	}

	@Override 
 	public Bordereau toItem(BordereauVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Bordereau item = new Bordereau();
             if(StringUtil.isNotEmpty(vo.getDateBordereaux()))
			      item.setDateBordereaux(DateUtil.parse(vo.getDateBordereaux()));
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getNombrePieceJointe()))
                  item.setNombrePieceJointe(NumberUtil.toInt(vo.getNombrePieceJointe()));
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
 	public BordereauVo toVo(Bordereau item) {
 		if (item == null) {
    		return null;
      	} else {
			BordereauVo vo = new BordereauVo();

            if(item.getDateBordereaux()!=null)
			    vo.setDateBordereaux(DateUtil.formateDate(item.getDateBordereaux()));	     
            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			 if(item.getNombrePieceJointe()!=null)
				vo.setNombrePieceJointe(NumberUtil.toString(item.getNombrePieceJointe()));
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