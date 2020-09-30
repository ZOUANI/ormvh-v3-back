package ma.zs.generated.ws.rest.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.EtatCourrier;
import ma.zs.generated.service.facade.EtatCourrierService;
import ma.zs.generated.ws.rest.provided.converter.EtatCourrierConverter;
import ma.zs.generated.ws.rest.provided.vo.EtatCourrierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages etatCourrier services")
@RestController
@RequestMapping("generated/etatCourrier")
public class EtatCourrierRest {

	@Autowired
	private EtatCourrierService etatCourrierService;

	@Autowired
	private EtatCourrierConverter etatCourrierConverter ;

	@ApiOperation("creates the specified etatCourrier")
	@PostMapping("/")
	public EtatCourrierVo create(@RequestBody EtatCourrierVo etatCourrierVo){
		EtatCourrier etatCourrier= etatCourrierConverter.toItem(etatCourrierVo);
		etatCourrier=	etatCourrierService.create(etatCourrier);
		return etatCourrierConverter.toVo(etatCourrier);
	}

	@ApiOperation("Delete the specified etatCourrier")
	@DeleteMapping("/")
	public int delete(@RequestBody EtatCourrierVo etatCourrierVo){
		EtatCourrier etatCourrier = etatCourrierConverter.toItem(etatCourrierVo);
		return etatCourrierService.delete(etatCourrier);
	}

	@ApiOperation("Updates the specified etatCourrier")
	@PutMapping("/")
	public EtatCourrierVo update(@RequestBody EtatCourrierVo etatCourrierVo){
		EtatCourrier etatCourrier= etatCourrierConverter.toItem(etatCourrierVo);
		etatCourrier=	etatCourrierService.update(etatCourrier);
		return etatCourrierConverter.toVo(etatCourrier);
	}

	@ApiOperation("Finds a list of all etatCourriers")
	@GetMapping("/")
	public List<EtatCourrierVo> findAll(){
		return etatCourrierConverter.toVo(etatCourrierService.findAll());
	}

	@ApiOperation("Finds a etatCourrier by id")
	@GetMapping("/id/{id}")
	public EtatCourrierVo findById(@PathVariable Long id){
		return  etatCourrierConverter.toVo(etatCourrierService.findById(id));
	}
	@ApiOperation("Deletes a etatCourrier by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		etatCourrierService.deleteById(id);
	}

	@ApiOperation("Finds a  etatCourrier by libelle")
	@GetMapping("/libelle/{libelle}")
	public EtatCourrierVo findByLibelle(@PathVariable String libelle){
		return  etatCourrierConverter.toVo(etatCourrierService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  etatCourrier by libelle")
	@DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  etatCourrierService.deleteByLibelle(libelle);
	}




	@ApiOperation("Search etatCourrier by a specific criterion")
	@PostMapping("/search")
	public List<EtatCourrierVo> findByCriteria(@RequestBody EtatCourrierVo etatCourrierVo){
		return etatCourrierConverter.toVo(etatCourrierService.findByCriteria(etatCourrierVo));
	}
	public EtatCourrierConverter getEtatCourrierConverter(){
		return etatCourrierConverter;
	}

	public void setEtatCourrierConverter(EtatCourrierConverter etatCourrierConverter){
		this.etatCourrierConverter=etatCourrierConverter;
	}

	public EtatCourrierService getEtatCourrierService(){
		return etatCourrierService;
	}
	public void setEtatCourrierService( EtatCourrierService etatCourrierService){
		this.etatCourrierService=etatCourrierService;
	}


}