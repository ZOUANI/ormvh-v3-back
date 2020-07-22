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
import ma.zs.generated.bean.CourrierServiceItem; 
import ma.zs.generated.service.facade.CourrierServiceItemService;
import ma.zs.generated.ws.rest.provided.converter.CourrierServiceItemConverter;
import ma.zs.generated.ws.rest.provided.vo.CourrierServiceItemVo;

@Api("Manages courrierServiceItem services")
@RestController
@RequestMapping("generated/courrierServiceItem")
public class CourrierServiceItemRest {

	@Autowired 
	private CourrierServiceItemService courrierServiceItemService;
	
	@Autowired 
	private CourrierServiceItemConverter courrierServiceItemConverter ;

    @ApiOperation("Saves the specified courrierServiceItem")
	@PostMapping("/")
	public CourrierServiceItemVo save(@RequestBody CourrierServiceItemVo courrierServiceItemVo){
		CourrierServiceItem courrierServiceItem= courrierServiceItemConverter.toItem(courrierServiceItemVo);
	  courrierServiceItem=	courrierServiceItemService.save(courrierServiceItem);
		return courrierServiceItemConverter.toVo(courrierServiceItem);
	}

    @ApiOperation("Delete the specified courrierServiceItem")
	@DeleteMapping("/")
	public int delete(@RequestBody CourrierServiceItemVo courrierServiceItemVo){
		CourrierServiceItem courrierServiceItem = courrierServiceItemConverter.toItem(courrierServiceItemVo);
		return courrierServiceItemService.delete(courrierServiceItem);
	}

	@ApiOperation("Updates the specified courrierServiceItem")
	@PutMapping("/")
	public CourrierServiceItemVo update(@RequestBody CourrierServiceItemVo courrierServiceItemVo){
		CourrierServiceItem courrierServiceItem= courrierServiceItemConverter.toItem(courrierServiceItemVo);
	  courrierServiceItem=	courrierServiceItemService.update(courrierServiceItem);
		return courrierServiceItemConverter.toVo(courrierServiceItem);
	}

	@ApiOperation("Finds a list of all courrierServiceItems")
	@GetMapping("/")
	public List<CourrierServiceItemVo> findAll(){
		return courrierServiceItemConverter.toVo(courrierServiceItemService.findAll());
	}
    
	@ApiOperation("Finds a courrierServiceItem by id")
	@GetMapping("/id/{id}")
	public CourrierServiceItemVo findById(@PathVariable Long id){
		return  courrierServiceItemConverter.toVo(courrierServiceItemService.findById(id));
	}
	@ApiOperation("Deletes a courrierServiceItem by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 courrierServiceItemService.deleteById(id);
	}



    @ApiOperation("Finds a courrierServiceItem by idCourrier of courrier")
	@GetMapping("/courrier/idCourrier/{idCourrier}")
	public List<CourrierServiceItemVo> findByCourrierIdCourrier(@PathVariable String idCourrier){
		return courrierServiceItemConverter.toVo(courrierServiceItemService.findByCourrierIdCourrier(idCourrier));
	}
	
	@ApiOperation("Deletes a courrierServiceItem by idCourrier of courrier")
	@DeleteMapping("/courrier/idCourrier/{idCourrier}")
	public int deleteByCourrierIdCourrier(@PathVariable String idCourrier){
		return courrierServiceItemService.deleteByCourrierIdCourrier(idCourrier);
	}
	
	@ApiOperation("Finds courrierServiceItem by id of courrier")
	@GetMapping("/courrier/id/{id}")
	public List<CourrierServiceItemVo> findByCourrierId(@PathVariable Long id){
		return courrierServiceItemConverter.toVo(courrierServiceItemService.findByCourrierId(id));
	}
	@ApiOperation("Deletes courrierServiceItem by id of courrier")
	@DeleteMapping("/courrier/id/{id}")
	public int deleteByCourrierId(@PathVariable Long id){
		return courrierServiceItemService.deleteByCourrierId(id);
	}
     	
    @ApiOperation("Finds a courrierServiceItem by title of service")
	@GetMapping("/service/title/{title}")
	public List<CourrierServiceItemVo> findByServiceTitle(@PathVariable String title){
		return courrierServiceItemConverter.toVo(courrierServiceItemService.findByServiceTitle(title));
	}
	
	@ApiOperation("Deletes a courrierServiceItem by title of service")
	@DeleteMapping("/service/title/{title}")
	public int deleteByServiceTitle(@PathVariable String title){
		return courrierServiceItemService.deleteByServiceTitle(title);
	}
	
	@ApiOperation("Finds courrierServiceItem by id of service")
	@GetMapping("/service/id/{id}")
	public List<CourrierServiceItemVo> findByServiceId(@PathVariable Long id){
		return courrierServiceItemConverter.toVo(courrierServiceItemService.findByServiceId(id));
	}
	@ApiOperation("Deletes courrierServiceItem by id of service")
	@DeleteMapping("/service/id/{id}")
	public int deleteByServiceId(@PathVariable Long id){
		return courrierServiceItemService.deleteByServiceId(id);
	}
     	
   
    @ApiOperation("Search courrierServiceItem by a specific criterion")
    @PostMapping("/search")
	public List<CourrierServiceItemVo> findByCriteria(@RequestBody CourrierServiceItemVo courrierServiceItemVo){
       return courrierServiceItemConverter.toVo(courrierServiceItemService.findByCriteria(courrierServiceItemVo));
	}	
	public CourrierServiceItemConverter getCourrierServiceItemConverter(){
		return courrierServiceItemConverter;
	}
 
	public void setCourrierServiceItemConverter(CourrierServiceItemConverter courrierServiceItemConverter){
		this.courrierServiceItemConverter=courrierServiceItemConverter;
	}

	public CourrierServiceItemService getCourrierServiceItemService(){
		return courrierServiceItemService;
	}
	public void setCourrierServiceItemService( CourrierServiceItemService courrierServiceItemService){
	 	this.courrierServiceItemService=courrierServiceItemService;
	}
	

}