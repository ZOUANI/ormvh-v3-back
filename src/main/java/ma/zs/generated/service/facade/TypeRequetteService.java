package ma.zs.generated.service.facade;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.bean.TypeRequette;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import ma.zs.generated.ws.rest.provided.vo.TypeRequetteVo;

import java.util.List;

public interface TypeRequetteService {

	/**

	 * find all TypeRequette in database
	 * @return List<TypeRequette> , If database is empty return  null.
	 */
	List<TypeRequette> findAll();

	/**

	 * find TypeRequette from database by libelle (reference)
	 * @param libelle - reference of TypeRequette
	 * @return the founded TypeRequette , If no TypeRequette were
	 *         found in database return  null.
	 */
	TypeRequette findByLibelle(String libelle);

	/**
	 * find TypeRequette from database by id (id)
	 * @param id - id of TypeRequette
	 * @return the founded  TypeRequette , If no TypeRequette were
	 *         found in database return  null.
	 */
	TypeRequette findById(Long id);

	/**
	 * delete TypeRequette from database
	 * @param id - id of TypeRequette to be deleted
	 *
	 */
	void deleteById(Long id);

	/**
	 * create TypeRequette in database
	 * @param typeRequette - TypeRequette to be created
	 * @return the created TypeRequette, If the TypeRequette can't be created return null.
	 */
	TypeRequette create(TypeRequette typeRequette);

	/**
	 * create list TypeRequette in database
	 * @param natureClients - list of TypeRequette to be created
	 * @return the created TypeRequette list
	 */
	List<TypeRequette> create(List<TypeRequette> typeRequettes);

	/**
	 * update TypeRequette in database
	 * @param typeRequette - TypeRequette to be updated
	 * @return the updated TypeRequette, If the TypeRequette can't be updated return null.
	 */
	TypeRequette update(TypeRequette typeRequette);

	/**
	 * delete TypeRequette from database
	 * @param typeRequette - TypeRequette to be deleted
	 * @return 1 if TypeRequette deleted successfully, If the TypeRequette can't be deleted return negative int
	 */
	int delete(TypeRequette typeRequette);



	/**
	 * delete TypeRequette from database by libelle (reference)
	 *
	 * @param libelle - reference of TypeRequette to be deleted
	 * @return 1 if TypeRequette deleted successfully
	 */
	int deleteByLibelle(String libelle);


	/**
	 * search for TypeRequette in by some criteria
	 * @return the searhed list TypeRequette
	 */
	List<TypeRequette> findByCriteria(TypeRequetteVo typeRequetteVo);
}