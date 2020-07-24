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
import ma.zs.generated.bean.TypeCourrier; 
import ma.zs.generated.service.facade.TypeCourrierService;
import ma.zs.generated.ws.rest.provided.converter.TypeCourrierConverter;
import ma.zs.generated.ws.rest.provided.vo.TypeCourrierVo;

@Api("Manages typeCourrier services")
@RestController
@RequestMapping("generated/typeCourrier")
public class TypeCourrierRest {

	@Autowired 
	private TypeCourrierService typeCourrierService;
	
	@Autowired 
	private TypeCourrierConverter typeCourrierConverter ;

    @ApiOperation("creates the specified typeCourrier")
	@PostMapping("/")
	public TypeCourrierVo create(@RequestBody TypeCourrierVo typeCourrierVo){
		TypeCourrier typeCourrier= typeCourrierConverter.toItem(typeCourrierVo);
	  typeCourrier=	typeCourrierService.create(typeCourrier);
		return typeCourrierConverter.toVo(typeCourrier);
	}

    @ApiOperation("Delete the specified typeCourrier")
	@DeleteMapping("/")
	public int delete(@RequestBody TypeCourrierVo typeCourrierVo){
		TypeCourrier typeCourrier = typeCourrierConverter.toItem(typeCourrierVo);
		return typeCourrierService.delete(typeCourrier);
	}

	@ApiOperation("Updates the specified typeCourrier")
	@PutMapping("/")
	public TypeCourrierVo update(@RequestBody TypeCourrierVo typeCourrierVo){
		TypeCourrier typeCourrier= typeCourrierConverter.toItem(typeCourrierVo);
	  typeCourrier=	typeCourrierService.update(typeCourrier);
		return typeCourrierConverter.toVo(typeCourrier);
	}

	@ApiOperation("Finds a list of all typeCourriers")
	@GetMapping("/")
	public List<TypeCourrierVo> findAll(){
		return typeCourrierConverter.toVo(typeCourrierService.findAll());
	}
    
	@ApiOperation("Finds a typeCourrier by id")
	@GetMapping("/id/{id}")
	public TypeCourrierVo findById(@PathVariable Long id){
		return  typeCourrierConverter.toVo(typeCourrierService.findById(id));
	}
	@ApiOperation("Deletes a typeCourrier by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 typeCourrierService.deleteById(id);
	}

	@ApiOperation("Finds a  typeCourrier by libelle")
    @GetMapping("/libelle/{libelle}")
	public TypeCourrierVo findByLibelle(@PathVariable String libelle){
		return  typeCourrierConverter.toVo(typeCourrierService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  typeCourrier by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  typeCourrierService.deleteByLibelle(libelle);
	}
	


   
    @ApiOperation("Search typeCourrier by a specific criterion")
    @PostMapping("/search")
	public List<TypeCourrierVo> findByCriteria(@RequestBody TypeCourrierVo typeCourrierVo){
       return typeCourrierConverter.toVo(typeCourrierService.findByCriteria(typeCourrierVo));
	}	
	public TypeCourrierConverter getTypeCourrierConverter(){
		return typeCourrierConverter;
	}
 
	public void setTypeCourrierConverter(TypeCourrierConverter typeCourrierConverter){
		this.typeCourrierConverter=typeCourrierConverter;
	}

	public TypeCourrierService getTypeCourrierService(){
		return typeCourrierService;
	}
	public void setTypeCourrierService( TypeCourrierService typeCourrierService){
	 	this.typeCourrierService=typeCourrierService;
	}
	

}