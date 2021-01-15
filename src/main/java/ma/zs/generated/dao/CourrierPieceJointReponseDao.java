package ma.zs.generated.dao;

import ma.zs.generated.bean.CourrierPieceJointReponse;
import ma.zs.generated.bean.CourrierPieceJointTraite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CourrierPieceJointReponseDao extends JpaRepository<CourrierPieceJointReponse, Long> {
   Optional<CourrierPieceJointReponse> findById(Long id);
   CourrierPieceJointReponse findByCourierId(Long id);
   @Query(value = "SELECT * FROM courrier_piece_joint_reponse u where u.courier = ?1", nativeQuery = true)
   List<CourrierPieceJointReponse> searchByCourierId(Long id);
   void deleteById(Long id);
}