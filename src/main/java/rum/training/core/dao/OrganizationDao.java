package rum.training.core.dao;

import rum.training.core.model.Organization;

public interface OrganizationDao {
    Organization createOrganization(Organization organization);

    Organization readOrganization(Long id);

    Organization updateOrganization(Organization organization);

    void delete(Long id);
}
