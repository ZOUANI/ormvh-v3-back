package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.CourrierObject;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.CourrierObjectDao;
import ma.zs.generated.service.facade.CourrierObjectService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.CourrierObjectVo;
import ma.zs.generated.service.util.*;
@Service
public class CourrierObjectServiceImpl implements CourrierObjectService {

   @Autowired
   private CourrierObjectDao courrierObjectDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<CourrierObject> findAll(){
		return courrierObjectDao.findAll();
	}	
	@Override
	public List<CourrierObject> findByCreatedByUsername(String username){
		return courrierObjectDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return courrierObjectDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<CourrierObject> findByCreatedById(Long id){
		return courrierObjectDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return courrierObjectDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<CourrierObject> findByUpdatedByUsername(String username){
		return courrierObjectDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return courrierObjectDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<CourrierObject> findByUpdatedById(Long id){
		return courrierObjectDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return courrierObjectDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public CourrierObject findByTitle(String title){
		if( title==null)
		  return null;
		return courrierObjectDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return courrierObjectDao.deleteByTitle(title);	 
	}

	@Override
	public CourrierObject findById(Long id){
		 if(id==null)
		  return null;
		return courrierObjectDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           courrierObjectDao.deleteById(id);
   }
	@Override	
	public CourrierObject save (CourrierObject courrierObject){
			CourrierObject foundedCourrierObject = findByTitle(courrierObject.getTitle());
	       if(foundedCourrierObject!=null)
	          return null;  
	    
	          if(courrierObject.getCreatedBy()!=null){
				    User createdBy = userService.findByUsername(courrierObject.getCreatedBy().getUsername());
				  if(createdBy == null)
				  courrierObject.setCreatedBy(userService.save(courrierObject.getCreatedBy()));
				  else
				  courrierObject.setCreatedBy(createdBy);
			  }
	    
	          if(courrierObject.getUpdatedBy()!=null){
				    User updatedBy = userService.findByUsername(courrierObject.getUpdatedBy().getUsername());
				  if(updatedBy == null)
				  courrierObject.setUpdatedBy(userService.save(courrierObject.getUpdatedBy()));
				  else
				  courrierObject.setUpdatedBy(updatedBy);
			  }

	    CourrierObject savedCourrierObject = courrierObjectDao.save(courrierObject);
	   return savedCourrierObject;
	}

    @Override
    public List<CourrierObject> save(List<CourrierObject> courrierObjects){
		List<CourrierObject> list = new ArrayList<CourrierObject>();
		for(CourrierObject courrierObject: courrierObjects){
		        list.add(save(courrierObject));	
		}
		return list;
	}


   @Override
   public CourrierObject update(CourrierObject courrierObject){
     
    
		  CourrierObject foundedCourrierObject = findById(courrierObject.getId()); 
		       if(foundedCourrierObject==null)
	          return null;	  
	  
	   return  courrierObjectDao.save(courrierObject);
     
     }
    
	@Override
	@Transactional
	public int delete(CourrierObject courrierObject){

	        if(courrierObject.getTitle()==null)
			  return -1;
		
			CourrierObject foundedCourrierObject = findByTitle(courrierObject.getTitle());
	       if(foundedCourrierObject==null)
	          return -1;  
	   courrierObjectDao.delete(foundedCourrierObject);
	   return 1;
	}


	public List<CourrierObject> findByCriteria(CourrierObjectVo courrierObjectVo){
      String query = "SELECT o FROM CourrierObject o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",courrierObjectVo.getCreatedAt());
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",courrierObjectVo.getUpdatedAt());
			 query += SearchUtil.addConstraint( "o", "titleArab","LIKE",courrierObjectVo.getTitleArab());

			 query += SearchUtil.addConstraint( "o", "code","LIKE",courrierObjectVo.getCode());

		 	 query += SearchUtil.addConstraint( "o", "id","=",courrierObjectVo.getId());
			 query += SearchUtil.addConstraint( "o", "title","LIKE",courrierObjectVo.getTitle());

	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",courrierObjectVo.getCreatedAtMin(),courrierObjectVo.getCreatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",courrierObjectVo.getUpdatedAtMin(),courrierObjectVo.getUpdatedAtMax());
   if(courrierObjectVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",courrierObjectVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",courrierObjectVo.getCreatedByVo().getUsername());
   }
   
   if(courrierObjectVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",courrierObjectVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",courrierObjectVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
