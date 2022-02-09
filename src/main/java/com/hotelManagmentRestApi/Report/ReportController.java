package com.hotelManagmentRestApi.Report;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagmentRestApi.Hotel.Hotel;


@RestController
public class ReportController {

	@Autowired
	private ReportService reportService;
	
	//get all reports 
		@RequestMapping("/reports")
		public List<Report> getAllReports(){
			return reportService.getAllReports();
		}
		
	//get all report for a specific Hotel
	@RequestMapping("/hotels/{hotelName}/reports")
	public List<Report> getAllReportOfSpecificHotel(@PathVariable String hotelName){
		return reportService.getAllReportOfHotel(hotelName);
	}
	
	//get a report for a specific Hotel
	@RequestMapping("/hotels/{hotelName}/reports/{name}")
	public Report getReportOfSpecificHotel(@PathVariable String hotelName,@PathVariable String name) {
		return reportService.getAReportOfSpecificHotel(hotelName,name);
	}

	//save a new report for a specific Hotel
	@PostMapping("/hotels/{hotelName}/reports")
	public void addNewReportforSpecificHotel( @RequestBody Report report,@PathVariable String hotelName) {
		report.setHotel(new Hotel(hotelName));
		reportService.addReoprtforSpecificHotel(report);
	}

	//update a report details
	@PutMapping("/reports/{name}")
	public void updateReport( @RequestBody Report report,@PathVariable String name) {
		reportService.updateReport(report);
	}
	
	//delete a report
	@DeleteMapping("/reports/{name}")
	public void deleteReport(@PathVariable String name){
		reportService.deleteReport(name);
	}
	
}
