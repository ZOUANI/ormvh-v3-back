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
import ma.zs.generated.bean.Status; 
import ma.zs.generated.service.facade.StatusService;
import ma.zs.generated.ws.rest.provided.converter.StatusConverter;
import ma.zs.generated.ws.rest.provided.vo.StatusVo;

@Api("Manages status services")
@RestController
@RequestMapping("generated/status")
public class StatusRest {

	@Autowired 
	private StatusService statusService;
	
	@Autowired 
	private StatusConverter statusConverter ;

    @ApiOperation("Saves the specified status")
	@PostMapping("/")
	public StatusVo save(@RequestBody StatusVo statusVo){
		Status status= statusConverter.toItem(statusVo);
	  status=	statusService.save(status);
		return statusConverter.toVo(status);
	}

    @ApiOperation("Delete the specified status")
	@DeleteMapping("/")
	public int delete(@RequestBody StatusVo statusVo){
		Status status = statusConverter.toItem(statusVo);
		return statusService.delete(status);
	}

	@ApiOperation("Updates the specified status")
	@PutMapping("/")
	public StatusVo update(@RequestBody StatusVo statusVo){
		Status status= statusConverter.toItem(statusVo);
	  status=	statusService.update(status);
		return statusConverter.toVo(status);
	}

	@ApiOperation("Finds a list of all statuss")
	@GetMapping("/")
	public List<StatusVo> findAll(){
		return statusConverter.toVo(statusService.findAll());
	}
    
	@ApiOperation("Finds a status by id")
	@GetMapping("/id/{id}")
	public StatusVo findById(@PathVariable Long id){
		return  statusConverter.toVo(statusService.findById(id));
	}
	@ApiOperation("Deletes a status by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 statusService.deleteById(id);
	}

	@ApiOperation("Finds a  status by libelle")
    @GetMapping("/libelle/{libelle}")
	public StatusVo findByLibelle(@PathVariable String libelle){
		return  statusConverter.toVo(statusService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  status by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  statusService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a status by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<StatusVo> findByCreatedByUsername(@PathVariable String username){
		return statusConverter.toVo(statusService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a status by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return statusService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds status by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<StatusVo> findByCreatedById(@PathVariable Long id){
		return statusConverter.toVo(statusService.findByCreatedById(id));
	}
	@ApiOperation("Deletes status by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return statusService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a status by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<StatusVo> findByUpdatedByUsername(@PathVariable String username){
		return statusConverter.toVo(statusService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a status by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return statusService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds status by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<StatusVo> findByUpdatedById(@PathVariable Long id){
		return statusConverter.toVo(statusService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes status by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return statusService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search status by a specific criterion")
    @PostMapping("/search")
	public List<StatusVo> findByCriteria(@RequestBody StatusVo statusVo){
       return statusConverter.toVo(statusService.findByCriteria(statusVo));
	}	
	public StatusConverter getStatusConverter(){
		return statusConverter;
	}
 
	public void setStatusConverter(StatusConverter statusConverter){
		this.statusConverter=statusConverter;
	}

	public StatusService getStatusService(){
		return statusService;
	}
	public void setStatusService( StatusService statusService){
	 	this.statusService=statusService;
	}
	

}