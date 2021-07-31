package com.FlightReservationSystem;

public class TouristTicket extends Ticket{
    public TouristTicket(int pnr,String from,String to,Flights flight,String departureDateTime,String arrivalDateTime,Passenger passenger,int seatNo,int price,boolean ticketStatus)
    {
        super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,ticketStatus);
    }
}
