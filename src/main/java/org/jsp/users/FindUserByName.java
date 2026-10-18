package org.jsp.users;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindUserByName {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Query<User> q = ses.createQuery("select u from User u where u.name = ?1" , User.class);
		System.out.println("Enter Name of the user : ");
		Scanner sc = new Scanner(System.in);
		q.setParameter(1, sc.nextLine());
		List<User> ul = q.getResultList();
		if(!ul.isEmpty()) {
			ul.forEach(System.out::println);
		}
		else {
			System.err.println("User not found !!!");
		}
		try {}
		finally {
			sc.close();
		}
	}
}
