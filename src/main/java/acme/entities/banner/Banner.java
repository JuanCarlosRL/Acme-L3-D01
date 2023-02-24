
package acme.entities.banner;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends AbstractEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Past
	@Column(name = "update_time", unique = false, nullable = false)
	private LocalDateTime		updateTime;

	@Future
	@Column(name = "period_start", unique = false, nullable = false)
	private LocalDateTime		periodStart;

	@Future
	@Column(name = "period_end", unique = false, nullable = false)
	private LocalDateTime		periodEnd;

	@Column(name = "picture", unique = false, nullable = true)
	private String				picture;

	@NotBlank
	@Max(76)
	@Column(name = "slogan", unique = false)
	private String				slogan;

	@Column(name = "web", unique = false, nullable = true)
	private String				web;
}
