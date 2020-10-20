package com.christianpari;

public class CheckingAccount extends BankAccount {
  private int curBalance;
  private String accountNumber;
  private String routingNumber;

  public CheckingAccount(String owner, String ssn) {
    super(owner, ssn);
  }

  public CheckingAccount(String owner, boolean isActive, String ssn) {
    super(owner, isActive, ssn);
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  private void setAccountNumber() {
    int accountNumber = (int) (Math.random() * 9_999_999) + 1_00_000;
    this.accountNumber = Integer.toString(accountNumber);
  }

  public String getRoutingNumber() {
    return routingNumber;
  }

  private void setRoutingNumber() {
    int routingNumber = (int) (Math.random() * 9_999_999) + 1_00_000;
    this.routingNumber = Integer.toString(routingNumber);
  }
}
