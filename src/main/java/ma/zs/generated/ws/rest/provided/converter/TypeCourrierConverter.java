package ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;


import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.ws.rest.provided.vo.TypeCourrierVo;

@Component
public class TypeCourrierConverter extends AbstractConverter<TypeCourrier, TypeCourrierVo> {


    public TypeCourrierConverter() {
        init(true);
    }

    @Override
    public TypeCourrier toItem(TypeCourrierVo vo) {
        if (vo == null) {
            return null;
        } else {
            TypeCourrier item = new TypeCourrier();
            if (StringUtil.isNotEmpty(vo.getLibelleArab()))
                item.setLibelleArab(vo.getLibelleArab());
            if (StringUtil.isNotEmpty(vo.getCode()))
                item.setCode(vo.getCode());
            if (StringUtil.isNotEmpty(vo.getLibelle()))
                item.setLibelle(vo.getLibelle());
            if (StringUtil.isNotEmpty(vo.getColor()))
                item.setColor(vo.getColor());
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));


            return item;
        }
    }

    @Override
    public TypeCourrierVo toVo(TypeCourrier item) {
        if (item == null) {
            return null;
        } else {
            TypeCourrierVo vo = new TypeCourrierVo();

            if (StringUtil.isNotEmpty(item.getLibelleArab()))
                vo.setLibelleArab(item.getLibelleArab());

            if (StringUtil.isNotEmpty(item.getCode()))
                vo.setCode(item.getCode());

            if (StringUtil.isNotEmpty(item.getLibelle()))
                vo.setLibelle(item.getLibelle());

			if (StringUtil.isNotEmpty(item.getColor()))
				vo.setColor(item.getColor());

			if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            return vo;

        }
    }

    public void init(Boolean value) {
    }


}