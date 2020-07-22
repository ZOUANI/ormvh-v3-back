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
import ma.zs.generated.bean.ExpeditorType; 
import ma.zs.generated.service.facade.ExpeditorTypeService;
import ma.zs.generated.ws.rest.provided.converter.ExpeditorTypeConverter;
import ma.zs.generated.ws.rest.provided.vo.ExpeditorTypeVo;

@Api("Manages expeditorType services")
@RestController
@RequestMapping("generated/expeditorType")
public class ExpeditorTypeRest {

	@Autowired 
	private ExpeditorTypeService expeditorTypeService;
	
	@Autowired 
	private ExpeditorTypeConverter expeditorTypeConverter ;

    @ApiOperation("Saves the specified expeditorType")
	@PostMapping("/")
	public ExpeditorTypeVo save(@RequestBody ExpeditorTypeVo expeditorTypeVo){
		ExpeditorType expeditorType= expeditorTypeConverter.toItem(expeditorTypeVo);
	  expeditorType=	expeditorTypeService.save(expeditorType);
		return expeditorTypeConverter.toVo(expeditorType);
	}

    @ApiOperation("Delete the specified expeditorType")
	@DeleteMapping("/")
	public int delete(@RequestBody ExpeditorTypeVo expeditorTypeVo){
		ExpeditorType expeditorType = expeditorTypeConverter.toItem(expeditorTypeVo);
		return expeditorTypeService.delete(expeditorType);
	}

	@ApiOperation("Updates the specified expeditorType")
	@PutMapping("/")
	public ExpeditorTypeVo update(@RequestBody ExpeditorTypeVo expeditorTypeVo){
		ExpeditorType expeditorType= expeditorTypeConverter.toItem(expeditorTypeVo);
	  expeditorType=	expeditorTypeService.update(expeditorType);
		return expeditorTypeConverter.toVo(expeditorType);
	}

	@ApiOperation("Finds a list of all expeditorTypes")
	@GetMapping("/")
	public List<ExpeditorTypeVo> findAll(){
		return expeditorTypeConverter.toVo(expeditorTypeService.findAll());
	}
    
	@ApiOperation("Finds a expeditorType by id")
	@GetMapping("/id/{id}")
	public ExpeditorTypeVo findById(@PathVariable Long id){
		return  expeditorTypeConverter.toVo(expeditorTypeService.findById(id));
	}
	@ApiOperation("Deletes a expeditorType by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 expeditorTypeService.deleteById(id);
	}

	@ApiOperation("Finds a  expeditorType by title")
    @GetMapping("/title/{title}")
	public ExpeditorTypeVo findByTitle(@PathVariable String title){
		return  expeditorTypeConverter.toVo(expeditorTypeService.findByTitle(title));
	}
	@ApiOperation("Deletes a  expeditorType by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  expeditorTypeService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a expeditorType by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<ExpeditorTypeVo> findByCreatedByUsername(@PathVariable String username){
		return expeditorTypeConverter.toVo(expeditorTypeService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a expeditorType by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return expeditorTypeService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds expeditorType by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<ExpeditorTypeVo> findByCreatedById(@PathVariable Long id){
		return expeditorTypeConverter.toVo(expeditorTypeService.findByCreatedById(id));
	}
	@ApiOperation("Deletes expeditorType by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return expeditorTypeService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a expeditorType by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<ExpeditorTypeVo> findByUpdatedByUsername(@PathVariable String username){
		return expeditorTypeConverter.toVo(expeditorTypeService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a expeditorType by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return expeditorTypeService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds expeditorType by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<ExpeditorTypeVo> findByUpdatedById(@PathVariable Long id){
		return expeditorTypeConverter.toVo(expeditorTypeService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes expeditorType by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return expeditorTypeService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search expeditorType by a specific criterion")
    @PostMapping("/search")
	public List<ExpeditorTypeVo> findByCriteria(@RequestBody ExpeditorTypeVo expeditorTypeVo){
       return expeditorTypeConverter.toVo(expeditorTypeService.findByCriteria(expeditorTypeVo));
	}	
	public ExpeditorTypeConverter getExpeditorTypeConverter(){
		return expeditorTypeConverter;
	}
 
	public void setExpeditorTypeConverter(ExpeditorTypeConverter expeditorTypeConverter){
		this.expeditorTypeConverter=expeditorTypeConverter;
	}

	public ExpeditorTypeService getExpeditorTypeService(){
		return expeditorTypeService;
	}
	public void setExpeditorTypeService( ExpeditorTypeService expeditorTypeService){
	 	this.expeditorTypeService=expeditorTypeService;
	}
	

}