package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.bean.Role;
import ma.zs.generated.ws.rest.provided.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;


import ma.zs.generated.bean.User;
import ma.zs.generated.ws.rest.provided.vo.UserVo;

import java.util.Collection;
import java.util.List;

@Component
public class UserConverter extends AbstractConverter<User, UserVo> {

    @Autowired
    private RoleConverter roleConverter;

    private Boolean createdBy;
    private Boolean updatedBy;
    private Boolean roles;

    public UserConverter() {
        init(true);
    }

    @Override
    public User toItem(UserVo vo) {
        if (vo == null) {
            return null;
        } else {
            User item = new User();

                item.setCredentialsNonExpired(vo.getCredentialsNonExpired());

                item.setEnabled(vo.getEnabled());
                item.setPasswordChanged(vo.getPasswordChanged());

            if (StringUtil.isNotEmpty(vo.getCreatedAt()))
                item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
            if (StringUtil.isNotEmpty(vo.getUpdatedAt()))
                item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
            if (StringUtil.isNotEmpty(vo.getEmail()))
                item.setEmail(vo.getEmail());

                item.setAccountNonExpired(vo.getAccountNonExpired());

                item.setAccountNonLocked(vo.getAccountNonLocked());

            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getUsername()))
                item.setUsername(vo.getUsername());
            if (StringUtil.isNotEmpty(vo.getPassword()))
                item.setPassword(vo.getPassword());


            if (ListUtil.isNotEmpty(vo.getRolesVo()) && this.roles)
                item.setRoles(roleConverter.toItem((List<RoleVo>) vo.getRolesVo()));


            return item;
        }
    }

    @Override
    public UserVo toVo(User item) {
        if (item == null) {
            return null;
        } else {
            UserVo vo = new UserVo();
            if (item.isPasswordChanged() != null)
                vo.setPasswordChanged(item.isPasswordChanged());

            if (item.isCredentialsNonExpired() != null)
                vo.setCredentialsNonExpired(item.isCredentialsNonExpired());
            if (item.isEnabled() != null)
                vo.setEnabled(item.isEnabled());

            if (item.getCreatedAt() != null)
                vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));
            if (item.getUpdatedAt() != null)
                vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));
            if (StringUtil.isNotEmpty(item.getEmail()))
                vo.setEmail(item.getEmail());

            if (item.isAccountNonExpired() != null)
                vo.setAccountNonExpired(item.isAccountNonExpired());
            if (item.isAccountNonLocked() != null)
                vo.setAccountNonLocked(item.isAccountNonLocked());
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));
            if (StringUtil.isNotEmpty(item.getUsername()))
                vo.setUsername(item.getUsername());

            if (StringUtil.isNotEmpty(item.getPassword()))
                vo.setPassword(item.getPassword());

            if (item.getCreatedBy() != null && this.createdBy) {
                this.setCreatedBy(false);
                this.setUpdatedBy(false);
                vo.setCreatedByVo(toVo(item.getCreatedBy()));
                this.setCreatedBy(true);
                this.setUpdatedBy(true);
            }
            if (item.getUpdatedBy() != null && this.updatedBy) {
                this.setCreatedBy(false);
                this.setUpdatedBy(false);
                vo.setUpdatedByVo(toVo(item.getUpdatedBy()));
                this.setCreatedBy(true);
                this.setUpdatedBy(true);
            }
            if (ListUtil.isNotEmpty(item.getRoles()) && this.roles) {

                roleConverter.init(false);
                vo.setRolesVo(roleConverter.toVo(item.getRoles()));
                roleConverter.init(true);

            }

            return vo;

        }
    }

    public void init(Boolean value) {
        createdBy = value;
        updatedBy = value;
        roles = value;
    }


    public RoleConverter getRoleConverter() {
        return this.roleConverter;
    }

    public void setRoleConverter(RoleConverter roleConverter) {
        this.roleConverter = roleConverter;
    }

    public boolean isCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(boolean createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(boolean updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean isRoles() {
        return this.roles;
    }

    public void setRoles(Boolean roles) {
        this.roles = roles;
    }
}