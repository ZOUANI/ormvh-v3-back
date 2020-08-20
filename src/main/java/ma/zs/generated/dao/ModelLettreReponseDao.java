package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.ModelLettreReponse;


@Repository
public interface ModelLettreReponseDao extends JpaRepository<ModelLettreReponse,Long> {

	ModelLettreReponse findByLibelle(String libelle);
       int deleteByLibelle(String libelle);

       List<ModelLettreReponse> findByCategorieModelLettreReponseLibelle(String libelle);
       int deleteByCategorieModelLettreReponseLibelle(String libelle);       
       List<ModelLettreReponse> findByCategorieModelLettreReponseId(Long id);
       int deleteByCategorieModelLettreReponseId(Long id);
       List<ModelLettreReponse> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<ModelLettreReponse> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<ModelLettreReponse> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<ModelLettreReponse> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);
       ModelLettreReponse findByChemin(String chemin);
}