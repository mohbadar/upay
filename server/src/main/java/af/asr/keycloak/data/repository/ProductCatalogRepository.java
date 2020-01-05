package af.asr.keycloak.data.repository;

import af.asr.keycloak.data.model.ProductCatalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCatalogRepository extends CrudRepository<ProductCatalog, String> {

}
