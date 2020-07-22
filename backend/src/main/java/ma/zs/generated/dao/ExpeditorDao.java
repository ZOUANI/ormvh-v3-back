package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Expeditor;


@Repository
public interface ExpeditorDao extends JpaRepository<Expeditor,Long> {

	Expeditor findByTitle(String title);
       int deleteByTitle(String title);

       List<Expeditor> findBySexeLibelle(String libelle);
       int deleteBySexeLibelle(String libelle);       
       List<Expeditor> findBySexeId(Long id);
       int deleteBySexeId(Long id);
       List<Expeditor> findByNationalityLibelle(String libelle);
       int deleteByNationalityLibelle(String libelle);       
       List<Expeditor> findByNationalityId(Long id);
       int deleteByNationalityId(Long id);
       List<Expeditor> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Expeditor> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Expeditor> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Expeditor> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}