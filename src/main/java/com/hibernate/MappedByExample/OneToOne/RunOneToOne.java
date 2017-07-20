package com.hibernate.MappedByExample.OneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.MappedByExample.utils.HibernateUtils;

public class RunOneToOne {

	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Author author = new Author();
		author.setEmail("author@gmail.com");
		author.setName("name");
		author.setPhone(543653465L);

		Book book1 = new Book();
		book1.setAuthor(author);
		book1.setContent("re  td e sdf asdfasdfasd f");
		book1.setTitle("java");

		session.save(book1);

		transaction.commit();
		session.close();
		
		// Output
		/*
		author
		# id, email, name, phone
		1, author@gmail.com, name, 543653465

		book
		# id, content, title, author_id
		1, re  td e sdf asdfasdfasd f, java, 1
		*/
	}

}
