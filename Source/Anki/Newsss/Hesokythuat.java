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
 * Hesokythuat generated by hbm2java
 */
@Entity
@Table(name = "hesokythuat", catalog = "luanvan")
public class Hesokythuat implements java.io.Serializable {

	private Integer hesokythuatid;
	private String tenheso;
	private int trongso;
	private Set xephangkythuats = new HashSet(0);

	public Hesokythuat() {
	}

	public Hesokythuat(String tenheso, int trongso) {
		this.tenheso = tenheso;
		this.trongso = trongso;
	}

	public Hesokythuat(String tenheso, int trongso, Set xephangkythuats) {
		this.tenheso = tenheso;
		this.trongso = trongso;
		this.xephangkythuats = xephangkythuats;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HESOKYTHUATID", unique = true, nullable = false)
	public Integer getHesokythuatid() {
		return this.hesokythuatid;
	}

	public void setHesokythuatid(Integer hesokythuatid) {
		this.hesokythuatid = hesokythuatid;
	}

	@Column(name = "TENHESO", nullable = false)
	public String getTenheso() {
		return this.tenheso;
	}

	public void setTenheso(String tenheso) {
		this.tenheso = tenheso;
	}

	@Column(name = "TRONGSO", nullable = false)
	public int getTrongso() {
		return this.trongso;
	}

	public void setTrongso(int trongso) {
		this.trongso = trongso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hesokythuat")
	public Set getXephangkythuats() {
		return this.xephangkythuats;
	}

	public void setXephangkythuats(Set xephangkythuats) {
		this.xephangkythuats = xephangkythuats;
	}

}
