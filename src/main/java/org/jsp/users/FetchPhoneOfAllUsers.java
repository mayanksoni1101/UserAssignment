package org.jsp.users;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchPhoneOfAllUsers {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Query<Long> q = ses.createQuery("select u.phone from User u" , Long.class);
		List<Long> ul = q.getResultList();
		if(!ul.isEmpty()) {
			ul.forEach(System.out::println);
		}
		else {
			System.err.println("User not found");
		}
	}
}
