package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Bordereau;
import ma.zs.generated.dao.BordereauDao;
import ma.zs.generated.service.facade.BordereauService;

import ma.zs.generated.ws.rest.provided.vo.BordereauVo;
import ma.zs.generated.service.util.*;
@Service
public class BordereauServiceImpl implements BordereauService {

   @Autowired
   private BordereauDao bordereauDao;
   
   
   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Bordereau> findAll(){
		return bordereauDao.findAll();
	}	
	@Override
	public List<Bordereau> findByCreatedByUsername(String username){
		return bordereauDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return bordereauDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<Bordereau> findByCreatedById(Long id){
		return bordereauDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return bordereauDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<Bordereau> findByUpdatedByUsername(String username){
		return bordereauDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return bordereauDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<Bordereau> findByUpdatedById(Long id){
		return bordereauDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return bordereauDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public Bordereau findByLibelle(String libelle){
		if( libelle==null)
		  return null;
		return bordereauDao.findByLibelle(libelle);
	}

   

	@Override
	@Transactional
	public int deleteByLibelle(String  libelle) {
		return bordereauDao.deleteByLibelle(libelle);	 
	}

	@Override
	public Bordereau findById(Long id){
		 if(id==null)
		  return null;
		return bordereauDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           bordereauDao.deleteById(id);
   }
	@Override	
	public Bordereau save (Bordereau bordereau){
			Bordereau foundedBordereau = findByLibelle(bordereau.getLibelle());
	       if(foundedBordereau!=null)
	          return null;  
	    
	  

	    Bordereau savedBordereau = bordereauDao.save(bordereau);
	   return savedBordereau;
	}

    @Override
    public List<Bordereau> save(List<Bordereau> bordereaus){
		List<Bordereau> list = new ArrayList<Bordereau>();
		for(Bordereau bordereau: bordereaus){
		        list.add(save(bordereau));	
		}
		return list;
	}


   @Override
   public Bordereau update(Bordereau bordereau){
     
    
		  Bordereau foundedBordereau = findById(bordereau.getId()); 
		       if(foundedBordereau==null)
	          return null;	  
	  
	   return  bordereauDao.save(bordereau);
     
     }
    
	@Override
	@Transactional
	public int delete(Bordereau bordereau){

	        if(bordereau.getLibelle()==null)
			  return -1;
		
			Bordereau foundedBordereau = findByLibelle(bordereau.getLibelle());
	       if(foundedBordereau==null)
	          return -1;  
	   bordereauDao.delete(foundedBordereau);
	   return 1;
	}


	public List<Bordereau> findByCriteria(BordereauVo bordereauVo){
      String query = "SELECT o FROM Bordereau o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "dateBordereaux","=",bordereauVo.getDateBordereaux());
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",bordereauVo.getCreatedAt());
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",bordereauVo.getUpdatedAt());
			 query += SearchUtil.addConstraint( "o", "description","LIKE",bordereauVo.getDescription());

		 	 query += SearchUtil.addConstraint( "o", "nombrePieceJointe","=",bordereauVo.getNombrePieceJointe());
		 	 query += SearchUtil.addConstraint( "o", "id","=",bordereauVo.getId());
			 query += SearchUtil.addConstraint( "o", "libelle","LIKE",bordereauVo.getLibelle());

	  query += SearchUtil.addConstraintMinMaxDate("o","dateBordereaux",bordereauVo.getDateBordereauxMin(),bordereauVo.getDateBordereauxMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",bordereauVo.getCreatedAtMin(),bordereauVo.getCreatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",bordereauVo.getUpdatedAtMin(),bordereauVo.getUpdatedAtMax());
	  query += SearchUtil.addConstraintMinMax("o","nombrePieceJointe",bordereauVo.getNombrePieceJointeMin(),bordereauVo.getNombrePieceJointeMax());
   if(bordereauVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",bordereauVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",bordereauVo.getCreatedByVo().getUsername());
   }
   
   if(bordereauVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",bordereauVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",bordereauVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
