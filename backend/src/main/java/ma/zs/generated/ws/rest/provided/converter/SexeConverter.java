package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Sexe; 
import ma.zs.generated.ws.rest.provided.vo.SexeVo;

@Component 
public class SexeConverter extends AbstractConverter<Sexe,SexeVo>{ 
	

	public  SexeConverter(){
		init(true);
	}

	@Override 
 	public Sexe toItem(SexeVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Sexe item = new Sexe();
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
 	public SexeVo toVo(Sexe item) {
 		if (item == null) {
    		return null;
      	} else {
			SexeVo vo = new SexeVo();

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