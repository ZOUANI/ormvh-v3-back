package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.bean.NatureClient;
import ma.zs.generated.service.util.NumberUtil;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.NatureClientVo;
import org.springframework.stereotype.Component;

@Component 
public class NatureClientConverter extends AbstractConverter<NatureClient,NatureClientVo>{ 
	

	public NatureClientConverter(){
		init(true);
	}

	@Override 
 	public NatureClient toItem(NatureClientVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	NatureClient item = new NatureClient();
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
 	public NatureClientVo toVo(NatureClient item) {
 		if (item == null) {
    		return null;
      	} else {
			NatureClientVo vo = new NatureClientVo();

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