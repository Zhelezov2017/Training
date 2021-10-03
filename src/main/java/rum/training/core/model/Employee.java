package rum.training.core.model;


import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import rum.training.core.annotation.InjectRandomString;

import javax.persistence.*;
import java.util.HashSet;

import java.util.Set;

@Data
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "ID")
    private Long id;
    @InjectRandomString(randomString = {"vlad", "anton", "artem", "andrey"})
    @Column(name = "NAME")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POSITION_ID", referencedColumnName = "id")
    private Position position;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "EMPLOYEE_SKILL",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "SKILL_ID")})
    private Set<Skill> skills = new HashSet<>();

    public Employee() {
    }

    public Employee(Long id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
}
