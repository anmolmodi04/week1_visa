package com.visa.prj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.User;

public interface BookingDao extends JpaRepository<Booking, Integer> {
	
	
	@Query("from Booking b where b.user = :u")	
	public List<Booking> getAllBookingsOfUser(@Param("u") User user);
}
