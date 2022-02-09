package com.hotelManagmentRestApi.Report;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.hotelManagmentRestApi.Hotel.Hotel;



@Entity
public class Report {

	@Id
	private String name;
	private String category;
	private String description;
	
//	@Temporal(TemporalType.DATE)
//	private Date date;
	@ManyToOne
	private Hotel hotel;
	
	public Report() {
		
	}
	public Report(String name, String category,String description,String hotelName) {
		super();
		this.name = name;
		this.category = category;
		this.description=description;
//		this.date = date;
		this.hotel =new Hotel(hotelName);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}

	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
}
