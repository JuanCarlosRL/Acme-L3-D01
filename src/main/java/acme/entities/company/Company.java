
package acme.entities.company;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Company extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	private String				name;

	@NotBlank
	@Length(max = 25)
	private String				VATNumber;

	@NotBlank
	@Length(max = 100)
	private String				summary;

	@URL
	private String				link;
}
