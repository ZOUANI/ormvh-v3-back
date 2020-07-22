package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.NatureCourrier;
import ma.zs.generated.ws.rest.provided.vo.NatureCourrierVo;

public interface NatureCourrierService {

        /**

     * find all NatureCourrier in database 
     * @return List<NatureCourrier> , If database is empty return  null.
     */
	List<NatureCourrier> findAll();
	   
	/**

     * find NatureCourrier from database by libelle (reference)
     * @param libelle - reference of NatureCourrier 
     * @return the founded NatureCourrier , If no NatureCourrier were
     *         found in database return  null.
     */
	NatureCourrier findByLibelle(String libelle);

    /**
     * find NatureCourrier from database by id (id)
     * @param id - id of NatureCourrier 
     * @return the founded  NatureCourrier , If no NatureCourrier were
     *         found in database return  null.
     */
	NatureCourrier findById(Long id);
     
     /**
     * delete NatureCourrier from database
     * @param id - id of NatureCourrier to be deleted
     * 
     */
	void deleteById(Long id);

	List<NatureCourrier> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<NatureCourrier> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<NatureCourrier> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<NatureCourrier> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save NatureCourrier in database
     * @param natureCourrier - NatureCourrier to be saved 
     * @return the saved NatureCourrier, If the NatureCourrier can't be saved return null.
     */
	NatureCourrier save(NatureCourrier natureCourrier);

	/**
     * save list NatureCourrier in database
     * @param natureCourriers - list of NatureCourrier to be saved 
     * @return the saved NatureCourrier list
     */
	List<NatureCourrier> save(List<NatureCourrier> natureCourriers);
    
     /**
     * update NatureCourrier in database
     * @param natureCourrier - NatureCourrier to be updated
     * @return the updated NatureCourrier, If the NatureCourrier can't be updated return null.
     */
    NatureCourrier update(NatureCourrier natureCourrier);
    
       /**
     * delete NatureCourrier from database
     * @param natureCourrier - NatureCourrier to be deleted
     * @return 1 if NatureCourrier deleted successfully, If the NatureCourrier can't be deleted return negative int
     */
	int delete(NatureCourrier natureCourrier);


    
        /**
     * delete NatureCourrier from database by libelle (reference)
     * 
     * @param libelle - reference of NatureCourrier to be deleted
     * @return 1 if NatureCourrier deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for NatureCourrier in by some criteria
     * @return the searhed list NatureCourrier 
     */
	List<NatureCourrier> findByCriteria( NatureCourrierVo natureCourrierVo);
}