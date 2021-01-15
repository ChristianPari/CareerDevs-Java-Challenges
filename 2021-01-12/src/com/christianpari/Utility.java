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
      newTime += 24;
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
      newHours += 24;
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
      newTime += 24;
    }
    String period = newTime > 11 ? " PM" : " AM";
    if (standard) {
      newTime = (newTime % 12 != 0) ? newTime % 12 : 12;
    }
    System.out.println(newTime + ":" + (mins < 10 ? "0" + mins : mins) + (standard ? period : ""));
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
    int newHours = standard ? (adjustedHours % 12 == 0 ? 12 : adjustedHours % 12) : adjustedHours;
    String newTime = newHours + ":" + (mins < 10 ? "0" + mins : mins) + (standard ? (adjustedHours > 11 ? " PM" : " AM") : "");
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
    boolean isPM = suffix.equalsIgnoreCase("pm");
    if ((isPM && hours != 12) || (!isPM && hours == 12)) {
      hours += 12;
    }
    int newTime = (hours + hoursPassed) % 24;
    String newSuffix = newTime > 11 ? "PM" : "AM";
    if (newTime < 0) {
      newTime += 24;
    }
    if (standard) {
      newTime = (newTime % 12 != 0) ? newTime % 12 : 12;
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
    // checking suffix first to adjust hours accordingly
    boolean isPM = suffix.equalsIgnoreCase("pm");
    if ((isPM && hours != 12) || (!isPM && hours == 12)) {
      hours += 12;
    }
    boolean negativeMins = false; // boolean check to handle converting of mins later
    if (minsPassed < 0) { // negative mins were passed
      minsPassed -= (minsPassed * 2); // convert minsPassed to a positive number
      negativeMins = true;
    }
    int addedHours = minsPassed / 60; // extract amount of hours from total mins
    minsPassed = minsPassed % 60; // assigns the leftover mins to minsPassed
    mins = negativeMins ? mins - minsPassed : mins + minsPassed; // negativeMins = true -> subtract minsPassed - mins [else] add them
    if (mins > 59) {
      addedHours += 1; // add another hour since mins became greater than 59
      mins -= 60; // subtract them from mins
    }
    if (mins < 0) { // mins are negative?
      mins += 60; // make mins positive by adding 60 (which actually is 60 - mins since mins is negative)
      hours -= 1; // subtract 1 from total hours
    }

    // adjusted hours are handling whether the addedHours are being added or subtracted
    int adjustedHours = negativeMins ? (hours - addedHours) % 24 : (hours + addedHours) % 24;
    if (adjustedHours < 0) { // negative hours adjust to correct positive hours
      adjustedHours += 24;
    }

    // if standard time convert else leave as military
    int newHours = standard ? (adjustedHours % 12 == 0 ? 12 : adjustedHours % 12) : adjustedHours;

    String minString = ":" + (mins < 10 ? "0" + mins : mins); // include a 0 with mins or not

    // concat the correct period am or pm if standard is true, otherwise concat an empty string
    String period = (standard ? (adjustedHours <= 11 ? " AM" : " PM") : "");
    String newTime = newHours + minString + period;
    System.out.println(newTime);
  }
}
