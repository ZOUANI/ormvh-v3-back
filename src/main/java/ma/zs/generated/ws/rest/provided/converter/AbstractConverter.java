package  ma.zs.generated.ws.rest.provided.converter;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public abstract class AbstractConverter<T, VO> {

    public abstract T toItem(VO vo);

    public abstract VO toVo(T item);

    public List<T> toItem(List<VO> vos) {
        if (vos == null || vos.isEmpty()) {
            return null;
        } else {
            List<T> items = new ArrayList();
            for (VO vo : vos) {
                items.add(toItem(vo));
            }
            return items;
        }
    }
    
  

    public List<VO> toVo(List<T> items) {
        if (items == null || items.isEmpty()) {
            return null;
        } else {
            List<VO> vos = new ArrayList();
            for (T item : items) {
                vos.add(toVo(item));
            }
            return vos;
        }
    }
    
    public Set<VO> toVo(Set<T> items) {
        if (items == null || items.isEmpty()) {
            return null;
        } else {
            Set<VO> vos = new HashSet<>();
            for (T item : items) {
                vos.add(toVo(item));
            }
            return vos;
        }
    }
}