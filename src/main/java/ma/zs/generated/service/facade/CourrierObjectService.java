package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.CourrierObject;
import ma.zs.generated.ws.rest.provided.vo.CourrierObjectVo;

public interface CourrierObjectService {

        /**

     * find all CourrierObject in database 
     * @return List<CourrierObject> , If database is empty return  null.
     */
	List<CourrierObject> findAll();
	   
	/**

     * find CourrierObject from database by title (reference)
     * @param title - reference of CourrierObject 
     * @return the founded CourrierObject , If no CourrierObject were
     *         found in database return  null.
     */
	CourrierObject findByTitle(String title);

    /**
     * find CourrierObject from database by id (id)
     * @param id - id of CourrierObject 
     * @return the founded  CourrierObject , If no CourrierObject were
     *         found in database return  null.
     */
	CourrierObject findById(Long id);
     
     /**
     * delete CourrierObject from database
     * @param id - id of CourrierObject to be deleted
     * 
     */
	void deleteById(Long id);

	List<CourrierObject> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<CourrierObject> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<CourrierObject> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<CourrierObject> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * create CourrierObject in database
     * @param courrierObject - CourrierObject to be created 
     * @return the created CourrierObject, If the CourrierObject can't be created return null.
     */
	CourrierObject create(CourrierObject courrierObject);

	/**
     * create list CourrierObject in database
     * @param courrierObjects - list of CourrierObject to be created 
     * @return the created CourrierObject list
     */
	List<CourrierObject> create(List<CourrierObject> courrierObjects);
    
     /**
     * update CourrierObject in database
     * @param courrierObject - CourrierObject to be updated
     * @return the updated CourrierObject, If the CourrierObject can't be updated return null.
     */
    CourrierObject update(CourrierObject courrierObject);
    
       /**
     * delete CourrierObject from database
     * @param courrierObject - CourrierObject to be deleted
     * @return 1 if CourrierObject deleted successfully, If the CourrierObject can't be deleted return negative int
     */
	int delete(CourrierObject courrierObject);


    
        /**
     * delete CourrierObject from database by title (reference)
     * 
     * @param title - reference of CourrierObject to be deleted
     * @return 1 if CourrierObject deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for CourrierObject in by some criteria
     * @return the searhed list CourrierObject 
     */
	List<CourrierObject> findByCriteria( CourrierObjectVo courrierObjectVo);
}