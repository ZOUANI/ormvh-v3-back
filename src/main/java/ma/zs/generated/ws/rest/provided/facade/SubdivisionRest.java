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
import ma.zs.generated.bean.Subdivision; 
import ma.zs.generated.service.facade.SubdivisionService;
import ma.zs.generated.ws.rest.provided.converter.SubdivisionConverter;
import ma.zs.generated.ws.rest.provided.vo.SubdivisionVo;

@Api("Manages subdivision services")
@RestController
@RequestMapping("generated/subdivision")
public class SubdivisionRest {

	@Autowired 
	private SubdivisionService subdivisionService;
	
	@Autowired 
	private SubdivisionConverter subdivisionConverter ;

    @ApiOperation("creates the specified subdivision")
	@PostMapping("/")
	public SubdivisionVo create(@RequestBody SubdivisionVo subdivisionVo){
		Subdivision subdivision= subdivisionConverter.toItem(subdivisionVo);
	  subdivision=	subdivisionService.create(subdivision);
		return subdivisionConverter.toVo(subdivision);
	}

    @ApiOperation("Delete the specified subdivision")
	@DeleteMapping("/")
	public int delete(@RequestBody SubdivisionVo subdivisionVo){
		Subdivision subdivision = subdivisionConverter.toItem(subdivisionVo);
		return subdivisionService.delete(subdivision);
	}

	@ApiOperation("Updates the specified subdivision")
	@PutMapping("/")
	public SubdivisionVo update(@RequestBody SubdivisionVo subdivisionVo){
		Subdivision subdivision= subdivisionConverter.toItem(subdivisionVo);
	  subdivision=	subdivisionService.update(subdivision);
		return subdivisionConverter.toVo(subdivision);
	}

	@ApiOperation("Finds a list of all subdivisions")
	@GetMapping("/")
	public List<SubdivisionVo> findAll(){
		return subdivisionConverter.toVo(subdivisionService.findAll());
	}
    
	@ApiOperation("Finds a subdivision by id")
	@GetMapping("/id/{id}")
	public SubdivisionVo findById(@PathVariable Long id){
		return  subdivisionConverter.toVo(subdivisionService.findById(id));
	}
	@ApiOperation("Deletes a subdivision by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 subdivisionService.deleteById(id);
	}

	@ApiOperation("Finds a  subdivision by title")
    @GetMapping("/title/{title}")
	public SubdivisionVo findByTitle(@PathVariable String title){
		return  subdivisionConverter.toVo(subdivisionService.findByTitle(title));
	}
	@ApiOperation("Deletes a  subdivision by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  subdivisionService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a subdivision by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<SubdivisionVo> findByCreatedByUsername(@PathVariable String username){
		return subdivisionConverter.toVo(subdivisionService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a subdivision by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return subdivisionService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds subdivision by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<SubdivisionVo> findByCreatedById(@PathVariable Long id){
		return subdivisionConverter.toVo(subdivisionService.findByCreatedById(id));
	}
	@ApiOperation("Deletes subdivision by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return subdivisionService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a subdivision by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<SubdivisionVo> findByUpdatedByUsername(@PathVariable String username){
		return subdivisionConverter.toVo(subdivisionService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a subdivision by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return subdivisionService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds subdivision by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<SubdivisionVo> findByUpdatedById(@PathVariable Long id){
		return subdivisionConverter.toVo(subdivisionService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes subdivision by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return subdivisionService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search subdivision by a specific criterion")
    @PostMapping("/search")
	public List<SubdivisionVo> findByCriteria(@RequestBody SubdivisionVo subdivisionVo){
       return subdivisionConverter.toVo(subdivisionService.findByCriteria(subdivisionVo));
	}	
	public SubdivisionConverter getSubdivisionConverter(){
		return subdivisionConverter;
	}
 
	public void setSubdivisionConverter(SubdivisionConverter subdivisionConverter){
		this.subdivisionConverter=subdivisionConverter;
	}

	public SubdivisionService getSubdivisionService(){
		return subdivisionService;
	}
	public void setSubdivisionService( SubdivisionService subdivisionService){
	 	this.subdivisionService=subdivisionService;
	}
	

}