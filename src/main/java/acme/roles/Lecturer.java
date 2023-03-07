
package acme.roles;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;

public class Lecturer extends AbstractRole {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			almaMater;

	@NotBlank
	@Length(max = 100)
	protected String			aRésumé;

	@NotBlank
	@Length(max = 100)
	protected String			qualifications;

	@URL
	protected String			link;
}
