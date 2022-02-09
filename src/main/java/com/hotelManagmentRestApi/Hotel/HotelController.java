package com.hotelManagmentRestApi.Hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	//get all Hotels
	@RequestMapping("/hotels")
	public List<Hotel> getAllReports(){
		return hotelService.getAllReports();
	}	

}
