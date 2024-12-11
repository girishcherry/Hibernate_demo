package Hibernate1.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Student s1=new Student();
		s1.setsName("cherry");
		s1.setsPercentage(93.33);
		
		t.begin();
		m.persist(s1);
		t.commit();
		
		Student s=m.find(Student.class,1 );
		System.out.println(s.getsId()+" "+s.getsName()+" "+s.getsPercentage()+" "+s.getEdate());
	
		Student s1=m.find(Student.class,2);
		s1.setsName("nammu");
		
		t.begin();
		m.merge(s1);
		t.commit();
		System.out.println(s1.getsId()+" "+s1.getsName()+" "+s1.getsPercentage()+" "+s1.getEdate());
		
//		Student s=m.find(Student.class, 11);
//		t.begin();
//		m.remove(s);
//		t.commit();
	}

}
