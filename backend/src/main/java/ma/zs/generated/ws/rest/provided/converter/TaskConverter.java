package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Task; 
import ma.zs.generated.ws.rest.provided.vo.TaskVo;

@Component 
public class TaskConverter extends AbstractConverter<Task,TaskVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
	   @Autowired
         private StatusConverter statusConverter ;
	   @Autowired
         private CourrierConverter courrierConverter ;
    private Boolean updatedBy;
    private Boolean courrier;
    private Boolean assigne;
    private Boolean createdBy;
    private Boolean status;

	public  TaskConverter(){
		init(true);
	}

	@Override 
 	public Task toItem(TaskVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Task item = new Task();
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
             if(StringUtil.isNotEmpty(vo.getAssignedAt()))
			      item.setAssignedAt(DateUtil.parse(vo.getAssignedAt()));
             if(StringUtil.isNotEmpty(vo.getDateAccuse()))
			      item.setDateAccuse(DateUtil.parse(vo.getDateAccuse()));
             if(StringUtil.isNotEmpty(vo.getDateReponse()))
			      item.setDateReponse(DateUtil.parse(vo.getDateReponse()));
             if(StringUtil.isNotEmpty(vo.getProcessedAt()))
			      item.setProcessedAt(DateUtil.parse(vo.getProcessedAt()));
			 if(StringUtil.isNotEmpty(vo.getDelai()))
                  item.setDelai(NumberUtil.toDouble(vo.getDelai()));
			 if(StringUtil.isNotEmpty(vo.getRelance()))
                  item.setRelance(NumberUtil.toDouble(vo.getRelance()));
			 if(StringUtil.isNotEmpty(vo.getAccuse()))
                  item.setAccuse(NumberUtil.toBoolean(vo.getAccuse()));
			 if(StringUtil.isNotEmpty(vo.getReponse()))
                  item.setReponse(NumberUtil.toBoolean(vo.getReponse()));
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getTitle()))
                  item.setTitle(vo.getTitle());
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getObservation()))
                  item.setObservation(vo.getObservation());
             if(vo.getUpdatedByVo()!=null && this.updatedBy)
			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;
             if(vo.getCourrierVo()!=null && this.courrier)
			     item.setCourrier(courrierConverter.toItem(vo.getCourrierVo())) ;
             if(vo.getAssigneVo()!=null && this.assigne)
			     item.setAssigne(userConverter.toItem(vo.getAssigneVo())) ;
             if(vo.getCreatedByVo()!=null && this.createdBy)
			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
             if(vo.getStatusVo()!=null && this.status)
			     item.setStatus(statusConverter.toItem(vo.getStatusVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public TaskVo toVo(Task item) {
 		if (item == null) {
    		return null;
      	} else {
			TaskVo vo = new TaskVo();

            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
            if(item.getAssignedAt()!=null)
			    vo.setAssignedAt(DateUtil.formateDate(item.getAssignedAt()));	     
            if(item.getDateAccuse()!=null)
			    vo.setDateAccuse(DateUtil.formateDate(item.getDateAccuse()));	     
            if(item.getDateReponse()!=null)
			    vo.setDateReponse(DateUtil.formateDate(item.getDateReponse()));	     
            if(item.getProcessedAt()!=null)
			    vo.setProcessedAt(DateUtil.formateDate(item.getProcessedAt()));	     
			 if(item.getDelai()!=null)
				vo.setDelai(NumberUtil.toString(item.getDelai()));
			 if(item.getRelance()!=null)
				vo.setRelance(NumberUtil.toString(item.getRelance()));
			if(item.isAccuse()!=null)
				vo.setAccuse(NumberUtil.toString(item.isAccuse()));
			if(item.isReponse()!=null)
				vo.setReponse(NumberUtil.toString(item.isReponse()));
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getTitle()))
				vo.setTitle(item.getTitle());
			
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			if(StringUtil.isNotEmpty(item.getObservation()))
				vo.setObservation(item.getObservation());
			
            if(item.getUpdatedBy()!=null && this.updatedBy) {
				   vo.setUpdatedByVo(userConverter.toVo(item.getUpdatedBy())) ;
			   } 
            if(item.getCourrier()!=null && this.courrier) {
				   vo.setCourrierVo(courrierConverter.toVo(item.getCourrier())) ;
			   } 
            if(item.getAssigne()!=null && this.assigne) {
				   vo.setAssigneVo(userConverter.toVo(item.getAssigne())) ;
			   } 
            if(item.getCreatedBy()!=null && this.createdBy) {
				   vo.setCreatedByVo(userConverter.toVo(item.getCreatedBy())) ;
			   } 
            if(item.getStatus()!=null && this.status) {
				   vo.setStatusVo(statusConverter.toVo(item.getStatus())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       updatedBy = value;
       courrier = value;
       assigne = value;
       createdBy = value;
       status = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
	}  
	   public StatusConverter getStatusConverter(){
		return this.statusConverter;
	}  
        public void setStatusConverter(StatusConverter statusConverter ){
		 this.statusConverter = statusConverter;
	}  
	   public CourrierConverter getCourrierConverter(){
		return this.courrierConverter;
	}  
        public void setCourrierConverter(CourrierConverter courrierConverter ){
		 this.courrierConverter = courrierConverter;
	}  
	
	 public boolean  isUpdatedBy(){
		  return this.updatedBy;
	 }
	 public void  setUpdatedBy(boolean updatedBy){
		   this.updatedBy = updatedBy;
	 }
	 public boolean  isCourrier(){
		  return this.courrier;
	 }
	 public void  setCourrier(boolean courrier){
		   this.courrier = courrier;
	 }
	 public boolean  isAssigne(){
		  return this.assigne;
	 }
	 public void  setAssigne(boolean assigne){
		   this.assigne = assigne;
	 }
	 public boolean  isCreatedBy(){
		  return this.createdBy;
	 }
	 public void  setCreatedBy(boolean createdBy){
		   this.createdBy = createdBy;
	 }
	 public boolean  isStatus(){
		  return this.status;
	 }
	 public void  setStatus(boolean status){
		   this.status = status;
	 }
}