package af.asr.keycloak.core.resource;

import af.asr.keycloak.core.service.CustomerServiceImpl;
import af.asr.keycloak.data.model.CustomerInfo;
import af.asr.keycloak.infrastructure.exceptions.DoesNotExistException;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;

	@GetMapping("customers")
	public List<CustomerInfo> searchForCustomers(@RequestParam("username") Optional<String> username,
												 KeycloakPrincipal<KeycloakSecurityContext> principal) throws DoesNotExistException {
		if (username.isPresent()) {
			return customerService.getCustomerByUsername(username.get(), principal);
		}

		return customerService.getCustomers(principal);
	}

}
