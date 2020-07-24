package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Nationality;
import ma.zs.generated.ws.rest.provided.vo.NationalityVo;

public interface NationalityService {

        /**

     * find all Nationality in database 
     * @return List<Nationality> , If database is empty return  null.
     */
	List<Nationality> findAll();
	   
	/**

     * find Nationality from database by libelle (reference)
     * @param libelle - reference of Nationality 
     * @return the founded Nationality , If no Nationality were
     *         found in database return  null.
     */
	Nationality findByLibelle(String libelle);

    /**
     * find Nationality from database by id (id)
     * @param id - id of Nationality 
     * @return the founded  Nationality , If no Nationality were
     *         found in database return  null.
     */
	Nationality findById(Long id);
     
     /**
     * delete Nationality from database
     * @param id - id of Nationality to be deleted
     * 
     */
	void deleteById(Long id);

	List<Nationality> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Nationality> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
	List<Nationality> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Nationality> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
    /**
     * create Nationality in database
     * @param nationality - Nationality to be created 
     * @return the created Nationality, If the Nationality can't be created return null.
     */
	Nationality create(Nationality nationality);

	/**
     * create list Nationality in database
     * @param nationalitys - list of Nationality to be created 
     * @return the created Nationality list
     */
	List<Nationality> create(List<Nationality> nationalitys);
    
     /**
     * update Nationality in database
     * @param nationality - Nationality to be updated
     * @return the updated Nationality, If the Nationality can't be updated return null.
     */
    Nationality update(Nationality nationality);
    
       /**
     * delete Nationality from database
     * @param nationality - Nationality to be deleted
     * @return 1 if Nationality deleted successfully, If the Nationality can't be deleted return negative int
     */
	int delete(Nationality nationality);


    
        /**
     * delete Nationality from database by libelle (reference)
     * 
     * @param libelle - reference of Nationality to be deleted
     * @return 1 if Nationality deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for Nationality in by some criteria
     * @return the searhed list Nationality 
     */
	List<Nationality> findByCriteria( NationalityVo nationalityVo);
}