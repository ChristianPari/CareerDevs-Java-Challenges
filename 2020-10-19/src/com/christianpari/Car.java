package com.christianpari;

public class Car {
  public String color;
  public String make;
  public String model;

  public Car(String color, String make, String model) {
    this.color = color;
    this.make = make;
    this.model = model;
  }

  public void carDetails() {
    System.out.println("This is a " + color + " " + make + " " + model + ".");
  }
}
