package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.ExpeditorType;
import ma.zs.generated.ws.rest.provided.vo.ExpeditorTypeVo;

public interface ExpeditorTypeService {

        /**

     * find all ExpeditorType in database 
     * @return List<ExpeditorType> , If database is empty return  null.
     */
	List<ExpeditorType> findAll();
	   
	/**

     * find ExpeditorType from database by title (reference)
     * @param title - reference of ExpeditorType 
     * @return the founded ExpeditorType , If no ExpeditorType were
     *         found in database return  null.
     */
	ExpeditorType findByTitle(String title);

    /**
     * find ExpeditorType from database by id (id)
     * @param id - id of ExpeditorType 
     * @return the founded  ExpeditorType , If no ExpeditorType were
     *         found in database return  null.
     */
	ExpeditorType findById(Long id);
     
     /**
     * delete ExpeditorType from database
     * @param id - id of ExpeditorType to be deleted
     * 
     */
	void deleteById(Long id);

	List<ExpeditorType> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<ExpeditorType> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<ExpeditorType> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<ExpeditorType> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * create ExpeditorType in database
     * @param expeditorType - ExpeditorType to be created 
     * @return the created ExpeditorType, If the ExpeditorType can't be created return null.
     */
	ExpeditorType create(ExpeditorType expeditorType);

	/**
     * create list ExpeditorType in database
     * @param expeditorTypes - list of ExpeditorType to be created 
     * @return the created ExpeditorType list
     */
	List<ExpeditorType> create(List<ExpeditorType> expeditorTypes);
    
     /**
     * update ExpeditorType in database
     * @param expeditorType - ExpeditorType to be updated
     * @return the updated ExpeditorType, If the ExpeditorType can't be updated return null.
     */
    ExpeditorType update(ExpeditorType expeditorType);
    
       /**
     * delete ExpeditorType from database
     * @param expeditorType - ExpeditorType to be deleted
     * @return 1 if ExpeditorType deleted successfully, If the ExpeditorType can't be deleted return negative int
     */
	int delete(ExpeditorType expeditorType);


    
        /**
     * delete ExpeditorType from database by title (reference)
     * 
     * @param title - reference of ExpeditorType to be deleted
     * @return 1 if ExpeditorType deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for ExpeditorType in by some criteria
     * @return the searhed list ExpeditorType 
     */
	List<ExpeditorType> findByCriteria( ExpeditorTypeVo expeditorTypeVo);
}