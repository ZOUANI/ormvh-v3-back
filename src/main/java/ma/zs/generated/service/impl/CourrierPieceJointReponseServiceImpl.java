package ma.zs.generated.service.impl;

import ma.zs.generated.bean.CourrierPieceJointReponse;
import ma.zs.generated.bean.CourrierPieceJointTraite;
import ma.zs.generated.dao.CourrierPieceJointReponseDao;
import ma.zs.generated.dao.CourrierPieceJointTraiteDao;
import ma.zs.generated.service.facade.CourrierPieceJointReponseService;
import ma.zs.generated.service.facade.CourrierPieceJointTraiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourrierPieceJointReponseServiceImpl extends AbstractService<CourrierPieceJointReponse> implements CourrierPieceJointReponseService {
@Autowired
private CourrierPieceJointReponseDao courrierPieceJointReponseDao;
	@Override
	public CourrierPieceJointReponse findById(Long id) {
		return courrierPieceJointReponseDao.findById(id).get();
	}

	@Override
	public CourrierPieceJointReponse save(CourrierPieceJointReponse courrierPieceJointReponse) {
		return courrierPieceJointReponseDao.save(courrierPieceJointReponse);
	}
	@Override
	public CourrierPieceJointReponse findByCourierId(Long id) {
		return courrierPieceJointReponseDao.findByCourierId(id);
	}

	@Override
	public List<CourrierPieceJointReponse> searchByCourierId(Long id) {
		return courrierPieceJointReponseDao.searchByCourierId(id);
	}

	@Override
	public void deleteById(Long id) {
		this.courrierPieceJointReponseDao.deleteById(id);
	}


}