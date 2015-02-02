// default package
// Generated Jan 31, 2015 7:09:10 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Mucdo generated by hbm2java
 */
@Entity
@Table(name = "mucdo", catalog = "luanvan")
public class Mucdo implements java.io.Serializable {

	private Integer mucdoid;
	private String motamucdo;
	private Set usecases = new HashSet(0);
	private Set chucnangs = new HashSet(0);

	public Mucdo() {
	}

	public Mucdo(String motamucdo) {
		this.motamucdo = motamucdo;
	}

	public Mucdo(String motamucdo, Set usecases, Set chucnangs) {
		this.motamucdo = motamucdo;
		this.usecases = usecases;
		this.chucnangs = chucnangs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MUCDOID", unique = true, nullable = false)
	public Integer getMucdoid() {
		return this.mucdoid;
	}

	public void setMucdoid(Integer mucdoid) {
		this.mucdoid = mucdoid;
	}

	@Column(name = "MOTAMUCDO", nullable = false)
	public String getMotamucdo() {
		return this.motamucdo;
	}

	public void setMotamucdo(String motamucdo) {
		this.motamucdo = motamucdo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mucdo")
	public Set getUsecases() {
		return this.usecases;
	}

	public void setUsecases(Set usecases) {
		this.usecases = usecases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mucdo")
	public Set getChucnangs() {
		return this.chucnangs;
	}

	public void setChucnangs(Set chucnangs) {
		this.chucnangs = chucnangs;
	}

}
