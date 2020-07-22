package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Employee;
import ma.zs.generated.ws.rest.provided.vo.EmployeeVo;

public interface EmployeeService {

        /**

     * find all Employee in database 
     * @return List<Employee> , If database is empty return  null.
     */
	List<Employee> findAll();
	   
	/**

     * find Employee from database by title (reference)
     * @param title - reference of Employee 
     * @return the founded Employee , If no Employee were
     *         found in database return  null.
     */
	Employee findByTitle(String title);

    /**
     * find Employee from database by id (id)
     * @param id - id of Employee 
     * @return the founded  Employee , If no Employee were
     *         found in database return  null.
     */
	Employee findById(Long id);
     
     /**
     * delete Employee from database
     * @param id - id of Employee to be deleted
     * 
     */
	void deleteById(Long id);

	List<Employee> findByUpdatedByUsername(String username);
    int deleteByUpdatedByUsername(String username);       
			
    List<Employee> findByUpdatedById(Long id);
    int deleteByUpdatedById(Long id);
			 
	List<Employee> findByCreatedByUsername(String username);
    int deleteByCreatedByUsername(String username);       
			
    List<Employee> findByCreatedById(Long id);
    int deleteByCreatedById(Long id);
			 
	List<Employee> findByUserUsername(String username);
    int deleteByUserUsername(String username);       
			
    List<Employee> findByUserId(Long id);
    int deleteByUserId(Long id);
			 
    /**
     * save Employee in database
     * @param employee - Employee to be saved 
     * @return the saved Employee, If the Employee can't be saved return null.
     */
	Employee save(Employee employee);

	/**
     * save list Employee in database
     * @param employees - list of Employee to be saved 
     * @return the saved Employee list
     */
	List<Employee> save(List<Employee> employees);
    
     /**
     * update Employee in database
     * @param employee - Employee to be updated
     * @return the updated Employee, If the Employee can't be updated return null.
     */
    Employee update(Employee employee);
    
       /**
     * delete Employee from database
     * @param employee - Employee to be deleted
     * @return 1 if Employee deleted successfully, If the Employee can't be deleted return negative int
     */
	int delete(Employee employee);


    
        /**
     * delete Employee from database by title (reference)
     * 
     * @param title - reference of Employee to be deleted
     * @return 1 if Employee deleted successfully
     */
	int deleteByTitle(String title);

     
	/**
     * search for Employee in by some criteria
     * @return the searhed list Employee 
     */
	List<Employee> findByCriteria( EmployeeVo employeeVo);
}