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
import ma.zs.generated.bean.Evaluation; 
import ma.zs.generated.service.facade.EvaluationService;
import ma.zs.generated.ws.rest.provided.converter.EvaluationConverter;
import ma.zs.generated.ws.rest.provided.vo.EvaluationVo;

@Api("Manages evaluation services")
@RestController
@RequestMapping("generated/evaluation")
public class EvaluationRest {

	@Autowired 
	private EvaluationService evaluationService;
	
	@Autowired 
	private EvaluationConverter evaluationConverter ;

    @ApiOperation("Saves the specified evaluation")
	@PostMapping("/")
	public EvaluationVo save(@RequestBody EvaluationVo evaluationVo){
		Evaluation evaluation= evaluationConverter.toItem(evaluationVo);
	  evaluation=	evaluationService.save(evaluation);
		return evaluationConverter.toVo(evaluation);
	}

    @ApiOperation("Delete the specified evaluation")
	@DeleteMapping("/")
	public int delete(@RequestBody EvaluationVo evaluationVo){
		Evaluation evaluation = evaluationConverter.toItem(evaluationVo);
		return evaluationService.delete(evaluation);
	}

	@ApiOperation("Updates the specified evaluation")
	@PutMapping("/")
	public EvaluationVo update(@RequestBody EvaluationVo evaluationVo){
		Evaluation evaluation= evaluationConverter.toItem(evaluationVo);
	  evaluation=	evaluationService.update(evaluation);
		return evaluationConverter.toVo(evaluation);
	}

	@ApiOperation("Finds a list of all evaluations")
	@GetMapping("/")
	public List<EvaluationVo> findAll(){
		return evaluationConverter.toVo(evaluationService.findAll());
	}
    
	@ApiOperation("Finds a evaluation by id")
	@GetMapping("/id/{id}")
	public EvaluationVo findById(@PathVariable Long id){
		return  evaluationConverter.toVo(evaluationService.findById(id));
	}
	@ApiOperation("Deletes a evaluation by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 evaluationService.deleteById(id);
	}

	@ApiOperation("Finds a  evaluation by title")
    @GetMapping("/title/{title}")
	public EvaluationVo findByTitle(@PathVariable String title){
		return  evaluationConverter.toVo(evaluationService.findByTitle(title));
	}
	@ApiOperation("Deletes a  evaluation by title")
    @DeleteMapping("/title/{title}")
	public int deleteByTitle(@PathVariable String title){
		return  evaluationService.deleteByTitle(title);
	}
	


    @ApiOperation("Finds a evaluation by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<EvaluationVo> findByCreatedByUsername(@PathVariable String username){
		return evaluationConverter.toVo(evaluationService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a evaluation by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return evaluationService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds evaluation by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<EvaluationVo> findByCreatedById(@PathVariable Long id){
		return evaluationConverter.toVo(evaluationService.findByCreatedById(id));
	}
	@ApiOperation("Deletes evaluation by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return evaluationService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a evaluation by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<EvaluationVo> findByUpdatedByUsername(@PathVariable String username){
		return evaluationConverter.toVo(evaluationService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a evaluation by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return evaluationService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds evaluation by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<EvaluationVo> findByUpdatedById(@PathVariable Long id){
		return evaluationConverter.toVo(evaluationService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes evaluation by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return evaluationService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search evaluation by a specific criterion")
    @PostMapping("/search")
	public List<EvaluationVo> findByCriteria(@RequestBody EvaluationVo evaluationVo){
       return evaluationConverter.toVo(evaluationService.findByCriteria(evaluationVo));
	}	
	public EvaluationConverter getEvaluationConverter(){
		return evaluationConverter;
	}
 
	public void setEvaluationConverter(EvaluationConverter evaluationConverter){
		this.evaluationConverter=evaluationConverter;
	}

	public EvaluationService getEvaluationService(){
		return evaluationService;
	}
	public void setEvaluationService( EvaluationService evaluationService){
	 	this.evaluationService=evaluationService;
	}
	

}