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
import ma.zs.generated.bean.ModelLettreReponse; 
import ma.zs.generated.service.facade.ModelLettreReponseService;
import ma.zs.generated.ws.rest.provided.converter.ModelLettreReponseConverter;
import ma.zs.generated.ws.rest.provided.vo.ModelLettreReponseVo;

@Api("Manages modelLettreReponse services")
@RestController
@RequestMapping("generated/modelLettreReponse")
public class ModelLettreReponseRest {

	@Autowired 
	private ModelLettreReponseService modelLettreReponseService;
	
	@Autowired 
	private ModelLettreReponseConverter modelLettreReponseConverter ;

    @ApiOperation("Saves the specified modelLettreReponse")
	@PostMapping("/")
	public ModelLettreReponseVo save(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
		ModelLettreReponse modelLettreReponse= modelLettreReponseConverter.toItem(modelLettreReponseVo);
	  modelLettreReponse=	modelLettreReponseService.save(modelLettreReponse);
		return modelLettreReponseConverter.toVo(modelLettreReponse);
	}

    @ApiOperation("Delete the specified modelLettreReponse")
	@DeleteMapping("/")
	public int delete(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
		ModelLettreReponse modelLettreReponse = modelLettreReponseConverter.toItem(modelLettreReponseVo);
		return modelLettreReponseService.delete(modelLettreReponse);
	}

	@ApiOperation("Updates the specified modelLettreReponse")
	@PutMapping("/")
	public ModelLettreReponseVo update(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
		ModelLettreReponse modelLettreReponse= modelLettreReponseConverter.toItem(modelLettreReponseVo);
	  modelLettreReponse=	modelLettreReponseService.update(modelLettreReponse);
		return modelLettreReponseConverter.toVo(modelLettreReponse);
	}

	@ApiOperation("Finds a list of all modelLettreReponses")
	@GetMapping("/")
	public List<ModelLettreReponseVo> findAll(){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findAll());
	}
    
	@ApiOperation("Finds a modelLettreReponse by id")
	@GetMapping("/id/{id}")
	public ModelLettreReponseVo findById(@PathVariable Long id){
		return  modelLettreReponseConverter.toVo(modelLettreReponseService.findById(id));
	}
	@ApiOperation("Deletes a modelLettreReponse by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 modelLettreReponseService.deleteById(id);
	}

	@ApiOperation("Finds a  modelLettreReponse by libelle")
    @GetMapping("/libelle/{libelle}")
	public ModelLettreReponseVo findByLibelle(@PathVariable String libelle){
		return  modelLettreReponseConverter.toVo(modelLettreReponseService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  modelLettreReponse by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  modelLettreReponseService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a modelLettreReponse by libelle of categorieModelLettreReponse")
	@GetMapping("/categorieModelLettreReponse/libelle/{libelle}")
	public List<ModelLettreReponseVo> findByCategorieModelLettreReponseLibelle(@PathVariable String libelle){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCategorieModelLettreReponseLibelle(libelle));
	}
	
	@ApiOperation("Deletes a modelLettreReponse by libelle of categorieModelLettreReponse")
	@DeleteMapping("/categorieModelLettreReponse/libelle/{libelle}")
	public int deleteByCategorieModelLettreReponseLibelle(@PathVariable String libelle){
		return modelLettreReponseService.deleteByCategorieModelLettreReponseLibelle(libelle);
	}
	
	@ApiOperation("Finds modelLettreReponse by id of categorieModelLettreReponse")
	@GetMapping("/categorieModelLettreReponse/id/{id}")
	public List<ModelLettreReponseVo> findByCategorieModelLettreReponseId(@PathVariable Long id){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCategorieModelLettreReponseId(id));
	}
	@ApiOperation("Deletes modelLettreReponse by id of categorieModelLettreReponse")
	@DeleteMapping("/categorieModelLettreReponse/id/{id}")
	public int deleteByCategorieModelLettreReponseId(@PathVariable Long id){
		return modelLettreReponseService.deleteByCategorieModelLettreReponseId(id);
	}
     	
    @ApiOperation("Finds a modelLettreReponse by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<ModelLettreReponseVo> findByCreatedByUsername(@PathVariable String username){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a modelLettreReponse by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return modelLettreReponseService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds modelLettreReponse by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<ModelLettreReponseVo> findByCreatedById(@PathVariable Long id){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCreatedById(id));
	}
	@ApiOperation("Deletes modelLettreReponse by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return modelLettreReponseService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a modelLettreReponse by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<ModelLettreReponseVo> findByUpdatedByUsername(@PathVariable String username){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a modelLettreReponse by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return modelLettreReponseService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds modelLettreReponse by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<ModelLettreReponseVo> findByUpdatedById(@PathVariable Long id){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes modelLettreReponse by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return modelLettreReponseService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search modelLettreReponse by a specific criterion")
    @PostMapping("/search")
	public List<ModelLettreReponseVo> findByCriteria(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
       return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCriteria(modelLettreReponseVo));
	}	
	public ModelLettreReponseConverter getModelLettreReponseConverter(){
		return modelLettreReponseConverter;
	}
 
	public void setModelLettreReponseConverter(ModelLettreReponseConverter modelLettreReponseConverter){
		this.modelLettreReponseConverter=modelLettreReponseConverter;
	}

	public ModelLettreReponseService getModelLettreReponseService(){
		return modelLettreReponseService;
	}
	public void setModelLettreReponseService( ModelLettreReponseService modelLettreReponseService){
	 	this.modelLettreReponseService=modelLettreReponseService;
	}
	

}