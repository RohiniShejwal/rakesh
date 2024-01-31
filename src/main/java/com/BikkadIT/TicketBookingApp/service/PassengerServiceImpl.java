package com.BikkadIT.TicketBookingApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.TicketBookingApp.model.Passenger;
import com.BikkadIT.TicketBookingApp.model1.Ticket;
import com.BikkadIT.TicketBookingApp.repository.PassengerRepository;
import com.BikkadIT.TicketBookingApp.repository.TicketRepository;

@Service
public class PassengerServiceImpl implements PassengerServiceI {

	@Autowired
	private PassengerRepository passengerRepository;
	
	@Autowired
	private TicketRepository ticketRepository;
	
	
	@Override
	public Ticket BookTicket(Passenger psng) {
		Passenger save = passengerRepository.save(psng);
		int pid = save.getPid();
		
		Ticket ticket = ticketRepository.findById(pid).get();
		return ticket;
	}

}
