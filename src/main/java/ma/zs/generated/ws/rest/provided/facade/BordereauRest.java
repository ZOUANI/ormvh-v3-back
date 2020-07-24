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
import ma.zs.generated.bean.Bordereau; 
import ma.zs.generated.service.facade.BordereauService;
import ma.zs.generated.ws.rest.provided.converter.BordereauConverter;
import ma.zs.generated.ws.rest.provided.vo.BordereauVo;

@Api("Manages bordereau services")
@RestController
@RequestMapping("generated/bordereau")
public class BordereauRest {

	@Autowired 
	private BordereauService bordereauService;
	
	@Autowired 
	private BordereauConverter bordereauConverter ;

    @ApiOperation("creates the specified bordereau")
	@PostMapping("/")
	public BordereauVo create(@RequestBody BordereauVo bordereauVo){
		Bordereau bordereau= bordereauConverter.toItem(bordereauVo);
	  bordereau=	bordereauService.create(bordereau);
		return bordereauConverter.toVo(bordereau);
	}

    @ApiOperation("Delete the specified bordereau")
	@DeleteMapping("/")
	public int delete(@RequestBody BordereauVo bordereauVo){
		Bordereau bordereau = bordereauConverter.toItem(bordereauVo);
		return bordereauService.delete(bordereau);
	}

	@ApiOperation("Updates the specified bordereau")
	@PutMapping("/")
	public BordereauVo update(@RequestBody BordereauVo bordereauVo){
		Bordereau bordereau= bordereauConverter.toItem(bordereauVo);
	  bordereau=	bordereauService.update(bordereau);
		return bordereauConverter.toVo(bordereau);
	}

	@ApiOperation("Finds a list of all bordereaus")
	@GetMapping("/")
	public List<BordereauVo> findAll(){
		return bordereauConverter.toVo(bordereauService.findAll());
	}
    
	@ApiOperation("Finds a bordereau by id")
	@GetMapping("/id/{id}")
	public BordereauVo findById(@PathVariable Long id){
		return  bordereauConverter.toVo(bordereauService.findById(id));
	}
	@ApiOperation("Deletes a bordereau by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 bordereauService.deleteById(id);
	}

	@ApiOperation("Finds a  bordereau by libelle")
    @GetMapping("/libelle/{libelle}")
	public BordereauVo findByLibelle(@PathVariable String libelle){
		return  bordereauConverter.toVo(bordereauService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  bordereau by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  bordereauService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a bordereau by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<BordereauVo> findByCreatedByUsername(@PathVariable String username){
		return bordereauConverter.toVo(bordereauService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a bordereau by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return bordereauService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds bordereau by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<BordereauVo> findByCreatedById(@PathVariable Long id){
		return bordereauConverter.toVo(bordereauService.findByCreatedById(id));
	}
	@ApiOperation("Deletes bordereau by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return bordereauService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a bordereau by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<BordereauVo> findByUpdatedByUsername(@PathVariable String username){
		return bordereauConverter.toVo(bordereauService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a bordereau by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return bordereauService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds bordereau by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<BordereauVo> findByUpdatedById(@PathVariable Long id){
		return bordereauConverter.toVo(bordereauService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes bordereau by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return bordereauService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search bordereau by a specific criterion")
    @PostMapping("/search")
	public List<BordereauVo> findByCriteria(@RequestBody BordereauVo bordereauVo){
       return bordereauConverter.toVo(bordereauService.findByCriteria(bordereauVo));
	}	
	public BordereauConverter getBordereauConverter(){
		return bordereauConverter;
	}
 
	public void setBordereauConverter(BordereauConverter bordereauConverter){
		this.bordereauConverter=bordereauConverter;
	}

	public BordereauService getBordereauService(){
		return bordereauService;
	}
	public void setBordereauService( BordereauService bordereauService){
	 	this.bordereauService=bordereauService;
	}
	

}