package ma.zs.generated.dao;

import ma.zs.generated.bean.CourrierPieceJointTraite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CourrierPieceJointTraiteDao extends JpaRepository<CourrierPieceJointTraite, Long> {
   Optional<CourrierPieceJointTraite> findById(Long id);
   CourrierPieceJointTraite findByCourierId(Long id);
   @Query(value = "SELECT * FROM courrier_piece_joint_traite u where u.courier = ?1", nativeQuery = true)
   List<CourrierPieceJointTraite> searchByCourierId(Long id);
   void deleteById(Long id);
}