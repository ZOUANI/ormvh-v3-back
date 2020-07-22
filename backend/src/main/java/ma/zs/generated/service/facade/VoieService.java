package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Voie;
import ma.zs.generated.ws.rest.provided.vo.VoieVo;

public interface VoieService {

        /**

     * find all Voie in database 
     * @return List<Voie> , If database is empty return  null.
     */
	List<Voie> findAll();
	   
	/**

     * find Voie from database by libelle (reference)
     * @param libelle - reference of Voie 
     * @return the founded Voie , If no Voie were
     *         found in database return  null.
     */
	Voie findByLibelle(String libelle);

    /**
     * find Voie from database by id (id)
     * @param id - id of Voie 
     * @return the founded  Voie , If no Voie were
     *         found in database return  null.
     */
	Voie findById(Long id);
     
     /**
     * delete Voie from database
     * @param id - id of Voie to be deleted
     * 
     */
	void deleteById(Long id);

	List<Voie> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Voie> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Voie> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Voie> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save Voie in database
     * @param voie - Voie to be saved 
     * @return the saved Voie, If the Voie can't be saved return null.
     */
	Voie save(Voie voie);

	/**
     * save list Voie in database
     * @param voies - list of Voie to be saved 
     * @return the saved Voie list
     */
	List<Voie> save(List<Voie> voies);
    
     /**
     * update Voie in database
     * @param voie - Voie to be updated
     * @return the updated Voie, If the Voie can't be updated return null.
     */
    Voie update(Voie voie);
    
       /**
     * delete Voie from database
     * @param voie - Voie to be deleted
     * @return 1 if Voie deleted successfully, If the Voie can't be deleted return negative int
     */
	int delete(Voie voie);


    
        /**
     * delete Voie from database by libelle (reference)
     * 
     * @param libelle - reference of Voie to be deleted
     * @return 1 if Voie deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for Voie in by some criteria
     * @return the searhed list Voie 
     */
	List<Voie> findByCriteria( VoieVo voieVo);
}