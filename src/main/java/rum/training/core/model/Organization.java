package rum.training.core.model;

import lombok.Data;

import java.util.List;

@Data
public class Organization {
    private Long id;
    private String name;
    private List<Employee> employees;
}
