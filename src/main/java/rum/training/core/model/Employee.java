package rum.training.core.model;


import lombok.Data;

import java.util.List;

@Data
public class Employee {
    private Long id;
    private String name;
    private Position position;
    private Organization organization;
    private List<Skill> skills;
}
