package com.christianpari;

public class Main {

    public static void main(String[] args) {
        /*
        TODO
        1) car class has 3 fields and 1 method
        2) two subclasses, each have 1 field and 1 method that is unique
        3) include an override or overloaded method
         */
        var car1 = new Car(
                "black",
                "toyota",
                "prius");

        var car2 = new Truck(
                "blue",
                "ford",
                "F150",
                (byte) 2
        );

        var car3 = new Sedan(
                "red",
                "chevy",
                "malibu",
                "mid-size"
        );

        car1.carDetails();
        car2.carDetails();
        car2.truckQuote();
        car3.carDetails();
        car3.sedanQuote();
    }
}
