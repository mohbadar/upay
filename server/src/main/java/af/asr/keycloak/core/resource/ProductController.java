package af.asr.keycloak.core.resource;


import af.asr.keycloak.core.service.ProductServiceImpl;
import af.asr.keycloak.data.model.Product;
import af.asr.keycloak.infrastructure.exceptions.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable String id) throws DoesNotExistException {
		return productService.getProduct(id);
	}

	@GetMapping("/products")
	public List<Product> searchForProducts(@RequestParam("productCatalogId") Optional<String> productCatalogId,
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Optional<LocalDate> date) {
		if (productCatalogId.isPresent() && date.isPresent()) {
			return productService.getEffectiveProductsByProductCatalogOnDate(productCatalogId.get(), date.get());
		}
		if (productCatalogId.isPresent()) {
			return productService.getProductsByProductCatalog(productCatalogId.get());
		}
		if (date.isPresent()) {
			return productService.getEffectiveProductsOnDate(date.get());
		}
		return productService.getProducts();
	}

	@PostMapping("/products")
	public Product createProduct(@RequestParam("productCatalogId") String productCatalogId,
			@Valid @RequestBody Product product) {
		return productService.createProduct(productCatalogId, product);
	}

	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable String id, @Valid @RequestBody Product product)
			throws DoesNotExistException {
		return productService.updateProduct(id, product);
	}

}
