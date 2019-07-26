package com.visa.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.TicketDao;
import com.visa.prj.entity.Ticket;

@Service
public class TicketService {
	@Autowired
	public TicketDao ticketDao;

	public List<Ticket> getAllTickets() {
		return ticketDao.findAll();
	}

	public void addTicket(Ticket t) {
		ticketDao.save(t);
	}

	public void resolveTicket(Ticket t) {
		if ("IT".equals(t.getResolvedBy().getDepartment())) {
			Ticket t1 = ticketDao.getOne(t.getId());
			t1.setResolvedBy(t.getResolvedBy());
			t1.setResolvedDate(t.getResolvedDate());
			t1.setResolvedInfo(t.getResolvedInfo());
			ticketDao.save(t1);
		}
	}

	public Ticket getTicket(int id) {
		return ticketDao.getOne(id);
	}
}
