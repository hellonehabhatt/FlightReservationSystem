package com.FlightReservationSystem;

public class Main {
    public static void main(String[] args)
    {
    	Flights flights = new Flights("Air India",100,10);
        Address address = new Address("42 Street","Haldwani","Uttarakhand");
        Contact contact = new Contact("Neha",839403285,"helloneha.bhatt@gmail.com");
        Passenger passenger = new Passenger(101,address,contact);
        RegularTicket ticket = new RegularTicket(1242312,"Tanakpur","Haldwani",flights,"31-07-21 8:00PM","31-07-21 11:30PM",passenger,122,899,true);
        System.out.println(address.getAddressDetails());
        System.out.println(contact.getContactDetails());
        System.out.println(flights.getFlightDetails());
        System.out.println(ticket.getTicket());
    }
}
