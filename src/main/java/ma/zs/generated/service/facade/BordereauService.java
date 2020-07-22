package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Bordereau;
import ma.zs.generated.ws.rest.provided.vo.BordereauVo;

public interface BordereauService {

        /**

     * find all Bordereau in database 
     * @return List<Bordereau> , If database is empty return  null.
     */
	List<Bordereau> findAll();
	   
	/**

     * find Bordereau from database by libelle (reference)
     * @param libelle - reference of Bordereau 
     * @return the founded Bordereau , If no Bordereau were
     *         found in database return  null.
     */
	Bordereau findByLibelle(String libelle);

    /**
     * find Bordereau from database by id (id)
     * @param id - id of Bordereau 
     * @return the founded  Bordereau , If no Bordereau were
     *         found in database return  null.
     */
	Bordereau findById(Long id);
     
     /**
     * delete Bordereau from database
     * @param id - id of Bordereau to be deleted
     * 
     */
	void deleteById(Long id);

	List<Bordereau> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Bordereau> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Bordereau> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Bordereau> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save Bordereau in database
     * @param bordereau - Bordereau to be saved 
     * @return the saved Bordereau, If the Bordereau can't be saved return null.
     */
	Bordereau save(Bordereau bordereau);

	/**
     * save list Bordereau in database
     * @param bordereaus - list of Bordereau to be saved 
     * @return the saved Bordereau list
     */
	List<Bordereau> save(List<Bordereau> bordereaus);
    
     /**
     * update Bordereau in database
     * @param bordereau - Bordereau to be updated
     * @return the updated Bordereau, If the Bordereau can't be updated return null.
     */
    Bordereau update(Bordereau bordereau);
    
       /**
     * delete Bordereau from database
     * @param bordereau - Bordereau to be deleted
     * @return 1 if Bordereau deleted successfully, If the Bordereau can't be deleted return negative int
     */
	int delete(Bordereau bordereau);


    
        /**
     * delete Bordereau from database by libelle (reference)
     * 
     * @param libelle - reference of Bordereau to be deleted
     * @return 1 if Bordereau deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for Bordereau in by some criteria
     * @return the searhed list Bordereau 
     */
	List<Bordereau> findByCriteria( BordereauVo bordereauVo);
}