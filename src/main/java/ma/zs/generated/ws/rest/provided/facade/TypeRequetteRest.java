package ma.zs.generated.ws.rest.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.bean.TypeRequette;
import ma.zs.generated.service.facade.NatureClientService;
import ma.zs.generated.service.facade.TypeRequetteService;
import ma.zs.generated.ws.rest.provided.converter.NatureClientConverter;
import ma.zs.generated.ws.rest.provided.converter.TypeRequetteConverter;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import ma.zs.generated.ws.rest.provided.vo.TypeRequetteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages typeRequette services")
@RestController
@RequestMapping("generated/typeRequette")
public class TypeRequetteRest {

	@Autowired
	private TypeRequetteService typeRequetteService;

	@Autowired
	private TypeRequetteConverter typeRequetteConverter ;

	@ApiOperation("creates the specified typeRequette")
	@PostMapping("/")
	public TypeRequetteVo create(@RequestBody TypeRequetteVo typeRequetteVo){
		TypeRequette typeRequette= typeRequetteConverter.toItem(typeRequetteVo);
		typeRequette=	typeRequetteService.create(typeRequette);
		return typeRequetteConverter.toVo(typeRequette);
	}

	@ApiOperation("Delete the specified typeRequette")
	@DeleteMapping("/")
	public int delete(@RequestBody TypeRequetteVo typeRequetteVo){
		TypeRequette typeRequette = typeRequetteConverter.toItem(typeRequetteVo);
		return typeRequetteService.delete(typeRequette);
	}

	@ApiOperation("Updates the specified typeRequette")
	@PutMapping("/")
	public TypeRequetteVo update(@RequestBody TypeRequetteVo typeRequetteVo){
		TypeRequette typeRequette= typeRequetteConverter.toItem(typeRequetteVo);
		typeRequette=	typeRequetteService.update(typeRequette);
		return typeRequetteConverter.toVo(typeRequette);
	}

	@ApiOperation("Finds a list of all typeRequettes")
	@GetMapping("/")
	public List<TypeRequetteVo> findAll(){
		return typeRequetteConverter.toVo(typeRequetteService.findAll());
	}

	@ApiOperation("Finds a typeRequette by id")
	@GetMapping("/id/{id}")
	public TypeRequetteVo findById(@PathVariable Long id){
		return  typeRequetteConverter.toVo(typeRequetteService.findById(id));
	}
	@ApiOperation("Deletes a typeRequette by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		typeRequetteService.deleteById(id);
	}

	@ApiOperation("Finds a  typeRequette by libelle")
	@GetMapping("/libelle/{libelle}")
	public TypeRequetteVo findByLibelle(@PathVariable String libelle){
		return  typeRequetteConverter.toVo(typeRequetteService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  typeRequette by libelle")
	@DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  typeRequetteService.deleteByLibelle(libelle);
	}




	@ApiOperation("Search typeRequette by a specific criterion")
	@PostMapping("/search")
	public List<TypeRequetteVo> findByCriteria(@RequestBody TypeRequetteVo typeRequetteVo){
		return typeRequetteConverter.toVo(typeRequetteService.findByCriteria(typeRequetteVo));
	}
	public TypeRequetteConverter getTypeRequetteConverter(){
		return typeRequetteConverter;
	}

	public void setTypeRequetteConverter(TypeRequetteConverter typeRequetteConverter){
		this.typeRequetteConverter=typeRequetteConverter;
	}

	public TypeRequetteService getTypeRequetteService(){
		return typeRequetteService;
	}
	public void setTypeRequetteService( TypeRequetteService typeRequetteService){
		this.typeRequetteService=typeRequetteService;
	}


}