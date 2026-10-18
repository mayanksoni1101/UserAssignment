package org.jsp.users;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindUserById {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id : ");
		User u = ses.get(User.class, sc.nextInt());
		if(u!=null) {
			System.out.println(u);
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
