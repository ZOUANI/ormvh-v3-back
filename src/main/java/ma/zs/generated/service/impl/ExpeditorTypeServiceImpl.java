package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.ExpeditorType;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.ExpeditorTypeDao;
import ma.zs.generated.service.facade.ExpeditorTypeService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.ExpeditorTypeVo;
import ma.zs.generated.service.util.*;
@Service
public class ExpeditorTypeServiceImpl extends  AbstractService<ExpeditorType> implements ExpeditorTypeService {

   @Autowired
   private ExpeditorTypeDao expeditorTypeDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<ExpeditorType> findAll(){
		return expeditorTypeDao.findAll();
	}	
	@Override
	public List<ExpeditorType> findByCreatedByUsername(String username){
		return expeditorTypeDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return expeditorTypeDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<ExpeditorType> findByCreatedById(Long id){
		return expeditorTypeDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return expeditorTypeDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<ExpeditorType> findByUpdatedByUsername(String username){
		return expeditorTypeDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return expeditorTypeDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<ExpeditorType> findByUpdatedById(Long id){
		return expeditorTypeDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return expeditorTypeDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public ExpeditorType findByTitle(String title){
		if( title==null)
		  return null;
		return expeditorTypeDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return expeditorTypeDao.deleteByTitle(title);	 
	}

	@Override
	public ExpeditorType findById(Long id){
		 if(id==null)
		  return null;
		return expeditorTypeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           expeditorTypeDao.deleteById(id);
   }
	@Override	
	public ExpeditorType save (ExpeditorType expeditorType){
			ExpeditorType foundedExpeditorType = findByTitle(expeditorType.getTitle());
	       if(foundedExpeditorType!=null)
	          return null;  
	    

	    ExpeditorType savedExpeditorType = expeditorTypeDao.save(expeditorType);
	   return savedExpeditorType;
	}

   @Override
   public ExpeditorType update(ExpeditorType expeditorType){
     
    
		  ExpeditorType foundedExpeditorType = findById(expeditorType.getId()); 
		       if(foundedExpeditorType==null)
	          return null;	  
	  
	   return  expeditorTypeDao.save(expeditorType);
     
     }
    
	@Override
	@Transactional
	public int delete(ExpeditorType expeditorType){

	        if(expeditorType.getTitle()==null)
			  return -1;
		
			ExpeditorType foundedExpeditorType = findByTitle(expeditorType.getTitle());
	       if(foundedExpeditorType==null)
	          return -1;  
	   expeditorTypeDao.delete(foundedExpeditorType);
	   return 1;
	}


	public List<ExpeditorType> findByCriteria(ExpeditorTypeVo expeditorTypeVo){
      String query = "SELECT o FROM ExpeditorType o where 1=1 ";
	  query += addConstraintDate( "o", "createdAt","=",expeditorTypeVo.getCreatedAt());
	  query += addConstraintDate( "o", "updatedAt","=",expeditorTypeVo.getUpdatedAt());
			 query += addConstraint( "o", "libelleArab","LIKE",expeditorTypeVo.getLibelleArab());

			 query += addConstraint( "o", "code","LIKE",expeditorTypeVo.getCode());

		 	 query += addConstraint( "o", "id","=",expeditorTypeVo.getId());
			 query += addConstraint( "o", "title","LIKE",expeditorTypeVo.getTitle());

	  query += addConstraintMinMaxDate("o","createdAt",expeditorTypeVo.getCreatedAtMin(),expeditorTypeVo.getCreatedAtMax());
	  query += addConstraintMinMaxDate("o","updatedAt",expeditorTypeVo.getUpdatedAtMin(),expeditorTypeVo.getUpdatedAtMax());
   if(expeditorTypeVo.getCreatedByVo()!=null){
     query += addConstraint( "o", "createdBy.id","=",expeditorTypeVo.getCreatedByVo().getId());
     query += addConstraint( "o", "createdBy.username","LIKE",expeditorTypeVo.getCreatedByVo().getUsername());
   }
   
   if(expeditorTypeVo.getUpdatedByVo()!=null){
     query += addConstraint( "o", "updatedBy.id","=",expeditorTypeVo.getUpdatedByVo().getId());
     query += addConstraint( "o", "updatedBy.username","LIKE",expeditorTypeVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
