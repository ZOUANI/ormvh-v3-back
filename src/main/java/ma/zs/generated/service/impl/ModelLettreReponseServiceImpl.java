package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.ModelLettreReponse;
import ma.zs.generated.bean.CategorieModelLettreReponse;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.ModelLettreReponseDao;
import ma.zs.generated.service.facade.ModelLettreReponseService;
import ma.zs.generated.service.facade.UserService;   
import ma.zs.generated.service.facade.CategorieModelLettreReponseService;   

import ma.zs.generated.ws.rest.provided.vo.ModelLettreReponseVo;
import ma.zs.generated.service.util.*;
@Service
public class ModelLettreReponseServiceImpl implements ModelLettreReponseService {

   @Autowired
   private ModelLettreReponseDao modelLettreReponseDao;
   
    @Autowired
    private UserService userService ;
    @Autowired
    private CategorieModelLettreReponseService categorieModelLettreReponseService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<ModelLettreReponse> findAll(){
		return modelLettreReponseDao.findAll();
	}	
	@Override
	public List<ModelLettreReponse> findByCategorieModelLettreReponseLibelle(String libelle){
		return modelLettreReponseDao.findByCategorieModelLettreReponseLibelle(libelle);
	}
	@Override
	@Transactional
    public int deleteByCategorieModelLettreReponseLibelle(String libelle){
		return modelLettreReponseDao.deleteByCategorieModelLettreReponseLibelle(libelle);
	}
	
     @Override
    public List<ModelLettreReponse> findByCategorieModelLettreReponseId(Long id){
		return modelLettreReponseDao.findByCategorieModelLettreReponseId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCategorieModelLettreReponseId(Long id){
		return modelLettreReponseDao.deleteByCategorieModelLettreReponseId(id);

	}
     		
	@Override
	public List<ModelLettreReponse> findByCreatedByUsername(String username){
		return modelLettreReponseDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return modelLettreReponseDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<ModelLettreReponse> findByCreatedById(Long id){
		return modelLettreReponseDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return modelLettreReponseDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<ModelLettreReponse> findByUpdatedByUsername(String username){
		return modelLettreReponseDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return modelLettreReponseDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<ModelLettreReponse> findByUpdatedById(Long id){
		return modelLettreReponseDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return modelLettreReponseDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public ModelLettreReponse findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return modelLettreReponseDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return modelLettreReponseDao.deleteByLibelle(libelle);	 
	}

	@Override
	public ModelLettreReponse findById(Long id){
		 if(id==null)
		  return null;
		return modelLettreReponseDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           modelLettreReponseDao.deleteById(id);
   }
	@Override	
	public ModelLettreReponse save (ModelLettreReponse modelLettreReponse){
			ModelLettreReponse foundedModelLettreReponse = findByLibelle(modelLettreReponse.getLibelle());
	       if(foundedModelLettreReponse!=null)
	          return null;  
	    
	          if(modelLettreReponse.getCategorieModelLettreReponse()!=null){
				    CategorieModelLettreReponse categorieModelLettreReponse = categorieModelLettreReponseService.findByLibelle(modelLettreReponse.getCategorieModelLettreReponse().getLibelle());
				 
				  modelLettreReponse.setCategorieModelLettreReponse(categorieModelLettreReponse);
			  }
	    
	        
	    ModelLettreReponse savedModelLettreReponse = modelLettreReponseDao.save(modelLettreReponse);
	   return savedModelLettreReponse;
	}

    @Override
    public List<ModelLettreReponse> save(List<ModelLettreReponse> modelLettreReponses){
		List<ModelLettreReponse> list = new ArrayList<ModelLettreReponse>();
		for(ModelLettreReponse modelLettreReponse: modelLettreReponses){
		        list.add(save(modelLettreReponse));	
		}
		return list;
	}


   @Override
   public ModelLettreReponse update(ModelLettreReponse modelLettreReponse){
     
    
		  ModelLettreReponse foundedModelLettreReponse = findById(modelLettreReponse.getId()); 
		       if(foundedModelLettreReponse==null)
	          return null;	  
	  
	   return  modelLettreReponseDao.save(modelLettreReponse);
     
     }
    
	@Override
	@Transactional
	public int delete(ModelLettreReponse modelLettreReponse){

	        if(modelLettreReponse.getLibelle()==null)
			  return -1;
		
			ModelLettreReponse foundedModelLettreReponse = findByLibelle(modelLettreReponse.getLibelle());
	       if(foundedModelLettreReponse==null)
	          return -1;  
	   modelLettreReponseDao.delete(foundedModelLettreReponse);
	   return 1;
	}


	public List<ModelLettreReponse> findByCriteria(ModelLettreReponseVo modelLettreReponseVo){
      String query = "SELECT o FROM ModelLettreReponse o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",modelLettreReponseVo.getCreatedAt());
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",modelLettreReponseVo.getUpdatedAt());
			 query += SearchUtil.addConstraint( "o", "libelleArab","LIKE",modelLettreReponseVo.getLibelleArab());

			 query += SearchUtil.addConstraint( "o", "code","LIKE",modelLettreReponseVo.getCode());

			 query += SearchUtil.addConstraint( "o", "chemin","LIKE",modelLettreReponseVo.getChemin());

		 	 query += SearchUtil.addConstraint( "o", "id","=",modelLettreReponseVo.getId());
			 query += SearchUtil.addConstraint( "o", "libelle","LIKE",modelLettreReponseVo.getLibelle());

	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",modelLettreReponseVo.getCreatedAtMin(),modelLettreReponseVo.getCreatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",modelLettreReponseVo.getUpdatedAtMin(),modelLettreReponseVo.getUpdatedAtMax());
   if(modelLettreReponseVo.getCategorieModelLettreReponseVo()!=null){
     query += SearchUtil.addConstraint( "o", "categorieModelLettreReponse.id","=",modelLettreReponseVo.getCategorieModelLettreReponseVo().getId());
     query += SearchUtil.addConstraint( "o", "categorieModelLettreReponse.libelle","LIKE",modelLettreReponseVo.getCategorieModelLettreReponseVo().getLibelle());
   }
   
   if(modelLettreReponseVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",modelLettreReponseVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",modelLettreReponseVo.getCreatedByVo().getUsername());
   }
   
   if(modelLettreReponseVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",modelLettreReponseVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",modelLettreReponseVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
