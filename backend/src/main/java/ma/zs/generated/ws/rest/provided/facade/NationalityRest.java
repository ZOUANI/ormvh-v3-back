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
import ma.zs.generated.bean.Nationality; 
import ma.zs.generated.service.facade.NationalityService;
import ma.zs.generated.ws.rest.provided.converter.NationalityConverter;
import ma.zs.generated.ws.rest.provided.vo.NationalityVo;

@Api("Manages nationality services")
@RestController
@RequestMapping("generated/nationality")
public class NationalityRest {

	@Autowired 
	private NationalityService nationalityService;
	
	@Autowired 
	private NationalityConverter nationalityConverter ;

    @ApiOperation("Saves the specified nationality")
	@PostMapping("/")
	public NationalityVo save(@RequestBody NationalityVo nationalityVo){
		Nationality nationality= nationalityConverter.toItem(nationalityVo);
	  nationality=	nationalityService.save(nationality);
		return nationalityConverter.toVo(nationality);
	}

    @ApiOperation("Delete the specified nationality")
	@DeleteMapping("/")
	public int delete(@RequestBody NationalityVo nationalityVo){
		Nationality nationality = nationalityConverter.toItem(nationalityVo);
		return nationalityService.delete(nationality);
	}

	@ApiOperation("Updates the specified nationality")
	@PutMapping("/")
	public NationalityVo update(@RequestBody NationalityVo nationalityVo){
		Nationality nationality= nationalityConverter.toItem(nationalityVo);
	  nationality=	nationalityService.update(nationality);
		return nationalityConverter.toVo(nationality);
	}

	@ApiOperation("Finds a list of all nationalitys")
	@GetMapping("/")
	public List<NationalityVo> findAll(){
		return nationalityConverter.toVo(nationalityService.findAll());
	}
    
	@ApiOperation("Finds a nationality by id")
	@GetMapping("/id/{id}")
	public NationalityVo findById(@PathVariable Long id){
		return  nationalityConverter.toVo(nationalityService.findById(id));
	}
	@ApiOperation("Deletes a nationality by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 nationalityService.deleteById(id);
	}

	@ApiOperation("Finds a  nationality by libelle")
    @GetMapping("/libelle/{libelle}")
	public NationalityVo findByLibelle(@PathVariable String libelle){
		return  nationalityConverter.toVo(nationalityService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  nationality by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  nationalityService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a nationality by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<NationalityVo> findByUpdatedByUsername(@PathVariable String username){
		return nationalityConverter.toVo(nationalityService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a nationality by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return nationalityService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds nationality by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<NationalityVo> findByUpdatedById(@PathVariable Long id){
		return nationalityConverter.toVo(nationalityService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes nationality by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return nationalityService.deleteByUpdatedById(id);
	}
     	
    @ApiOperation("Finds a nationality by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<NationalityVo> findByCreatedByUsername(@PathVariable String username){
		return nationalityConverter.toVo(nationalityService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a nationality by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return nationalityService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds nationality by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<NationalityVo> findByCreatedById(@PathVariable Long id){
		return nationalityConverter.toVo(nationalityService.findByCreatedById(id));
	}
	@ApiOperation("Deletes nationality by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return nationalityService.deleteByCreatedById(id);
	}
     	
   
    @ApiOperation("Search nationality by a specific criterion")
    @PostMapping("/search")
	public List<NationalityVo> findByCriteria(@RequestBody NationalityVo nationalityVo){
       return nationalityConverter.toVo(nationalityService.findByCriteria(nationalityVo));
	}	
	public NationalityConverter getNationalityConverter(){
		return nationalityConverter;
	}
 
	public void setNationalityConverter(NationalityConverter nationalityConverter){
		this.nationalityConverter=nationalityConverter;
	}

	public NationalityService getNationalityService(){
		return nationalityService;
	}
	public void setNationalityService( NationalityService nationalityService){
	 	this.nationalityService=nationalityService;
	}
	

}