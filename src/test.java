import java.util.Scanner;

import org.hibernate.*;

import org.hibernate.cfg.*;

import model.Student;


public class Test {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("model/hibernat.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Scanner sc=new Scanner(System.in);
		
		boolean exit=false;
		
		while(!exit){
			
			System.out.println("Enter the id :-");
			int id=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the name:-");
			String name=sc.nextLine();
			
			System.out.println("Enter the address:-");
			String address=sc.nextLine();
			
			
			Student s=new Student(id,name,address);
			
			
			 Transaction t = session.beginTransaction();
 			
 			session.save(s);
 			
 			
            System.out.print("Add student? (y/n): ");
            String choice = sc.nextLine().toLowerCase();

            if (!choice.equals("y")) {
                exit = true;
                
                
             
    			t.commit();
    			session.close();
            }
			
		}
		
		
		
		
		
		System.out.println("Data inserted");
		
		
	}

}