package com.FlightReservationSystem;

public class Passenger {
    private int id;
    private Address address;
    private Contact contact;
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
