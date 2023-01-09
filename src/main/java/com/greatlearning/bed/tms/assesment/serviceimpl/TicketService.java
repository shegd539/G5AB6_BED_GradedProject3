package com.greatlearning.bed.tms.assesment.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.bed.tms.assesment.databasemodel.TicketModel;
import com.greatlearning.bed.tms.assesment.model.CreateTicket;
import com.greatlearning.bed.tms.assesment.repository.TicketRepository;
import com.greatlearning.bed.tms.assesment.repository.UpdateTicketRepository;

@Component
public class TicketService {

	
	@Autowired
	TicketRepository employeeRepository;
	;
	@Autowired
	UpdateTicketRepository updateEmployeeRepository;
	
	
	public void saveTicket(CreateTicket createTicket) {
		
		TicketModel ticketModel=new TicketModel();
		ticketModel.setTicketTitle(createTicket.getTicketTitle());
		ticketModel.setTicketDescription(createTicket.getTicketDescription());
		ticketModel.setTicketCreatedOn(createTicket.getTicketCreatedOn());
		employeeRepository.save(ticketModel);
		
	}
	
	
    public List<TicketModel> getAllTickets() {
        return employeeRepository.findAll();
    }

    
    
    public TicketModel getTicketById(long id) {
        Optional < TicketModel > optional = employeeRepository.findById(id);
        TicketModel employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
            updateEmployeeRepository.updateEmployeeRecord(optional.get().getTicketTitle(), optional.get().getTicketDescription(), optional.get().getTicketCreatedOn(), id);
            System.out.println("Records updated ");
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    
    
    
    public void deleteTicketById(long id) {
        this.employeeRepository.deleteById(id);
    }

    
    
    public void updateTicketById(CreateTicket createTicket) {
    	updateEmployeeRepository.updateEmployeeRecord(createTicket.getTicketTitle(), createTicket.getTicketDescription(), createTicket.getTicketCreatedOn(), createTicket.getId());
    }
    
    
    
}
