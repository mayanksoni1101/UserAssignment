package org.jsp.users;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindUserByEmail {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Query<User> q  = ses.createQuery("select u from User u where email = ?1" , User.class);
		System.out.println("Enter Email of User : ");
		Scanner sc = new Scanner(System.in);
		q.setParameter(1, sc.next());
		try {
				User u = q.getSingleResult();
				System.out.println(u);
		}
		catch(NoResultException e) {
			System.err.println("User not found !!!!");
		}
		finally {
			sc.close();
		}
		
	}
}
