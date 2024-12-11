package Hibernate1.Student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
@Entity
public class Student {
	@Id
	@GeneratedValue
	int sId;
	String sName;
	double sPercentage;
	@CreationTimestamp
	Date edate;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsPercentage() {
		return sPercentage;
	}
	public void setsPercentage(double sPercentage) {
		this.sPercentage = sPercentage;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	

}
