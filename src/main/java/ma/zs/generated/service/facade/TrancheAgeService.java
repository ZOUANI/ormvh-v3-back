package ma.zs.generated.service.facade;

import ma.zs.generated.bean.Sexe;
import ma.zs.generated.bean.TrancheAge;

import java.util.List;

public interface TrancheAgeService {

    /**

     * find all Tranches d'age in database
     * @return List<TrancheAge> , If database is empty return  null.
     */
    List<TrancheAge> findAll();


}
