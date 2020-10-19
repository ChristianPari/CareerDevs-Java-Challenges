package com.christianpari;

public class Sedan extends Car{
  public String size;

  public Sedan(String color, String make, String model, String size) {
    super(color, make, model);
    this.size = size;
  }

  public void sedanQuote() {
    System.out.println("Im just a sedan... im safe!");
  }

  @Override
  public void carDetails() {
    System.out.println("This is a " + size + " sedan");
  }
}
