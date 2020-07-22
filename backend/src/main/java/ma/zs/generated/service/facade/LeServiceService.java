package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.ws.rest.provided.vo.LeServiceVo;

public interface LeServiceService {

        /**

     * find all LeService in database 
     * @return List<LeService> , If database is empty return  null.
     */
	List<LeService> findAll();
	   
	/**

     * find LeService from database by title (reference)
     * @param title - reference of LeService 
     * @return the founded LeService , If no LeService were
     *         found in database return  null.
     */
	LeService findByTitle(String title);

    /**
     * find LeService from database by id (id)
     * @param id - id of LeService 
     * @return the founded  LeService , If no LeService were
     *         found in database return  null.
     */
	LeService findById(Long id);
     
     /**
     * delete LeService from database
     * @param id - id of LeService to be deleted
     * 
     */
	void deleteById(Long id);

	List<LeService> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<LeService> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<LeService> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<LeService> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save LeService in database
     * @param leService - LeService to be saved 
     * @return the saved LeService, If the LeService can't be saved return null.
     */
	LeService save(LeService leService);

	/**
     * save list LeService in database
     * @param leServices - list of LeService to be saved 
     * @return the saved LeService list
     */
	List<LeService> save(List<LeService> leServices);
    
     /**
     * update LeService in database
     * @param leService - LeService to be updated
     * @return the updated LeService, If the LeService can't be updated return null.
     */
    LeService update(LeService leService);
    
       /**
     * delete LeService from database
     * @param leService - LeService to be deleted
     * @return 1 if LeService deleted successfully, If the LeService can't be deleted return negative int
     */
	int delete(LeService leService);


    
        /**
     * delete LeService from database by title (reference)
     * 
     * @param title - reference of LeService to be deleted
     * @return 1 if LeService deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for LeService in by some criteria
     * @return the searhed list LeService 
     */
	List<LeService> findByCriteria( LeServiceVo leServiceVo);
}