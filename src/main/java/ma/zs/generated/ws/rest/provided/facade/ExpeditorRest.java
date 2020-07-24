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
import ma.zs.generated.bean.Expeditor; 
import ma.zs.generated.service.facade.ExpeditorService;
import ma.zs.generated.ws.rest.provided.converter.ExpeditorConverter;
import ma.zs.generated.ws.rest.provided.vo.ExpeditorVo;

@Api("Manages expeditor services")
@RestController
@RequestMapping("generated/expeditor")
public class ExpeditorRest {

	@Autowired 
	private ExpeditorService expeditorService;
	
	@Autowired 
	private ExpeditorConverter expeditorConverter ;

    @ApiOperation("creates the specified expeditor")
	@PostMapping("/")
	public ExpeditorVo create(@RequestBody ExpeditorVo expeditorVo){
		Expeditor expeditor= expeditorConverter.toItem(expeditorVo);
	  expeditor=	expeditorService.create(expeditor);
		return expeditorConverter.toVo(expeditor);
	}

    @ApiOperation("Delete the specified expeditor")
	@DeleteMapping("/")
	public int delete(@RequestBody ExpeditorVo expeditorVo){
		Expeditor expeditor = expeditorConverter.toItem(expeditorVo);
		return expeditorService.delete(expeditor);
	}

	@ApiOperation("Updates the specified expeditor")
	@PutMapping("/")
	public ExpeditorVo update(@RequestBody ExpeditorVo expeditorVo){
		Expeditor expeditor= expeditorConverter.toItem(expeditorVo);
	  expeditor=	expeditorService.update(expeditor);
		return expeditorConverter.toVo(expeditor);
	}

	@ApiOperation("Finds a list of all expeditors")
	@GetMapping("/")
	public List<ExpeditorVo> findAll(){
		return expeditorConverter.toVo(expeditorService.findAll());
	}
    
	@ApiOperation("Finds a expeditor by id")
	@GetMapping("/id/{id}")
	public ExpeditorVo findById(@PathVariable Long id){
		return  expeditorConverter.toVo(expeditorService.findById(id));
	}
	@ApiOperation("Deletes a expeditor by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 expeditorService.deleteById(id);
	}

	@ApiOperation("Finds a  expeditor by title")
    @GetMapping("/title/{title}")
	public ExpeditorVo findByTitle(@PathVariable String title){
		return  expeditorConverter.toVo(expeditorService.findByTitle(title));
	}
	@ApiOperation("Deletes a  expeditor by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  expeditorService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a expeditor by libelle of sexe")
	@GetMapping("/sexe/libelle/{libelle}")
	public List<ExpeditorVo> findBySexeLibelle(@PathVariable String libelle){
		return expeditorConverter.toVo(expeditorService.findBySexeLibelle(libelle));
	}
	
	@ApiOperation("Deletes a expeditor by libelle of sexe")
	@DeleteMapping("/sexe/libelle/{libelle}")
	public int deleteBySexeLibelle(@PathVariable String libelle){
		return expeditorService.deleteBySexeLibelle(libelle);
	}
	
	@ApiOperation("Finds expeditor by id of sexe")
	@GetMapping("/sexe/id/{id}")
	public List<ExpeditorVo> findBySexeId(@PathVariable Long id){
		return expeditorConverter.toVo(expeditorService.findBySexeId(id));
	}
	@ApiOperation("Deletes expeditor by id of sexe")
	@DeleteMapping("/sexe/id/{id}")
	public int deleteBySexeId(@PathVariable Long id){
		return expeditorService.deleteBySexeId(id);
	}
     	
    @ApiOperation("Finds a expeditor by libelle of nationality")
	@GetMapping("/nationality/libelle/{libelle}")
	public List<ExpeditorVo> findByNationalityLibelle(@PathVariable String libelle){
		return expeditorConverter.toVo(expeditorService.findByNationalityLibelle(libelle));
	}
	
	@ApiOperation("Deletes a expeditor by libelle of nationality")
	@DeleteMapping("/nationality/libelle/{libelle}")
	public int deleteByNationalityLibelle(@PathVariable String libelle){
		return expeditorService.deleteByNationalityLibelle(libelle);
	}
	
	@ApiOperation("Finds expeditor by id of nationality")
	@GetMapping("/nationality/id/{id}")
	public List<ExpeditorVo> findByNationalityId(@PathVariable Long id){
		return expeditorConverter.toVo(expeditorService.findByNationalityId(id));
	}
	@ApiOperation("Deletes expeditor by id of nationality")
	@DeleteMapping("/nationality/id/{id}")
	public int deleteByNationalityId(@PathVariable Long id){
		return expeditorService.deleteByNationalityId(id);
	}
     	
    @ApiOperation("Finds a expeditor by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<ExpeditorVo> findByCreatedByUsername(@PathVariable String username){
		return expeditorConverter.toVo(expeditorService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a expeditor by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return expeditorService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds expeditor by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<ExpeditorVo> findByCreatedById(@PathVariable Long id){
		return expeditorConverter.toVo(expeditorService.findByCreatedById(id));
	}
	@ApiOperation("Deletes expeditor by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return expeditorService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a expeditor by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<ExpeditorVo> findByUpdatedByUsername(@PathVariable String username){
		return expeditorConverter.toVo(expeditorService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a expeditor by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return expeditorService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds expeditor by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<ExpeditorVo> findByUpdatedById(@PathVariable Long id){
		return expeditorConverter.toVo(expeditorService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes expeditor by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return expeditorService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search expeditor by a specific criterion")
    @PostMapping("/search")
	public List<ExpeditorVo> findByCriteria(@RequestBody ExpeditorVo expeditorVo){
       return expeditorConverter.toVo(expeditorService.findByCriteria(expeditorVo));
	}	
	public ExpeditorConverter getExpeditorConverter(){
		return expeditorConverter;
	}
 
	public void setExpeditorConverter(ExpeditorConverter expeditorConverter){
		this.expeditorConverter=expeditorConverter;
	}

	public ExpeditorService getExpeditorService(){
		return expeditorService;
	}
	public void setExpeditorService( ExpeditorService expeditorService){
	 	this.expeditorService=expeditorService;
	}
	

}