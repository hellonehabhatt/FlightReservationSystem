package com.FlightReservationSystem;

public class Flights {
    String flightName;
    int capacity;
    int bookedSeats;
    public Flights(String flightName,int capacity,int bookedSeats)
    {
        this.flightName=flightName;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
    public String getFlightDetails()
    {
        return flightName+"\n"+capacity+"\n"+bookedSeats;
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
