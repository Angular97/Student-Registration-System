
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class addResult extends javax.swing.JFrame {

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;

public addResult() {
super("Add Result");
initComponents();
conn = databaseConnection.connection();
}

private void initComponents() {

jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
name = new javax.swing.JTextField();
fatherName = new javax.swing.JTextField();
gender = new javax.swing.JComboBox<>();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jLabel7 = new javax.swing.JLabel();
stdClass = new javax.swing.JComboBox<>();
jSeparator1 = new javax.swing.JSeparator();
jLabel3 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel8 = new javax.swing.JLabel();
jLabel9 = new javax.swing.JLabel();
jLabel10 = new javax.swing.JLabel();
jLabel11 = new javax.swing.JLabel();
c = new javax.swing.JTextField();
math = new javax.swing.JTextField();
eco = new javax.swing.JTextField();
dbms = new javax.swing.JTextField();
jLabel12 = new javax.swing.JLabel();
jLabel13 = new javax.swing.JLabel();
total = new javax.swing.JTextField();
remarks = new javax.swing.JComboBox<>();
core = new javax.swing.JTextField();
jMenuBar1 = new javax.swing.JMenuBar();
jMenu1 = new javax.swing.JMenu();
jMenuItem1 = new javax.swing.JMenuItem();
jMenuItem2 = new javax.swing.JMenuItem();
jMenu2 = new javax.swing.JMenu();
jMenuItem3 = new javax.swing.JMenuItem();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setResizable(false);

jPanel1.setBackground(new java.awt.Color(255, 255, 153));
jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3), "Add Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 204, 204))); // NOI18N
jPanel1.setForeground(new java.awt.Color(0, 204, 255));

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel1.setText("Name");

jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel2.setText("Father's Name");

jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel4.setText("Gender");

jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel6.setText("Class");

gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female\t", "Other" }));

jButton1.setForeground(new java.awt.Color(51, 0, 204));
jButton1.setText("Submit");
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

stdClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "BCA", "OTHER" }));

jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
jLabel3.setForeground(new java.awt.Color(102, 0, 102));
jLabel3.setText("Marks");

jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel5.setText("C++");

jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel8.setText("Java");

jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel9.setText("Maths");

jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel10.setText("Economics");

jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel11.setText("DBMS");

jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel12.setText("REMARKS");

jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
jLabel13.setText("TOTAL");

remarks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "PASSED", "C.O.", "FAIL" }));

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(21, 21, 21)
.addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(eco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(30, 30, 30)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addComponent(jLabel11)
.addGap(22, 22, 22))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addComponent(dbms, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap())))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(45, 45, 45)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jLabel2)
.addComponent(jLabel4))
.addGap(70, 70, 70)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(gender, 0, 145, Short.MAX_VALUE)
.addComponent(fatherName)
.addComponent(name)))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel6)
.addGap(135, 135, 135)
.addComponent(stdClass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel5)
.addGap(66, 66, 66)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton1)
.addComponent(jLabel8)))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(88, 88, 88)
.addComponent(core, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(46, 46, 46)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(18, 18, 18)
.addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel13)
.addComponent(jLabel12))
.addGap(52, 52, 52)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(total)
.addComponent(remarks, 0, 128, Short.MAX_VALUE))
.addGap(93, 93, 93)
.addComponent(jLabel7))))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(202, 202, 202)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel9)
.addComponent(jLabel3))))
.addGap(0, 101, Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(24, 24, 24)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(36, 36, 36)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(28, 28, 28)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(38, 38, 38)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(stdClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel3)
.addGap(17, 17, 17)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(jLabel8)
.addComponent(jLabel9)
.addComponent(jLabel10)
.addComponent(jLabel11))
.addGap(18, 18, 18)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(eco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(dbms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(core, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel13)
.addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(45, 45, 45)
.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addGap(37, 37, 37)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel12)
.addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(60, 60, 60)))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton1))
.addContainerGap())
);

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

setSize(new java.awt.Dimension(519, 679));
setLocationRelativeTo(null);
}// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
try{
stmt = conn.createStatement();

String stdName = name.getText();
String stdGender = (String) gender.getSelectedItem();
String stdRemarks = (String) remarks.getSelectedItem();
String stdCplus = c.getText();
String stdFather = fatherName.getText();
String stdJava = core.getText();
String stdEconomics = eco.getText();
String stdMaths = math.getText();
String stdDBMS = dbms.getText();
String stdTotal = total.getText();
String stdclass = (String) stdClass.getSelectedItem();

String sql = "INSERT INTO RESULTS(Name,FatherName,Gender,class,C++,Java,Economics,Maths,DBMS,Total,Remarks) VALUES('"+stdName+"','"+stdFather+"','"+stdGender+"','"+stdclass+"','"+stdCplus+"','"+stdJava+"','"+stdEconomics+"','"+stdMaths+"','"+stdDBMS+"','"+stdTotal+"','"+stdRemarks+"')";


stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Data is sucessfully Inserted");

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

public static void main(String args[]) {
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>


java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new addResult().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JTextField c;
private javax.swing.JTextField core;
private javax.swing.JTextField dbms;
private javax.swing.JTextField eco;
private javax.swing.JTextField fatherName;
private javax.swing.JComboBox<String> gender;
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel10;
private javax.swing.JLabel jLabel11;
private javax.swing.JLabel jLabel12;
private javax.swing.JLabel jLabel13;
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
private javax.swing.JSeparator jSeparator1;
private javax.swing.JTextField math;
private javax.swing.JTextField name;
private javax.swing.JComboBox<String> remarks;
private javax.swing.JComboBox<String> stdClass;
private javax.swing.JTextField total;
// End of variables declaration//GEN-END:variables
}

