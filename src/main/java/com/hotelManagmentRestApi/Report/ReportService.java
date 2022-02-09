package com.hotelManagmentRestApi.Report;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReportService {

	@Autowired
	private ReportRepository reportRepository;
	
	//get all report 
	public List<Report> getAllReports() {
		List<Report> reports=new ArrayList<>();
		reportRepository.findAll()
		.forEach(reports :: add);
		return reports;
	}
	
	//get all report for a specific Hotel
	public List<Report> getAllReportOfHotel(String hotelName) {
		List<Report> reports=new ArrayList<>();
		reportRepository.findByHotelName(hotelName)
		.forEach(reports :: add);
		return reports;
	}

	//get a report for a specific Hotel
	public Report getAReportOfSpecificHotel(String hotelName,String name) {
		Report report=reportRepository.findByHotelNameAndName(hotelName,name);
		return report;
	}

	//save a new report for a specific Hotel
	public String addReoprtforSpecificHotel(Report report) {
		reportRepository.save(report);
		return "Report has created";
	}
	
	//update a report details
	public String updateReport(Report report) {
		reportRepository.save(report);
		return "Report has updated";
	}
	
	//delete a report
	public void deleteReport(String name) {
		reportRepository.deleteByName(name);
	}

}
