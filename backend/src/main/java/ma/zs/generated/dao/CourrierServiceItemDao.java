package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.CourrierServiceItem;


@Repository
public interface CourrierServiceItemDao extends JpaRepository<CourrierServiceItem,Long> {


       List<CourrierServiceItem> findByCourrierIdCourrier(String idCourrier);
       int deleteByCourrierIdCourrier(String idCourrier);       
       List<CourrierServiceItem> findByCourrierId(Long id);
       int deleteByCourrierId(Long id);
       List<CourrierServiceItem> findByServiceTitle(String title);
       int deleteByServiceTitle(String title);       
       List<CourrierServiceItem> findByServiceId(Long id);
       int deleteByServiceId(Long id);

}