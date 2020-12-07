package ma.zs.generated.ws.rest.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.service.facade.NatureClientService;
import ma.zs.generated.ws.rest.provided.converter.NatureClientConverter;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages natureClient services")
@RestController
@RequestMapping("generated/natureClient")
public class NatureClientRest {

	@Autowired 
	private NatureClientService natureClientService;
	
	@Autowired 
	private NatureClientConverter natureClientConverter ;

    @ApiOperation("creates the specified natureClient")
	@PostMapping("/")
	public NatureClientVo create(@RequestBody NatureClientVo natureClientVo){
		NatureClient natureClient= natureClientConverter.toItem(natureClientVo);
	  natureClient=	natureClientService.create(natureClient);
		return natureClientConverter.toVo(natureClient);
	}

    @ApiOperation("Delete the specified natureClient")
	@DeleteMapping("/")
	public int delete(@RequestBody NatureClientVo natureClientVo){
		NatureClient natureClient = natureClientConverter.toItem(natureClientVo);
		return natureClientService.delete(natureClient);
	}

	@ApiOperation("Updates the specified natureClient")
	@PutMapping("/")
	public NatureClientVo update(@RequestBody NatureClientVo natureClientVo){
		NatureClient natureClient= natureClientConverter.toItem(natureClientVo);
	  natureClient=	natureClientService.update(natureClient);
		return natureClientConverter.toVo(natureClient);
	}

	@ApiOperation("Finds a list of all natureClients")
	@GetMapping("/")
	public List<NatureClientVo> findAll(){
		return natureClientConverter.toVo(natureClientService.findAll());
	}
    
	@ApiOperation("Finds a natureClient by id")
	@GetMapping("/id/{id}")
	public NatureClientVo findById(@PathVariable Long id){
		return  natureClientConverter.toVo(natureClientService.findById(id));
	}
	@ApiOperation("Deletes a natureClient by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 natureClientService.deleteById(id);
	}

	@ApiOperation("Finds a  natureClient by libelle")
    @GetMapping("/libelle/{libelle}")
	public NatureClientVo findByLibelle(@PathVariable String libelle){
		return  natureClientConverter.toVo(natureClientService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  natureClient by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  natureClientService.deleteByLibelle(libelle);
	}
	


   
    @ApiOperation("Search natureClient by a specific criterion")
    @PostMapping("/search")
	public List<NatureClientVo> findByCriteria(@RequestBody NatureClientVo natureClientVo){
       return natureClientConverter.toVo(natureClientService.findByCriteria(natureClientVo));
	}	
	public NatureClientConverter getNatureClientConverter(){
		return natureClientConverter;
	}
 
	public void setNatureClientConverter(NatureClientConverter natureClientConverter){
		this.natureClientConverter=natureClientConverter;
	}

	public NatureClientService getNatureClientService(){
		return natureClientService;
	}
	public void setNatureClientService( NatureClientService natureClientService){
	 	this.natureClientService=natureClientService;
	}
	

}