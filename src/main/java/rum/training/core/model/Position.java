package rum.training.core.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "POSITION")
public class Position {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SKILL_ID", referencedColumnName = "id")
    private Skill skill;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SALARY_ID", referencedColumnName = "id")
    private Salary salary;
}
