package rum.training.core.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rum.training.core.api.dto.HireEmployeeDto;
import rum.training.core.model.Employee;
import rum.training.core.service.EmployeeService;

import java.util.List;

@RestController(value = "api/v1/employee")
@RequiredArgsConstructor
public class EmployeeControllerImpl {

    private final EmployeeService employeeService;

    @GetMapping(value = "/")
    public List<Employee> getList() {
        return employeeService.getList();
    }

    @PostMapping(value = "/post")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping(value = "/hire")
    public void hire(@RequestBody HireEmployeeDto hireEmployeeDto) {
        employeeService.hire(hireEmployeeDto.getEmployee(),
                hireEmployeeDto.getOrganization());
    }

    @PutMapping(value = "/miss")
    public void miss(@RequestBody Employee employee) {
        employeeService.miss(employee);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Long id) {
        employeeService.deleteEmployee(id);
    }
}
