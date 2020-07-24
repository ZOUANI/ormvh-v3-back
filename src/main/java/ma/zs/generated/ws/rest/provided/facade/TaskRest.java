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
import ma.zs.generated.bean.Task; 
import ma.zs.generated.service.facade.TaskService;
import ma.zs.generated.ws.rest.provided.converter.TaskConverter;
import ma.zs.generated.ws.rest.provided.vo.TaskVo;

@Api("Manages task services")
@RestController
@RequestMapping("generated/task")
public class TaskRest {

	@Autowired 
	private TaskService taskService;
	
	@Autowired 
	private TaskConverter taskConverter ;

    @ApiOperation("creates the specified task")
	@PostMapping("/")
	public TaskVo create(@RequestBody TaskVo taskVo){
		Task task= taskConverter.toItem(taskVo);
	  task=	taskService.create(task);
		return taskConverter.toVo(task);
	}

    @ApiOperation("Delete the specified task")
	@DeleteMapping("/")
	public int delete(@RequestBody TaskVo taskVo){
		Task task = taskConverter.toItem(taskVo);
		return taskService.delete(task);
	}

	@ApiOperation("Updates the specified task")
	@PutMapping("/")
	public TaskVo update(@RequestBody TaskVo taskVo){
		Task task= taskConverter.toItem(taskVo);
	  task=	taskService.update(task);
		return taskConverter.toVo(task);
	}

	@ApiOperation("Finds a list of all tasks")
	@GetMapping("/")
	public List<TaskVo> findAll(){
		return taskConverter.toVo(taskService.findAll());
	}
    
	@ApiOperation("Finds a task by id")
	@GetMapping("/id/{id}")
	public TaskVo findById(@PathVariable Long id){
		return  taskConverter.toVo(taskService.findById(id));
	}
	@ApiOperation("Deletes a task by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 taskService.deleteById(id);
	}

	@ApiOperation("Finds a  task by title")
    @GetMapping("/title/{title}")
	public TaskVo findByTitle(@PathVariable String title){
		return  taskConverter.toVo(taskService.findByTitle(title));
	}
	@ApiOperation("Deletes a  task by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  taskService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a task by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<TaskVo> findByUpdatedByUsername(@PathVariable String username){
		return taskConverter.toVo(taskService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a task by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return taskService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds task by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<TaskVo> findByUpdatedById(@PathVariable Long id){
		return taskConverter.toVo(taskService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes task by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return taskService.deleteByUpdatedById(id);
	}
     	
    @ApiOperation("Finds a task by idCourrier of courrier")
	@GetMapping("/courrier/idCourrier/{idCourrier}")
	public List<TaskVo> findByCourrierIdCourrier(@PathVariable String idCourrier){
		return taskConverter.toVo(taskService.findByCourrierIdCourrier(idCourrier));
	}
	
	@ApiOperation("Deletes a task by idCourrier of courrier")
	@DeleteMapping("/courrier/idCourrier/{idCourrier}")
	public int deleteByCourrierIdCourrier(@PathVariable String idCourrier){
		return taskService.deleteByCourrierIdCourrier(idCourrier);
	}
	
	@ApiOperation("Finds task by id of courrier")
	@GetMapping("/courrier/id/{id}")
	public List<TaskVo> findByCourrierId(@PathVariable Long id){
		return taskConverter.toVo(taskService.findByCourrierId(id));
	}
	@ApiOperation("Deletes task by id of courrier")
	@DeleteMapping("/courrier/id/{id}")
	public int deleteByCourrierId(@PathVariable Long id){
		return taskService.deleteByCourrierId(id);
	}
     	
    @ApiOperation("Finds a task by username of assigne")
	@GetMapping("/assigne/username/{username}")
	public List<TaskVo> findByAssigneUsername(@PathVariable String username){
		return taskConverter.toVo(taskService.findByAssigneUsername(username));
	}
	
	@ApiOperation("Deletes a task by username of assigne")
	@DeleteMapping("/assigne/username/{username}")
	public int deleteByAssigneUsername(@PathVariable String username){
		return taskService.deleteByAssigneUsername(username);
	}
	
	@ApiOperation("Finds task by id of assigne")
	@GetMapping("/assigne/id/{id}")
	public List<TaskVo> findByAssigneId(@PathVariable Long id){
		return taskConverter.toVo(taskService.findByAssigneId(id));
	}
	@ApiOperation("Deletes task by id of assigne")
	@DeleteMapping("/assigne/id/{id}")
	public int deleteByAssigneId(@PathVariable Long id){
		return taskService.deleteByAssigneId(id);
	}
     	
    @ApiOperation("Finds a task by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<TaskVo> findByCreatedByUsername(@PathVariable String username){
		return taskConverter.toVo(taskService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a task by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return taskService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds task by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<TaskVo> findByCreatedById(@PathVariable Long id){
		return taskConverter.toVo(taskService.findByCreatedById(id));
	}
	@ApiOperation("Deletes task by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return taskService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a task by libelle of status")
	@GetMapping("/status/libelle/{libelle}")
	public List<TaskVo> findByStatusLibelle(@PathVariable String libelle){
		return taskConverter.toVo(taskService.findByStatusLibelle(libelle));
	}
	
	@ApiOperation("Deletes a task by libelle of status")
	@DeleteMapping("/status/libelle/{libelle}")
	public int deleteByStatusLibelle(@PathVariable String libelle){
		return taskService.deleteByStatusLibelle(libelle);
	}
	
	@ApiOperation("Finds task by id of status")
	@GetMapping("/status/id/{id}")
	public List<TaskVo> findByStatusId(@PathVariable Long id){
		return taskConverter.toVo(taskService.findByStatusId(id));
	}
	@ApiOperation("Deletes task by id of status")
	@DeleteMapping("/status/id/{id}")
	public int deleteByStatusId(@PathVariable Long id){
		return taskService.deleteByStatusId(id);
	}
     	
   
    @ApiOperation("Search task by a specific criterion")
    @PostMapping("/search")
	public List<TaskVo> findByCriteria(@RequestBody TaskVo taskVo){
       return taskConverter.toVo(taskService.findByCriteria(taskVo));
	}	
	public TaskConverter getTaskConverter(){
		return taskConverter;
	}
 
	public void setTaskConverter(TaskConverter taskConverter){
		this.taskConverter=taskConverter;
	}

	public TaskService getTaskService(){
		return taskService;
	}
	public void setTaskService( TaskService taskService){
	 	this.taskService=taskService;
	}
	

}