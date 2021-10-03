package rum.training.core.model;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.io.Serializable;


@NoArgsConstructor
@EqualsAndHashCode
public class ContractId implements Serializable {
    private Long organizationId1;
    private Long organizationId2;
}
