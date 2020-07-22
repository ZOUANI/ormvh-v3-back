package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Evaluation;
import ma.zs.generated.ws.rest.provided.vo.EvaluationVo;

public interface EvaluationService {

        /**

     * find all Evaluation in database 
     * @return List<Evaluation> , If database is empty return  null.
     */
	List<Evaluation> findAll();
	   
	/**

     * find Evaluation from database by title (reference)
     * @param title - reference of Evaluation 
     * @return the founded Evaluation , If no Evaluation were
     *         found in database return  null.
     */
	Evaluation findByTitle(String title);

    /**
     * find Evaluation from database by id (id)
     * @param id - id of Evaluation 
     * @return the founded  Evaluation , If no Evaluation were
     *         found in database return  null.
     */
	Evaluation findById(Long id);
     
     /**
     * delete Evaluation from database
     * @param id - id of Evaluation to be deleted
     * 
     */
	void deleteById(Long id);

	List<Evaluation> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Evaluation> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Evaluation> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Evaluation> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save Evaluation in database
     * @param evaluation - Evaluation to be saved 
     * @return the saved Evaluation, If the Evaluation can't be saved return null.
     */
	Evaluation save(Evaluation evaluation);

	/**
     * save list Evaluation in database
     * @param evaluations - list of Evaluation to be saved 
     * @return the saved Evaluation list
     */
	List<Evaluation> save(List<Evaluation> evaluations);
    
     /**
     * update Evaluation in database
     * @param evaluation - Evaluation to be updated
     * @return the updated Evaluation, If the Evaluation can't be updated return null.
     */
    Evaluation update(Evaluation evaluation);
    
       /**
     * delete Evaluation from database
     * @param evaluation - Evaluation to be deleted
     * @return 1 if Evaluation deleted successfully, If the Evaluation can't be deleted return negative int
     */
	int delete(Evaluation evaluation);


    
        /**
     * delete Evaluation from database by title (reference)
     * 
     * @param title - reference of Evaluation to be deleted
     * @return 1 if Evaluation deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for Evaluation in by some criteria
     * @return the searhed list Evaluation 
     */
	List<Evaluation> findByCriteria( EvaluationVo evaluationVo);
}