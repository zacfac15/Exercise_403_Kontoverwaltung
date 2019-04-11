package user;

import data.Account;
import java.util.Random;
import javax.swing.JTextArea;

public class AccountUser implements Runnable
{

  private Account account;

  @Override
  public void run()
  {
    Random rand = new Random();
    for (int i = 0; i <= 10; i++)
    {
      synchronized (account)
      {
     
      }
    }
  }

}
