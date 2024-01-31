package com.BikkadIT.TicketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.TicketBookingApp.model1.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
