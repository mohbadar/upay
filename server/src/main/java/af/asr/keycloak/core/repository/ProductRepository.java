package af.asr.keycloak.core.repository;

import af.asr.keycloak.data.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

	List<Product> findByProductCatalogId(String productCatalogId);

	@Query("SELECT p FROM Product p WHERE p.productCatalogId = :productCatalogId and p.effectiveDate <= :date and (p.expirationDate is null or p.expirationDate > :date)")
	List<Product> findByProductCatalogIdOnDate(String productCatalogId, LocalDate date);

	@Query("SELECT p FROM Product p WHERE p.effectiveDate <= :date and (p.expirationDate is null or p.expirationDate > :date)")
	List<Product> findAllOnDate(LocalDate date);

}
