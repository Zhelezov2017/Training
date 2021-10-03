package rum.training.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rum.training.core.model.Employee;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
