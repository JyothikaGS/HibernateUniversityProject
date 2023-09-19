package anudip.org;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class University {
	@Id
	private String uniname;
	
	private int uniid;
	@ManyToMany(targetEntity=University.class,cascade=CascadeType.ALL)
	@JoinTable(name="University",
	joinColumns = { @JoinColumn(name="uniId")},
	inverseJoinColumns = { @JoinColumn(name="crId")})

	public String getUniname() {
		return uniname;
	}

	public void setUniname(String uniname) {
		this.uniname = uniname;
	}

	public int getUniid() {
		return uniid;
	}

	public void setUniid(int uniid) {
		this.uniid = uniid;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setUniid(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
