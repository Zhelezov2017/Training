package rum.training.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rum.training.core.model.Organization;
import rum.training.core.model.Position;

@Repository
public interface PositionDao  extends JpaRepository<Position, Long> {

}
