package com.hotelManagmentRestApi.Report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, String> {

	List<Report> findByHotelName(String hotelName);
	
	void deleteByName(String name);

	Report findByHotelNameAndName(String hotelName, String name);



}
