package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Voie;


@Repository
public interface VoieDao extends JpaRepository<Voie,Long> {

	Voie findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<Voie> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Voie> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Voie> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Voie> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);

}