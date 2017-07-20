package com.hibernate.MappedByExample.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionFactory;
	private static Properties properties;

	static {
		properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.setProperty("hibernate.connection.url",
				"jdbc:mysql://localhost:3306/mappedByExampleDB?createDatabaseIfNotExist=true");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		properties.setProperty("hibernate.connection.autoReconnect", "true");

		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");

		properties.setProperty("connection.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");
		properties.setProperty("c3p0.min_size", "5");
		properties.setProperty("c3p0.max_size", "20");
		properties.setProperty("c3p0.timeout", "1800");
		properties.setProperty("c3p0.max_statements", "100");
		properties.setProperty("hibernate.c3p0.testConnectionOnCheckout", "true");
	}

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(com.hibernate.MappedByExample.OneToOne.Book.class);
		configuration.addAnnotatedClass(com.hibernate.MappedByExample.OneToOne.Author.class);
		
		configuration.addAnnotatedClass(com.hibernate.MappedByExample.OneToMany.Person.class);
		configuration.addAnnotatedClass(com.hibernate.MappedByExample.OneToMany.Phone.class);
		
		configuration.addAnnotatedClass(com.hibernate.MappedByExample.ManayToMany.Employee.class);
		configuration.addAnnotatedClass(com.hibernate.MappedByExample.ManayToMany.Department.class);
		
		
		configuration.setProperties(properties);
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}
}
