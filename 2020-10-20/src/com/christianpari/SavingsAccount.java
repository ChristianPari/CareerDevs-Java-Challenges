package com.christianpari;

public class SavingsAccount extends BankAccount {
  private float monthlyInterest;
  private int curBalance;
  private String accountNumber;
  private String routingNumber;

  public SavingsAccount(String owner, String ssn, float monthlyInterest, int curBalance) {
    super(owner, ssn);
    setMonthlyInterest(monthlyInterest);
    setCurBalance(curBalance);
  }

  public SavingsAccount(String owner, boolean isActive, String ssn) {
    super(owner, isActive, ssn);
  }

  private void setMonthlyInterest(float interest) {
    if (interest < 0.00) {
      System.out.println("Interest must be greater than or equal to 1%.");
      return;
    }
    monthlyInterest = interest;
  }

  private void setCurBalance(int money) {
    if (money <= 0) {
      System.out.println("Cannot create initial balance of less that $0, must have a deposit of $500.");
      return;
    }
    curBalance = money;
  }

  public void getAccountNumber() {
    System.out.println(accountNumber);
  }

  private void setAccountNumber() {
    int accountNumber = (int) (Math.random() * 9_999_999) + 1_00_000;
    this.accountNumber = Integer.toString(accountNumber);
  }

  public void getRoutingNumber() {
    System.out.println(routingNumber);
  }

  private void setRoutingNumber() {
    int routingNumber = (int) (Math.random() * 9_999_999) + 1_00_000;
    this.routingNumber = Integer.toString(routingNumber);
  }
}
