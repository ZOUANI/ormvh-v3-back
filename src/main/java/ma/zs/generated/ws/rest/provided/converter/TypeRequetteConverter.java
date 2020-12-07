package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.bean.TypeRequette;
import ma.zs.generated.service.util.NumberUtil;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import ma.zs.generated.ws.rest.provided.vo.TypeRequetteVo;
import org.springframework.stereotype.Component;

@Component
public class TypeRequetteConverter extends AbstractConverter<TypeRequette,TypeRequetteVo>{


	public TypeRequetteConverter(){
		init(true);
	}

	@Override
	public TypeRequette toItem(TypeRequetteVo vo) {
		if (vo == null) {
			return null;
		} else {
			TypeRequette item = new TypeRequette();
			if(StringUtil.isNotEmpty(vo.getLibelle()))
				item.setLibelle(vo.getLibelle());
			if(StringUtil.isNotEmpty(vo.getLibelleArab()))
				item.setLibelleArab(vo.getLibelleArab());
			if(StringUtil.isNotEmpty(vo.getId()))
				item.setId(NumberUtil.toLong(vo.getId()));


			return item;
		}
	}

	@Override
	public TypeRequetteVo toVo(TypeRequette item) {
		if (item == null) {
			return null;
		} else {
			TypeRequetteVo vo = new TypeRequetteVo();

			if(StringUtil.isNotEmpty(item.getLibelle()))
				vo.setLibelle(item.getLibelle());

			if(StringUtil.isNotEmpty(item.getLibelleArab()))
				vo.setLibelleArab(item.getLibelleArab());

			if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));

			return vo;

		}
	}
	public void init(Boolean value) {
	}






}