package ma.zs.generated.service.facade;

import java.util.List;

import ma.zs.generated.bean.CourrierPieceJoint;

public interface CourrierPieceJointService {
   CourrierPieceJoint findById(Long id);

    CourrierPieceJoint save(CourrierPieceJoint courrierPieceJoint);

    CourrierPieceJoint findByCourierId(Long id);

}