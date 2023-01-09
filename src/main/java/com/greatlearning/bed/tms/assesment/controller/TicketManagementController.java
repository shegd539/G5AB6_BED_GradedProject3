package com.greatlearning.bed.tms.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.bed.tms.assesment.databasemodel.TicketModel;
import com.greatlearning.bed.tms.assesment.model.CreateTicket;
import com.greatlearning.bed.tms.assesment.serviceimpl.TicketService;

@Controller
public class TicketManagementController {

	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping(value = "/")
	   public String index(Model model) {
		model.addAttribute("listOfTickets", ticketService.getAllTickets());

	      return "index";
	   }

	@GetMapping("/showNewEmployeeForm")
    public String showNewTicketForm(Model model) {
        // create model attribute to bind form data
        CreateTicket ticket = new CreateTicket();
        model.addAttribute("ticket", ticket);
        return "new_ticket";
    }

    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") CreateTicket ticket) {
        // save employee to database
    	ticketService.saveTicket(ticket);
        return "redirect:/";
    }

    
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
    	TicketModel ticket = ticketService.getTicketById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("ticket", ticket);
        return "update_ticket";
    }

    
    @GetMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.ticketService.deleteTicketById(id);
        return "redirect:/";
    }
    
    
    @PostMapping("/updateTicket")
    public String updateEmployee(@ModelAttribute("ticket") CreateTicket createTicket) {
        // save employee to database
        //employeeService.saveEmployee(employee);
    	
    	this.ticketService.updateTicketById(createTicket);
        return "redirect:/";
    }

    @GetMapping("/viewTicket/{id}")
    public String viewTicket(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
    	TicketModel ticket = ticketService.getTicketById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("ticket", ticket);
        return "view_ticket";
    }


}
