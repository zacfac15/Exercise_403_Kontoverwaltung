package user;

import data.Account;
import java.util.Random;
import javax.swing.JTextArea;

public class AccountUser implements Runnable
{

  private Account account;
  private JTextArea taLog;

  @Override
  public void run()
  {
    Random rand = new Random();
    for (int i = 0; i <= 10; i++)
    {
      int amount = rand.nextInt(41) + 10;
      amount = amount * (rand.nextBoolean() ? -1 : 1);
      OUTER:
      synchronized (account)
      {
        {
          int count = 0;
          while (account.getBalance() + amount < 0)
          {
            try
            {
              log("has to wait to withdraw " + amount);
              account.wait(2000);
              count++;
              taLog.append(" has finished waiting!");
              log(" has finished waiting!");
            }
            catch (InterruptedException ex)
            {
              if (count == 3)
              {
                log(" has been interrupted to avoid deadlock <<<");
                break OUTER;
              }
              log("makes withdrawel " + amount);
            }
          }
        }
      }
    }
  }
  
  private void log(String logText)
  {
    synchronized (taLog)
    {
      taLog.append(Thread.currentThread().getName() + " " + logText + "\n");
    }
  }

}
