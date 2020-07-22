package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Employee; 
import ma.zs.generated.ws.rest.provided.vo.EmployeeVo;

@Component 
public class EmployeeConverter extends AbstractConverter<Employee,EmployeeVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
    private Boolean updatedBy;
    private Boolean createdBy;
    private Boolean user;

	public  EmployeeConverter(){
		init(true);
	}

	@Override 
 	public Employee toItem(EmployeeVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Employee item = new Employee();
             if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
			      item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
             if(StringUtil.isNotEmpty(vo.getCreatedAt()))
			      item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
			 if(StringUtil.isNotEmpty(vo.getTitle()))
                  item.setTitle(vo.getTitle());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
//             if(vo.getUpdatedByVo()!=null && this.updatedBy)
//			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;
//             if(vo.getCreatedByVo()!=null && this.createdBy)
//			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;
             if(vo.getUserVo()!=null && this.user)
			     item.setUser(userConverter.toItem(vo.getUserVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public EmployeeVo toVo(Employee item) {
 		if (item == null) {
    		return null;
      	} else {
			EmployeeVo vo = new EmployeeVo();

            if(item.getUpdatedAt()!=null)
			    vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));	     
            if(item.getCreatedAt()!=null)
			    vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));	     
			if(StringUtil.isNotEmpty(item.getTitle()))
				vo.setTitle(item.getTitle());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getUpdatedBy()!=null && this.updatedBy) {
				   vo.setUpdatedByVo(userConverter.toVo(item.getUpdatedBy())) ;
			   } 
            if(item.getCreatedBy()!=null && this.createdBy) {
				   vo.setCreatedByVo(userConverter.toVo(item.getCreatedBy())) ;
			   } 
            if(item.getUser()!=null && this.user) {
				   vo.setUserVo(userConverter.toVo(item.getUser())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       updatedBy = value;
       createdBy = value;
       user = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
	}  
	
	 public boolean  isUpdatedBy(){
		  return this.updatedBy;
	 }
	 public void  setUpdatedBy(boolean updatedBy){
		   this.updatedBy = updatedBy;
	 }
	 public boolean  isCreatedBy(){
		  return this.createdBy;
	 }
	 public void  setCreatedBy(boolean createdBy){
		   this.createdBy = createdBy;
	 }
	 public boolean  isUser(){
		  return this.user;
	 }
	 public void  setUser(boolean user){
		   this.user = user;
	 }
}