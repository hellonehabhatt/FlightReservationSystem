package com.FlightReservationSystem;

public class Ticket {
private int pnr;
    private String from;
    private String to;
    private Flights flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private int seatNo;
    private int price;
    private boolean ticketStatus;
    public Ticket(int pnr,String from,String to,Flights flight,String departureDateTime,String arrivalDateTime,Passenger passenger,int seatNo,int price,boolean ticketStatus)
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
    public String getTicket()
    {
        return "Ticket Details : \n"+"PNR : "+pnr+"\nFROM : "+from+"\nTO : "+to+"\n"+flight.getFlightDetails()+"\nDeparture DateTime: "+departureDateTime+"\nPassenger : "+passenger.getAddress().getAddressDetails()+"\n"+passenger.getContact().getContactDetails()+"\nSeat No. : "+seatNo+"\nPrice : "+price+"\nTicket Status : "+ticketStatus;
    }

}
