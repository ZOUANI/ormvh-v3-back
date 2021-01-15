package ma.zs.generated.service.facade;

import ma.zs.generated.bean.CourrierPieceJointReponse;
import ma.zs.generated.bean.CourrierPieceJointTraite;

import java.util.List;

public interface CourrierPieceJointReponseService {
	   CourrierPieceJointReponse findById(Long id);

	CourrierPieceJointReponse save(CourrierPieceJointReponse courrierPieceJointReponse);

	CourrierPieceJointReponse findByCourierId(Long id);

	    List<CourrierPieceJointReponse> searchByCourierId(Long id);

	    void deleteById(Long id);
}