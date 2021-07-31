package com.FlightReservationSystem;

public class Passenger {
    int id;
    Address address;
    Contact contact;
    public Passenger(int id,Address address,Contact contact)
    {
        this.id=id;
        this.address=address;
        this.contact=contact;
    }
    public Address getAddress()
    {
        return  address;
    }
    public Contact getContact()
    {
        return contact;
    }
}
