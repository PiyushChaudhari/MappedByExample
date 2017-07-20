package com.hibernate.MappedByExample.ManayToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.MappedByExample.utils.HibernateUtils;

public class RunManyToMany {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		com.hibernate.MappedByExample.ManayToMany.Employee employee = new com.hibernate.MappedByExample.ManayToMany.Employee();
		employee.setFirstName("Saurabh");
		employee.setLastName("Chaudhari");

		com.hibernate.MappedByExample.ManayToMany.Department se = new com.hibernate.MappedByExample.ManayToMany.Department();
		se.setName("Software Engineer");

		com.hibernate.MappedByExample.ManayToMany.Department qa = new com.hibernate.MappedByExample.ManayToMany.Department();;
		qa.setName("QA");
		
		employee.addDepartment(se);
		employee.addDepartment(qa);
		session.save(employee);

		transaction.commit();
		session.close();
		
		
		// Output
		/*
		Employee
		# id, firstName, lastName
		1, Saurabh, Chaudhari



		Department
		# id, name
		1, QA
		2, Software Engineer
		
		Employee_Department
		# employees_id, departments_id
		1, 1
		1, 2

		*/
	}

}
