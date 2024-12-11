package Hibernate1.Hero;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hero {
		private int age;
		private String name;
		@Id
		private long phno;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		
}
