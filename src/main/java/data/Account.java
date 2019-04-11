package data;

public class Account
{

  private int amount = 0;

  public Account(int amount)
  {
    this.amount = amount;
  }

  public int getAmount()
  {
    return amount;
  }

  public void setAmount(int amount)
  {
    this.amount = amount;
  }

  public void deposit(int money)
  {
    amount += money;
  }

  public void withdraw(int money)
  {
    amount -= money;
  }
}
