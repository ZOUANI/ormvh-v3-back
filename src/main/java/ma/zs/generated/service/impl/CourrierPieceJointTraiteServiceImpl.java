package ma.zs.generated.service.impl;

import ma.zs.generated.bean.CourrierPieceJointTraite;
import ma.zs.generated.dao.CourrierPieceJointTraiteDao;
import ma.zs.generated.service.facade.CourrierPieceJointTraiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourrierPieceJointTraiteServiceImpl extends AbstractService<CourrierPieceJointTraite> implements CourrierPieceJointTraiteService {
@Autowired
private CourrierPieceJointTraiteDao courrierPieceJointTraiteDao;
	@Override
	public CourrierPieceJointTraite findById(Long id) {
		return courrierPieceJointTraiteDao.findById(id).get();
	}

	@Override
	public CourrierPieceJointTraite save(CourrierPieceJointTraite courrierPieceJoint) {
		return courrierPieceJointTraiteDao.save(courrierPieceJoint);
	}
	@Override
	public CourrierPieceJointTraite findByCourierId(Long id) {
		return courrierPieceJointTraiteDao.findByCourierId(id);
	}

	@Override
	public List<CourrierPieceJointTraite> searchByCourierId(Long id) {
		return courrierPieceJointTraiteDao.searchByCourierId(id);
	}

	@Override
	public void deleteById(Long id) {
		this.courrierPieceJointTraiteDao.deleteById(id);
	}


}