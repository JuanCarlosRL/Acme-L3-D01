
package acme.entities.peep;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Peep extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@Past
	private LocalDateTime		instantiationMoment;

	@NotBlank
	@Length(max = 75)
	private String				title;

	@NotBlank
	@Length(max = 75)
	private String				nick;

	@NotBlank
	@Length(max = 100)
	private String				message;

	@Email
	private String				email;

	@URL
	private String				link;
}
