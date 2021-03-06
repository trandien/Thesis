// default package
// Generated Jan 31, 2015 7:09:10 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "project", catalog = "luanvan")
public class Project implements java.io.Serializable {

	private Integer projectid;
	private Luong luong;
	private User user;
	private int trangthai;
	private Date ngaytao;
	private String tenproject;
	private Set phichucnangs = new HashSet(0);
	private Set xephangnhoms = new HashSet(0);
	private Set chucnangs = new HashSet(0);
	private Set usecases = new HashSet(0);
	private Set xephangkythuats = new HashSet(0);

	public Project() {
	}

	public Project(Luong luong, User user, int trangthai, Date ngaytao,
			String tenproject) {
		this.luong = luong;
		this.user = user;
		this.trangthai = trangthai;
		this.ngaytao = ngaytao;
		this.tenproject = tenproject;
	}

	public Project(Luong luong, User user, int trangthai, Date ngaytao,
			String tenproject, Set phichucnangs, Set xephangnhoms,
			Set chucnangs, Set usecases, Set xephangkythuats) {
		this.luong = luong;
		this.user = user;
		this.trangthai = trangthai;
		this.ngaytao = ngaytao;
		this.tenproject = tenproject;
		this.phichucnangs = phichucnangs;
		this.xephangnhoms = xephangnhoms;
		this.chucnangs = chucnangs;
		this.usecases = usecases;
		this.xephangkythuats = xephangkythuats;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PROJECTID", unique = true, nullable = false)
	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUONGID", nullable = false)
	public Luong getLuong() {
		return this.luong;
	}

	public void setLuong(Luong luong) {
		this.luong = luong;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USERNAME", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "TRANGTHAI", nullable = false)
	public int getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NGAYTAO", nullable = false, length = 10)
	public Date getNgaytao() {
		return this.ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	@Column(name = "TENPROJECT", nullable = false)
	public String getTenproject() {
		return this.tenproject;
	}

	public void setTenproject(String tenproject) {
		this.tenproject = tenproject;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getPhichucnangs() {
		return this.phichucnangs;
	}

	public void setPhichucnangs(Set phichucnangs) {
		this.phichucnangs = phichucnangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getXephangnhoms() {
		return this.xephangnhoms;
	}

	public void setXephangnhoms(Set xephangnhoms) {
		this.xephangnhoms = xephangnhoms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getChucnangs() {
		return this.chucnangs;
	}

	public void setChucnangs(Set chucnangs) {
		this.chucnangs = chucnangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getUsecases() {
		return this.usecases;
	}

	public void setUsecases(Set usecases) {
		this.usecases = usecases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getXephangkythuats() {
		return this.xephangkythuats;
	}

	public void setXephangkythuats(Set xephangkythuats) {
		this.xephangkythuats = xephangkythuats;
	}

}
