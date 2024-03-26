package edu.neu.mgen;



import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    private String name;
    private int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

// Car class extending Vehicle
class Car extends Vehicle {
    private String model;

    public Car(String name, int year, String model) {
        super(name, year);
        this.model = model;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getName() + ", Model: " + model + ", Year: " + getYear());
    }
}

// Motorbike class extending Vehicle
class Motorbike extends Vehicle {
    private String type;

    public Motorbike(String name, int year, String type) {
        super(name, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorbike: " + getName() + ", Type: " + type + ", Year: " + getYear());
    }
}

// Aircraft class extending Vehicle
class Aircraft extends Vehicle {
    private String manufacturer;

    public Aircraft(String name, int year, String manufacturer) {
        super(name, year);
        this.manufacturer = manufacturer;
    }

    @Override
    public void displayInfo() {
        System.out.println("Aircraft: " + getName() + ", Manufacturer: " + manufacturer + ", Year: " + getYear());
    }
}

// Ship class extending Vehicle
class Ship extends Vehicle {
    private String purpose;

    public Ship(String name, int year, String purpose) {
        super(name, year);
        this.purpose = purpose;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ship: " + getName() + ", Purpose: " + purpose + ", Year: " + getYear());
    }
}

// Main class
public class App {
    public static void main(String[] args) {
        // Creating instances of vehicles
        Vehicle car = new Car("Toyota", 2022, "Camry");
        Vehicle motorbike = new Motorbike("Harley-Davidson", 2021, "Sportster");
        Vehicle aircraft = new Aircraft("Boeing 747", 2018, "Boeing");
        Vehicle ship = new Ship("Titanic", 1912, "Passenger");

        // Displaying information about vehicles
        car.displayInfo();
        motorbike.displayInfo();
        aircraft.displayInfo();
        ship.displayInfo();
    }
}
