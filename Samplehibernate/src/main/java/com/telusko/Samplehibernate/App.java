package com.telusko.Samplehibernate;

import java.util.List;
import java.util.Random;

import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Random r = new Random();
		for (int i = 1; i <= 50; i++) {
			Student s = new Student();
			s.setsId(i);
			s.setsName("Name is:" + i);
			s.setsMarks(r.nextInt(100));
			session.save(s);
		}
		Query q = session.createQuery("from Student where sMarks > 50");
		List<Student> students = q.getResultList();
		for (Student s : students) {
			System.out.println(s);
		}
		/*
		 * Query q1 =
		 * session.createQuery("select sId,sName,sMarks from Student where sId=?"); //
		 * Object[] stud = (Object[])q1.uniqueResult(); // Object[]
		 * student=(Object[])((org.hibernate.query.Query) q).uniqueResult();
		 * 
		 * // System.out.println(stud[0]+":"+stud[1]+" "+stud[2]); Query q3 =
		 * session.createQuery("select sId,sName,sMarks from Student"); List<Object[]>
		 * stude = (List<Object[]>) q.getResultList(); for (Object[] stue : stude) {
		 * System.out.println(stue[0] + ":" + stue[1] + " " + stue[2]); }
		 */
		SQLQuery query=session.createSQLQuery("select *from student where sMarks>60");
		query.addEntity(Student.class);
		List studentsList=query.list();
		for(Object o:studentsList) {
			System.out.println(o);
		}
		tx.commit();
		session.close();
	}
}
