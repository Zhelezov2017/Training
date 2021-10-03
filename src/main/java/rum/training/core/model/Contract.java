package rum.training.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@IdClass(ContractId.class)
@Table(name = "CONTRACT")
public class Contract {
    @Id
    @Column(name = "ORGANIZATION_ID1", nullable = false)
    private Long organizationId1;
    @Id
    @Column(name = "ORGANIZATION_ID2", nullable = false)
    private Long organizationId2;
    @Column(name = "TIMESTAMP")
    private Timestamp timestamp;
}
