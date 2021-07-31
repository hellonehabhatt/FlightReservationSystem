package com.FlightReservationSystem;

public class Contact {
    String name;
    int phoneNo;
    String emailId;
    public Contact(String name,int phoneNo,String emailId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.emailId=emailId;
    }
    public String getContactDetails()
    {
        return name+"\n"+phoneNo+"\n"+emailId;
    }
    public void setContactDetails(String name,int phoneNo,String emailId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.emailId=emailId;
    }
}
