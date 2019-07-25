package com.visa.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.visa.prj.dao.BookingDao;
import com.visa.prj.dao.HotelDao;
import com.visa.prj.dao.UserDao;
import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;

@Service
public class BookingService {
	@Autowired
	public BookingDao bookingDao;
	
	@Autowired
	public HotelDao hotelDao;
	
	@Autowired
	public UserDao userDao;
	
	public List<Booking> getBookings(String u) {
		return bookingDao.getAllBookingsOfUser(userDao.findById(u).get());
	}
	
	@Transactional //We write this when we have to make changes in DB
	public void addBooking(Booking b) {
		
		  Hotel h = hotelDao.findById(b.getHotel().getId()).get(); User u =
		  userDao.findById(b.getUser().getUsername()).get(); b.setHotel(h);
		  b.setUser(u); 
		  b.setHotel(h);
		  bookingDao.save(b);
	}
	
	public List<Hotel> getHotels() {
		return hotelDao.findAll();
	}
	
	@Transactional
	public void createBooking(Booking b) {
		bookingDao.save(b);
	}
	
}
