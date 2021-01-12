package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.CourrierPieceJoint;


@Repository
public interface CourrierPieceJointDao extends JpaRepository<CourrierPieceJoint, Long> {
   Optional<CourrierPieceJoint> findById(Long id);
   CourrierPieceJoint findByCourierId(Long id);
   @Query(value = "SELECT * FROM courrier_piece_joint u where u.courier = ?1", nativeQuery = true)
   List<CourrierPieceJoint> searchByCourierId(Long id);
   void deleteById(Long id);
}