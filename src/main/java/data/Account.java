package data;

public class Account
{

  private double balance = 0;

  public Account(double balance)
  {
    this.balance = balance;
  }

  public void deposit(double money)
  {
    balance += money;
  }

  public void withdraw(double money)
  {
    balance -= money;
  }
}
