package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.CategorieModelLettreReponse;


@Repository
public interface CategorieModelLettreReponseDao extends JpaRepository<CategorieModelLettreReponse,Long> {

	CategorieModelLettreReponse findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<CategorieModelLettreReponse> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<CategorieModelLettreReponse> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);
       List<CategorieModelLettreReponse> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<CategorieModelLettreReponse> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);

}