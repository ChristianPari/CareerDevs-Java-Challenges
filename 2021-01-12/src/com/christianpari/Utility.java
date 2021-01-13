package com.christianpari;

public class Utility {
  // VERSION 1
  public void convertHoursV1(
    int hours,
    int mins,
    int hoursPassed
  ) {
    int newTime = (hours + hoursPassed) % 24;
    System.out.println(newTime + ":" + (mins < 10 ? "0" + mins : mins));
  }

  // VERSION 2
  public void convertHoursV2(
    int hours,
    int mins,
    int hoursPassed
  ) {
    int newTime = (hours + hoursPassed) % 24;
    if (newTime < 0) {
      newTime = 24 + newTime;
    }
    System.out.println(newTime + ":" + (mins < 10 ? "0" + mins : mins));
  }

  // VERSION 3
  public void convertMinsV1(
    int hours,
    int mins,
    int minsPassed
  ) {
    boolean negativeMins = false;
    if (minsPassed < 0) {
      minsPassed -= (minsPassed * 2);
      negativeMins = true;
    }
    int addedHours = minsPassed / 60;
//    minsPassed -= (60 * addedHours);
    minsPassed = minsPassed % 60;
    mins = negativeMins ? mins - minsPassed : mins + minsPassed;
    if (mins > 59) {
      addedHours += 1;
      mins -= 60;
    }
    if (mins < 0) {
      mins = 60 + mins;
      hours -= 1;
    }
    int newHours = negativeMins ? (hours - addedHours) % 24 : (hours + addedHours) % 24;
    if (newHours < 0) {
      newHours = 24 + newHours;
    }
    String newTime = newHours + ":" + (mins < 10 ? "0" + mins : mins);
    System.out.println(newTime);
  }

  // VERSION 4
  public void convertHoursV3(
    int hours,
    int mins,
    int hoursPassed,
    boolean standard
  ) {
    int newTime = (hours + hoursPassed) % 24;
    if (newTime < 0) {
      newTime = 24 + newTime;
    }
    if (standard) {
      newTime = newTime % 12;
    }
    System.out.println(newTime + ":" + (mins < 10 ? "0" + mins : mins));
  }

  public void convertMinsV2(
    int hours,
    int mins,
    int minsPassed,
    boolean standard
  ) {
    boolean negativeMins = false;
    if (minsPassed < 0) {
      minsPassed -= (minsPassed * 2);
      negativeMins = true;
    }
    int addedHours = minsPassed / 60;
//    minsPassed -= (60 * addedHours);
    minsPassed = minsPassed % 60;
    mins = negativeMins ? mins - minsPassed : mins + minsPassed;
    if (mins > 59) {
      addedHours += 1;
      mins -= 60;
    }
    if (mins < 0) {
      mins = 60 + mins;
      hours -= 1;
    }
    int adjustedHours = negativeMins ? (hours - addedHours) % 24 : (hours + addedHours) % 24;
    if (adjustedHours < 0) {
      adjustedHours = 24 + adjustedHours;
    }
    int newHours = standard ? adjustedHours % 12 : adjustedHours;
    String newTime = newHours + ":" + (mins < 10 ? "0" + mins : mins) + (standard ? (adjustedHours > 12 ? " PM" : " AM") : "");
    System.out.println(newTime);
  }

  // VERSION 5
  public void convertHoursV4(
    int hours,
    int mins,
    String suffix,
    int hoursPassed,
    boolean standard
  ) {
    if (suffix.equals("PM") || suffix.equals("Pm") || suffix.equals("pm")) {
      hours += 12;
    }
    int newTime = (hours + hoursPassed) % 24;
    String newSuffix = newTime > 12 ? "PM" : "AM";
    if (newTime < 0) {
      newTime = 24 + newTime;
    }
    if (standard) {
      newTime = newTime % 12;
    }
    System.out.println(newTime + ":" + (mins < 10 ? "0" + mins : mins) + " " + (standard ? newSuffix : ""));
  }

  public void convertMinsV3(
    int hours,
    int mins,
    String suffix,
    int minsPassed,
    boolean standard
  ) {
    if (suffix.equals("PM") || suffix.equals("Pm") || suffix.equals("pm")) {
      hours += 12;
    }
    boolean negativeMins = false;
    if (minsPassed < 0) {
      minsPassed -= (minsPassed * 2);
      negativeMins = true;
    }
    int addedHours = minsPassed / 60;
//    minsPassed -= (60 * addedHours);
    minsPassed = minsPassed % 60;
    mins = negativeMins ? mins - minsPassed : mins + minsPassed;
    if (mins > 59) {
      addedHours += 1;
      mins -= 60;
    }
    if (mins < 0) {
      mins = 60 + mins;
      hours -= 1;
    }
    int adjustedHours = negativeMins ? (hours - addedHours) % 24 : (hours + addedHours) % 24;
    if (adjustedHours < 0) {
      adjustedHours = 24 + adjustedHours;
    }
    int newHours = standard ? adjustedHours % 12 : adjustedHours;
    String newTime = newHours + ":" + (mins < 10 ? "0" + mins : mins) + (standard ? (adjustedHours > 12 ? " PM" : " AM") : "");
    System.out.println(newTime);
  }
}
