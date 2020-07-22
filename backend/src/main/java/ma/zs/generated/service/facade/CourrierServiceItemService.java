package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.CourrierServiceItem;
import ma.zs.generated.ws.rest.provided.vo.CourrierServiceItemVo;

public interface CourrierServiceItemService {

        /**

     * find all CourrierServiceItem in database 
     * @return List<CourrierServiceItem> , If database is empty return  null.
     */
	List<CourrierServiceItem> findAll();
	   

    /**
     * find CourrierServiceItem from database by id (id)
     * @param id - id of CourrierServiceItem 
     * @return the founded  CourrierServiceItem , If no CourrierServiceItem were
     *         found in database return  null.
     */
	CourrierServiceItem findById(Long id);
     
     /**
     * delete CourrierServiceItem from database
     * @param id - id of CourrierServiceItem to be deleted
     * 
     */
	void deleteById(Long id);

	List<CourrierServiceItem> findByCourrierIdCourrier(String idCourrier);
    int deleteByCourrierIdCourrier(String idCourrier);       
			
    List<CourrierServiceItem> findByCourrierId(Long id);
    int deleteByCourrierId(Long id);
			 
	List<CourrierServiceItem> findByServiceTitle(String title);
    int deleteByServiceTitle(String title);       
			
    List<CourrierServiceItem> findByServiceId(Long id);
    int deleteByServiceId(Long id);
			 
    /**
     * save CourrierServiceItem in database
     * @param courrierServiceItem - CourrierServiceItem to be saved 
     * @return the saved CourrierServiceItem, If the CourrierServiceItem can't be saved return null.
     */
	CourrierServiceItem save(CourrierServiceItem courrierServiceItem);

	/**
     * save list CourrierServiceItem in database
     * @param courrierServiceItems - list of CourrierServiceItem to be saved 
     * @return the saved CourrierServiceItem list
     */
	List<CourrierServiceItem> save(List<CourrierServiceItem> courrierServiceItems);
    
     /**
     * update CourrierServiceItem in database
     * @param courrierServiceItem - CourrierServiceItem to be updated
     * @return the updated CourrierServiceItem, If the CourrierServiceItem can't be updated return null.
     */
    CourrierServiceItem update(CourrierServiceItem courrierServiceItem);
    
       /**
     * delete CourrierServiceItem from database
     * @param courrierServiceItem - CourrierServiceItem to be deleted
     * @return 1 if CourrierServiceItem deleted successfully, If the CourrierServiceItem can't be deleted return negative int
     */
	int delete(CourrierServiceItem courrierServiceItem);


    

     
	/**
     * search for CourrierServiceItem in by some criteria
     * @return the searhed list CourrierServiceItem 
     */
	List<CourrierServiceItem> findByCriteria( CourrierServiceItemVo courrierServiceItemVo);
}