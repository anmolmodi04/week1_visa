package com.visa.prj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visa.prj.entity.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Long> {

}
