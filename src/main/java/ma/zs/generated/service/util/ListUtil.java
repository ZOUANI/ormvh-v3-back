package ma.zs.generated.service.util;
 
 
 
import java.util.Collection;
import java.util.List;


public class ListUtil {

    public static boolean isEmpty(Collection objects) {
        return objects == null || objects.isEmpty();
    }

    public static boolean isNotEmpty(Collection objects) {
        return !isEmpty(objects);
    }
}
