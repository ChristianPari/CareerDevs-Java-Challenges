package com.christianpari;

public class BankAccount {
  private String owner;
  private boolean isActive;
  private String ssn;

  public BankAccount(String owner, String ssn) {
    this.owner =  owner;
    this.ssn = ssn;
    this.isActive = true;
  }

  public BankAccount(String owner, boolean isActive, String ssn) {
    this.owner =  owner;
    this.isActive = isActive;
    this.ssn = ssn;
  }

  public void toggleActive() {
    isActive = !isActive;
  }

  private void setOwner(String name) {
    if (name.isBlank()) {
      System.out.println("Owner must have a name.");
      return;
    }
    owner = name;
  }
}
