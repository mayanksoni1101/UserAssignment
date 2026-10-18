package org.jsp.users;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id to update : ");
		User us = ses.get(User.class, sc.nextInt());
		if(us!=null) {
			Transaction tran = ses.getTransaction();
			User u = new User();
			tran.begin();
			u.setId(sc.nextInt());
			u.setName("Mayank Soni");
			u.setEmail("sonim@gmail.com");
			u.setPhone(9485688456l);
			u.setPassword("admin");
			ses.saveOrUpdate(u);
			tran.commit();
		}
		else {
			System.err.println("User not found to update!!!");
		}
		
		try {}
		finally {
			sc.close();
		}
	}
}
