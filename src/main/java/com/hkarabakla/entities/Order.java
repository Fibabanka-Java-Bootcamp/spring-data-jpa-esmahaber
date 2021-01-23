package com.hkarabakla.entities;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Order {

    @Id
    private int id;

    private Timestamp created_at;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private User user;
    
    private double total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	@OneToMany(mappedBy = "registeredOrderBook")
	  private Set<Book> books;

}
