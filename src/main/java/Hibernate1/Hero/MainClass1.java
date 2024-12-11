package Hibernate1.Hero;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass1 {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
//		Hero d=new Hero();
//		d.setAge(18);
//		d.setName("nammu");
//		d.setPhno(8553639816l);
//		
//		t.begin();
//		m.persist(d);
//		t.commit();
//		
		Hero h=m.find(Hero.class, 8951020988l);
		System.out.println(h.getAge()+" "+h.getName()+" "+h.getPhno());
	}

}
