package quiz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
			Configuration con= new Configuration();
			con.configure().addAnnotatedClass(person.class);
			con.configure().addAnnotatedClass(car.class);
			SessionFactory sf=con.buildSessionFactory();
			Session s=sf.openSession();
			Transaction trans= s.beginTransaction();
			
			person p=new person();
			p.setName("Faiez");
			p.setSurname("Malik");
			p.setPersonID(1);
			
			car c1=new car();
			c1.setCarID(1002);
			c1.setLicensePlate(1002);
			c1.setMake("Toyota");
			c1.setModel(2020);
			
			car c2=new car();
			c2.setCarID(051);
			c2.setLicensePlate(051);
			c2.setMake("Honda");
			c2.setModel(2001);
			
			s.save(p);
			s.save(c1);
			s.save(c2);
			trans.commit();
			
			
	}

}
