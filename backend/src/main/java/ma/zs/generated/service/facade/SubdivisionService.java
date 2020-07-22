package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Subdivision;
import ma.zs.generated.ws.rest.provided.vo.SubdivisionVo;

public interface SubdivisionService {

        /**

     * find all Subdivision in database 
     * @return List<Subdivision> , If database is empty return  null.
     */
	List<Subdivision> findAll();
	   
	/**

     * find Subdivision from database by title (reference)
     * @param title - reference of Subdivision 
     * @return the founded Subdivision , If no Subdivision were
     *         found in database return  null.
     */
	Subdivision findByTitle(String title);

    /**
     * find Subdivision from database by id (id)
     * @param id - id of Subdivision 
     * @return the founded  Subdivision , If no Subdivision were
     *         found in database return  null.
     */
	Subdivision findById(Long id);
     
     /**
     * delete Subdivision from database
     * @param id - id of Subdivision to be deleted
     * 
     */
	void deleteById(Long id);

	List<Subdivision> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Subdivision> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Subdivision> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Subdivision> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save Subdivision in database
     * @param subdivision - Subdivision to be saved 
     * @return the saved Subdivision, If the Subdivision can't be saved return null.
     */
	Subdivision save(Subdivision subdivision);

	/**
     * save list Subdivision in database
     * @param subdivisions - list of Subdivision to be saved 
     * @return the saved Subdivision list
     */
	List<Subdivision> save(List<Subdivision> subdivisions);
    
     /**
     * update Subdivision in database
     * @param subdivision - Subdivision to be updated
     * @return the updated Subdivision, If the Subdivision can't be updated return null.
     */
    Subdivision update(Subdivision subdivision);
    
       /**
     * delete Subdivision from database
     * @param subdivision - Subdivision to be deleted
     * @return 1 if Subdivision deleted successfully, If the Subdivision can't be deleted return negative int
     */
	int delete(Subdivision subdivision);


    
        /**
     * delete Subdivision from database by title (reference)
     * 
     * @param title - reference of Subdivision to be deleted
     * @return 1 if Subdivision deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for Subdivision in by some criteria
     * @return the searhed list Subdivision 
     */
	List<Subdivision> findByCriteria( SubdivisionVo subdivisionVo);
}