package ma.zs.generated.service.facade;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import ma.zs.generated.bean.LettreModel;
import ma.zs.generated.bean.ModelLettreReponse;
import ma.zs.generated.ws.rest.provided.vo.ModelLettreReponseVo;

public interface ModelLettreReponseService {

        /**

     * find all ModelLettreReponse in database 
     * @return List<ModelLettreReponse> , If database is empty return  null.
     */
	List<ModelLettreReponse> findAll();
	   
	/**

     * find ModelLettreReponse from database by libelle (reference)
     * @param libelle - reference of ModelLettreReponse 
     * @return the founded ModelLettreReponse , If no ModelLettreReponse were
     *         found in database return  null.
     */
	ModelLettreReponse findByLibelle(String libelle);

    /**
     * find ModelLettreReponse from database by id (id)
     * @param id - id of ModelLettreReponse 
     * @return the founded  ModelLettreReponse , If no ModelLettreReponse were
     *         found in database return  null.
     */
	ModelLettreReponse findById(Long id);
     
     /**
     * delete ModelLettreReponse from database
     * @param id - id of ModelLettreReponse to be deleted
     * 
     */
	void deleteById(Long id);

	List<ModelLettreReponse> findByCategorieModelLettreReponseLibelle(String libelle);
    int deleteByCategorieModelLettreReponseLibelle(String libelle);       
			
    List<ModelLettreReponse> findByCategorieModelLettreReponseId(Long id);
    int deleteByCategorieModelLettreReponseId(Long id);
			 
	List<ModelLettreReponse> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<ModelLettreReponse> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<ModelLettreReponse> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<ModelLettreReponse> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
	public int storeFile(MultipartFile file);
			 
    /**
     * create ModelLettreReponse in database
     * @param modelLettreReponse - ModelLettreReponse to be created 
     * @return the created ModelLettreReponse, If the ModelLettreReponse can't be created return null.
     */
	ModelLettreReponse create(ModelLettreReponse modelLettreReponse);
	 public LettreModel getFile(String fileId) throws FileNotFoundException;
	/**
     * create list ModelLettreReponse in database
     * @param modelLettreReponses - list of ModelLettreReponse to be created 
     * @return the created ModelLettreReponse list
     */
	List<ModelLettreReponse> create(List<ModelLettreReponse> modelLettreReponses);
    
     /**
     * update ModelLettreReponse in database
     * @param modelLettreReponse - ModelLettreReponse to be updated
     * @return the updated ModelLettreReponse, If the ModelLettreReponse can't be updated return null.
     */
    ModelLettreReponse update(ModelLettreReponse modelLettreReponse);
    
       /**
     * delete ModelLettreReponse from database
     * @param modelLettreReponse - ModelLettreReponse to be deleted
     * @return 1 if ModelLettreReponse deleted successfully, If the ModelLettreReponse can't be deleted return negative int
     */
	int delete(ModelLettreReponse modelLettreReponse);


    
        /**
     * delete ModelLettreReponse from database by libelle (reference)
     * 
     * @param libelle - reference of ModelLettreReponse to be deleted
     * @return 1 if ModelLettreReponse deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for ModelLettreReponse in by some criteria
     * @return the searhed list ModelLettreReponse 
     */
	List<ModelLettreReponse> findByCriteria( ModelLettreReponseVo modelLettreReponseVo);
}