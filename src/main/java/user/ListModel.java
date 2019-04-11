package user;

import java.util.LinkedList;
import javax.swing.AbstractListModel;

public class ListModel extends AbstractListModel
{

  private LinkedList<String> list = new LinkedList<>();

  @Override
  public int getSize()
  {
    return list.size();
  }

  @Override
  public Object getElementAt(int index)
  {
    return list.get(index);
  }

  public void add(String username)
  {
    list.add(username);
    this.fireIntervalAdded(username, list.size(), list.size());
  }
  
  public String getUsername(int index)
  {
    return list.get(index);
  }
}
