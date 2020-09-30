package ma.zs.generated.service.facade;

import ma.zs.generated.bean.EtatCourrier;
import ma.zs.generated.bean.EtatCourrier;
import ma.zs.generated.ws.rest.provided.vo.EtatCourrierVo;

import java.util.List;

public interface EtatCourrierService {

        /**

     * find all EtatCourrier in database 
     * @return List<EtatCourrier> , If database is empty return  null.
     */
	List<EtatCourrier> findAll();
	   
	/**

     * find EtatCourrier from database by libelle (reference)
     * @param libelle - reference of EtatCourrier 
     * @return the founded EtatCourrier , If no EtatCourrier were
     *         found in database return  null.
     */
	EtatCourrier findByLibelle(String libelle);

    /**
     * find EtatCourrier from database by id (id)
     * @param id - id of EtatCourrier
     * @return the founded  EtatCourrier , If no EtatCourrier were
     *         found in database return  null.
     */
	EtatCourrier findById(Long id);
     
     /**
     * delete EtatCourrier from database
     * @param id - id of EtatCourrier to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * create EtatCourrier in database
     * @param etatCourrier - EtatCourrier to be created
     * @return the created EtatCourrier, If the EtatCourrier can't be created return null.
     */
	EtatCourrier create(EtatCourrier etatCourrier);

	/**
     * create list EtatCourrier in database
     * @param etatCourriers - list of etatCourrier to be created
     * @return the created EtatCourrier list
     */
	List<EtatCourrier> create(List<EtatCourrier> etatCourriers);
    
     /**
     * update EtatCourrier in database
     * @param etatCourrier - EtatCourrier to be updated
     * @return the updated EtatCourrier, If the EtatCourrier can't be updated return null.
     */
    EtatCourrier update(EtatCourrier etatCourrier);
    
       /**
     * delete EtatCourrier from database
     * @param etatCourrier - EtatCourrier to be deleted
     * @return 1 if EtatCourrier deleted successfully, If the EtatCourrier can't be deleted return negative int
     */
	int delete(EtatCourrier etatCourrier);


    
        /**
     * delete EtatCourrier from database by libelle (reference)
     * 
     * @param libelle - reference of EtatCourrier to be deleted
     * @return 1 if EtatCourrier deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for EtatCourrier in by some criteria
     * @return the searhed list EtatCourrier 
     */
	List<EtatCourrier> findByCriteria( EtatCourrierVo etatCourrierVo);
}