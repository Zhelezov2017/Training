package rum.training.core.service;

import org.springframework.stereotype.Service;
import rum.training.core.model.Employee;
import rum.training.core.model.Organization;

public interface EmployeeService {
    void hire(Employee employee, Organization organization);
    void miss(Employee employee);
}
