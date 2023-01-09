package com.greatlearning.bed.tms.assesment.model;

import javax.persistence.Column;

public class CreateTicket {
	
    private String ticketTitle;

   
    private String ticketDescription;

   
    private String ticketCreatedOn;

    private long id;

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(String ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CreateTicket(String ticketTitle, String ticketDescription, String ticketCreatedOn, long id) {
		super();
		this.ticketTitle = ticketTitle;
		this.ticketDescription = ticketDescription;
		this.ticketCreatedOn = ticketCreatedOn;
		this.id = id;
	} 

	
    public CreateTicket() {
    	
    }
    
    
}
