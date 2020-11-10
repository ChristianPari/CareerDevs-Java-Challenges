package com.christianpari.Car.Engine;

public class ElectricEngine implements Engine {
  private int mileage = 0;
  private boolean engineIsOn = false;

  public ElectricEngine() {}

  public ElectricEngine(
          int mileage
  ) {
    this.mileage = mileage;
  }

  @Override
  public int getMileage() {
    return mileage;
  }

  @Override
  public void toggleEngine() {
    engineIsOn = !engineIsOn;
  }
}
