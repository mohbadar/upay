package af.asr.keycloak.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ORDER_ITEM")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String customerId;

	private String product;

	private String productCatalog;

	private LocalDate orderDate;

	private int quantity;

	private BigDecimal unitPrice;

}
