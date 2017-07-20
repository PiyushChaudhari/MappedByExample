package com.hibernate.MappedByExample.OneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.MappedByExample.utils.HibernateUtils;

public class RunOneToMany {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		com.hibernate.MappedByExample.OneToMany.Person person = new com.hibernate.MappedByExample.OneToMany.Person();
		person.setFirstName("Saurabh");
		person.setLastName("Chaudhari");

		
		com.hibernate.MappedByExample.OneToMany.Phone phone1 = new com.hibernate.MappedByExample.OneToMany.Phone();
		phone1.setNetwork("Vodafone");
		phone1.setNumber("1234567890");

		com.hibernate.MappedByExample.OneToMany.Phone phone2 = new com.hibernate.MappedByExample.OneToMany.Phone();
		phone2.setNetwork("BSNL");
		phone2.setNumber("0987654321");

		person.addPhone(phone1);
		person.addPhone(phone2);
		
		session.save(person);

		transaction.commit();
		session.close();
		
		// Output
		/*
		person
		# id, firstName, lastName
		1, Saurabh, Chaudhari


		book
		# id, network, number, person_id
		1, BSNL, 0987654321, 1
		2, Vodafone, 1234567890, 1

		*/

	}

}
