package consumer;

import data.Account;

public class Consumer implements Runnable
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
