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
 * Nhomchucnang generated by hbm2java
 */
@Entity
@Table(name = "nhomchucnang", catalog = "luanvan")
public class Nhomchucnang implements java.io.Serializable {

	private Integer nhomid;
	private String tennhom;
	private Set chucnangs = new HashSet(0);

	public Nhomchucnang() {
	}

	public Nhomchucnang(String tennhom) {
		this.tennhom = tennhom;
	}

	public Nhomchucnang(String tennhom, Set chucnangs) {
		this.tennhom = tennhom;
		this.chucnangs = chucnangs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "NHOMID", unique = true, nullable = false)
	public Integer getNhomid() {
		return this.nhomid;
	}

	public void setNhomid(Integer nhomid) {
		this.nhomid = nhomid;
	}

	@Column(name = "TENNHOM", nullable = false)
	public String getTennhom() {
		return this.tennhom;
	}

	public void setTennhom(String tennhom) {
		this.tennhom = tennhom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhomchucnang")
	public Set getChucnangs() {
		return this.chucnangs;
	}

	public void setChucnangs(Set chucnangs) {
		this.chucnangs = chucnangs;
	}

}
