package ma.zs.generated.service.facade;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;

import java.util.List;

public interface NatureClientService {

        /**

     * find all NatureClient in database 
     * @return List<NatureClient> , If database is empty return  null.
     */
	List<NatureClient> findAll();
	   
	/**

     * find NatureClient from database by libelle (reference)
     * @param libelle - reference of NatureClient 
     * @return the founded NatureClient , If no NatureClient were
     *         found in database return  null.
     */
	NatureClient findByLibelle(String libelle);

    /**
     * find NatureClient from database by id (id)
     * @param id - id of NatureClient 
     * @return the founded  NatureClient , If no NatureClient were
     *         found in database return  null.
     */
	NatureClient findById(Long id);
     
     /**
     * delete NatureClient from database
     * @param id - id of NatureClient to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * create NatureClient in database
     * @param natureClient - NatureClient to be created 
     * @return the created NatureClient, If the NatureClient can't be created return null.
     */
	NatureClient create(NatureClient natureClient);

	/**
     * create list NatureClient in database
     * @param natureClients - list of NatureClient to be created 
     * @return the created NatureClient list
     */
	List<NatureClient> create(List<NatureClient> natureClients);
    
     /**
     * update NatureClient in database
     * @param natureClient - NatureClient to be updated
     * @return the updated NatureClient, If the NatureClient can't be updated return null.
     */
    NatureClient update(NatureClient natureClient);
    
       /**
     * delete NatureClient from database
     * @param natureClient - NatureClient to be deleted
     * @return 1 if NatureClient deleted successfully, If the NatureClient can't be deleted return negative int
     */
	int delete(NatureClient natureClient);


    
        /**
     * delete NatureClient from database by libelle (reference)
     * 
     * @param libelle - reference of NatureClient to be deleted
     * @return 1 if NatureClient deleted successfully
     */
	int deleteByLibelle(String libelle);

     
	/**
     * search for NatureClient in by some criteria
     * @return the searhed list NatureClient 
     */
	List<NatureClient> findByCriteria( NatureClientVo natureClientVo);
}