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
import ma.zs.generated.bean.Sexe; 
import ma.zs.generated.service.facade.SexeService;
import ma.zs.generated.ws.rest.provided.converter.SexeConverter;
import ma.zs.generated.ws.rest.provided.vo.SexeVo;

@Api("Manages sexe services")
@RestController
@RequestMapping("generated/sexe")
public class SexeRest {

	@Autowired 
	private SexeService sexeService;
	
	@Autowired 
	private SexeConverter sexeConverter ;

    @ApiOperation("creates the specified sexe")
	@PostMapping("/")
	public SexeVo create(@RequestBody SexeVo sexeVo){
		Sexe sexe= sexeConverter.toItem(sexeVo);
	  sexe=	sexeService.create(sexe);
		return sexeConverter.toVo(sexe);
	}

    @ApiOperation("Delete the specified sexe")
	@DeleteMapping("/")
	public int delete(@RequestBody SexeVo sexeVo){
		Sexe sexe = sexeConverter.toItem(sexeVo);
		return sexeService.delete(sexe);
	}

	@ApiOperation("Updates the specified sexe")
	@PutMapping("/")
	public SexeVo update(@RequestBody SexeVo sexeVo){
		Sexe sexe= sexeConverter.toItem(sexeVo);
	  sexe=	sexeService.update(sexe);
		return sexeConverter.toVo(sexe);
	}

	@ApiOperation("Finds a list of all sexes")
	@GetMapping("/")
	public List<SexeVo> findAll(){
		return sexeConverter.toVo(sexeService.findAll());
	}
    
	@ApiOperation("Finds a sexe by id")
	@GetMapping("/id/{id}")
	public SexeVo findById(@PathVariable Long id){
		return  sexeConverter.toVo(sexeService.findById(id));
	}
	@ApiOperation("Deletes a sexe by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 sexeService.deleteById(id);
	}

	@ApiOperation("Finds a  sexe by libelle")
    @GetMapping("/libelle/{libelle}")
	public SexeVo findByLibelle(@PathVariable String libelle){
		return  sexeConverter.toVo(sexeService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  sexe by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  sexeService.deleteByLibelle(libelle);
	}
	


   
    @ApiOperation("Search sexe by a specific criterion")
    @PostMapping("/search")
	public List<SexeVo> findByCriteria(@RequestBody SexeVo sexeVo){
       return sexeConverter.toVo(sexeService.findByCriteria(sexeVo));
	}	
	public SexeConverter getSexeConverter(){
		return sexeConverter;
	}
 
	public void setSexeConverter(SexeConverter sexeConverter){
		this.sexeConverter=sexeConverter;
	}

	public SexeService getSexeService(){
		return sexeService;
	}
	public void setSexeService( SexeService sexeService){
	 	this.sexeService=sexeService;
	}
	

}