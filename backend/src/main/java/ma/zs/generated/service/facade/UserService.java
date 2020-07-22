package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.User;
import ma.zs.generated.ws.rest.provided.vo.UserVo;

public interface UserService {

        /**

     * find all User in database 
     * @return List<User> , If database is empty return  null.
     */
	List<User> findAll();
	   
	/**

     * find User from database by username (reference)
     * @param username - reference of User 
     * @return the founded User , If no User were
     *         found in database return  null.
     */
	User findByUsername(String username);

    /**
     * find User from database by id (id)
     * @param id - id of User 
     * @return the founded  User , If no User were
     *         found in database return  null.
     */
	User findById(Long id);
     
     /**
     * delete User from database
     * @param id - id of User to be deleted
     * 
     */
	void deleteById(Long id);

	List<User> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<User> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<User> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<User> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
    /**
     * save User in database
     * @param user - User to be saved 
     * @return the saved User, If the User can't be saved return null.
     */
	User save(User user);

	/**
     * save list User in database
     * @param users - list of User to be saved 
     * @return the saved User list
     */
	List<User> save(List<User> users);
    
     /**
     * update User in database
     * @param user - User to be updated
     * @return the updated User, If the User can't be updated return null.
     */
    User update(User user);
    
       /**
     * delete User from database
     * @param user - User to be deleted
     * @return 1 if User deleted successfully, If the User can't be deleted return negative int
     */
	int delete(User user);


    
        /**
     * delete User from database by username (reference)
     * 
     * @param username - reference of User to be deleted
     * @return 1 if User deleted successfully
     */
	int deleteByUsername(String username);

     
	/**
     * search for User in by some criteria
     * @return the searhed list User 
     */
	List<User> findByCriteria( UserVo userVo);
}