package com.help;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory factory;// non static method static ko call nhi ker sakta
	
	public static SessionFactory getFactory() { // method ka object naa banana pare esliye method ko static kiye hai
		if(factory==null) {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
		
	}
	public void closeFcatory() {
		if(factory.isOpen) {
			factory.close();
		}
	}

}