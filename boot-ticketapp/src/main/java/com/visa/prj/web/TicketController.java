package com.visa.prj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Ticket;
import com.visa.prj.service.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService service;
	
	@GetMapping("tickets")
	public @ResponseBody List<Ticket> getTickets(){
		return service.getAllTickets();
	}
	
	@GetMapping("tickets/{id}")
	public @ResponseBody Ticket getTicket(@PathVariable("id") int id) {
		return service.getTicket(id);
	}
	
	@PostMapping("raiseticket")
	public ResponseEntity<Ticket> addTicket(@RequestBody Ticket t) {
		service.addTicket(t);
		return new ResponseEntity<>(t, HttpStatus.CREATED); //Status code and entity
	}
	
	@PostMapping("resolveticket")
	public ResponseEntity<Ticket> resolveTicket(@RequestBody Ticket t) {
		service.resolveTicket(t);
		return new ResponseEntity<>(t, HttpStatus.CREATED); //Status code and entity
	}
}
