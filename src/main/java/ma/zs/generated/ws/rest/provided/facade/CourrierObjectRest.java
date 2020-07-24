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
import ma.zs.generated.bean.CourrierObject; 
import ma.zs.generated.service.facade.CourrierObjectService;
import ma.zs.generated.ws.rest.provided.converter.CourrierObjectConverter;
import ma.zs.generated.ws.rest.provided.vo.CourrierObjectVo;

@Api("Manages courrierObject services")
@RestController
@RequestMapping("generated/courrierObject")
public class CourrierObjectRest {

	@Autowired 
	private CourrierObjectService courrierObjectService;
	
	@Autowired 
	private CourrierObjectConverter courrierObjectConverter ;

    @ApiOperation("creates the specified courrierObject")
	@PostMapping("/")
	public CourrierObjectVo create(@RequestBody CourrierObjectVo courrierObjectVo){
		CourrierObject courrierObject= courrierObjectConverter.toItem(courrierObjectVo);
	  courrierObject=	courrierObjectService.create(courrierObject);
		return courrierObjectConverter.toVo(courrierObject);
	}

    @ApiOperation("Delete the specified courrierObject")
	@DeleteMapping("/")
	public int delete(@RequestBody CourrierObjectVo courrierObjectVo){
		CourrierObject courrierObject = courrierObjectConverter.toItem(courrierObjectVo);
		return courrierObjectService.delete(courrierObject);
	}

	@ApiOperation("Updates the specified courrierObject")
	@PutMapping("/")
	public CourrierObjectVo update(@RequestBody CourrierObjectVo courrierObjectVo){
		CourrierObject courrierObject= courrierObjectConverter.toItem(courrierObjectVo);
	  courrierObject=	courrierObjectService.update(courrierObject);
		return courrierObjectConverter.toVo(courrierObject);
	}

	@ApiOperation("Finds a list of all courrierObjects")
	@GetMapping("/")
	public List<CourrierObjectVo> findAll(){
		return courrierObjectConverter.toVo(courrierObjectService.findAll());
	}
    
	@ApiOperation("Finds a courrierObject by id")
	@GetMapping("/id/{id}")
	public CourrierObjectVo findById(@PathVariable Long id){
		return  courrierObjectConverter.toVo(courrierObjectService.findById(id));
	}
	@ApiOperation("Deletes a courrierObject by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 courrierObjectService.deleteById(id);
	}

	@ApiOperation("Finds a  courrierObject by title")
    @GetMapping("/title/{title}")
	public CourrierObjectVo findByTitle(@PathVariable String title){
		return  courrierObjectConverter.toVo(courrierObjectService.findByTitle(title));
	}
	@ApiOperation("Deletes a  courrierObject by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  courrierObjectService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a courrierObject by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<CourrierObjectVo> findByCreatedByUsername(@PathVariable String username){
		return courrierObjectConverter.toVo(courrierObjectService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a courrierObject by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return courrierObjectService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds courrierObject by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<CourrierObjectVo> findByCreatedById(@PathVariable Long id){
		return courrierObjectConverter.toVo(courrierObjectService.findByCreatedById(id));
	}
	@ApiOperation("Deletes courrierObject by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return courrierObjectService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a courrierObject by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<CourrierObjectVo> findByUpdatedByUsername(@PathVariable String username){
		return courrierObjectConverter.toVo(courrierObjectService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a courrierObject by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return courrierObjectService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds courrierObject by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<CourrierObjectVo> findByUpdatedById(@PathVariable Long id){
		return courrierObjectConverter.toVo(courrierObjectService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes courrierObject by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return courrierObjectService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search courrierObject by a specific criterion")
    @PostMapping("/search")
	public List<CourrierObjectVo> findByCriteria(@RequestBody CourrierObjectVo courrierObjectVo){
       return courrierObjectConverter.toVo(courrierObjectService.findByCriteria(courrierObjectVo));
	}	
	public CourrierObjectConverter getCourrierObjectConverter(){
		return courrierObjectConverter;
	}
 
	public void setCourrierObjectConverter(CourrierObjectConverter courrierObjectConverter){
		this.courrierObjectConverter=courrierObjectConverter;
	}

	public CourrierObjectService getCourrierObjectService(){
		return courrierObjectService;
	}
	public void setCourrierObjectService( CourrierObjectService courrierObjectService){
	 	this.courrierObjectService=courrierObjectService;
	}
	

}