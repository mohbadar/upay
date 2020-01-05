package af.asr.keycloak.core.resource;

import af.asr.keycloak.core.service.ProductCatalogServiceImpl;
import af.asr.keycloak.data.model.ProductCatalog;
import af.asr.keycloak.infrastructure.exceptions.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductCatalogController {

	@Autowired
	private ProductCatalogServiceImpl productCatalogService;

	@GetMapping("/productcatalogs/{id}")
	public ProductCatalog getProductCatalog(@PathVariable String id) throws DoesNotExistException {
		return productCatalogService.getProductCatalog(id);
	}

	@GetMapping("/productcatalogs")
	public List<ProductCatalog> getProductCatalogs() {
		return productCatalogService.getProductCatalogs();
	}

	@PostMapping("/productcatalogs")
	public ProductCatalog createProductCatalog(@Valid @RequestBody ProductCatalog productCatalog) {
		return productCatalogService.createProductCatalog(productCatalog);
	}

	@PutMapping("/productcatalogs/{id}")
	public ProductCatalog updateProductCatalog(@PathVariable String id,
			@Valid @RequestBody ProductCatalog productCatalog) throws DoesNotExistException {
		return productCatalogService.updateProductCatalog(id, productCatalog);
	}

}
