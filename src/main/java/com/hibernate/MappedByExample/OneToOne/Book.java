package com.hibernate.MappedByExample.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
    @GeneratedValue
	private int id;
    private String title;
    private String content;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Author author;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
    
	@Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", content=" + content
                + ", author=" + author.getId() + "]";
    }
    
}
