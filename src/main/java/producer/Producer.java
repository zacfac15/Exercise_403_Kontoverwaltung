package producer;

import data.Account;

public class Producer implements Runnable
{

  private Account account;
  
  @Override
  public void run()
  {
    synchronized(account)
    {
      
    }
  }
  
}
