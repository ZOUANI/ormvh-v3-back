package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Sexe;
import ma.zs.generated.dao.SexeDao;
import ma.zs.generated.service.facade.SexeService;

import ma.zs.generated.ws.rest.provided.vo.SexeVo;
import ma.zs.generated.service.util.*;
@Service
public class SexeServiceImpl extends AbstractService<Sexe> implements SexeService {

   @Autowired
   private SexeDao sexeDao;
   
   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Sexe> findAll(){
		return sexeDao.findAll();
	}	
	@Override
	public Sexe findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return sexeDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return sexeDao.deleteByLibelle(libelle);	 
	}

	@Override
	public Sexe findById(Long id){
		 if(id==null)
		  return null;
		return sexeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           sexeDao.deleteById(id);
   }
	
	@Override	
	public Sexe save (Sexe sexe){
			Sexe foundedSexe = findByLibelle(sexe.getLibelle());
	       if(foundedSexe!=null)
	          return null;  
	    Sexe savedSexe = sexeDao.save(sexe);
	   return savedSexe;
	}

   @Override
   public Sexe update(Sexe sexe){
     
    
		  Sexe foundedSexe = findById(sexe.getId()); 
		       if(foundedSexe==null)
	          return null;	  
	  
	   return  sexeDao.save(sexe);
     
     }
    
	@Override
	@Transactional
	public int delete(Sexe sexe){

	        if(sexe.getLibelle()==null)
			  return -1;
		
			Sexe foundedSexe = findByLibelle(sexe.getLibelle());
	       if(foundedSexe==null)
	          return -1;  
	   sexeDao.delete(foundedSexe);
	   return 1;
	}


	public List<Sexe> findByCriteria(SexeVo sexeVo){
      String query = "SELECT o FROM Sexe o where 1=1 ";
			 query += addConstraint( "o", "libelle","LIKE",sexeVo.getLibelle());

			 query += addConstraint( "o", "libelleArab","LIKE",sexeVo.getLibelleArab());

		 	 query += addConstraint( "o", "id","=",sexeVo.getId());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
