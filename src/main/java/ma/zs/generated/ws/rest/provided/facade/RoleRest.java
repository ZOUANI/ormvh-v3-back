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
import ma.zs.generated.bean.Role; 
import ma.zs.generated.service.facade.RoleService;
import ma.zs.generated.ws.rest.provided.converter.RoleConverter;
import ma.zs.generated.ws.rest.provided.vo.RoleVo;

@Api("Manages role services")
@RestController
@RequestMapping("generated/role")
public class RoleRest {

	@Autowired 
	private RoleService roleService;
	
	@Autowired 
	private RoleConverter roleConverter ;

    @ApiOperation("creates the specified role")
	@PostMapping("/")
	public RoleVo create(@RequestBody RoleVo roleVo){
		Role role= roleConverter.toItem(roleVo);
	  role=	roleService.create(role);
		return roleConverter.toVo(role);
	}

    @ApiOperation("Delete the specified role")
	@DeleteMapping("/")
	public int delete(@RequestBody RoleVo roleVo){
		Role role = roleConverter.toItem(roleVo);
		return roleService.delete(role);
	}

	@ApiOperation("Updates the specified role")
	@PutMapping("/")
	public RoleVo update(@RequestBody RoleVo roleVo){
		Role role= roleConverter.toItem(roleVo);
	  role=	roleService.update(role);
		return roleConverter.toVo(role);
	}

	@ApiOperation("Finds a list of all roles")
	@GetMapping("/")
	public List<RoleVo> findAll(){
		return roleConverter.toVo(roleService.findAll());
	}
    
	@ApiOperation("Finds a role by id")
	@GetMapping("/id/{id}")
	public RoleVo findById(@PathVariable Long id){
		return  roleConverter.toVo(roleService.findById(id));
	}
	@ApiOperation("Deletes a role by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 roleService.deleteById(id);
	}

	@ApiOperation("Finds a  role by authority")
    @GetMapping("/authority/{authority}")
	public RoleVo findByAuthority(@PathVariable String authority){
		return  roleConverter.toVo(roleService.findByAuthority(authority));
	}
	@ApiOperation("Deletes a  role by authority")
    @DeleteMapping("/authority/{authority}")
	public int deleteByAuthority(@PathVariable String authority){
		return  roleService.deleteByAuthority(authority);
	}
	


    @ApiOperation("Finds a role by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<RoleVo> findByUpdatedByUsername(@PathVariable String username){
		return roleConverter.toVo(roleService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a role by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return roleService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds role by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<RoleVo> findByUpdatedById(@PathVariable Long id){
		return roleConverter.toVo(roleService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes role by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return roleService.deleteByUpdatedById(id);
	}
     	
    @ApiOperation("Finds a role by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<RoleVo> findByCreatedByUsername(@PathVariable String username){
		return roleConverter.toVo(roleService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a role by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return roleService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds role by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<RoleVo> findByCreatedById(@PathVariable Long id){
		return roleConverter.toVo(roleService.findByCreatedById(id));
	}
	@ApiOperation("Deletes role by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return roleService.deleteByCreatedById(id);
	}
     	
   
    @ApiOperation("Search role by a specific criterion")
    @PostMapping("/search")
	public List<RoleVo> findByCriteria(@RequestBody RoleVo roleVo){
       return roleConverter.toVo(roleService.findByCriteria(roleVo));
	}	
	public RoleConverter getRoleConverter(){
		return roleConverter;
	}
 
	public void setRoleConverter(RoleConverter roleConverter){
		this.roleConverter=roleConverter;
	}

	public RoleService getRoleService(){
		return roleService;
	}
	public void setRoleService( RoleService roleService){
	 	this.roleService=roleService;
	}
	

}