package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.NatureCourrier;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.NatureCourrierDao;
import ma.zs.generated.service.facade.NatureCourrierService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.NatureCourrierVo;
import ma.zs.generated.service.util.*;
@Service
public class NatureCourrierServiceImpl extends  AbstractService<NatureCourrier> implements NatureCourrierService {

   @Autowired
   private NatureCourrierDao natureCourrierDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<NatureCourrier> findAll(){
		return natureCourrierDao.findAll();
	}	
	@Override
	public List<NatureCourrier> findByCreatedByUsername(String username){
		return natureCourrierDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return natureCourrierDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<NatureCourrier> findByCreatedById(Long id){
		return natureCourrierDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return natureCourrierDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<NatureCourrier> findByUpdatedByUsername(String username){
		return natureCourrierDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return natureCourrierDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<NatureCourrier> findByUpdatedById(Long id){
		return natureCourrierDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return natureCourrierDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public NatureCourrier findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return natureCourrierDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return natureCourrierDao.deleteByLibelle(libelle);	 
	}

	@Override
	public NatureCourrier findById(Long id){
		 if(id==null)
		  return null;
		return natureCourrierDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           natureCourrierDao.deleteById(id);
   }
	@Override	
	public NatureCourrier save (NatureCourrier natureCourrier){
			NatureCourrier foundedNatureCourrier = findByLibelle(natureCourrier.getLibelle());
	       if(foundedNatureCourrier!=null)
	          return null;  
	    
	          if(natureCourrier.getCreatedBy()!=null){
				    User createdBy = userService.findByUsername(natureCourrier.getCreatedBy().getUsername());
				  if(createdBy == null)
				  natureCourrier.setCreatedBy(userService.create(natureCourrier.getCreatedBy()));
				  else
				  natureCourrier.setCreatedBy(createdBy);
			  }
	    
	          if(natureCourrier.getUpdatedBy()!=null){
				    User updatedBy = userService.findByUsername(natureCourrier.getUpdatedBy().getUsername());
				  if(updatedBy == null)
				  natureCourrier.setUpdatedBy(userService.create(natureCourrier.getUpdatedBy()));
				  else
				  natureCourrier.setUpdatedBy(updatedBy);
			  }

	    NatureCourrier savedNatureCourrier = natureCourrierDao.save(natureCourrier);
	   return savedNatureCourrier;
	}


   @Override
   public NatureCourrier update(NatureCourrier natureCourrier){
     
    
		  NatureCourrier foundedNatureCourrier = findById(natureCourrier.getId()); 
		       if(foundedNatureCourrier==null)
	          return null;	  
	  
	   return  natureCourrierDao.save(natureCourrier);
     
     }
    
	@Override
	@Transactional
	public int delete(NatureCourrier natureCourrier){

	        if(natureCourrier.getLibelle()==null)
			  return -1;
		
			NatureCourrier foundedNatureCourrier = findByLibelle(natureCourrier.getLibelle());
	       if(foundedNatureCourrier==null)
	          return -1;  
	   natureCourrierDao.delete(foundedNatureCourrier);
	   return 1;
	}


	public List<NatureCourrier> findByCriteria(NatureCourrierVo natureCourrierVo){
      String query = "SELECT o FROM NatureCourrier o where 1=1 ";
			 query += addConstraint( "o", "code","LIKE",natureCourrierVo.getCode());

	  query += addConstraintDate( "o", "createdAt","=",natureCourrierVo.getCreatedAt());
	  query += addConstraintDate( "o", "updatedAt","=",natureCourrierVo.getUpdatedAt());
		 	 query += addConstraint( "o", "delai","=",natureCourrierVo.getDelai());
		 	 query += addConstraint( "o", "relance","=",natureCourrierVo.getRelance());
			 query += addConstraint( "o", "libelleArab","LIKE",natureCourrierVo.getLibelleArab());

		 	 query += addConstraint( "o", "id","=",natureCourrierVo.getId());
			 query += addConstraint( "o", "libelle","LIKE",natureCourrierVo.getLibelle());

	  query += addConstraintMinMaxDate("o","createdAt",natureCourrierVo.getCreatedAtMin(),natureCourrierVo.getCreatedAtMax());
	  query += addConstraintMinMaxDate("o","updatedAt",natureCourrierVo.getUpdatedAtMin(),natureCourrierVo.getUpdatedAtMax());
	  query += addConstraintMinMax("o","delai",natureCourrierVo.getDelaiMin(),natureCourrierVo.getDelaiMax());
	  query += addConstraintMinMax("o","relance",natureCourrierVo.getRelanceMin(),natureCourrierVo.getRelanceMax());
   if(natureCourrierVo.getCreatedByVo()!=null){
     query += addConstraint( "o", "createdBy.id","=",natureCourrierVo.getCreatedByVo().getId());
     query += addConstraint( "o", "createdBy.username","LIKE",natureCourrierVo.getCreatedByVo().getUsername());
   }
   
   if(natureCourrierVo.getUpdatedByVo()!=null){
     query += addConstraint( "o", "updatedBy.id","=",natureCourrierVo.getUpdatedByVo().getId());
     query += addConstraint( "o", "updatedBy.username","LIKE",natureCourrierVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
