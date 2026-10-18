package org.jsp.users;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyUserByEmailAndPassword {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Query<User> q = ses.createQuery("select u from User u where u.email=?1 and u.password=?2",User.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Email Id : ");
		q.setParameter(1, sc.next());
		System.out.println("Enter password : ");
		q.setParameter(2, sc.next());
		try {
			User u = q.getSingleResult();
			System.out.println(u);
		}
		catch(NoResultException e) {
			System.err.println("User not found !!!");
		}
		finally {
			sc.close();
		}
	}
}
