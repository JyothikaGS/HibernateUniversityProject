package anudip.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
        Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
        
        SessionFactory factory=md.getSessionFactoryBuilder().build();  
        
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        University un=new University();
        un.setUniname("VEMU");
        un.setUniid("4M");
        
        Course c=new Course();
        c.setCrname("CSE");
        c.setCrid(5);
        
        Course c1=new Course();
        c1.setCrname("Mech");
        c1.setCrid(3);
        
        Course c2=new Course();
        c2.setCrname("Civil");
        c2.setCrid(2);
        
        session.save(un);
		t.commit();
		   
		session.close();
		factory.close(); 

	}

}
