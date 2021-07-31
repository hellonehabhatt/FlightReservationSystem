package com.FlightReservationSystem;

public class Main {
    public static void main(String[] args)
    {
        Address address = new Address("42 Street","Haldwani","Uttarakhand");
        Contact contact = new Contact("Neha",839403285,"helloneha.bhatt@gmail.com");
        Flights flights = new Flights("Air India",100,10);
        System.out.println(address.getAddressDetails());
        System.out.println(contact.getContactDetails());
        System.out.println(flights.getFlightDetails());
    }
}
