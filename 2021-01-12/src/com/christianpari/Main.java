package com.christianpari;

public class Main {

  public static void main(String[] args) {
    Utility util = new Utility();
    // VERSION 1
    util.convertHoursV1(21, 36);
    // VERSION 2
    util.convertHoursV2(1, -5);
    // VERSION 3
    util.convertMinsV1(21, 00, 147);
    // VERSION 4
    util.convertHoursV3(21, 27, 2, true);
    util.convertMinsV2(11, 0, 147, true);
    // VERSION 5
    util.convertHoursV4(9, 27, "pm", 12, true);
    util.convertMinsV3(9, 12, "pm", 147, true);
  }
}
