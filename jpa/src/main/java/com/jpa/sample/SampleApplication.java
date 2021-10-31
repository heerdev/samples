package com.jpa.sample;


import com.jpa.sample.entities.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {
	public static final Logger log =  LoggerFactory.getLogger(SampleApplication.class);
	@Autowired
	SessionFactory sessionFactory;

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//SessionFactory sessionFactory = HIbernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Author author = session.get(Author.class,1l);
		System.out.println(author);
		txn.commit();

		session.close();
	}
}
