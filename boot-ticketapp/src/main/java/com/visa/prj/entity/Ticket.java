package com.visa.prj.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne
	@JoinColumn(name="raisedBy") //Foreign Key
	private Employee raisedBy;
	
	private String ticketDescription;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ticketDate;
	
	@ManyToOne
	@JoinColumn(name="resolvedBy") //Foreign Key
	private Employee resolvedBy;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolvedDate;
	
	private String resolvedInfo;

	public Employee getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public String getResolvedInfo() {
		return resolvedInfo;
	}

	public void setResolvedInfo(String resolvedInfo) {
		this.resolvedInfo = resolvedInfo;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setEmployee(Employee employee) {
		this.raisedBy = employee;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public Date getTicketDate() {
		return ticketDate;
	}

	public void setTicketDate(Date ticketDate) {
		this.ticketDate = ticketDate;
	}

	@Override
	public String toString() {
		return "Ticket [Id=" + Id + ", employee=" + raisedBy + ", ticketDescription=" + ticketDescription
				+ ", ticketDate=" + ticketDate + ", resolvedBy=" + resolvedBy + ", resolvedDate=" + resolvedDate
				+ ", resolvedInfo=" + resolvedInfo + "]";
	}
	
	
}
