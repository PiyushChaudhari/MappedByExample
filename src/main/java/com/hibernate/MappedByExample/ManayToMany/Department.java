package com.hibernate.MappedByExample.ManayToMany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department implements Serializable {

	private static final long serialVersionUID = 453293181804267376L;
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@ManyToMany(mappedBy = "departments")
	private Set<Employee> employees = new HashSet<Employee>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

}
