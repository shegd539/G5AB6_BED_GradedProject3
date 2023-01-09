package com.greatlearning.bed.tms.assesment.databasemodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TICKET_RECORDS")
public class TicketModel {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(name = "ticket_title")
	    private String ticketTitle;

	    @Column(name = "ticket_description")
	    private String ticketDescription;

	    @Column(name = "ticket_created_date")
	    private String ticketCreatedOn;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

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

		public TicketModel(long id, String ticketTitle, String ticketDescription, String ticketCreatedOn) {
			super();
			this.id = id;
			this.ticketTitle = ticketTitle;
			this.ticketDescription = ticketDescription;
			this.ticketCreatedOn = ticketCreatedOn;
		}

	public TicketModel() {
		
	}
	   
}
