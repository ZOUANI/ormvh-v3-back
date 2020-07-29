package ma.zs.generated.ws.rest.provided.facade;

import java.util.List;

import ma.zs.generated.bean.Role;
import ma.zs.generated.ws.rest.provided.vo.RoleVo;
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
import ma.zs.generated.bean.User;
import ma.zs.generated.service.facade.UserService;
import ma.zs.generated.ws.rest.provided.converter.UserConverter;
import ma.zs.generated.ws.rest.provided.vo.UserVo;

@Api("Manages user services")
@RestController
@RequestMapping("generated/user")
public class UserRest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    @ApiOperation("creates the specified user")
    @PostMapping("/")
    public UserVo create(@RequestBody UserVo userVo) {

        User user = userConverter.toItem(userVo);
        user = userService.create(user);
        return userConverter.toVo(user);
    }

    @ApiOperation("Delete the specified user")
    @DeleteMapping("/")
    public int delete(@RequestBody UserVo userVo) {
        User user = userConverter.toItem(userVo);
        return userService.delete(user);
    }

    @ApiOperation("Updates the specified user")
    @PutMapping("/")
    public UserVo update(@RequestBody UserVo userVo) {
        User user = userConverter.toItem(userVo);
        user = userService.update(user);
        return userConverter.toVo(user);
    }

    @ApiOperation("Finds a list of all users")
    @GetMapping("/")
    public List<UserVo> findAll() {
        return userConverter.toVo(userService.findAll());
    }

    @ApiOperation("Finds a user by id")
    @GetMapping("/id/{id}")
    public UserVo findById(@PathVariable Long id) {
        return userConverter.toVo(userService.findById(id));
    }

    @ApiOperation("Deletes a user by id")
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @ApiOperation("Finds a  user by username")
    @GetMapping("/username/{username}")
    public UserVo findByUsername(@PathVariable String username) {
        return userConverter.toVo(userService.findByUsername(username));
    }

    @ApiOperation("Deletes a  user by username")
    @DeleteMapping("/username/{username}")
    public int deleteByUsername(@PathVariable String username) {
        return userService.deleteByUsername(username);
    }


    @ApiOperation("Finds a user by username of createdBy")
    @GetMapping("/createdBy/username/{username}")
    public List<UserVo> findByCreatedByUsername(@PathVariable String username) {
        return userConverter.toVo(userService.findByCreatedByUsername(username));
    }

    @ApiOperation("Deletes a user by username of createdBy")
    @DeleteMapping("/createdBy/username/{username}")
    public int deleteByCreatedByUsername(@PathVariable String username) {
        return userService.deleteByCreatedByUsername(username);
    }

    @ApiOperation("Finds user by id of createdBy")
    @GetMapping("/createdBy/id/{id}")
    public List<UserVo> findByCreatedById(@PathVariable Long id) {
        return userConverter.toVo(userService.findByCreatedById(id));
    }

    @ApiOperation("Deletes user by id of createdBy")
    @DeleteMapping("/createdBy/id/{id}")
    public int deleteByCreatedById(@PathVariable Long id) {
        return userService.deleteByCreatedById(id);
    }

    @ApiOperation("Finds a user by username of updatedBy")
    @GetMapping("/updatedBy/username/{username}")
    public List<UserVo> findByUpdatedByUsername(@PathVariable String username) {
        return userConverter.toVo(userService.findByUpdatedByUsername(username));
    }

    @ApiOperation("Deletes a user by username of updatedBy")
    @DeleteMapping("/updatedBy/username/{username}")
    public int deleteByUpdatedByUsername(@PathVariable String username) {
        return userService.deleteByUpdatedByUsername(username);
    }

    @ApiOperation("Finds user by id of updatedBy")
    @GetMapping("/updatedBy/id/{id}")
    public List<UserVo> findByUpdatedById(@PathVariable Long id) {
        return userConverter.toVo(userService.findByUpdatedById(id));
    }

    @ApiOperation("Deletes user by id of updatedBy")
    @DeleteMapping("/updatedBy/id/{id}")
    public int deleteByUpdatedById(@PathVariable Long id) {
        return userService.deleteByUpdatedById(id);
    }


    @ApiOperation("Search user by a specific criterion")
    @PostMapping("/search")
    public List<UserVo> findByCriteria(@RequestBody UserVo userVo) {
        return userConverter.toVo(userService.findByCriteria(userVo));
    }



    public UserConverter getUserConverter() {
        return userConverter;
    }

    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}