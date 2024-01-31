 package com.BikkadIT.TicketBookingApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Passenger_Details")
public class Passenger {

    @Id
	private int pid;
	
	private String fname;
	
	private String lname;
	
	private String currentlocation;
	
	private String destination;
	
	private String doj;

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", currentlocation="
				+ currentlocation + ", destination=" + destination + ", doj=" + doj + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCurrentlocation() {
		return currentlocation;
	}

	public void setCurrentlocation(String currentlocation) {
		this.currentlocation = currentlocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
}
