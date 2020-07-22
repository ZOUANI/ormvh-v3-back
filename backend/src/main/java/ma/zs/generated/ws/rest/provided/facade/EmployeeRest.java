package  ma.zs.generated.ws.rest.provided.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.Employee; 
import ma.zs.generated.service.facade.EmployeeService;
import ma.zs.generated.ws.rest.provided.converter.EmployeeConverter;
import ma.zs.generated.ws.rest.provided.vo.EmployeeVo;

@Api("Manages employee services")
@RestController
@RequestMapping("generated/employee")
public class EmployeeRest {

	@Autowired 
	private EmployeeService employeeService;
	
	@Autowired 
	private EmployeeConverter employeeConverter ;

    @ApiOperation("Saves the specified employee")
	@PostMapping("/")
	public EmployeeVo save(@RequestBody EmployeeVo employeeVo){
		Employee employee= employeeConverter.toItem(employeeVo);
	  employee=	employeeService.save(employee);
		return employeeConverter.toVo(employee);
	}

    @ApiOperation("Delete the specified employee")
	@DeleteMapping("/")
	public int delete(@RequestBody EmployeeVo employeeVo){
		Employee employee = employeeConverter.toItem(employeeVo);
		return employeeService.delete(employee);
	}

	@ApiOperation("Updates the specified employee")
	@PutMapping("/")
	public EmployeeVo update(@RequestBody EmployeeVo employeeVo){
		Employee employee= employeeConverter.toItem(employeeVo);
	  employee=	employeeService.update(employee);
		return employeeConverter.toVo(employee);
	}

	@ApiOperation("Finds a list of all employees")
	@GetMapping("/")
	public List<EmployeeVo> findAll(){
		return employeeConverter.toVo(employeeService.findAll());
	}
    
	@ApiOperation("Finds a employee by id")
	@GetMapping("/id/{id}")
	public EmployeeVo findById(@PathVariable Long id){
		return  employeeConverter.toVo(employeeService.findById(id));
	}
	@ApiOperation("Deletes a employee by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 employeeService.deleteById(id);
	}

	@ApiOperation("Finds a  employee by title")
    @GetMapping("/title/{title}")
	public EmployeeVo findByTitle(@PathVariable String title){
		return  employeeConverter.toVo(employeeService.findByTitle(title));
	}
	@ApiOperation("Deletes a  employee by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  employeeService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a employee by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<EmployeeVo> findByUpdatedByUsername(@PathVariable String username){
		return employeeConverter.toVo(employeeService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a employee by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return employeeService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds employee by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<EmployeeVo> findByUpdatedById(@PathVariable Long id){
		return employeeConverter.toVo(employeeService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes employee by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return employeeService.deleteByUpdatedById(id);
	}
     	
    @ApiOperation("Finds a employee by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<EmployeeVo> findByCreatedByUsername(@PathVariable String username){
		return employeeConverter.toVo(employeeService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a employee by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return employeeService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds employee by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<EmployeeVo> findByCreatedById(@PathVariable Long id){
		return employeeConverter.toVo(employeeService.findByCreatedById(id));
	}
	@ApiOperation("Deletes employee by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return employeeService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a employee by username of user")
	@GetMapping("/user/username/{username}")
	public List<EmployeeVo> findByUserUsername(@PathVariable String username){
		return employeeConverter.toVo(employeeService.findByUserUsername(username));
	}
	
	@ApiOperation("Deletes a employee by username of user")
	@DeleteMapping("/user/username/{username}")
	public int deleteByUserUsername(@PathVariable String username){
		return employeeService.deleteByUserUsername(username);
	}
	
	@ApiOperation("Finds employee by id of user")
	@GetMapping("/user/id/{id}")
	public List<EmployeeVo> findByUserId(@PathVariable Long id){
		return employeeConverter.toVo(employeeService.findByUserId(id));
	}
	@ApiOperation("Deletes employee by id of user")
	@DeleteMapping("/user/id/{id}")
	public int deleteByUserId(@PathVariable Long id){
		return employeeService.deleteByUserId(id);
	}
     	
   
    @ApiOperation("Search employee by a specific criterion")
    @PostMapping("/search")
	public List<EmployeeVo> findByCriteria(@RequestBody EmployeeVo employeeVo){
       return employeeConverter.toVo(employeeService.findByCriteria(employeeVo));
	}	
	public EmployeeConverter getEmployeeConverter(){
		return employeeConverter;
	}
 
	public void setEmployeeConverter(EmployeeConverter employeeConverter){
		this.employeeConverter=employeeConverter;
	}

	public EmployeeService getEmployeeService(){
		return employeeService;
	}
	public void setEmployeeService( EmployeeService employeeService){
	 	this.employeeService=employeeService;
	}
	

}