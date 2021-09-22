package rum.training.core.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "POSITION")
public class Position {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @OneToOne
    @Column(name = "SKILL_ID")
    private Skill skill;
    @OneToOne
    @Column(name = "SALARY_ID")
    private Salary salary;
}
