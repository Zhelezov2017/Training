package rum.training.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rum.training.core.dao.EmployeeDao;
import rum.training.core.dao.OrganizationDao;
import rum.training.core.model.Employee;
import rum.training.core.model.Organization;
import rum.training.core.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    OrganizationDao organizationDao;

    public void hire(Employee employee, Organization organization) {
        List<Employee> employees = organization.getEmployees();
        employees.add(employee);

        organizationDao.save(organization);
    }

    public void miss(Employee employee) {

    }
}
