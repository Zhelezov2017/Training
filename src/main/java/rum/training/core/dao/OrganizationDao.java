package rum.training.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rum.training.core.model.Organization;

@Repository
public interface OrganizationDao extends JpaRepository<Organization, Long> {

}
