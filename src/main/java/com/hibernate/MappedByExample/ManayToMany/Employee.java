package com.hibernate.MappedByExample.ManayToMany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 3218907743059517513L;

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;
	private String lastName;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Department> departments = new HashSet<Department>();

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

	public Set<Department> getDepartments() {
		return departments;
	}

	public void addDepartment(Department department) {
		if (departments == null)
			departments = new HashSet<Department>();
		departments.add(department);
		department.getEmployees().add(this);
	}

	public void removeDepartment(Department department) {
		departments.remove(department);
		department.getEmployees().remove(this);
	}

}
