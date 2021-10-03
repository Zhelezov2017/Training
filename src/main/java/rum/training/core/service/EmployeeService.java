package rum.training.core.service;


import rum.training.core.model.Employee;
import rum.training.core.model.Organization;

import java.util.List;

public interface EmployeeService {
    void hire(Employee employee, Organization organization);
    void miss(Employee employee);

    List<Employee> getList();

    Employee createEmployee(Employee employee);

    void deleteEmployee(Long id);
}
