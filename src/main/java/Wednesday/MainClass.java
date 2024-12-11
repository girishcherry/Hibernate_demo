package Wednesday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee2 employee=new Employee2();
		employee.setAge(20);
		employee.seteName("cherry");
		employee.seteSalary(44.55);
		
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\10th cerficate.jpg");
		byte[] arr=new byte[fileInputStream.available()];
		fileInputStream.read(arr);
		employee.setImage(arr);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
