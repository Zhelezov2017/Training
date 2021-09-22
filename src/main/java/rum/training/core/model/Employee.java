package rum.training.core.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @OneToOne
    @Column(name = "POSITION_ID")
    private Position position;
    @ManyToOne
    @Column(name = "ORGANIZATION_ID")
    private Organization organization;
    @ManyToMany
    @JoinTable(name = "EMPLOYEE_SKILL_MAPPING",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "SKILL_ID", referencedColumnName = "ID")})
    @MapKeyJoinColumn(name = "EMPLOYEE_D")
    private List<Skill> skills;
}
