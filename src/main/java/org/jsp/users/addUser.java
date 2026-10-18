package org.jsp.users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class addUser {
	public static void main(String[] args) {
		Configuration conf  = new Configuration();
		conf.configure();
		System.out.println("file loaded");
		SessionFactory sef = conf.buildSessionFactory();
		Session session = sef.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		
        User u1 = new User();
        u1.setName("Aarav Sharma");
        u1.setPhone(9876543210L);
        u1.setEmail("aarav.sharma@example.com");
        u1.setPassword("Aarav@123");
        session.save(u1);

    
        User u2 = new User();
        u2.setName("Priya Patel");
        u2.setPhone(9876543211L);
        u2.setEmail("priya.patel@example.com");
        u2.setPassword("Priya#2024");
        session.save(u2);


        User u3 = new User();
        u3.setName("Rohan Verma");
        u3.setPhone(9876543212L);
        u3.setEmail("rohan.verma@example.com");
        u3.setPassword("RohanPass99");
        session.save(u3);

      
        User u4 = new User();
        u4.setName("Ananya Iyer");
        u4.setPhone(9876543213L);
        u4.setEmail("ananya.iyer@example.com");
        u4.setPassword("Ananya!456");
        session.save(u4);

        
        User u5 = new User();
        u5.setName("Vikram Singh");
        u5.setPhone(9876543214L);
        u5.setEmail("vikram.singh@example.com");
        u5.setPassword("VikramSecure1");
        session.save(u5);

    
        User u6 = new User();
        u6.setName("Sneha Reddy");
        u6.setPhone(9876543215L);
        u6.setEmail("sneha.reddy@example.com");
        u6.setPassword("SnehaR#789");
        session.save(u6);

        
        User u7 = new User();
        u7.setName("Aditya Kulkarni");
        u7.setPhone(9876543216L);
        u7.setEmail("aditya.kulkarni@example.com");
        u7.setPassword("AdityaK@321");
        session.save(u7);

        
        User u8 = new User();
        u8.setName("Kavya Nair");
        u8.setPhone(9876543217L);
        u8.setEmail("kavya.nair@example.com");
        u8.setPassword("KavyaPass!0");
        session.save(u8);

       
        User u9 = new User();
        u9.setName("Siddharth Rao");
        u9.setPhone(9876543218L);
        u9.setEmail("siddharth.rao@example.com");
        u9.setPassword("SidRao#2026");
        session.save(u9);

       
        User u10 = new User();
        u10.setName("Meera Joshi");
        u10.setPhone(9876543219L);
        u10.setEmail("meera.joshi@example.com");
        u10.setPassword("MeeraJ@999");
        session.save(u10);

        tran.commit();
	}
}
