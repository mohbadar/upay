package af.asr.keycloak.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductCatalog extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(nullable = true)
	private String name;

	@Column(length = 4000, nullable = true)
	private String description;

	
}
