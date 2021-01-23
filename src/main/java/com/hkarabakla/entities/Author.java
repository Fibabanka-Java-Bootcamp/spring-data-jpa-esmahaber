package com.hkarabakla.entities;


import java.util.Set;

import javax.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private int id;

    private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "registeredAuthor")
	  private Set<Book> books;

  
}

