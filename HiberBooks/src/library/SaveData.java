package library;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData {
	public static void main(String [] args){
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Books b = new Books();
		b.setAuthor("Sandiago");
		b.setId(11);
		b.setTitle("The art of working");
		
		session.save(b);
		session.persist(b);
		t.commit();
		session.close();
		System.out.print("Success");
		
		
	}

}
