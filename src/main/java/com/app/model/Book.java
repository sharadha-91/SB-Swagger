package com.app.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@ApiModelProperty(name="bookId",notes ="book Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookId, bookName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId && Objects.equals(bookName, other.bookName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	public Book(String bookName, double price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	
	

}
