package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Nationality;


@Repository
public interface NationalityDao extends JpaRepository<Nationality,Long> {

	Nationality findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<Nationality> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Nationality> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);
       List<Nationality> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Nationality> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);

}