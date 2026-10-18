package org.jsp.users;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllUsers {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Query<User> q = ses.createQuery("select u from User u" , User.class);
		List<User> ul = q.getResultList();
		if(!ul.isEmpty()) {
			ul.forEach(System.out::println);
		}
		else {
			System.err.println("No Record Found");
		}
	}
}
