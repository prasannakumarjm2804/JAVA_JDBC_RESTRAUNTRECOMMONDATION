package com.restaurant.prasana;
import java.sql.Connection;
import java.sql.Statement;
public class Restaurant {
	private String name;
    private String cuisine;
    private float rating;
    private String location;
    private long phno;
    private int reviews;
    private String price;
    private String delavail;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDelavail() {
		return delavail;
	}
	public void setDelavail(String delavail) {
		this.delavail = delavail;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", cuisine=" + cuisine + ", rating=" + rating + ", location=" + location
				+ ", phno=" + phno + ", noofreviews=" + reviews + ", price_range=" + price + ", delavail="
				+ delavail + "]";
	}
    
}
