package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.CategorieModelLettreReponse;
import ma.zs.generated.ws.rest.provided.vo.CategorieModelLettreReponseVo;

public interface CategorieModelLettreReponseService {

        /**

     * find all CategorieModelLettreReponse in database 
     * @return List<CategorieModelLettreReponse> , If database is empty return  null.
     */
	List<CategorieModelLettreReponse> findAll();
	   
	/**

     * find CategorieModelLettreReponse from database by libelle (reference)
     * @param libelle - reference of CategorieModelLettreReponse 
     * @return the founded CategorieModelLettreReponse , If no CategorieModelLettreReponse were
     *         found in database return  null.
     */
	CategorieModelLettreReponse findByLibelle(String libelle);

    /**
     * find CategorieModelLettreReponse from database by id (id)
     * @param id - id of CategorieModelLettreReponse 
     * @return the founded  CategorieModelLettreReponse , If no CategorieModelLettreReponse were
     *         found in database return  null.
     */
	CategorieModelLettreReponse findById(Long id);
     
     /**
     * delete CategorieModelLettreReponse from database
     * @param id - id of CategorieModelLettreReponse to be deleted
     * 
     */
	void deleteById(Long id);

	List<CategorieModelLettreReponse> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<CategorieModelLettreReponse> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
	List<CategorieModelLettreReponse> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<CategorieModelLettreReponse> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
    /**
     * create CategorieModelLettreReponse in database
     * @param categorieModelLettreReponse - CategorieModelLettreReponse to be created 
     * @return the created CategorieModelLettreReponse, If the CategorieModelLettreReponse can't be created return null.
     */
	CategorieModelLettreReponse create(CategorieModelLettreReponse categorieModelLettreReponse);

	/**
     * create list CategorieModelLettreReponse in database
     * @param categorieModelLettreReponses - list of CategorieModelLettreReponse to be created 
     * @return the created CategorieModelLettreReponse list
     */
	List<CategorieModelLettreReponse> create(List<CategorieModelLettreReponse> categorieModelLettreReponses);
    
     /**
     * update CategorieModelLettreReponse in database
     * @param categorieModelLettreReponse - CategorieModelLettreReponse to be updated
     * @return the updated CategorieModelLettreReponse, If the CategorieModelLettreReponse can't be updated return null.
     */
    CategorieModelLettreReponse update(CategorieModelLettreReponse categorieModelLettreReponse);
    
       /**
     * delete CategorieModelLettreReponse from database
     * @param categorieModelLettreReponse - CategorieModelLettreReponse to be deleted
     * @return 1 if CategorieModelLettreReponse deleted successfully, If the CategorieModelLettreReponse can't be deleted return negative int
     */
	int delete(CategorieModelLettreReponse categorieModelLettreReponse);


    
        /**
     * delete CategorieModelLettreReponse from database by libelle (reference)
     * 
     * @param libelle - reference of CategorieModelLettreReponse to be deleted
     * @return 1 if CategorieModelLettreReponse deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for CategorieModelLettreReponse in by some criteria
     * @return the searhed list CategorieModelLettreReponse 
     */
	List<CategorieModelLettreReponse> findByCriteria( CategorieModelLettreReponseVo categorieModelLettreReponseVo);
}