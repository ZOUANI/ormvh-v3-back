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
import ma.zs.generated.bean.CategorieModelLettreReponse; 
import ma.zs.generated.service.facade.CategorieModelLettreReponseService;
import ma.zs.generated.ws.rest.provided.converter.CategorieModelLettreReponseConverter;
import ma.zs.generated.ws.rest.provided.vo.CategorieModelLettreReponseVo;

@Api("Manages categorieModelLettreReponse services")
@RestController
@RequestMapping("generated/categorieModelLettreReponse")
public class CategorieModelLettreReponseRest {

	@Autowired 
	private CategorieModelLettreReponseService categorieModelLettreReponseService;
	
	@Autowired 
	private CategorieModelLettreReponseConverter categorieModelLettreReponseConverter ;

    @ApiOperation("Saves the specified categorieModelLettreReponse")
	@PostMapping("/")
	public CategorieModelLettreReponseVo save(@RequestBody CategorieModelLettreReponseVo categorieModelLettreReponseVo){
		CategorieModelLettreReponse categorieModelLettreReponse= categorieModelLettreReponseConverter.toItem(categorieModelLettreReponseVo);
	  categorieModelLettreReponse=	categorieModelLettreReponseService.save(categorieModelLettreReponse);
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponse);
	}

    @ApiOperation("Delete the specified categorieModelLettreReponse")
	@DeleteMapping("/")
	public int delete(@RequestBody CategorieModelLettreReponseVo categorieModelLettreReponseVo){
		CategorieModelLettreReponse categorieModelLettreReponse = categorieModelLettreReponseConverter.toItem(categorieModelLettreReponseVo);
		return categorieModelLettreReponseService.delete(categorieModelLettreReponse);
	}

	@ApiOperation("Updates the specified categorieModelLettreReponse")
	@PutMapping("/")
	public CategorieModelLettreReponseVo update(@RequestBody CategorieModelLettreReponseVo categorieModelLettreReponseVo){
		CategorieModelLettreReponse categorieModelLettreReponse= categorieModelLettreReponseConverter.toItem(categorieModelLettreReponseVo);
	  categorieModelLettreReponse=	categorieModelLettreReponseService.update(categorieModelLettreReponse);
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponse);
	}

	@ApiOperation("Finds a list of all categorieModelLettreReponses")
	@GetMapping("/")
	public List<CategorieModelLettreReponseVo> findAll(){
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findAll());
	}
    
	@ApiOperation("Finds a categorieModelLettreReponse by id")
	@GetMapping("/id/{id}")
	public CategorieModelLettreReponseVo findById(@PathVariable Long id){
		return  categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findById(id));
	}
	@ApiOperation("Deletes a categorieModelLettreReponse by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 categorieModelLettreReponseService.deleteById(id);
	}

	@ApiOperation("Finds a  categorieModelLettreReponse by libelle")
    @GetMapping("/libelle/{libelle}")
	public CategorieModelLettreReponseVo findByLibelle(@PathVariable String libelle){
		return  categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  categorieModelLettreReponse by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  categorieModelLettreReponseService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a categorieModelLettreReponse by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<CategorieModelLettreReponseVo> findByUpdatedByUsername(@PathVariable String username){
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a categorieModelLettreReponse by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return categorieModelLettreReponseService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds categorieModelLettreReponse by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<CategorieModelLettreReponseVo> findByUpdatedById(@PathVariable Long id){
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes categorieModelLettreReponse by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return categorieModelLettreReponseService.deleteByUpdatedById(id);
	}
     	
    @ApiOperation("Finds a categorieModelLettreReponse by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<CategorieModelLettreReponseVo> findByCreatedByUsername(@PathVariable String username){
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a categorieModelLettreReponse by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return categorieModelLettreReponseService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds categorieModelLettreReponse by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<CategorieModelLettreReponseVo> findByCreatedById(@PathVariable Long id){
		return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findByCreatedById(id));
	}
	@ApiOperation("Deletes categorieModelLettreReponse by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return categorieModelLettreReponseService.deleteByCreatedById(id);
	}
     	
   
    @ApiOperation("Search categorieModelLettreReponse by a specific criterion")
    @PostMapping("/search")
	public List<CategorieModelLettreReponseVo> findByCriteria(@RequestBody CategorieModelLettreReponseVo categorieModelLettreReponseVo){
       return categorieModelLettreReponseConverter.toVo(categorieModelLettreReponseService.findByCriteria(categorieModelLettreReponseVo));
	}	
	public CategorieModelLettreReponseConverter getCategorieModelLettreReponseConverter(){
		return categorieModelLettreReponseConverter;
	}
 
	public void setCategorieModelLettreReponseConverter(CategorieModelLettreReponseConverter categorieModelLettreReponseConverter){
		this.categorieModelLettreReponseConverter=categorieModelLettreReponseConverter;
	}

	public CategorieModelLettreReponseService getCategorieModelLettreReponseService(){
		return categorieModelLettreReponseService;
	}
	public void setCategorieModelLettreReponseService( CategorieModelLettreReponseService categorieModelLettreReponseService){
	 	this.categorieModelLettreReponseService=categorieModelLettreReponseService;
	}
	

}