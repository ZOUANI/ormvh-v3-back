package ma.zs.generated.service.impl;

import ma.zs.generated.bean.TrancheAge;
import ma.zs.generated.dao.TrancheAgeDao;
import ma.zs.generated.service.facade.TrancheAgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrancheAgeServiceImpl implements TrancheAgeService {

    @Autowired
    TrancheAgeDao trancheAgeDao;

    @Override
    public List<TrancheAge> findAll() {
        return trancheAgeDao.findAll();
    }
}
