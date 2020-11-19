package com.christianpari.Car;

import com.christianpari.Car.Engine.Engine;

public class Car{
  private String make;
  private String model;
  private String year;
  private int milesPerGallon;
  private Engine engine;

  public Car(
          String make,
          String model,
          String year,
          int milesPerGallon,
          Engine engine
  ) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.milesPerGallon = milesPerGallon;
    this.engine = engine;
  }

  public void displayMileage() {
    System.out.println("Mileage: " + engine.getMileage());
  }

  public void displayCarInfo() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Mileage: " + engine.getMileage());
    System.out.println("MPG: " + milesPerGallon);
    System.out.print("\n");
  }
}
