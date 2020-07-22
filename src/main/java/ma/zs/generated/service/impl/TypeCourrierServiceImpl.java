package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.dao.TypeCourrierDao;
import ma.zs.generated.service.facade.TypeCourrierService;

import ma.zs.generated.ws.rest.provided.vo.TypeCourrierVo;
import ma.zs.generated.service.util.*;
@Service
public class TypeCourrierServiceImpl implements TypeCourrierService {

   @Autowired
   private TypeCourrierDao typeCourrierDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<TypeCourrier> findAll(){
		return typeCourrierDao.findAll();
	}	
	@Override
	public TypeCourrier findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return typeCourrierDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return typeCourrierDao.deleteByLibelle(libelle);	 
	}

	@Override
	public TypeCourrier findById(Long id){
		 if(id==null)
		  return null;
		return typeCourrierDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           typeCourrierDao.deleteById(id);
   }
	@Override	
	public TypeCourrier save (TypeCourrier typeCourrier){
			TypeCourrier foundedTypeCourrier = findByLibelle(typeCourrier.getLibelle());
	       if(foundedTypeCourrier!=null)
	          return null;  

	    TypeCourrier savedTypeCourrier = typeCourrierDao.save(typeCourrier);
	   return savedTypeCourrier;
	}

    @Override
    public List<TypeCourrier> save(List<TypeCourrier> typeCourriers){
		List<TypeCourrier> list = new ArrayList<TypeCourrier>();
		for(TypeCourrier typeCourrier: typeCourriers){
		        list.add(save(typeCourrier));	
		}
		return list;
	}


   @Override
   public TypeCourrier update(TypeCourrier typeCourrier){
     
    
		  TypeCourrier foundedTypeCourrier = findById(typeCourrier.getId()); 
		       if(foundedTypeCourrier==null)
	          return null;	  
	  
	   return  typeCourrierDao.save(typeCourrier);
     
     }
    
	@Override
	@Transactional
	public int delete(TypeCourrier typeCourrier){

	        if(typeCourrier.getLibelle()==null)
			  return -1;
		
			TypeCourrier foundedTypeCourrier = findByLibelle(typeCourrier.getLibelle());
	       if(foundedTypeCourrier==null)
	          return -1;  
	   typeCourrierDao.delete(foundedTypeCourrier);
	   return 1;
	}


	public List<TypeCourrier> findByCriteria(TypeCourrierVo typeCourrierVo){
      String query = "SELECT o FROM TypeCourrier o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "libelleArab","LIKE",typeCourrierVo.getLibelleArab());

			 query += SearchUtil.addConstraint( "o", "code","LIKE",typeCourrierVo.getCode());

			 query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeCourrierVo.getLibelle());

		 	 query += SearchUtil.addConstraint( "o", "id","=",typeCourrierVo.getId());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
