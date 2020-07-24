package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.CategorieModelLettreReponse;
import ma.zs.generated.dao.CategorieModelLettreReponseDao;
import ma.zs.generated.service.facade.CategorieModelLettreReponseService;

import ma.zs.generated.ws.rest.provided.vo.CategorieModelLettreReponseVo;
import ma.zs.generated.service.util.*;
@Service
public class CategorieModelLettreReponseServiceImpl extends  AbstractService<CategorieModelLettreReponse> implements CategorieModelLettreReponseService {

   @Autowired
   private CategorieModelLettreReponseDao categorieModelLettreReponseDao;
   
  
   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<CategorieModelLettreReponse> findAll(){
		return categorieModelLettreReponseDao.findAll();
	}	
	@Override
	public List<CategorieModelLettreReponse> findByUpdatedByUsername(String username){
		return categorieModelLettreReponseDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return categorieModelLettreReponseDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<CategorieModelLettreReponse> findByUpdatedById(Long id){
		return categorieModelLettreReponseDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return categorieModelLettreReponseDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public List<CategorieModelLettreReponse> findByCreatedByUsername(String username){
		return categorieModelLettreReponseDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return categorieModelLettreReponseDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<CategorieModelLettreReponse> findByCreatedById(Long id){
		return categorieModelLettreReponseDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return categorieModelLettreReponseDao.deleteByCreatedById(id);

	}
     		
	@Override
	public CategorieModelLettreReponse findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return categorieModelLettreReponseDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return categorieModelLettreReponseDao.deleteByLibelle(libelle);	 
	}

	@Override
	public CategorieModelLettreReponse findById(Long id){
		 if(id==null)
		  return null;
		return categorieModelLettreReponseDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           categorieModelLettreReponseDao.deleteById(id);
   }
	@Override	
	public CategorieModelLettreReponse save (CategorieModelLettreReponse categorieModelLettreReponse){
			CategorieModelLettreReponse foundedCategorieModelLettreReponse = findByLibelle(categorieModelLettreReponse.getLibelle());
	       if(foundedCategorieModelLettreReponse!=null)
	          return null;  
	    
	       
	    CategorieModelLettreReponse savedCategorieModelLettreReponse = categorieModelLettreReponseDao.save(categorieModelLettreReponse);
	   return savedCategorieModelLettreReponse;
	}


   @Override
   public CategorieModelLettreReponse update(CategorieModelLettreReponse categorieModelLettreReponse){
     
    
		  CategorieModelLettreReponse foundedCategorieModelLettreReponse = findById(categorieModelLettreReponse.getId()); 
		       if(foundedCategorieModelLettreReponse==null)
	          return null;	  
	  
	   return  categorieModelLettreReponseDao.save(categorieModelLettreReponse);
     
     }
    
	@Override
	@Transactional
	public int delete(CategorieModelLettreReponse categorieModelLettreReponse){

	        if(categorieModelLettreReponse.getLibelle()==null)
			  return -1;
		
			CategorieModelLettreReponse foundedCategorieModelLettreReponse = findByLibelle(categorieModelLettreReponse.getLibelle());
	       if(foundedCategorieModelLettreReponse==null)
	          return -1;  
	   categorieModelLettreReponseDao.delete(foundedCategorieModelLettreReponse);
	   return 1;
	}


	public List<CategorieModelLettreReponse> findByCriteria(CategorieModelLettreReponseVo categorieModelLettreReponseVo){
      String query = "SELECT o FROM CategorieModelLettreReponse o where 1=1 ";
	  query += addConstraintDate( "o", "updatedAt","=",categorieModelLettreReponseVo.getUpdatedAt());
			 query += addConstraint( "o", "libelle","LIKE",categorieModelLettreReponseVo.getLibelle());

	  query += addConstraintDate( "o", "createdAt","=",categorieModelLettreReponseVo.getCreatedAt());
		 	 query += addConstraint( "o", "id","=",categorieModelLettreReponseVo.getId());
	  query += addConstraintMinMaxDate("o","updatedAt",categorieModelLettreReponseVo.getUpdatedAtMin(),categorieModelLettreReponseVo.getUpdatedAtMax());
	  query += addConstraintMinMaxDate("o","createdAt",categorieModelLettreReponseVo.getCreatedAtMin(),categorieModelLettreReponseVo.getCreatedAtMax());
   if(categorieModelLettreReponseVo.getUpdatedByVo()!=null){
     query += addConstraint( "o", "updatedBy.id","=",categorieModelLettreReponseVo.getUpdatedByVo().getId());
     query += addConstraint( "o", "updatedBy.username","LIKE",categorieModelLettreReponseVo.getUpdatedByVo().getUsername());
   }
   
   if(categorieModelLettreReponseVo.getCreatedByVo()!=null){
     query += addConstraint( "o", "createdBy.id","=",categorieModelLettreReponseVo.getCreatedByVo().getId());
     query += addConstraint( "o", "createdBy.username","LIKE",categorieModelLettreReponseVo.getCreatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
