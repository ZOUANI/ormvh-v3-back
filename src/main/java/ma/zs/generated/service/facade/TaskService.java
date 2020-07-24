package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Task;
import ma.zs.generated.ws.rest.provided.vo.TaskVo;

public interface TaskService {

        /**

     * find all Task in database 
     * @return List<Task> , If database is empty return  null.
     */
	List<Task> findAll();
	   
	/**

     * find Task from database by title (reference)
     * @param title - reference of Task 
     * @return the founded Task , If no Task were
     *         found in database return  null.
     */
	Task findByTitle(String title);

    /**
     * find Task from database by id (id)
     * @param id - id of Task 
     * @return the founded  Task , If no Task were
     *         found in database return  null.
     */
	Task findById(Long id);
     
     /**
     * delete Task from database
     * @param id - id of Task to be deleted
     * 
     */
	void deleteById(Long id);

	List<Task> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Task> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
	List<Task> findByCourrierIdCourrier(String idCourrier);
    int deleteByCourrierIdCourrier(String idCourrier);       
			
    List<Task> findByCourrierId(Long id);
    int deleteByCourrierId(Long id);
			 
	List<Task> findByAssigneUsername(String username);
    int deleteByAssigneUsername(String username);       
			
    List<Task> findByAssigneId(Long id);
    int deleteByAssigneId(Long id);
			 
	List<Task> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Task> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Task> findByStatusLibelle(String libelle);
    int deleteByStatusLibelle(String libelle);       
			
    List<Task> findByStatusId(Long id);
    int deleteByStatusId(Long id);
			 
    /**
     * create Task in database
     * @param task - Task to be created 
     * @return the created Task, If the Task can't be created return null.
     */
	Task create(Task task);

	/**
     * create list Task in database
     * @param tasks - list of Task to be created 
     * @return the created Task list
     */
	List<Task> create(List<Task> tasks);
    
     /**
     * update Task in database
     * @param task - Task to be updated
     * @return the updated Task, If the Task can't be updated return null.
     */
    Task update(Task task);
    
       /**
     * delete Task from database
     * @param task - Task to be deleted
     * @return 1 if Task deleted successfully, If the Task can't be deleted return negative int
     */
	int delete(Task task);


    
        /**
     * delete Task from database by title (reference)
     * 
     * @param title - reference of Task to be deleted
     * @return 1 if Task deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for Task in by some criteria
     * @return the searhed list Task 
     */
	List<Task> findByCriteria( TaskVo taskVo);
}