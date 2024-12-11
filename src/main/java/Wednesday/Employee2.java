package Wednesday;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Employee2 {
	@Id
	@GeneratedValue
	private int eId;
	@Column(nullable=false)
	private String eName;
	@Column(unique=true)
	private double eSalary;
	@CreationTimestamp
	private Date objectCreationTime;
	@Lob
	private byte[] image;
	private int age;
	@UpdateTimestamp
	private Date objectUpdationTime;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public Date getObjectCreationTime() {
		return objectCreationTime;
	}
	public void setObjectCreationTime(Date objectCreationTime) {
		this.objectCreationTime = objectCreationTime;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getObjectUpdationTime() {
		return objectUpdationTime;
	}
	public void setObjectUpdationTime(Date objectUpdationTime) {
		this.objectUpdationTime = objectUpdationTime;
	}
	
}
