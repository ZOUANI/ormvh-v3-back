package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.TypeCourrier;


@Repository
public interface TypeCourrierDao extends JpaRepository<TypeCourrier,Long> {

	TypeCourrier findByLibelle(String libelle);
       int deleteByLibelle(String libelle);


}