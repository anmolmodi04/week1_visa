package com.visa.prj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService service;
	
	@GetMapping("hotels")
	public @ResponseBody List<Hotel> getHotels() {
		return service.getHotels();
	}
	
	@GetMapping("bookings")
	public @ResponseBody List<Booking> getBookings(@RequestParam(name = "user", required = true) String user) {
		return service.getBookings(user);
	}
	
	@PostMapping("hotels")
	public ResponseEntity<Booking> addCompletedTicket(@RequestBody Booking b) {
		service.addBooking(b);
		return new ResponseEntity<>(b, HttpStatus.CREATED); //Status code and entity
	}
}
