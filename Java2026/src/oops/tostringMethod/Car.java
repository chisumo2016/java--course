package oops.tostringMethod;

public class Car {

    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() { //meaningful information
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}