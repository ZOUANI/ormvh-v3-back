package ma.zs.generated.service.facade;

import ma.zs.generated.bean.PhaseAdmin;
import ma.zs.generated.ws.rest.provided.vo.PhaseAdminVo;

import java.util.List;

public interface PhaseAdminService {

        /**

     * find all Sexe in database 
     * @return List<PhaseAdmin> , If database is empty return  null.
     */
	List<PhaseAdmin> findAll();
	   
	/**

     * find PhaseAdmin from database by libelle (reference)
     * @param libelle - reference of PhaseAdmin 
     * @return the founded PhaseAdmin , If no PhaseAdmin were
     *         found in database return  null.
     */
	PhaseAdmin findByLibelle(String libelle);

    /**
     * find PhaseAdmin from database by id (id)
     * @param id - id of PhaseAdmin 
     * @return the founded  PhaseAdmin , If no PhaseAdmin were
     *         found in database return  null.
     */
	PhaseAdmin findById(Long id);
     
     /**
     * delete PhaseAdmin from database
     * @param id - id of PhaseAdmin to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * create PhaseAdmin in database
     * @param phaseAdmin - PhaseAdmin to be created 
     * @return the created PhaseAdmin, If the PhaseAdmin can't be created return null.
     */
	PhaseAdmin create(PhaseAdmin phaseAdmin);

	/**
     * create list PhaseAdmin in database
     * @param phaseAdmins - list of PhaseAdmin to be created 
     * @return the created PhaseAdmin list
     */
	List<PhaseAdmin> create(List<PhaseAdmin> phaseAdmins);
    
     /**
     * update PhaseAdmin in database
     * @param phaseAdmin - PhaseAdmin to be updated
     * @return the updated PhaseAdmin, If the PhaseAdmin can't be updated return null.
     */
    PhaseAdmin update(PhaseAdmin phaseAdmin);
    
       /**
     * delete PhaseAdmin from database
     * @param phaseAdmin - PhaseAdmin to be deleted
     * @return 1 if PhaseAdmin deleted successfully, If the PhaseAdmin can't be deleted return negative int
     */
	int delete(PhaseAdmin phaseAdmin);


    
        /**
     * delete PhaseAdmin from database by libelle (reference)
     * 
     * @param libelle - reference of PhaseAdmin to be deleted
     * @return 1 if PhaseAdmin deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for PhaseAdmin in by some criteria
     * @return the searhed list PhaseAdmin 
     */
	List<PhaseAdmin> findByCriteria( PhaseAdminVo phaseAdminVo);
}