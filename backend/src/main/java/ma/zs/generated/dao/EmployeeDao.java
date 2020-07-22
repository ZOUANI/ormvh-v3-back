package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long> {

	Employee findByTitle(String title);
       int deleteByTitle(String title);

       List<Employee> findByUpdatedByUsername(String username);
       int deleteByUpdatedByUsername(String username);       
       List<Employee> findByUpdatedById(Long id);
       int deleteByUpdatedById(Long id);
       List<Employee> findByCreatedByUsername(String username);
       int deleteByCreatedByUsername(String username);       
       List<Employee> findByCreatedById(Long id);
       int deleteByCreatedById(Long id);
       List<Employee> findByUserUsername(String username);
       int deleteByUserUsername(String username);       
       List<Employee> findByUserId(Long id);
       int deleteByUserId(Long id);

}