package com.telusko.demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceInitiator;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AlienNames alieanNames = new AlienNames();
		alieanNames.setFname("harika");
		alieanNames.setMname("boga");
		alieanNames.setLname("krishna");
		Alien telusko = new Alien();
		telusko.setaId(30);
		telusko.setaNames(alieanNames);
		telusko.setaColor("green");
		Laptop lap = new Laptop();
		lap.setlId(101);
		lap.setlName("DELL");
		Student sc = new Student();
		sc.setsId(1);
		sc.setsName("Harika");
		sc.setsMarks("89");
		// sc.setLaptop(lap);
		sc.getLaptop().add(lap);
		// lap.setStudent(sc);
		lap.getStudent().add(sc);
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Session session3 = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(telusko);
		session3.save(telusko);
		// for caching First leval caching in same session
		//for second leval cache using different sessions
		telusko = (Alien) session.get(Alien.class, 30);
		System.out.println(telusko);
		session.getTransaction().commit();
		session.close();
		telusko = (Alien) session3.get(Alien.class, 30);
		System.out.println(telusko);
		session3.getTransaction().commit();
		session3.close();

		Configuration con1 = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		ServiceRegistry reg1 = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf1 = con1.buildSessionFactory(reg1);
		Session session1 = sf1.openSession();
		Transaction tx1 = session1.beginTransaction();
		session1.save(sc);
		session1.save(lap);
		tx1.commit();
		session1.close();
		// prints the object// inthe form of hashcode

	}
}
