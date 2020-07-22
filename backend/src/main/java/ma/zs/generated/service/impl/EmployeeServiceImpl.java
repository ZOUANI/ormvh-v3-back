package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Employee;
import ma.zs.generated.bean.User;

import ma.zs.generated.dao.EmployeeDao;
import ma.zs.generated.service.facade.EmployeeService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.EmployeeVo;
import ma.zs.generated.service.util.*;
@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeDao employeeDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Employee> findAll(){
		return employeeDao.findAll();
	}	
	@Override
	public List<Employee> findByUpdatedByUsername(String username){
		return employeeDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return employeeDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<Employee> findByUpdatedById(Long id){
		return employeeDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return employeeDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public List<Employee> findByCreatedByUsername(String username){
		return employeeDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return employeeDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<Employee> findByCreatedById(Long id){
		return employeeDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return employeeDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<Employee> findByUserUsername(String username){
		return employeeDao.findByUserUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUserUsername(String username){
		return employeeDao.deleteByUserUsername(username);
	}
	
     @Override
    public List<Employee> findByUserId(Long id){
		return employeeDao.findByUserId(id);

	}
	   @Override
	   @Transactional
    public int deleteByUserId(Long id){
		return employeeDao.deleteByUserId(id);

	}
     		
	@Override
	public Employee findByTitle(String title){
		if( title==null)
		  return null;
		return employeeDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return employeeDao.deleteByTitle(title);	 
	}

	@Override
	public Employee findById(Long id){
		 if(id==null)
		  return null;
		return employeeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           employeeDao.deleteById(id);
   }
	@Override	
	public Employee save (Employee employee){
			Employee foundedEmployee = findByTitle(employee.getTitle());
	       if(foundedEmployee!=null)
	          return null;  
	    
	          if(employee.getUpdatedBy()!=null){
				    User updatedBy = userService.findByUsername(employee.getUpdatedBy().getUsername());
				  if(updatedBy == null)
				  employee.setUpdatedBy(userService.save(employee.getUpdatedBy()));
				  else
				  employee.setUpdatedBy(updatedBy);
			  }
	    
	          if(employee.getCreatedBy()!=null){
				    User createdBy = userService.findByUsername(employee.getCreatedBy().getUsername());
				  if(createdBy == null)
				  employee.setCreatedBy(userService.save(employee.getCreatedBy()));
				  else
				  employee.setCreatedBy(createdBy);
			  }
	    
	          if(employee.getUser()!=null){
				    User user = userService.findByUsername(employee.getUser().getUsername());
				  if(user == null)
				  employee.setUser(userService.save(employee.getUser()));
				  else
				  employee.setUser(user);
			  }

	    Employee savedEmployee = employeeDao.save(employee);
	   return savedEmployee;
	}

    @Override
    public List<Employee> save(List<Employee> employees){
		List<Employee> list = new ArrayList<Employee>();
		for(Employee employee: employees){
		        list.add(save(employee));	
		}
		return list;
	}


   @Override
   public Employee update(Employee employee){
     
    
		  Employee foundedEmployee = findById(employee.getId()); 
		       if(foundedEmployee==null)
	          return null;	  
	  
	   return  employeeDao.save(employee);
     
     }
    
	@Override
	@Transactional
	public int delete(Employee employee){

	        if(employee.getTitle()==null)
			  return -1;
		
			Employee foundedEmployee = findByTitle(employee.getTitle());
	       if(foundedEmployee==null)
	          return -1;  
	   employeeDao.delete(foundedEmployee);
	   return 1;
	}


	public List<Employee> findByCriteria(EmployeeVo employeeVo){
      String query = "SELECT o FROM Employee o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",employeeVo.getUpdatedAt());
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",employeeVo.getCreatedAt());
			 query += SearchUtil.addConstraint( "o", "title","LIKE",employeeVo.getTitle());

		 	 query += SearchUtil.addConstraint( "o", "id","=",employeeVo.getId());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",employeeVo.getUpdatedAtMin(),employeeVo.getUpdatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",employeeVo.getCreatedAtMin(),employeeVo.getCreatedAtMax());
   if(employeeVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",employeeVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",employeeVo.getUpdatedByVo().getUsername());
   }
   
   if(employeeVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",employeeVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",employeeVo.getCreatedByVo().getUsername());
   }
   
   if(employeeVo.getUserVo()!=null){
     query += SearchUtil.addConstraint( "o", "user.id","=",employeeVo.getUserVo().getId());
     query += SearchUtil.addConstraint( "o", "user.username","LIKE",employeeVo.getUserVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
