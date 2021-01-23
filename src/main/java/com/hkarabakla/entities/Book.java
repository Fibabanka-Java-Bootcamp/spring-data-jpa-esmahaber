package com.hkarabakla.entities;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    private String isbn;

    private String name;
    private String description;
    private Timestamp publishedDate;
    private Timestamp addedDate;
    private double price;
    private String currency;
    private String imageUrl;
    

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "order_book",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "book_isbn"))
    private Set<Order> registeredOrderBook;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_isbn"))
    private Set<Order> registeredAuthor;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Order> getOrderBooks() {
		return registeredOrderBook;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Timestamp publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Timestamp getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Set<Order> getRegisteredOrderBook() {
		return registeredOrderBook;
	}

	public void setRegisteredOrderBook(Set<Order> registeredOrderBook) {
		this.registeredOrderBook = registeredOrderBook;
	}

	public Set<Order> getRegisteredAuthor() {
		return registeredAuthor;
	}

	public void setRegisteredAuthor(Set<Order> registeredAuthor) {
		this.registeredAuthor = registeredAuthor;
	}

	public void setOrderBooks(Set<Order> orderBooks) {
		this.registeredOrderBook = orderBooks;
	}


}
