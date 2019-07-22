package com.visa.prj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.SearchCriteria;
import com.visa.prj.service.BookingService;

@RestController
public class HotelController {
	@Autowired
	private BookingService service;
	
	@RequestMapping("search.do")
	public String getSearchForm(Model m) {
		m.addAttribute("searchCriteria", new SearchCriteria());
		return "searchForm.jsp";
	}
	
	@RequestMapping("hotels.do")
	public String fetchHotels(@ModelAttribute("searchCriteria") SearchCriteria criteria, Model m) {
		m.addAttribute("hotelList", service.getHotelByName(criteria.getSearchString()));
		return "searchResults.jsp";
	}
}
