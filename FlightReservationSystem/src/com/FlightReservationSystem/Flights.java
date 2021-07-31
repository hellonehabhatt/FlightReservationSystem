package com.FlightReservationSystem;

public class Flights {
    private String flightName;
    private int capacity;
    private int bookedSeats;
    public Flights(String flightName,int capacity,int bookedSeats)
    {
        this.flightName=flightName;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
    public String getFlightDetails()
    {
        return "Flight Details\n"+"Flight Name : "+flightName+"\nCapacity : "+capacity+"\nBooked Seats"+bookedSeats;
    }
    public boolean checkAvailablity()
    {
        return capacity-bookedSeats>0?true:false;
    }
    public boolean booking()
    {
        return checkAvailablity()?true:false;
    }
}
