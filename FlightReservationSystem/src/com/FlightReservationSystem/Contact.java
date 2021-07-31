package com.FlightReservationSystem;

public class Contact {
    private String name;
    private int phoneNo;
    private String emailId;
    public Contact(String name,int phoneNo,String emailId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.emailId=emailId;
    }
    public String getContactDetails()
    {
        return "Contact Details\nName : "+name+"\nPhone No : "+phoneNo+"\nEmailId : "+emailId;
    }
    public void setContactDetails(String name,int phoneNo,String emailId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.emailId=emailId;
    }
}
