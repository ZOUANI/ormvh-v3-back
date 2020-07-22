package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Expeditor; 
import ma.zs.generated.ws.rest.provided.vo.ExpeditorVo;

@Component 
public class ExpeditorConverter extends AbstractConverter<Expeditor,ExpeditorVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
	   @Autowired
         private SexeConverter sexeConverter ;
	   @Autowired
         private NationalityConverter nationalityConverter ;
    private Boolean sexe;
    private Boolean nationality;
    private Boolean createdBy;
    private Boolean updatedBy;

	public  ExpeditorConverter(){
		init(true);
	}

	@Override 
 	public Expeditor toItem(ExpeditorVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Expeditor item = new Expeditor();
			 if(StringUtil.isNotEmpty(vo.getAdress()))
                  item.setAdress(vo.getAdress());
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getNature()))
                  item.setNature(vo.getNature());
			 if(StringUtil.isNotEmpty(vo.getAge()))
                  item.setAge(NumberUtil.toInt(vo.getAge()));
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getTitle()))
                  item.setTitle(vo.getTitle());
			 if(StringUtil.isNotEmpty(vo.getTitleArab()))
                  item.setTitleArab(vo.getTitleArab());
             if(vo.getSexeVo()!=null && this.sexe)
			     item.setSexe(sexeConverter.toItem(vo.getSexeVo())) ;
             if(vo.getNationalityVo()!=null && this.nationality)
			     item.setNationality(nationalityConverter.toItem(vo.getNationalityVo())) ;
//             if(vo.getCreatedByVo()!=null && this.createdBy)
//			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
//             if(vo.getUpdatedByVo()!=null && this.updatedBy)
//			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public ExpeditorVo toVo(Expeditor item) {
 		if (item == null) {
    		return null;
      	} else {
			ExpeditorVo vo = new ExpeditorVo();

			if(StringUtil.isNotEmpty(item.getAdress()))
				vo.setAdress(item.getAdress());
			
            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			if(StringUtil.isNotEmpty(item.getNature()))
				vo.setNature(item.getNature());
			
			 if(item.getAge()!=null)
				vo.setAge(NumberUtil.toString(item.getAge()));
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getTitle()))
				vo.setTitle(item.getTitle());
			
			if(StringUtil.isNotEmpty(item.getTitleArab()))
				vo.setTitleArab(item.getTitleArab());
			
            if(item.getSexe()!=null && this.sexe) {
				   vo.setSexeVo(sexeConverter.toVo(item.getSexe())) ;
			   } 
            if(item.getNationality()!=null && this.nationality) {
				   vo.setNationalityVo(nationalityConverter.toVo(item.getNationality())) ;
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
       sexe = value;
       nationality = value;
       createdBy = value;
       updatedBy = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
	}  
	   public SexeConverter getSexeConverter(){
		return this.sexeConverter;
	}  
        public void setSexeConverter(SexeConverter sexeConverter ){
		 this.sexeConverter = sexeConverter;
	}  
	   public NationalityConverter getNationalityConverter(){
		return this.nationalityConverter;
	}  
        public void setNationalityConverter(NationalityConverter nationalityConverter ){
		 this.nationalityConverter = nationalityConverter;
	}  
	
	 public boolean  isSexe(){
		  return this.sexe;
	 }
	 public void  setSexe(boolean sexe){
		   this.sexe = sexe;
	 }
	 public boolean  isNationality(){
		  return this.nationality;
	 }
	 public void  setNationality(boolean nationality){
		   this.nationality = nationality;
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