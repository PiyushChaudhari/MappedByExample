package com.hibernate.MappedByExample.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue
	private Long id;

	private String number;

	private String network;

	@ManyToOne
	private com.hibernate.MappedByExample.OneToMany.Person person;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public com.hibernate.MappedByExample.OneToMany.Person getPerson() {
		return person;
	}

	public void setPerson(com.hibernate.MappedByExample.OneToMany.Person person) {
		this.person = person;
	}
}
