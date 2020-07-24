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
import ma.zs.generated.bean.Voie; 
import ma.zs.generated.service.facade.VoieService;
import ma.zs.generated.ws.rest.provided.converter.VoieConverter;
import ma.zs.generated.ws.rest.provided.vo.VoieVo;

@Api("Manages voie services")
@RestController
@RequestMapping("generated/voie")
public class VoieRest {

	@Autowired 
	private VoieService voieService;
	
	@Autowired 
	private VoieConverter voieConverter ;

    @ApiOperation("creates the specified voie")
	@PostMapping("/")
	public VoieVo create(@RequestBody VoieVo voieVo){
		Voie voie= voieConverter.toItem(voieVo);
	  voie=	voieService.create(voie);
		return voieConverter.toVo(voie);
	}

    @ApiOperation("Delete the specified voie")
	@DeleteMapping("/")
	public int delete(@RequestBody VoieVo voieVo){
		Voie voie = voieConverter.toItem(voieVo);
		return voieService.delete(voie);
	}

	@ApiOperation("Updates the specified voie")
	@PutMapping("/")
	public VoieVo update(@RequestBody VoieVo voieVo){
		Voie voie= voieConverter.toItem(voieVo);
	  voie=	voieService.update(voie);
		return voieConverter.toVo(voie);
	}

	@ApiOperation("Finds a list of all voies")
	@GetMapping("/")
	public List<VoieVo> findAll(){
		return voieConverter.toVo(voieService.findAll());
	}
    
	@ApiOperation("Finds a voie by id")
	@GetMapping("/id/{id}")
	public VoieVo findById(@PathVariable Long id){
		return  voieConverter.toVo(voieService.findById(id));
	}
	@ApiOperation("Deletes a voie by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 voieService.deleteById(id);
	}

	@ApiOperation("Finds a  voie by libelle")
    @GetMapping("/libelle/{libelle}")
	public VoieVo findByLibelle(@PathVariable String libelle){
		return  voieConverter.toVo(voieService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  voie by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  voieService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a voie by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<VoieVo> findByCreatedByUsername(@PathVariable String username){
		return voieConverter.toVo(voieService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a voie by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return voieService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds voie by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<VoieVo> findByCreatedById(@PathVariable Long id){
		return voieConverter.toVo(voieService.findByCreatedById(id));
	}
	@ApiOperation("Deletes voie by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return voieService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a voie by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<VoieVo> findByUpdatedByUsername(@PathVariable String username){
		return voieConverter.toVo(voieService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a voie by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return voieService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds voie by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<VoieVo> findByUpdatedById(@PathVariable Long id){
		return voieConverter.toVo(voieService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes voie by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return voieService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search voie by a specific criterion")
    @PostMapping("/search")
	public List<VoieVo> findByCriteria(@RequestBody VoieVo voieVo){
       return voieConverter.toVo(voieService.findByCriteria(voieVo));
	}	
	public VoieConverter getVoieConverter(){
		return voieConverter;
	}
 
	public void setVoieConverter(VoieConverter voieConverter){
		this.voieConverter=voieConverter;
	}

	public VoieService getVoieService(){
		return voieService;
	}
	public void setVoieService( VoieService voieService){
	 	this.voieService=voieService;
	}
	

}