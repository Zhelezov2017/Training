package rum.training.core.dao;

import rum.training.core.model.Employee;

public interface EmployeeDao {
    Employee createEmployee(Employee employee);

    Employee readEmployee(Long id);

    Employee updateEmployee(Employee employee);

    void delete(Long id);
}
