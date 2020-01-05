package af.asr.keycloak.core.service;


import af.asr.keycloak.core.repository.ProductCatalogRepository;
import af.asr.keycloak.data.model.ProductCatalog;
import af.asr.keycloak.infrastructure.exceptions.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductCatalogServiceImpl {

	@Autowired
	private ProductCatalogRepository productCatalogRepository;

	public ProductCatalogServiceImpl() {
	}

	public ProductCatalog getProductCatalog(String id) throws DoesNotExistException {
		Optional<ProductCatalog> productCatalog = productCatalogRepository.findById(id);
		if (!productCatalog.isPresent()) {
			throw new DoesNotExistException("Product Catalog");
		}
		return productCatalog.get();
	}

	public List<ProductCatalog> getProductCatalogs() {
		List<ProductCatalog> list = new ArrayList<>();
		productCatalogRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	public ProductCatalog createProductCatalog(ProductCatalog productCatalog) {
		return productCatalogRepository.save(productCatalog);
	}

	public ProductCatalog updateProductCatalog(String id, ProductCatalog productCatalog) throws DoesNotExistException {
		this.getProductCatalog(id);
		productCatalog.setId(id);
		return productCatalogRepository.save(productCatalog);
	}

}
