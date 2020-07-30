package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.zs.generated.bean.LettreModel;


@Repository
public interface ModelLettreDao extends JpaRepository<LettreModel,Long> {
	public LettreModel findByFileName(String fileName);


}