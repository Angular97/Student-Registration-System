public class Home extends javax.swing.JFrame {
private void initComponents() {

jPanel1 = new javax.swing.JPanel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jLabel7 = new javax.swing.JLabel();
jButton7 = new javax.swing.JButton();
jLabel8 = new javax.swing.JLabel();
jButton8 = new javax.swing.JButton();
jLabel9 = new javax.swing.JLabel();
jMenuBar1 = new javax.swing.JMenuBar();
jMenu1 = new javax.swing.JMenu();
jMenuItem1 = new javax.swing.JMenuItem();
jMenuItem2 = new javax.swing.JMenuItem();
jMenu2 = new javax.swing.JMenu();
jMenuItem3 = new javax.swing.JMenuItem();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setResizable(false);

jPanel1.setBackground(new java.awt.Color(255, 255, 153));
jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 102)), "Home", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-students-96.png")); // NOI18N
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-services-48.png")); // NOI18N
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-admin-96.png")); // NOI18N
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-manager-96.png")); // NOI18N
jButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton4ActionPerformed(evt);
}
});

jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-service-48.png")); // NOI18N
jButton5.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton5ActionPerformed(evt);
}
});

jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-businessman-96.png")); // NOI18N
jButton6.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton6ActionPerformed(evt);
}
});

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-student-male-480.png")); // NOI18N
jLabel1.setText("Students Registration System");
jLabel1.setToolTipText("");

jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel2.setText("Add Students");

jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel3.setText("Operations");

jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel4.setText("Show Students");

jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel5.setText("Add Admins");

jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel6.setText("Operations");

jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel7.setText("Show Admins");

jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-report-card-96.png")); // NOI18N
jButton7.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton7ActionPerformed(evt);
}
});

jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel8.setText("Show Results");

jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-result-96.png")); // NOI18N
jButton8.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton8ActionPerformed(evt);
}
});

jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel9.setText("Add Results");

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(65, 65, 65)
.addComponent(jLabel5)
.addGap(117, 117, 117)
.addComponent(jLabel6)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(22, 22, 22))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addGap(18, 18, 18)
.addComponent(jLabel9)
.addGap(66, 66, 66))))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(74, 74, 74)
.addComponent(jLabel1))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(66, 66, 66)
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(94, 94, 94)
.addComponent(jLabel3)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jLabel4))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(56, 56, 56)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
.addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGap(80, 80, 80)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel7))))
.addGap(8, 8, 8)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
.addComponent(jLabel8)
.addGap(59, 59, 59))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(54, 54, 54)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
.addGap(38, 38, 38)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(jLabel3)
.addComponent(jLabel4)
.addComponent(jLabel8))
.addGap(29, 29, 29)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(35, 35, 35)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(jLabel6)
.addComponent(jLabel7)
.addComponent(jLabel9))
.addContainerGap(45, Short.MAX_VALUE))
);

jMenu1.setText("File");

jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-home-48.png")); // NOI18N
jMenuItem1.setText("Home");
jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem1ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem1);

jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-logout-48.png")); // NOI18N
jMenuItem2.setText("Logout");
jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem2ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem2);

jMenuBar1.add(jMenu1);

jMenu2.setText("About");

jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARSHU\\Downloads\\icons8-about-48.png")); // NOI18N
jMenuItem3.setText("About");
jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem3ActionPerformed(evt);
}
});
jMenu2.add(jMenuItem3);

jMenuBar1.add(jMenu2);

setJMenuBar(jMenuBar1);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);

setSize(new java.awt.Dimension(824, 621));
setLocationRelativeTo(null);
}// </editor-fold>                        

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
setVisible(false);
Home object = new Home();
object.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
// TODO add your handling code here:
setVisible(false);
About object = new About();
object.setVisible(true);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
System.exit(0);

}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
setVisible(false);
addStudent object = new addStudent();
object.setVisible(true);

}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
setVisible(false);
 object = new showStudent();
object.setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:

setVisible(false);
student object = new student();
object.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:


setVisible(false);
addAdmin object = new addAdmin();
object.setVisible(true);
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here:
setVisible(false);
showAdmin object = new showAdmin();
object.setVisible(true);
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
setVisible(false);
admin object = new admin();
object.setVisible(true);
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
// TODO add your handling code here:
setVisible(false);
showResult object = new showResult();
object.setVisible(true);
}//GEN-LAST:event_jButton7ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
// TODO add your handling code here:
setVisible(false);
addResult object = new addResult();
object.setVisible(true);
}//GEN-LAST:event_jButton8ActionPerformed

/**
* @param args the command line arguments
*/
public static void main(String args[]) {
/* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
*/
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(() -> {
new Home().setVisible(true);
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JButton jButton5;
private javax.swing.JButton jButton6;
private javax.swing.JButton jButton7;
private javax.swing.JButton jButton8;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JMenu jMenu1;
private javax.swing.JMenu jMenu2;
private javax.swing.JMenuBar jMenuBar1;
private javax.swing.JMenuItem jMenuItem1;
private javax.swing.JMenuItem jMenuItem2;
private javax.swing.JMenuItem jMenuItem3;
private javax.swing.JPanel jPanel1;
// End of variables declaration//GEN-END:variables

private static class about {

public about() {
}

private void setVisible(boolean b) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
}
}

