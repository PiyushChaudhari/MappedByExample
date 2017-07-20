# MappedByExample 

Using "mappedBy" attribute of mapping annotations(like @OneToOne, @OneToMany, @ManyToMany) for bi-directional relationship. This attribute allows you to refer the associated entities from both sides. If "X" has association with "Y" then you can get X from Y and Y from X.

# 1) OneToOne

    Book and Author
  
            Author
		id, email, name, phone
		1, author@gmail.com, name, 543653465

		Book
		id, content, title, author_id
		1, re  td e sdf asdfasdfasd f, java, 1

# 2) OneToMany

    Person and Phone
  
            Person
		id, firstName, lastName
		1, Saurabh, Chaudhari

		Phone
		id, network, number, person_id
		1, BSNL, 0987654321, 1
		2, Vodafone, 1234567890, 1
    
# 3) ManyToMany

    Employee and Department
  
            Employee
		id, firstName, lastName
		1, Saurabh, Chaudhari

		Department
		id, name
		1, QA
		2, Software Engineer
    
    
		Employee_Department
		employees_id, departments_id
		1, 1
		1, 2
