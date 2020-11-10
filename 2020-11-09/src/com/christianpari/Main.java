package com.christianpari;

import com.christianpari.Car.Car;
import com.christianpari.Car.Engine.GasEngine;
import com.christianpari.Car.Engine.ElectricEngine;

public class Main {

  public static void main(String[] args) {
    Car gasCar = new Car("Subaru", "WRX Sti", "2010", 27, new GasEngine(90_000));
    gasCar.displayCarInfo();

    Car electricCar = new Car("Toyota", "Prius", "2019", 52, new ElectricEngine(1_000));
    electricCar.displayCarInfo();
  }
}
