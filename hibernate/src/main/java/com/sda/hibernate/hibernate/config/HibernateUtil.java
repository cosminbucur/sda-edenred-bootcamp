package com.sda.hibernate.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.sda.hibernate.associations.one_to_one.Car;
import com.sda.hibernate.associations.one_to_one.Parking;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private static SessionFactory buildSessionFactory() {
		// load up the configuration using the hibernate.cfg.xml
		Configuration configuration = createConfig();

		// build the registry using the properties in the configuration
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		// build the session factory from the service registry
		return configuration.buildSessionFactory(serviceRegistry);
	}

	private static Configuration createConfig() {
		Configuration configuration = new Configuration();

		// hibernate settings equivalent to hibernate.cfg.xml's properties
		Properties settings = new Properties();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_tutorial?serverTimezone=UTC");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "password");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		settings.put(Environment.SHOW_SQL, "true");
		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		settings.put(Environment.HBM2DDL_AUTO, "create-drop");
		configuration.setProperties(settings);

		// add annotated classes

		// crud
//        configuration.addAnnotatedClass(Person.class);

		// hibernate types
//        configuration.addAnnotatedClass(Player.class);

		// one to one
		configuration.addAnnotatedClass(Parking.class);
		configuration.addAnnotatedClass(Car.class);

		// one to one join
//        configuration.addAnnotatedClass(Account.class);
//        configuration.addAnnotatedClass(Employee.class);
//
//        // one to many unidirectional
//        configuration.addAnnotatedClass(Daughter.class);
//        configuration.addAnnotatedClass(Mother.class);
//
//        // one to many unidirectional join
//        configuration.addAnnotatedClass(Father.class);
//        configuration.addAnnotatedClass(Son.class);
//
//        // one to many bidirectional
//        configuration.addAnnotatedClass(Parent.class);
//        configuration.addAnnotatedClass(Child.class);
//
//        // many to many
//        configuration.addAnnotatedClass(Post.class);
//        configuration.addAnnotatedClass(Tag.class);
//
//        // hql
//        configuration.addAnnotatedClass(Stock.class);
//        configuration.addAnnotatedClass(Trader.class);
//
//        configuration.addAnnotatedClass(Author.class);
//        configuration.addAnnotatedClass(Book.class);
//
//        // listeners
//        configuration.addAnnotatedClass(Customer.class);
//        configuration.addAnnotatedClass(CustomerHistory.class);

		return configuration;
	}
}
