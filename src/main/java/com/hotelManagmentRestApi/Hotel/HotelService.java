package com.hotelManagmentRestApi.Hotel;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	//get all hotels
	public List<Hotel> getAllReports() {
		List<Hotel> hotels=new ArrayList<>();
		hotelRepository.findAll()
		.forEach(hotels::add);
		return hotels;
	}

}
