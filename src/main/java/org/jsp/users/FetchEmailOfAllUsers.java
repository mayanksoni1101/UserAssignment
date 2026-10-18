package org.jsp.users;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchEmailOfAllUsers {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Query<String> q = ses.createQuery("select u.email from User u" , String.class);
		List<String> ul = q.getResultList();
		if(ul.isEmpty()) {
			ul.forEach(System.out::println);
		}
		else {
			System.err.println("User not found....");
		}
	}
}
