package ui;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.swing.JOptionPane;
import user.AccountUser;
import user.ListModel;

public class GUI extends javax.swing.JFrame
{

  private ListModel lm = new ListModel();
  
  public GUI()
  {
    initComponents();
    jtList.setModel(lm);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jPopupMenu1 = new javax.swing.JPopupMenu();
    jMenuItem2 = new javax.swing.JMenuItem();
    jMenuItem1 = new javax.swing.JMenuItem();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    lbAccountBalance = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jtList = new javax.swing.JList<>();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    taLog = new javax.swing.JTextArea();

    jMenuItem2.setText("add user");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenuItem2ActionPerformed(evt);
      }
    });
    jPopupMenu1.add(jMenuItem2);

    jMenuItem1.setText("perform account test");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenuItem1ActionPerformed(evt);
      }
    });
    jPopupMenu1.add(jMenuItem1);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("AccountBalance"));
    jPanel2.setPreferredSize(new java.awt.Dimension(400, 80));
    jPanel2.setLayout(new java.awt.GridLayout(1, 2));
    jPanel2.add(jLabel1);
    jPanel2.add(lbAccountBalance);

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    jPanel1.setLayout(new java.awt.BorderLayout());

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));
    jPanel4.setPreferredSize(new java.awt.Dimension(120, 60));
    jPanel4.setLayout(new java.awt.GridLayout(1, 1));

    jtList.setComponentPopupMenu(jPopupMenu1);
    jtList.setSize(new java.awt.Dimension(39, 70));
    jScrollPane2.setViewportView(jtList);

    jPanel4.add(jScrollPane2);

    jPanel1.add(jPanel4, java.awt.BorderLayout.WEST);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-Output"));
    jPanel3.setLayout(new java.awt.GridLayout(1, 1));

    taLog.setColumns(20);
    taLog.setRows(5);
    jScrollPane1.setViewportView(taLog);

    jPanel3.add(jScrollPane1);

    jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem2ActionPerformed
  {//GEN-HEADEREND:event_jMenuItem2ActionPerformed
    String username = JOptionPane.showInputDialog("Enter username");
    lm.add(username);
  }//GEN-LAST:event_jMenuItem2ActionPerformed

  private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
  {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
    int[] indi = jtList.getSelectedIndices();
    
    for (int i = 0; i < indi.length; i++)
    {
      AccountUser[] au = new AccountUser[indi.length];
      au[i] = new AccountUser();
      new Thread(au[i],lm.getUsername(indi[i])).start();
    }
  }//GEN-LAST:event_jMenuItem1ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new GUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPopupMenu jPopupMenu1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JList<String> jtList;
  private javax.swing.JLabel lbAccountBalance;
  private javax.swing.JTextArea taLog;
  // End of variables declaration//GEN-END:variables
}
