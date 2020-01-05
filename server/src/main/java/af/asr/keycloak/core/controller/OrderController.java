package af.asr.keycloak.core.controller;


import af.asr.keycloak.core.service.OrderServiceImpl;
import af.asr.keycloak.data.model.Order;
import af.asr.keycloak.infrastructure.exceptions.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;

	@GetMapping("/orders/{id}")
	public Order getOrder(@PathVariable String id) throws DoesNotExistException {
		return orderService.getOrder(id);
	}

	@GetMapping("/orders")
	public List<Order> searchForOrders(@RequestParam("customerId") Optional<String> customerId) {
		if (customerId.isPresent()) {
			return orderService.getOrdersByCustomer(customerId.get());
		}
		return orderService.getOrders();
	}

	@PostMapping("/orders")
	public Order createOrder(@RequestParam("customerId") String customerId, @Valid @RequestBody Order order) {
		return orderService.createOrder(customerId, order);
	}

	@PutMapping("/orders/{id}")
	public Order updateOrder(@PathVariable String id, @Valid @RequestBody Order order) throws DoesNotExistException {
		return orderService.updateOrder(id, order);
	}

}
