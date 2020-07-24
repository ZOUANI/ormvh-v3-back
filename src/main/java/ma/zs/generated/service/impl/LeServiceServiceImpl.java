package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.LeServiceDao;
import ma.zs.generated.service.facade.LeServiceService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.LeServiceVo;
import ma.zs.generated.service.util.*;
@Service
public class LeServiceServiceImpl extends  AbstractService<LeService> implements LeServiceService {

   @Autowired
   private LeServiceDao leServiceDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<LeService> findAll(){
		return leServiceDao.findAll();
	}	
	@Override
	public List<LeService> findByCreatedByUsername(String username){
		return leServiceDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return leServiceDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<LeService> findByCreatedById(Long id){
		return leServiceDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return leServiceDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<LeService> findByUpdatedByUsername(String username){
		return leServiceDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return leServiceDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<LeService> findByUpdatedById(Long id){
		return leServiceDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return leServiceDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public LeService findByTitle(String title){
		if( title==null)
		  return null;
		return leServiceDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return leServiceDao.deleteByTitle(title);	 
	}

	@Override
	public LeService findById(Long id){
		 if(id==null)
		  return null;
		return leServiceDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           leServiceDao.deleteById(id);
   }
	@Override	
	public LeService save (LeService leService){
			LeService foundedLeService = findByTitle(leService.getTitle());
	       if(foundedLeService!=null)
	          return null;  
	    
	      
	    LeService savedLeService = leServiceDao.save(leService);
	   return savedLeService;
	}


   @Override
   public LeService update(LeService leService){
		  LeService foundedLeService = findById(leService.getId());
		       if(foundedLeService==null)
	          return null;	  
	  
	   return  leServiceDao.save(leService);
     
     }
    
	@Override
	@Transactional
	public int delete(LeService leService){

	        if(leService.getTitle()==null)
			  return -1;
		
			LeService foundedLeService = findByTitle(leService.getTitle());
	       if(foundedLeService==null)
	          return -1;  
	   leServiceDao.delete(foundedLeService);
	   return 1;
	}


	public List<LeService> findByCriteria(LeServiceVo leServiceVo){
      String query = "SELECT o FROM LeService o where 1=1 ";
			 query += addConstraint( "o", "description","LIKE",leServiceVo.getDescription());

	  query += addConstraintDate( "o", "createdAt","=",leServiceVo.getCreatedAt());
	  query += addConstraintDate( "o", "updatedAt","=",leServiceVo.getUpdatedAt());
			 query += addConstraint( "o", "libelleArab","LIKE",leServiceVo.getLibelleArab());

			 query += addConstraint( "o", "code","LIKE",leServiceVo.getCode());

		 	 query += addConstraint( "o", "id","=",leServiceVo.getId());
			 query += addConstraint( "o", "title","LIKE",leServiceVo.getTitle());

	  query += addConstraintMinMaxDate("o","createdAt",leServiceVo.getCreatedAtMin(),leServiceVo.getCreatedAtMax());
	  query += addConstraintMinMaxDate("o","updatedAt",leServiceVo.getUpdatedAtMin(),leServiceVo.getUpdatedAtMax());
   if(leServiceVo.getCreatedByVo()!=null){
     query += addConstraint( "o", "createdBy.id","=",leServiceVo.getCreatedByVo().getId());
     query += addConstraint( "o", "createdBy.username","LIKE",leServiceVo.getCreatedByVo().getUsername());
   }
   
   if(leServiceVo.getUpdatedByVo()!=null){
     query += addConstraint( "o", "updatedBy.id","=",leServiceVo.getUpdatedByVo().getId());
     query += addConstraint( "o", "updatedBy.username","LIKE",leServiceVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
