package com.BikkadIT.TicketBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.TicketBookingApp.model.Passenger;
import com.BikkadIT.TicketBookingApp.model1.Ticket;
import com.BikkadIT.TicketBookingApp.service.PassengerServiceI;


@RestController
public class PassengerController {

	
	@Autowired
	private PassengerServiceI passengerServiceI;
	
	@PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psng){
		
		Ticket bookTicket = passengerServiceI.BookTicket(psng);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
		
	}
}
