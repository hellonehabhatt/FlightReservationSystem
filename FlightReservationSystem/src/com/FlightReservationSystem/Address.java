package com.FlightReservationSystem;

public class Address {
    private String street;
    private String city;
    private String state;
    public Address(String street,String city,String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }
    public String getAddressDetails()
    {
        return "Address Details : \n"+"Street : "+street+"\nCity : "+city+"\nState : "+state;
    }
    public void setAddressDetails(String street,String city,String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }
}
