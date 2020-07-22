package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Expeditor;
import ma.zs.generated.ws.rest.provided.vo.ExpeditorVo;

public interface ExpeditorService {

        /**

     * find all Expeditor in database 
     * @return List<Expeditor> , If database is empty return  null.
     */
	List<Expeditor> findAll();
	   
	/**

     * find Expeditor from database by title (reference)
     * @param title - reference of Expeditor 
     * @return the founded Expeditor , If no Expeditor were
     *         found in database return  null.
     */
	Expeditor findByTitle(String title);

    /**
     * find Expeditor from database by id (id)
     * @param id - id of Expeditor 
     * @return the founded  Expeditor , If no Expeditor were
     *         found in database return  null.
     */
	Expeditor findById(Long id);
     
     /**
     * delete Expeditor from database
     * @param id - id of Expeditor to be deleted
     * 
     */
	void deleteById(Long id);

	List<Expeditor> findBySexeLibelle(String libelle);
    int deleteBySexeLibelle(String libelle);       
			
    List<Expeditor> findBySexeId(Long id);
    int deleteBySexeId(Long id);
			 
	List<Expeditor> findByNationalityLibelle(String libelle);
    int deleteByNationalityLibelle(String libelle);       
			
    List<Expeditor> findByNationalityId(Long id);
    int deleteByNationalityId(Long id);
			 
	List<Expeditor> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Expeditor> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Expeditor> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Expeditor> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save Expeditor in database
     * @param expeditor - Expeditor to be saved 
     * @return the saved Expeditor, If the Expeditor can't be saved return null.
     */
	Expeditor save(Expeditor expeditor);

	/**
     * save list Expeditor in database
     * @param expeditors - list of Expeditor to be saved 
     * @return the saved Expeditor list
     */
	List<Expeditor> save(List<Expeditor> expeditors);
    
     /**
     * update Expeditor in database
     * @param expeditor - Expeditor to be updated
     * @return the updated Expeditor, If the Expeditor can't be updated return null.
     */
    Expeditor update(Expeditor expeditor);
    
       /**
     * delete Expeditor from database
     * @param expeditor - Expeditor to be deleted
     * @return 1 if Expeditor deleted successfully, If the Expeditor can't be deleted return negative int
     */
	int delete(Expeditor expeditor);


    
        /**
     * delete Expeditor from database by title (reference)
     * 
     * @param title - reference of Expeditor to be deleted
     * @return 1 if Expeditor deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for Expeditor in by some criteria
     * @return the searhed list Expeditor 
     */
	List<Expeditor> findByCriteria( ExpeditorVo expeditorVo);
}