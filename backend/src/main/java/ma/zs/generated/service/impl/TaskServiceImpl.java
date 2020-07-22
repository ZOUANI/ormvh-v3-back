package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Task;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.Status;
import ma.zs.generated.dao.TaskDao;
import ma.zs.generated.service.facade.TaskService;
import ma.zs.generated.service.facade.UserService;   
import ma.zs.generated.service.facade.StatusService;   
import ma.zs.generated.service.facade.CourrierService;   

import ma.zs.generated.ws.rest.provided.vo.TaskVo;
import ma.zs.generated.service.util.*;
@Service
public class TaskServiceImpl implements TaskService {

   @Autowired
   private TaskDao taskDao;
   
    @Autowired
    private UserService userService ;
    @Autowired
    private StatusService statusService ;
    @Autowired
    private CourrierService courrierService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Task> findAll(){
		return taskDao.findAll();
	}	
	@Override
	public List<Task> findByUpdatedByUsername(String username){
		return taskDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return taskDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<Task> findByUpdatedById(Long id){
		return taskDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return taskDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public List<Task> findByCourrierIdCourrier(String idCourrier){
		return taskDao.findByCourrierIdCourrier(idCourrier);
	}
	@Override
	@Transactional
    public int deleteByCourrierIdCourrier(String idCourrier){
		return taskDao.deleteByCourrierIdCourrier(idCourrier);
	}
	
     @Override
    public List<Task> findByCourrierId(Long id){
		return taskDao.findByCourrierId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCourrierId(Long id){
		return taskDao.deleteByCourrierId(id);

	}
     		
	@Override
	public List<Task> findByAssigneUsername(String username){
		return taskDao.findByAssigneUsername(username);
	}
	@Override
	@Transactional
    public int deleteByAssigneUsername(String username){
		return taskDao.deleteByAssigneUsername(username);
	}
	
     @Override
    public List<Task> findByAssigneId(Long id){
		return taskDao.findByAssigneId(id);

	}
	   @Override
	   @Transactional
    public int deleteByAssigneId(Long id){
		return taskDao.deleteByAssigneId(id);

	}
     		
	@Override
	public List<Task> findByCreatedByUsername(String username){
		return taskDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return taskDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<Task> findByCreatedById(Long id){
		return taskDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return taskDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<Task> findByStatusLibelle(String libelle){
		return taskDao.findByStatusLibelle(libelle);
	}
	@Override
	@Transactional
    public int deleteByStatusLibelle(String libelle){
		return taskDao.deleteByStatusLibelle(libelle);
	}
	
     @Override
    public List<Task> findByStatusId(Long id){
		return taskDao.findByStatusId(id);

	}
	   @Override
	   @Transactional
    public int deleteByStatusId(Long id){
		return taskDao.deleteByStatusId(id);

	}
     		
	@Override
	public Task findByTitle(String title){
		if( title==null)
		  return null;
		return taskDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return taskDao.deleteByTitle(title);	 
	}

	@Override
	public Task findById(Long id){
		 if(id==null)
		  return null;
		return taskDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           taskDao.deleteById(id);
   }
	@Override	
	public Task save (Task task){
			Task foundedTask = findByTitle(task.getTitle());
	       if(foundedTask!=null)
	          return null;  
	    
	          if(task.getUpdatedBy()!=null){
				    User updatedBy = userService.findByUsername(task.getUpdatedBy().getUsername());
				  if(updatedBy == null)
				  task.setUpdatedBy(userService.save(task.getUpdatedBy()));
				  else
				  task.setUpdatedBy(updatedBy);
			  }
	    
	          if(task.getCourrier()!=null){
				    Courrier courrier = courrierService.findByIdCourrier(task.getCourrier().getIdCourrier());
				  if(courrier == null)
				  task.setCourrier(courrierService.save(task.getCourrier()));
				  else
				  task.setCourrier(courrier);
			  }
	    
	          if(task.getAssigne()!=null){
				    User assigne = userService.findByUsername(task.getAssigne().getUsername());
				  if(assigne == null)
				  task.setAssigne(userService.save(task.getAssigne()));
				  else
				  task.setAssigne(assigne);
			  }
	    
	          if(task.getCreatedBy()!=null){
				    User createdBy = userService.findByUsername(task.getCreatedBy().getUsername());
				  if(createdBy == null)
				  task.setCreatedBy(userService.save(task.getCreatedBy()));
				  else
				  task.setCreatedBy(createdBy);
			  }
	    
	          if(task.getStatus()!=null){
				    Status status = statusService.findByLibelle(task.getStatus().getLibelle());
				  if(status == null)
				  task.setStatus(statusService.save(task.getStatus()));
				  else
				  task.setStatus(status);
			  }

	    Task savedTask = taskDao.save(task);
	   return savedTask;
	}

    @Override
    public List<Task> save(List<Task> tasks){
		List<Task> list = new ArrayList<Task>();
		for(Task task: tasks){
		        list.add(save(task));	
		}
		return list;
	}


   @Override
   public Task update(Task task){
     
    
		  Task foundedTask = findById(task.getId()); 
		       if(foundedTask==null)
	          return null;	  
	  
	   return  taskDao.save(task);
     
     }
    
	@Override
	@Transactional
	public int delete(Task task){

	        if(task.getTitle()==null)
			  return -1;
		
			Task foundedTask = findByTitle(task.getTitle());
	       if(foundedTask==null)
	          return -1;  
	   taskDao.delete(foundedTask);
	   return 1;
	}


	public List<Task> findByCriteria(TaskVo taskVo){
      String query = "SELECT o FROM Task o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",taskVo.getCreatedAt());
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",taskVo.getUpdatedAt());
	  query += SearchUtil.addConstraintDate( "o", "assignedAt","=",taskVo.getAssignedAt());
	  query += SearchUtil.addConstraintDate( "o", "dateAccuse","=",taskVo.getDateAccuse());
	  query += SearchUtil.addConstraintDate( "o", "dateReponse","=",taskVo.getDateReponse());
	  query += SearchUtil.addConstraintDate( "o", "processedAt","=",taskVo.getProcessedAt());
		 	 query += SearchUtil.addConstraint( "o", "delai","=",taskVo.getDelai());
		 	 query += SearchUtil.addConstraint( "o", "relance","=",taskVo.getRelance());
		 	 query += SearchUtil.addConstraint( "o", "accuse","=",taskVo.getAccuse());
		 	 query += SearchUtil.addConstraint( "o", "reponse","=",taskVo.getReponse());
		 	 query += SearchUtil.addConstraint( "o", "id","=",taskVo.getId());
			 query += SearchUtil.addConstraint( "o", "title","LIKE",taskVo.getTitle());

			 query += SearchUtil.addConstraint( "o", "description","LIKE",taskVo.getDescription());

			 query += SearchUtil.addConstraint( "o", "observation","LIKE",taskVo.getObservation());

	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",taskVo.getCreatedAtMin(),taskVo.getCreatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",taskVo.getUpdatedAtMin(),taskVo.getUpdatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","assignedAt",taskVo.getAssignedAtMin(),taskVo.getAssignedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","dateAccuse",taskVo.getDateAccuseMin(),taskVo.getDateAccuseMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","dateReponse",taskVo.getDateReponseMin(),taskVo.getDateReponseMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","processedAt",taskVo.getProcessedAtMin(),taskVo.getProcessedAtMax());
	  query += SearchUtil.addConstraintMinMax("o","delai",taskVo.getDelaiMin(),taskVo.getDelaiMax());
	  query += SearchUtil.addConstraintMinMax("o","relance",taskVo.getRelanceMin(),taskVo.getRelanceMax());
   if(taskVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",taskVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",taskVo.getUpdatedByVo().getUsername());
   }
   
   if(taskVo.getCourrierVo()!=null){
     query += SearchUtil.addConstraint( "o", "courrier.id","=",taskVo.getCourrierVo().getId());
     query += SearchUtil.addConstraint( "o", "courrier.idCourrier","LIKE",taskVo.getCourrierVo().getIdCourrier());
   }
   
   if(taskVo.getAssigneVo()!=null){
     query += SearchUtil.addConstraint( "o", "assigne.id","=",taskVo.getAssigneVo().getId());
     query += SearchUtil.addConstraint( "o", "assigne.username","LIKE",taskVo.getAssigneVo().getUsername());
   }
   
   if(taskVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",taskVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",taskVo.getCreatedByVo().getUsername());
   }
   
   if(taskVo.getStatusVo()!=null){
     query += SearchUtil.addConstraint( "o", "status.id","=",taskVo.getStatusVo().getId());
     query += SearchUtil.addConstraint( "o", "status.libelle","LIKE",taskVo.getStatusVo().getLibelle());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
