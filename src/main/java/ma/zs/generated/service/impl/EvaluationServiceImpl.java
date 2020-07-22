package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Evaluation;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.EvaluationDao;
import ma.zs.generated.service.facade.EvaluationService;
import ma.zs.generated.service.facade.UserService;   

import ma.zs.generated.ws.rest.provided.vo.EvaluationVo;
import ma.zs.generated.service.util.*;
@Service
public class EvaluationServiceImpl implements EvaluationService {

   @Autowired
   private EvaluationDao evaluationDao;
   
    @Autowired
    private UserService userService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Evaluation> findAll(){
		return evaluationDao.findAll();
	}	
	@Override
	public List<Evaluation> findByCreatedByUsername(String username){
		return evaluationDao.findByCreatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByCreatedByUsername(String username){
		return evaluationDao.deleteByCreatedByUsername(username);
	}
	
     @Override
    public List<Evaluation> findByCreatedById(Long id){
		return evaluationDao.findByCreatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByCreatedById(Long id){
		return evaluationDao.deleteByCreatedById(id);

	}
     		
	@Override
	public List<Evaluation> findByUpdatedByUsername(String username){
		return evaluationDao.findByUpdatedByUsername(username);
	}
	@Override
	@Transactional
    public int deleteByUpdatedByUsername(String username){
		return evaluationDao.deleteByUpdatedByUsername(username);
	}
	
     @Override
    public List<Evaluation> findByUpdatedById(Long id){
		return evaluationDao.findByUpdatedById(id);

	}
	   @Override
	   @Transactional
    public int deleteByUpdatedById(Long id){
		return evaluationDao.deleteByUpdatedById(id);

	}
     		
	@Override
	public Evaluation findByTitle(String title){
		if( title==null)
		  return null;
		return evaluationDao.findByTitle(title);
	}

   

	@Override
	@Transactional
	public int deleteByTitle(String  title) {
		return evaluationDao.deleteByTitle(title);	 
	}

	@Override
	public Evaluation findById(Long id){
		 if(id==null)
		  return null;
		return evaluationDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           evaluationDao.deleteById(id);
   }
	@Override	
	public Evaluation save (Evaluation evaluation){
			Evaluation foundedEvaluation = findByTitle(evaluation.getTitle());
	       if(foundedEvaluation!=null)
	          return null;  
	    
	        
	    Evaluation savedEvaluation = evaluationDao.save(evaluation);
	   return savedEvaluation;
	}

    @Override
    public List<Evaluation> save(List<Evaluation> evaluations){
		List<Evaluation> list = new ArrayList<Evaluation>();
		for(Evaluation evaluation: evaluations){
		        list.add(save(evaluation));	
		}
		return list;
	}


   @Override
   public Evaluation update(Evaluation evaluation){
     
    
		  Evaluation foundedEvaluation = findById(evaluation.getId()); 
		       if(foundedEvaluation==null)
	          return null;	  
	  
	   return  evaluationDao.save(evaluation);
     
     }
    
	@Override
	@Transactional
	public int delete(Evaluation evaluation){

	        if(evaluation.getTitle()==null)
			  return -1;
		
			Evaluation foundedEvaluation = findByTitle(evaluation.getTitle());
	       if(foundedEvaluation==null)
	          return -1;  
	   evaluationDao.delete(foundedEvaluation);
	   return 1;
	}


	public List<Evaluation> findByCriteria(EvaluationVo evaluationVo){
      String query = "SELECT o FROM Evaluation o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "createdAt","=",evaluationVo.getCreatedAt());
	  query += SearchUtil.addConstraintDate( "o", "updatedAt","=",evaluationVo.getUpdatedAt());
			 query += SearchUtil.addConstraint( "o", "libelleArab","LIKE",evaluationVo.getLibelleArab());

			 query += SearchUtil.addConstraint( "o", "code","LIKE",evaluationVo.getCode());

		 	 query += SearchUtil.addConstraint( "o", "id","=",evaluationVo.getId());
			 query += SearchUtil.addConstraint( "o", "title","LIKE",evaluationVo.getTitle());

	  query += SearchUtil.addConstraintMinMaxDate("o","createdAt",evaluationVo.getCreatedAtMin(),evaluationVo.getCreatedAtMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",evaluationVo.getUpdatedAtMin(),evaluationVo.getUpdatedAtMax());
   if(evaluationVo.getCreatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "createdBy.id","=",evaluationVo.getCreatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "createdBy.username","LIKE",evaluationVo.getCreatedByVo().getUsername());
   }
   
   if(evaluationVo.getUpdatedByVo()!=null){
     query += SearchUtil.addConstraint( "o", "updatedBy.id","=",evaluationVo.getUpdatedByVo().getId());
     query += SearchUtil.addConstraint( "o", "updatedBy.username","LIKE",evaluationVo.getUpdatedByVo().getUsername());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
