package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.bean.EtatCourrier;
import ma.zs.generated.service.util.NumberUtil;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.EtatCourrierVo;
import org.springframework.stereotype.Component;

@Component
public class EtatCourrierConverter extends AbstractConverter<EtatCourrier,EtatCourrierVo>{


	public EtatCourrierConverter(){
		init(true);
	}

	@Override
	public EtatCourrier toItem(EtatCourrierVo vo) {
		if (vo == null) {
			return null;
		} else {
			EtatCourrier item = new EtatCourrier();
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
	public EtatCourrierVo toVo(EtatCourrier item) {
		if (item == null) {
			return null;
		} else {
			EtatCourrierVo vo = new EtatCourrierVo();

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