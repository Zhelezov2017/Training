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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final OrganizationDao organizationDao;

    private final EmployeeDao employeeDao;

    public void hire(Employee employee, Organization organization) {
        List<Employee> employees = organization.getEmployees();
        employees.add(employee);

        organizationDao.save(organization);
    }

    public void miss(Employee employee) {

        employee.setOrganization(null);
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> getList() {
        return employeeDao.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> byId = employeeDao.findById(id);

        byId.ifPresent(employeeDao::delete);
    }
}
