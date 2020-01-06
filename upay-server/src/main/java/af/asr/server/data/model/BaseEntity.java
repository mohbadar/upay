package af.asr.server.data.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique = true, nullable = false)
	private String id;

	@PrePersist
	public void prePersist() {
		if (this.id == null) {
			this.id = UUID.randomUUID().toString();
		}
	}


}
