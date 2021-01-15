package com.christianpari;

public class Main {

  public static void main(String[] args) {
    Utility util = new Utility();
    // VERSION 1
    System.out.print("Version 1 --- ");
    util.convertHoursV1(21, 0, 36);
    // VERSION 2
    System.out.print("Version 2 --- ");
    util.convertHoursV2(1, 15, -5);
    // VERSION 3
    System.out.print("Version 3 --- ");
    util.convertMinsV1(12, 00, 0);
    // VERSION 4
    System.out.println("\nVersion 4");
    util.convertHoursV3(11, 00, 13, false);
    util.convertMinsV2(11, 0, 59, true);
    // VERSION 5
    System.out.println("\nVersion 5");
    util.convertHoursV4(12, 0, "am", 12, true);
    util.convertMinsV3(11, 0, "pm", 0, true);
  }
}
