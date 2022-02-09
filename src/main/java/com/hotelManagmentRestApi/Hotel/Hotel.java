package com.hotelManagmentRestApi.Hotel;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.hotelManagmentRestApi.Report.Report;

@Entity
public class Hotel {

	@Id
	private String name;
	@OneToMany
	private List<Report> report;
	
	public Hotel() {
		
	}
	public Hotel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Report> getReport() {
		return report;
	}
	
	public void setReport(List<Report> report) {
		this.report = report;
	}
	
	
}
