package br.edu.usp.pedido.infra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NovaTransacao {

	static Session getSession() {
		Configuration configuration = new Configuration();
		configuration.configure();
	
	    SessionFactory factory = configuration.buildSessionFactory();
	    Session session = factory.openSession();
		return session;
	}

}
