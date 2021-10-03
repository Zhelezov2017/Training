package rum.training.core.model;

import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "ORGANIZATION")
public class Organization {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Enumerated(EnumType.STRING)
    private TypeOrganization typeOrganization;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
    @Fetch(FetchMode.SUBSELECT)
    @BatchSize(size = 10)
    private Set<Employee> employees = new HashSet<>();
    @Version
    @Column(name = "VERSION", nullable = false)
    private int version;

    @Override
    public int hashCode() {
        return 5;
    }
}
