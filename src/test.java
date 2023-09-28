import org.hibernate.*;
import org.hibernate.cfg.*;

import model.Student;


public class Test {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=new Student(103,"ram","java");
		
		Transaction tx = session.beginTransaction();
		
		session.save(s);

		tx.commit();
		session.close();
		
		System.out.println("Data inserted");
		
		
	}

}