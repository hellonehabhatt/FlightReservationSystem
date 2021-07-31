package com.FlightReservationSystem;

public class TouristTicket {
    int pnr;
    String from;
    String to;
    Flights flight;
    String departureDateTime;
    String arrivalDateTime;
    Passenger passenger;
    int seatNo;
    int price;
    boolean ticketStatus;
    public TouristTicket(int pnr,String from,String to,Flights flight,String departureDateTime,String arrivalDateTime,Passenger passenger,int seatNo,int price,boolean ticketStatus)
    {
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.flight=flight;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.passenger=passenger;
        this.seatNo=seatNo;
        this.price=price;
        this.ticketStatus=ticketStatus;
    }
}
