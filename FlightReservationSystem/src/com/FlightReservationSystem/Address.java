package com.FlightReservationSystem;

public class Address {
    String street;
    String city;
    String state;
    public Address(String street,String city,String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }
    public String getAddressDetails()
    {
        return street+"\n"+city+"\n"+state;
    }
    public void setAddressDetails(String street,String city,String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }
}
