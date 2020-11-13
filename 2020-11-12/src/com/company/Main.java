package com.company;

import Yahtzee.Hand.Hand;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Hand hand = new Hand(5);
    hand.rollDice();
    Scanner scanner = new Scanner(System.in);
    hand.reRoll(scanner.nextLine());
  }
}