package ma.zs.generated.ws.rest.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.PhaseAdmin;
import ma.zs.generated.service.facade.PhaseAdminService;
import ma.zs.generated.ws.rest.provided.converter.PhaseAdminConverter;
import ma.zs.generated.ws.rest.provided.vo.PhaseAdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages phaseAdmin services")
@RestController
@RequestMapping("generated/phaseAdmin")
public class PhaseAdminRest {

	@Autowired 
	private PhaseAdminService phaseAdminService;
	
	@Autowired 
	private PhaseAdminConverter phaseAdminConverter ;

    @ApiOperation("creates the specified phaseAdmin")
	@PostMapping("/")
	public PhaseAdminVo create(@RequestBody PhaseAdminVo phaseAdminVo){
		PhaseAdmin phaseAdmin= phaseAdminConverter.toItem(phaseAdminVo);
	  phaseAdmin=	phaseAdminService.create(phaseAdmin);
		return phaseAdminConverter.toVo(phaseAdmin);
	}

    @ApiOperation("Delete the specified phaseAdmin")
	@DeleteMapping("/")
	public int delete(@RequestBody PhaseAdminVo phaseAdminVo){
		PhaseAdmin phaseAdmin = phaseAdminConverter.toItem(phaseAdminVo);
		return phaseAdminService.delete(phaseAdmin);
	}

	@ApiOperation("Updates the specified phaseAdmin")
	@PutMapping("/")
	public PhaseAdminVo update(@RequestBody PhaseAdminVo phaseAdminVo){
		PhaseAdmin phaseAdmin= phaseAdminConverter.toItem(phaseAdminVo);
	  phaseAdmin=	phaseAdminService.update(phaseAdmin);
		return phaseAdminConverter.toVo(phaseAdmin);
	}

	@ApiOperation("Finds a list of all phaseAdmins")
	@GetMapping("/")
	public List<PhaseAdminVo> findAll(){
		return phaseAdminConverter.toVo(phaseAdminService.findAll());
	}
    
	@ApiOperation("Finds a phaseAdmin by id")
	@GetMapping("/id/{id}")
	public PhaseAdminVo findById(@PathVariable Long id){
		return  phaseAdminConverter.toVo(phaseAdminService.findById(id));
	}
	@ApiOperation("Deletes a phaseAdmin by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 phaseAdminService.deleteById(id);
	}

	@ApiOperation("Finds a  phaseAdmin by libelle")
    @GetMapping("/libelle/{libelle}")
	public PhaseAdminVo findByLibelle(@PathVariable String libelle){
		return  phaseAdminConverter.toVo(phaseAdminService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  phaseAdmin by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  phaseAdminService.deleteByLibelle(libelle);
	}
	


   
    @ApiOperation("Search phaseAdmin by a specific criterion")
    @PostMapping("/search")
	public List<PhaseAdminVo> findByCriteria(@RequestBody PhaseAdminVo phaseAdminVo){
       return phaseAdminConverter.toVo(phaseAdminService.findByCriteria(phaseAdminVo));
	}	
	public PhaseAdminConverter getPhaseAdminConverter(){
		return phaseAdminConverter;
	}
 
	public void setPhaseAdminConverter(PhaseAdminConverter phaseAdminConverter){
		this.phaseAdminConverter=phaseAdminConverter;
	}

	public PhaseAdminService getPhaseAdminService(){
		return phaseAdminService;
	}
	public void setPhaseAdminService( PhaseAdminService phaseAdminService){
	 	this.phaseAdminService=phaseAdminService;
	}
	

}