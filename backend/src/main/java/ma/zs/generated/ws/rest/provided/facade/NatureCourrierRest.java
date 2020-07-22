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
import ma.zs.generated.bean.NatureCourrier; 
import ma.zs.generated.service.facade.NatureCourrierService;
import ma.zs.generated.ws.rest.provided.converter.NatureCourrierConverter;
import ma.zs.generated.ws.rest.provided.vo.NatureCourrierVo;

@Api("Manages natureCourrier services")
@RestController
@RequestMapping("generated/natureCourrier")
public class NatureCourrierRest {

	@Autowired 
	private NatureCourrierService natureCourrierService;
	
	@Autowired 
	private NatureCourrierConverter natureCourrierConverter ;

    @ApiOperation("Saves the specified natureCourrier")
	@PostMapping("/")
	public NatureCourrierVo save(@RequestBody NatureCourrierVo natureCourrierVo){
		NatureCourrier natureCourrier= natureCourrierConverter.toItem(natureCourrierVo);
	  natureCourrier=	natureCourrierService.save(natureCourrier);
		return natureCourrierConverter.toVo(natureCourrier);
	}

    @ApiOperation("Delete the specified natureCourrier")
	@DeleteMapping("/")
	public int delete(@RequestBody NatureCourrierVo natureCourrierVo){
		NatureCourrier natureCourrier = natureCourrierConverter.toItem(natureCourrierVo);
		return natureCourrierService.delete(natureCourrier);
	}

	@ApiOperation("Updates the specified natureCourrier")
	@PutMapping("/")
	public NatureCourrierVo update(@RequestBody NatureCourrierVo natureCourrierVo){
		NatureCourrier natureCourrier= natureCourrierConverter.toItem(natureCourrierVo);
	  natureCourrier=	natureCourrierService.update(natureCourrier);
		return natureCourrierConverter.toVo(natureCourrier);
	}

	@ApiOperation("Finds a list of all natureCourriers")
	@GetMapping("/")
	public List<NatureCourrierVo> findAll(){
		return natureCourrierConverter.toVo(natureCourrierService.findAll());
	}
    
	@ApiOperation("Finds a natureCourrier by id")
	@GetMapping("/id/{id}")
	public NatureCourrierVo findById(@PathVariable Long id){
		return  natureCourrierConverter.toVo(natureCourrierService.findById(id));
	}
	@ApiOperation("Deletes a natureCourrier by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 natureCourrierService.deleteById(id);
	}

	@ApiOperation("Finds a  natureCourrier by libelle")
    @GetMapping("/libelle/{libelle}")
	public NatureCourrierVo findByLibelle(@PathVariable String libelle){
		return  natureCourrierConverter.toVo(natureCourrierService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  natureCourrier by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  natureCourrierService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a natureCourrier by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<NatureCourrierVo> findByCreatedByUsername(@PathVariable String username){
		return natureCourrierConverter.toVo(natureCourrierService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a natureCourrier by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return natureCourrierService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds natureCourrier by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<NatureCourrierVo> findByCreatedById(@PathVariable Long id){
		return natureCourrierConverter.toVo(natureCourrierService.findByCreatedById(id));
	}
	@ApiOperation("Deletes natureCourrier by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return natureCourrierService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a natureCourrier by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<NatureCourrierVo> findByUpdatedByUsername(@PathVariable String username){
		return natureCourrierConverter.toVo(natureCourrierService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a natureCourrier by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return natureCourrierService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds natureCourrier by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<NatureCourrierVo> findByUpdatedById(@PathVariable Long id){
		return natureCourrierConverter.toVo(natureCourrierService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes natureCourrier by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return natureCourrierService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search natureCourrier by a specific criterion")
    @PostMapping("/search")
	public List<NatureCourrierVo> findByCriteria(@RequestBody NatureCourrierVo natureCourrierVo){
       return natureCourrierConverter.toVo(natureCourrierService.findByCriteria(natureCourrierVo));
	}	
	public NatureCourrierConverter getNatureCourrierConverter(){
		return natureCourrierConverter;
	}
 
	public void setNatureCourrierConverter(NatureCourrierConverter natureCourrierConverter){
		this.natureCourrierConverter=natureCourrierConverter;
	}

	public NatureCourrierService getNatureCourrierService(){
		return natureCourrierService;
	}
	public void setNatureCourrierService( NatureCourrierService natureCourrierService){
	 	this.natureCourrierService=natureCourrierService;
	}
	

}