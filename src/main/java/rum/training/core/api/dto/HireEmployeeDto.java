package rum.training.core.api.dto;


import lombok.Data;
import rum.training.core.model.Employee;
import rum.training.core.model.Organization;

@Data
public class HireEmployeeDto {
    private Employee employee;
    private Organization organization;
}
