package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.ws.rest.provided.vo.TypeCourrierVo;

public interface TypeCourrierService {

        /**

     * find all TypeCourrier in database 
     * @return List<TypeCourrier> , If database is empty return  null.
     */
	List<TypeCourrier> findAll();
	   
	/**

     * find TypeCourrier from database by libelle (reference)
     * @param libelle - reference of TypeCourrier 
     * @return the founded TypeCourrier , If no TypeCourrier were
     *         found in database return  null.
     */
	TypeCourrier findByLibelle(String libelle);

    /**
     * find TypeCourrier from database by id (id)
     * @param id - id of TypeCourrier 
     * @return the founded  TypeCourrier , If no TypeCourrier were
     *         found in database return  null.
     */
	TypeCourrier findById(Long id);
     
     /**
     * delete TypeCourrier from database
     * @param id - id of TypeCourrier to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * create TypeCourrier in database
     * @param typeCourrier - TypeCourrier to be created 
     * @return the created TypeCourrier, If the TypeCourrier can't be created return null.
     */
	TypeCourrier create(TypeCourrier typeCourrier);

	/**
     * create list TypeCourrier in database
     * @param typeCourriers - list of TypeCourrier to be created 
     * @return the created TypeCourrier list
     */
	List<TypeCourrier> create(List<TypeCourrier> typeCourriers);
    
     /**
     * update TypeCourrier in database
     * @param typeCourrier - TypeCourrier to be updated
     * @return the updated TypeCourrier, If the TypeCourrier can't be updated return null.
     */
    TypeCourrier update(TypeCourrier typeCourrier);
    
       /**
     * delete TypeCourrier from database
     * @param typeCourrier - TypeCourrier to be deleted
     * @return 1 if TypeCourrier deleted successfully, If the TypeCourrier can't be deleted return negative int
     */
	int delete(TypeCourrier typeCourrier);


    
        /**
     * delete TypeCourrier from database by libelle (reference)
     * 
     * @param libelle - reference of TypeCourrier to be deleted
     * @return 1 if TypeCourrier deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for TypeCourrier in by some criteria
     * @return the searhed list TypeCourrier 
     */
	List<TypeCourrier> findByCriteria( TypeCourrierVo typeCourrierVo);

	TypeCourrier findByCode(String code);

}