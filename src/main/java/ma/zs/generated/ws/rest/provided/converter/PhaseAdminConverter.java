package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.bean.PhaseAdmin;
import ma.zs.generated.service.util.NumberUtil;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.PhaseAdminVo;
import org.springframework.stereotype.Component;

@Component 
public class PhaseAdminConverter extends AbstractConverter<PhaseAdmin,PhaseAdminVo>{ 
	

	public PhaseAdminConverter(){
		init(true);
	}

	@Override 
 	public PhaseAdmin toItem(PhaseAdminVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	PhaseAdmin item = new PhaseAdmin();
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
 	public PhaseAdminVo toVo(PhaseAdmin item) {
 		if (item == null) {
    		return null;
      	} else {
			PhaseAdminVo vo = new PhaseAdminVo();

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