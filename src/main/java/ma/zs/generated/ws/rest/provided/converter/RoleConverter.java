package ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;


import ma.zs.generated.bean.Role;
import ma.zs.generated.ws.rest.provided.vo.RoleVo;

@Component
public class RoleConverter extends AbstractConverter<Role, RoleVo> {

    @Autowired
    private UserConverter userConverter;
    private Boolean updatedBy;
    private Boolean createdBy;

    public RoleConverter() {
        init(true);
    }

    @Override
    public Role toItem(RoleVo vo) {
        if (vo == null) {
            return null;
        } else {
            Role item = new Role();
            if (StringUtil.isNotEmpty(vo.getUpdatedAt()))
                item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
            if (StringUtil.isNotEmpty(vo.getAuthority()))
                item.setAuthority(vo.getAuthority());
            if (StringUtil.isNotEmpty(vo.getCreatedAt()))
                item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
//             if(vo.getUpdatedByVo()!=null && this.updatedBy)
//			     item.setUpdatedBy(userConverter.toItem(vo.getUpdatedByVo())) ;
//             if(vo.getCreatedByVo()!=null && this.createdBy)
//			     item.setCreatedBy(userConverter.toItem(vo.getCreatedByVo())) ;


            return item;
        }
    }

    @Override
    public RoleVo toVo(Role item) {
        if (item == null) {
            return null;
        } else {
            RoleVo vo = new RoleVo();

            if (item.getUpdatedAt() != null)
                vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));
            if (StringUtil.isNotEmpty(item.getAuthority()))
                vo.setAuthority(item.getAuthority());

            if (item.getCreatedAt() != null)
                vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));
            if (item.getUpdatedBy() != null && this.updatedBy) {
                vo.setUpdatedByVo(userConverter.toVo(item.getUpdatedBy()));
            }
            if (item.getCreatedBy() != null && this.createdBy) {
                vo.setCreatedByVo(userConverter.toVo(item.getCreatedBy()));
            }

            return vo;

        }
    }

    public void init(Boolean value) {
        updatedBy = value;
        createdBy = value;
    }


    public UserConverter getUserConverter() {
        return this.userConverter;
    }

    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public boolean isUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(boolean updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(boolean createdBy) {
        this.createdBy = createdBy;
    }
}