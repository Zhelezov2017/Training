package rum.training.core.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "SALARY")
public class Salary {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "SAL_LONG")
    private Long salLong;
    @Column(name = "BONUS")
    private Long bonus;
}
