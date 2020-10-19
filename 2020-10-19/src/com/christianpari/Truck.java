package com.christianpari;

public class Truck extends Car{
  public byte doors;

  public Truck(String color, String make, String model, byte doors) {
    super(color, make, model);
    this.doors = doors;
  }

  public void truckQuote() {
    System.out.println("TRUCK OFF ROADING!!!!!!!");
  }

  @Override
  public void carDetails() {
    System.out.println("This truck is a " + color + " " + make + " " + model + " and has " + doors + " doors.");
  }
}
