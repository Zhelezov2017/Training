package rum.training.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rum.training.core.model.Salary;

@Repository
public interface SalaryDao extends JpaRepository<Salary, Long> {
}
