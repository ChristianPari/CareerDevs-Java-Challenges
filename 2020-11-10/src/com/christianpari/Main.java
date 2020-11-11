package com.christianpari;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Math Expression Below");

    String mathExpression = scanner.nextLine();
    System.out.println(mathFromString(mathExpression));

    scanner.close();
  }

  public static int mathFromString(String expression) {
    // version 1
//    int x = Integer.parseInt(expression.substring(0, 1));
//    int y = Integer.parseInt(expression.substring(4, 5));
//    String operator = expression.substring(2, 3);

    // version 2
//    int x = Character.getNumericValue(expression.charAt(0));
//    int y = Character.getNumericValue(expression.charAt(4));
//    String operator = expression.substring(2, 3);

    // version 3 - allows for multi-digit numbers
    String[] parts = expression.split(" ");
    int x = Integer.parseInt(parts[0]);
    String operator = parts[1];
    int y = Integer.parseInt(parts[2]);

    // enhanced switch
    return switch (operator) {
      case "+" -> x + y;
      case "-" -> x - y;
      case "*", "x", "X" -> x * y;
      case "/" -> x / y;
      case "%" -> x % y;
      default -> 0;
    };

    // original switch
//    switch(operator) {
//      case "+":
//        return x + y;
//      case "-":
//        return x - y;
//      case "*":
//      case "x":
//      case "X":
//        return x * y;
//      case "/":
//        return x / y;
//      case "%":
//        return x % y;
//      default:
//        return 0;
//    }
  }
}
