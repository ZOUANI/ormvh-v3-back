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
import ma.zs.generated.bean.LeService; 
import ma.zs.generated.service.facade.LeServiceService;
import ma.zs.generated.ws.rest.provided.converter.LeServiceConverter;
import ma.zs.generated.ws.rest.provided.vo.LeServiceVo;

@Api("Manages leService services")
@RestController
@RequestMapping("generated/leService")
public class LeServiceRest {

	@Autowired 
	private LeServiceService leServiceService;
	
	@Autowired 
	private LeServiceConverter leServiceConverter ;

    @ApiOperation("Saves the specified leService")
	@PostMapping("/")
	public LeServiceVo save(@RequestBody LeServiceVo leServiceVo){
		LeService leService= leServiceConverter.toItem(leServiceVo);
	  leService=	leServiceService.save(leService);
		return leServiceConverter.toVo(leService);
	}

    @ApiOperation("Delete the specified leService")
	@DeleteMapping("/")
	public int delete(@RequestBody LeServiceVo leServiceVo){
		LeService leService = leServiceConverter.toItem(leServiceVo);
		return leServiceService.delete(leService);
	}

	@ApiOperation("Updates the specified leService")
	@PutMapping("/")
	public LeServiceVo update(@RequestBody LeServiceVo leServiceVo){
		LeService leService= leServiceConverter.toItem(leServiceVo);
	  leService=	leServiceService.update(leService);
		return leServiceConverter.toVo(leService);
	}

	@ApiOperation("Finds a list of all leServices")
	@GetMapping("/")
	public List<LeServiceVo> findAll(){
		return leServiceConverter.toVo(leServiceService.findAll());
	}
    
	@ApiOperation("Finds a leService by id")
	@GetMapping("/id/{id}")
	public LeServiceVo findById(@PathVariable Long id){
		return  leServiceConverter.toVo(leServiceService.findById(id));
	}
	@ApiOperation("Deletes a leService by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 leServiceService.deleteById(id);
	}

	@ApiOperation("Finds a  leService by title")
    @GetMapping("/title/{title}")
	public LeServiceVo findByTitle(@PathVariable String title){
		return  leServiceConverter.toVo(leServiceService.findByTitle(title));
	}
	@ApiOperation("Deletes a  leService by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  leServiceService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a leService by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<LeServiceVo> findByCreatedByUsername(@PathVariable String username){
		return leServiceConverter.toVo(leServiceService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a leService by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return leServiceService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds leService by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<LeServiceVo> findByCreatedById(@PathVariable Long id){
		return leServiceConverter.toVo(leServiceService.findByCreatedById(id));
	}
	@ApiOperation("Deletes leService by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return leServiceService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a leService by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<LeServiceVo> findByUpdatedByUsername(@PathVariable String username){
		return leServiceConverter.toVo(leServiceService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a leService by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return leServiceService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds leService by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<LeServiceVo> findByUpdatedById(@PathVariable Long id){
		return leServiceConverter.toVo(leServiceService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes leService by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return leServiceService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search leService by a specific criterion")
    @PostMapping("/search")
	public List<LeServiceVo> findByCriteria(@RequestBody LeServiceVo leServiceVo){
       return leServiceConverter.toVo(leServiceService.findByCriteria(leServiceVo));
	}	
	public LeServiceConverter getLeServiceConverter(){
		return leServiceConverter;
	}
 
	public void setLeServiceConverter(LeServiceConverter leServiceConverter){
		this.leServiceConverter=leServiceConverter;
	}

	public LeServiceService getLeServiceService(){
		return leServiceService;
	}
	public void setLeServiceService( LeServiceService leServiceService){
	 	this.leServiceService=leServiceService;
	}
	

}