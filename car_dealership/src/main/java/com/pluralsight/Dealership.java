package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership
{
    String name;
    String address;
    String phoneNumber;

    public Dealership(String name, String address, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

}
