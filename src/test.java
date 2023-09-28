import org.hibernate.*;
import org.hibernate.cfg.*;

import model.Student;


public class Test {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("model/hibernat.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=new Student(104,"ram","Nandanavan");
		
		Transaction t = session.beginTransaction();
		
		session.save(s);

		t.commit();
		session.close();
		
		System.out.println("Data inserted");
		
		
	}

}