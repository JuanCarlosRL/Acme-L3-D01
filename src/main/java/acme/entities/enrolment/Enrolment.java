
package acme.entities.enrolment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.entities.course.Course;
import acme.framework.data.AbstractEntity;
import acme.roles.Student;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Enrolment extends AbstractEntity {

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	protected String	code;

	@NotBlank
	@Length(max = 75)
	protected String	motivation;

	@NotBlank
	@Length(max = 100)
	protected String	goals;

	@NotNull
	@Min(0)
	protected Double	workTime;

	// Relationships

	@ManyToOne(optional = false)
	private Course		course;

	@ManyToOne(optional = false)
	private Student		student;

}
