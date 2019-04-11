package user;

import data.Account;
import javax.swing.JTextArea;

public class AccountUser implements Runnable
{

  private Account account;
  private String username;
  private JTextArea taLog;


  public String getUsername()
  {
    return username;
  }

  @Override
  public String toString()
  {
    return username;
  }
  
  @Override
  public void run()
  {
    for (int i = 0; i <10; i++)
    {
      
      System.out.println(""+i+Thread.currentThread().getName());
    }
  }
  
    private void log(String logText)
  {
    synchronized (taLog)
    {
      taLog.append(username + " " + logText + "\n");
    }
  }
  
}
