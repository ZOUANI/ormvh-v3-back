package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Subdivision;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.SubdivisionDao;
import ma.zs.generated.service.facade.SubdivisionService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.SubdivisionVo;
import ma.zs.generated.service.util.*;
@Service
public class SubdivisionServiceImpl implements SubdivisionService {

   @Autowired
   private SubdivisionDao subdivisionDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Subdivision> findAll(){
		return subdivisionDao.findAll();
	}	
	@Override
	public List<Subdivision> findByCreatedByUsername(String username){
		return subdivisionDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return subdivisionDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<Subdivision> findByCreatedById(Long id){
		return subdivisionDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return subdivisionDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<Subdivision> findByUpdatedByUsername(String username){
		return subdivisionDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return subdivisionDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<Subdivision> findByUpdatedById(Long id){
		return subdivisionDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return subdivisionDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public Subdivision findByTitle(String title){
		if( title==null)
		  return null;
		return subdivisionDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return subdivisionDao.deleteByTitle(title);	 
	}

	@Override
	public Subdivision findById(Long id){
		 if(id==null)
		  return null;
		return subdivisionDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           subdivisionDao.deleteById(id);
   }
	@Override	
	public Subdivision save (Subdivision subdivision){
			Subdivision foundedSubdivision = findByTitle(subdivision.getTitle());
	       if(foundedSubdivision!=null)
	          return null;  
	    
	          if(subdivision.getCreatedBy()!=null){
				    User createdBy = userService.findByUsername(subdivision.getCreatedBy().getUsername());
				  if(createdBy == null)
				  subdivision.setCreatedBy(userService.save(subdivision.getCreatedBy()));
				  else
				  subdivision.setCreatedBy(createdBy);
			  }
	    
	          if(subdivision.getUpdatedBy()!=null){
				    User updatedBy = userService.findByUsername(subdivision.getUpdatedBy().getUsername());
				  if(updatedBy == null)
				  subdivision.setUpdatedBy(userService.save(subdivision.getUpdatedBy()));
				  else
				  subdivision.setUpdatedBy(updatedBy);
			  }

	    Subdivision savedSubdivision = subdivisionDao.save(subdivision);
	   return savedSubdivision;
	}

    @Override
    public List<Subdivision> save(List<Subdivision> subdivisions){
		List<Subdivision> list = new ArrayList<Subdivision>();
		for(Subdivision subdivision: subdivisions){
		        list.add(save(subdivision));	
		}
		return list;
	}


   @Override
   public Subdivision update(Subdivision subdivision){
     
    
		  Subdivision foundedSubdivision = findById(subdivision.getId()); 
		       if(foundedSubdivision==null)
	          return null;	  
	  
	   return  subdivisionDao.save(subdivision);
     
     }
    
	@Override
	@Transactional
	public int delete(Subdivision subdivision){

	        if(subdivision.getTitle()==null)
			  return -1;
		
			Subdivision foundedSubdivision = findByTitle(subdivision.getTitle());
	       if(foundedSubdivision==null)
	          return -1;  
	   subdivisionDao.delete(foundedSubdivision);
	   return 1;
	}


	public List<Subdivision> findByCriteria(SubdivisionVo subdivisionVo){
      String query = "SELECT o FROM Subdivision o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",subdivisionVo.getCreatedAt());
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",subdivisionVo.getUpdatedAt());
			 query += SearchUtil.addConstraint( "o", "libelleArab","LIKE",subdivisionVo.getLibelleArab());

			 query += SearchUtil.addConstraint( "o", "code","LIKE",subdivisionVo.getCode());

		 	 query += SearchUtil.addConstraint( "o", "id","=",subdivisionVo.getId());
			 query += SearchUtil.addConstraint( "o", "title","LIKE",subdivisionVo.getTitle());

	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",subdivisionVo.getCreatedAtMin(),subdivisionVo.getCreatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",subdivisionVo.getUpdatedAtMin(),subdivisionVo.getUpdatedAtMax());
   if(subdivisionVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",subdivisionVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",subdivisionVo.getCreatedByVo().getUsername());
   }
   
   if(subdivisionVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",subdivisionVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",subdivisionVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
