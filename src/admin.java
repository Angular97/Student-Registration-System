
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class admin extends javax.swing.JFrame {



Connection conn = null;
Statement stmt = null;
ResultSet rs = null;

public admin() {
super("Admin");
initComponents();
conn = databaseConnection.connection();
}

private void initComponents() {

jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
name = new javax.swing.JTextField();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jLabel7 = new javax.swing.JLabel();
id = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
password = new javax.swing.JTextField();
mail = new javax.swing.JTextField();
jMenuBar1 = new javax.swing.JMenuBar();
jMenu1 = new javax.swing.JMenu();
jMenuItem1 = new javax.swing.JMenuItem();
jMenuItem2 = new javax.swing.JMenuItem();
jMenu2 = new javax.swing.JMenu();
jMenuItem3 = new javax.swing.JMenuItem();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setResizable(false);

jPanel1.setBackground(new java.awt.Color(255, 255, 153));
jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3), "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 204, 204))); // NOI18N

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel1.setText("Name");

jButton1.setForeground(new java.awt.Color(51, 0, 204));
jButton1.setText("Update");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jButton2.setForeground(new java.awt.Color(255, 102, 0));
jButton2.setText("Back");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setForeground(new java.awt.Color(153, 0, 0));
jButton3.setText("Search");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

jButton4.setForeground(new java.awt.Color(153, 0, 153));
jButton4.setText("Delete");
jButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton4ActionPerformed(evt);
}
});

jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel7.setText("ID");

jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel2.setText("Email");

jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel3.setText("Password");

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(45, 45, 45)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jLabel7)
.addComponent(jLabel3)
.addComponent(jLabel2))
.addGap(124, 124, 124)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(0, 0, Short.MAX_VALUE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addComponent(mail, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(21, 21, 21))))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(108, 108, 108)
.addComponent(jButton1)
.addGap(49, 49, 49)
.addComponent(jButton4)
.addGap(47, 47, 47)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel7)
.addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton3))
.addGap(29, 29, 29)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(31, 31, 31)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(33, 33, 33)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(34, 34, 34)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jButton4)
.addComponent(jButton2))
.addContainerGap(31, Short.MAX_VALUE))
);

jMenuBar1.setBackground(new java.awt.Color(255, 255, 153));

jMenu1.setText("File");

jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
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

jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
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

setSize(new java.awt.Dimension(540, 373));
setLocationRelativeTo(null);
}// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
setVisible(false);
Home object = new Home();
object.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
setVisible(false);
Home object = new Home();
object.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
// TODO add your handling code here:
setVisible(false);
About object = new About();
object.setVisible(true);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
try{
stmt = conn.createStatement();
int adminId = Integer.parseInt(id.getText());
String adminMail = mail.getText();
String adminName = name.getText();
String adminPassword = password.getText();

String sql = "UPDATE ADMIN SET mail='"+adminMail+"',password = '"+adminPassword+"',name = '"+adminName+"' WHERE id = '"+adminId+"'";

stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Data is sucessfully Updated");
}catch(SQLException e){
JOptionPane.showMessageDialog(null,e);


}
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
setVisible(false);
Home object = new Home();
object.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
try{

stmt  = conn.createStatement();

int adminId = Integer.parseInt(id.getText());


String sql = "SELECT * FROM ADMIN WHERE id ='"+adminId+"'";

rs = stmt.executeQuery(sql);

if(rs.next()){

name.setText(rs.getString("name"));
password.setText(rs.getString("password"));
mail.setText(rs.getString("mail"));

}else
{

JOptionPane.showMessageDialog(null,"Record Not Found");
}
}catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}

}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
try{
stmt = conn.createStatement();
int adminId = Integer.parseInt(id.getText());
String sql = "DELETE FROM ADMIN WHERE id ='"+adminId+"'";
stmt.executeUpdate(sql);
setVisible(false);
showAdmin object = new showAdmin();
object.setVisible(true);

}catch(Exception e){
JOptionPane.showMessageDialog(null,e);

}//GEN-LAST:event_jButton4ActionPerformed
}
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
java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new admin().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JTextField id;
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel7;
private javax.swing.JMenu jMenu1;
private javax.swing.JMenu jMenu2;
private javax.swing.JMenuBar jMenuBar1;
private javax.swing.JMenuItem jMenuItem1;
private javax.swing.JMenuItem jMenuItem2;
private javax.swing.JMenuItem jMenuItem3;
private javax.swing.JPanel jPanel1;
private javax.swing.JTextField mail;
private javax.swing.JTextField name;
private javax.swing.JTextField password;
// End of variables declaration//GEN-END:variables
}

