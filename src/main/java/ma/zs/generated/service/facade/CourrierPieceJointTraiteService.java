package ma.zs.generated.service.facade;

import ma.zs.generated.bean.CourrierPieceJointTraite;

import java.util.List;

public interface CourrierPieceJointTraiteService {
	   CourrierPieceJointTraite findById(Long id);

	CourrierPieceJointTraite save(CourrierPieceJointTraite courrierPieceJointTraite);

	CourrierPieceJointTraite findByCourierId(Long id);

	    List<CourrierPieceJointTraite> searchByCourierId(Long id);

	    void deleteById(Long id);
}