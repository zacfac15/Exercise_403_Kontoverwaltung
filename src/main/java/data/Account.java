package data;

public class Account
{

  private int balance = 0;

  public Account(int balance)
  {
    this.balance = balance;
  }

  public int getAmount()
  {
    return balance;
  }

  public void setAmount(int amount)
  {
    this.balance = amount;
  }

  public void deposit(int money)
  {
    balance += money;
  }

  public void withdraw(int money)
  {
    balance -= money;
  }
}
