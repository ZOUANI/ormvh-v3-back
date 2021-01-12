package ma.zs.generated.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.persistence.EntityManager;

import ma.zs.generated.helper.mail.service.facade.MailService;
import ma.zs.generated.service.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.CourrierObject;
import ma.zs.generated.bean.CourrierPieceJoint;
import ma.zs.generated.bean.CourrierServiceItem;
import ma.zs.generated.bean.Evaluation;
import ma.zs.generated.bean.Expeditor;
import ma.zs.generated.bean.ExpeditorType;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.bean.NatureCourrier;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.Subdivision;
import ma.zs.generated.bean.Task;
import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.bean.Voie;
import ma.zs.generated.dao.CourrierDao;
import ma.zs.generated.dao.CourrierPieceJointDao;
import ma.zs.generated.helper.mail.service.facade.MailService;
import ma.zs.generated.service.facade.CourrierObjectService;
import ma.zs.generated.service.facade.CourrierPieceJointService;
import ma.zs.generated.service.facade.CourrierService;
import ma.zs.generated.service.facade.CourrierServiceItemService;
import ma.zs.generated.service.facade.EvaluationService;
import ma.zs.generated.service.facade.ExpeditorService;
import ma.zs.generated.service.facade.ExpeditorTypeService;
import ma.zs.generated.service.facade.LeServiceService;
import ma.zs.generated.service.facade.NatureCourrierService;
import ma.zs.generated.service.facade.StatusService;
import ma.zs.generated.service.facade.SubdivisionService;
import ma.zs.generated.service.facade.TaskService;
import ma.zs.generated.service.facade.TypeCourrierService;
import ma.zs.generated.service.facade.VoieService;
import ma.zs.generated.service.util.ListUtil;
import ma.zs.generated.ws.rest.provided.vo.CourrierVo;

@Service
public class CourrierPieceJointServiceImpl extends AbstractService<CourrierPieceJoint> implements CourrierPieceJointService {
@Autowired
private CourrierPieceJointDao courrierPieceJointDao;
	@Override
	public CourrierPieceJoint findById(Long id) {
		return courrierPieceJointDao.findById(id).get();
	}

	@Override
	public CourrierPieceJoint save(CourrierPieceJoint courrierPieceJoint) {
		return courrierPieceJointDao.save(courrierPieceJoint);
	}
	@Override
	public CourrierPieceJoint findByCourierId(Long id) {
		return courrierPieceJointDao.findByCourierId(id);
	}

	@Override
	public List<CourrierPieceJoint> searchByCourierId(Long id) {
		return courrierPieceJointDao.searchByCourierId(id);
	}

	@Override
	public void deleteById(Long id) {
		this.courrierPieceJointDao.deleteById(id);
	}


}