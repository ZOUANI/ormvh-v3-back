package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Nationality;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.NationalityDao;
import ma.zs.generated.service.facade.NationalityService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.NationalityVo;
import ma.zs.generated.service.util.*;
@Service
public class NationalityServiceImpl implements NationalityService {

   @Autowired
   private NationalityDao nationalityDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Nationality> findAll(){
		return nationalityDao.findAll();
	}	
	@Override
	public List<Nationality> findByUpdatedByUsername(String username){
		return nationalityDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return nationalityDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<Nationality> findByUpdatedById(Long id){
		return nationalityDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return nationalityDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public List<Nationality> findByCreatedByUsername(String username){
		return nationalityDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return nationalityDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<Nationality> findByCreatedById(Long id){
		return nationalityDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return nationalityDao.deleteByCreatedById(id);

	}
     		
	@Override
	public Nationality findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return nationalityDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return nationalityDao.deleteByLibelle(libelle);	 
	}

	@Override
	public Nationality findById(Long id){
		 if(id==null)
		  return null;
		return nationalityDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           nationalityDao.deleteById(id);
   }
	@Override	
	public Nationality save (Nationality nationality){
			Nationality foundedNationality = findByLibelle(nationality.getLibelle());
	       if(foundedNationality!=null)
	          return null;  
	    
	          if(nationality.getUpdatedBy()!=null){
				    User updatedBy = userService.findByUsername(nationality.getUpdatedBy().getUsername());
				  if(updatedBy == null)
				  nationality.setUpdatedBy(userService.save(nationality.getUpdatedBy()));
				  else
				  nationality.setUpdatedBy(updatedBy);
			  }
	    
	          if(nationality.getCreatedBy()!=null){
				    User createdBy = userService.findByUsername(nationality.getCreatedBy().getUsername());
				  if(createdBy == null)
				  nationality.setCreatedBy(userService.save(nationality.getCreatedBy()));
				  else
				  nationality.setCreatedBy(createdBy);
			  }

	    Nationality savedNationality = nationalityDao.save(nationality);
	   return savedNationality;
	}

    @Override
    public List<Nationality> save(List<Nationality> nationalitys){
		List<Nationality> list = new ArrayList<Nationality>();
		for(Nationality nationality: nationalitys){
		        list.add(save(nationality));	
		}
		return list;
	}


   @Override
   public Nationality update(Nationality nationality){
     
    
		  Nationality foundedNationality = findById(nationality.getId()); 
		       if(foundedNationality==null)
	          return null;	  
	  
	   return  nationalityDao.save(nationality);
     
     }
    
	@Override
	@Transactional
	public int delete(Nationality nationality){

	        if(nationality.getLibelle()==null)
			  return -1;
		
			Nationality foundedNationality = findByLibelle(nationality.getLibelle());
	       if(foundedNationality==null)
	          return -1;  
	   nationalityDao.delete(foundedNationality);
	   return 1;
	}


	public List<Nationality> findByCriteria(NationalityVo nationalityVo){
      String query = "SELECT o FROM Nationality o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",nationalityVo.getUpdatedAt());
			 query += SearchUtil.addConstraint( "o", "libelle","LIKE",nationalityVo.getLibelle());

	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",nationalityVo.getCreatedAt());
		 	 query += SearchUtil.addConstraint( "o", "id","=",nationalityVo.getId());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",nationalityVo.getUpdatedAtMin(),nationalityVo.getUpdatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",nationalityVo.getCreatedAtMin(),nationalityVo.getCreatedAtMax());
   if(nationalityVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",nationalityVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",nationalityVo.getUpdatedByVo().getUsername());
   }
   
   if(nationalityVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",nationalityVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",nationalityVo.getCreatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
