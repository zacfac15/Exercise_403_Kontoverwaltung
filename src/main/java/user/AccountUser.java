package user;

import data.Account;
import javax.swing.JTextArea;

public class AccountUser implements Runnable
{

  private Account account;
  private String username;
  private JTextArea taLog;

  public AccountUser(Account account, String username, JTextArea taLog)
  {
    this.username = username;
    this.account = account;
    this.taLog = taLog;
  }

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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
