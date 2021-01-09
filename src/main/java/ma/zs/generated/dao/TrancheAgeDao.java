package ma.zs.generated.dao;


import ma.zs.generated.bean.TrancheAge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrancheAgeDao extends JpaRepository<TrancheAge,Long> {
    @Query("SELECT  t FROM  TrancheAge  t order by  t.ageMin ASC ")
    public List<TrancheAge> findAll();

}
