package com.pluralsight;

import java.util.Scanner;

public class Vehicle
{
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price)
    {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    public void addVehicle(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter vin number: ");
        vin = Integer.parseInt(userInput.nextLine());

        System.out.println("Please enter year of vehicle: ");
        year = Integer.parseInt(userInput.nextLine());

        System.out.println("Please enter make of vehicle: ");
        make = userInput.nextLine().toUpperCase();

        System.out.println("Please enter vehicle model: ");
        model = userInput.nextLine().toUpperCase();

        System.out.println("Please enter vehicle type (sedan, suv, truck): ");
        vehicleType = userInput.nextLine().toUpperCase();

        System.out.println("Please enter color of vehicle: ");
        color = userInput.nextLine().toUpperCase();

        System.out.println("Please enter odometer number: ");
        odometer = Integer.parseInt(userInput.nextLine());

        System.out.println("Please enter price of vehicle: ");
        price = Double.parseDouble(userInput.nextLine());

        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        vehicle.addVehicle();


    }
    public void removeVehicle(int vin) {
        for (int i = 0; i < vehicle.size(); i++) {
            if (vehicle.get(i).getVin() == vin) {
                vehicle.remove(i);
                System.out.println("Vehicle with VIN " + vin + " removed successfully.");
                return;
            }
        }
        System.out.println("Vehicle with VIN " + vin + " not found.");
    }

}
