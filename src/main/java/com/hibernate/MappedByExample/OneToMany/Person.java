package com.hibernate.MappedByExample.OneToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;
	private String lastName;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<com.hibernate.MappedByExample.OneToMany.Phone> phones = new HashSet<com.hibernate.MappedByExample.OneToMany.Phone>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public void addPhone(com.hibernate.MappedByExample.OneToMany.Phone phone) {
		phones.add(phone);
		phone.setPerson(this);
	}

	public void removePhone(com.hibernate.MappedByExample.OneToMany.Phone phone) {
		phones.remove(phone);
		phone.setPerson(null);
	}
}
