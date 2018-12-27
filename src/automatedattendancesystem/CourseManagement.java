package automatedattendancesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CourseManagement extends javax.swing.JFrame {
 Class cls; Connection con; DriverManager drm; Statement stm; ResultSet rst; String query=new String();
    final String drive=new String("sun.jdbc.odbc.JdbcOdbcDriver"),connect=new String("Jdbc:Odbc:attendance");
    JOptionPane jp=new JOptionPane();
 Integer ver,sure=jp.YES_OPTION,never=jp.NO_OPTION,confirm=jp.QUESTION_MESSAGE,yesNo=jp.YES_NO_OPTION,erm=jp.ERROR_MESSAGE,inf=jp.INFORMATION_MESSAGE;
 Integer warm=jp.WARNING_MESSAGE;
    public CourseManagement() {
        initComponents();
        jLabel3.setVisible(false);jLabel4.setVisible(false);jLabel5.setVisible(false);jLabel6.setVisible(false);jLabel7.setVisible(false);
        jLabel8.setVisible(false);jTextField1.setVisible(false);jTextField2.setVisible(false);
        jComboBox1.setVisible(false); jComboBox2.setVisible(false); jComboBox3.setVisible(false); jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);jComboBox6.setVisible(false);jButton3.setVisible(false);jButton4.setVisible(false);jButton5.setVisible(false);
        loadlec();jTextField1.removeAll();jTextField2.removeAll();
    }

    private void clear() {
       jTextField1.setText("");
       jTextField2.setText("");
       jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);
       jComboBox3.setSelectedIndex(0);
       jComboBox4.setSelectedIndex(0);
       jComboBox5.setSelectedIndex(0);
       jComboBox6.setSelectedIndex(0);
    }
    private void loadlec(){
     try {
           jComboBox4.removeAllItems();
            connection();
            stm=con.createStatement();
            query="SELECT FullName FROM Lecturers;";
            rst=stm.executeQuery(query);
                while (rst.next()) {                    
                    jComboBox4.addItem(rst.getString(1));
                }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:"+e, "ERROR MESSAGE", erm);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Course Management Form");
        setMinimumSize(new java.awt.Dimension(730, 465));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 36));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COURSE");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(73, 12, 580, 40);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jLabel3.setText("COURSE CODE");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 101, 100, 30);

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jLabel4.setText("COURSE TITLE");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 140, 100, 30);

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jLabel5.setText("COURSE UNIT");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 181, 100, 30);

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jLabel6.setText("COURSE TYPE");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 220, 100, 30);

        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jLabel7.setText("LEVEL");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 260, 100, 30);

        jLabel8.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jLabel8.setText("LECTURER");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(159, 301, 100, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 400, 90, 30);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 400, 70, 30);

        jButton3.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 340, 120, 40);

        jButton4.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(320, 340, 120, 40);

        jButton5.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(330, 340, 100, 40);

        jCheckBox1.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jCheckBox1.setText("Add Course");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(160, 50, 107, 25);

        jCheckBox2.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jCheckBox2.setText("Edit Course");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(320, 50, 107, 25);

        jCheckBox3.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jCheckBox3.setText("Remove Course");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(450, 50, 120, 25);

        jTextField1.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 101, 290, 30);

        jTextField2.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(291, 140, 290, 30);

        jComboBox1.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(290, 180, 290, 30);

        jComboBox2.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Core", "Elective" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(290, 220, 290, 30);

        jComboBox3.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(290, 260, 290, 30);

        jComboBox4.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(290, 300, 290, 30);

        jComboBox5.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(290, 101, 290, 30);

        jComboBox6.setFont(new java.awt.Font("Droid Sans", 0, 13));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(290, 140, 290, 30);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 80, 580, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -4, 730, 450);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-751)/2, (screenSize.height-483)/2, 751, 483);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
     jCheckBox1.setSelected(true); jCheckBox2.setSelected(false); jCheckBox3.setSelected(false);
     jComboBox5.setVisible(false);jComboBox6.setVisible(false);jButton3.setVisible(true);
      jLabel3.setVisible(true);jLabel4.setVisible(true);jLabel5.setVisible(true);jLabel6.setVisible(true);jLabel7.setVisible(true);
        jLabel8.setVisible(true);jButton4.setVisible(false);jButton5.setVisible(false);jTextField1.setVisible(true);jTextField2.setVisible(true);
         jComboBox1.setVisible(true); jComboBox2.setVisible(true); jComboBox3.setVisible(true); jComboBox4.setVisible(true);
         loadlec();
    }//GEN-LAST:event_jCheckBox1ActionPerformed
private void loadCourse(){
      try {
           jComboBox5.removeAllItems();jComboBox6.removeAllItems();
            connection();
            stm=con.createStatement();
            query="SELECT CourseCode, CourseTitle FROM CourseTable;";
            rst=stm.executeQuery(query);
                while (rst.next()) {                    
                    jComboBox5.addItem(rst.getString(1));jComboBox6.addItem(rst.getString(2));
                }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:"+e, "ERROR MESSAGE", erm);
        }
}
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    jCheckBox1.setSelected(false); jCheckBox2.setSelected(true); jCheckBox3.setSelected(false);
 jComboBox5.setVisible(true);jComboBox6.setVisible(true);jButton3.setVisible(false);
      jLabel3.setVisible(true);jLabel4.setVisible(true);jLabel5.setVisible(true);jLabel6.setVisible(true);jLabel7.setVisible(true);
        jLabel8.setVisible(true);jButton4.setVisible(true);jButton5.setVisible(false);jTextField1.setVisible(false);jTextField2.setVisible(false);
         jComboBox1.setVisible(true); jComboBox2.setVisible(true); jComboBox3.setVisible(true); jComboBox4.setVisible(true);
         loadCourse();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
  jCheckBox1.setSelected(false); jCheckBox2.setSelected(false); jCheckBox3.setSelected(true);
   jComboBox5.setVisible(true);jComboBox6.setVisible(true);jButton3.setVisible(false);
      jLabel3.setVisible(true);jLabel4.setVisible(true);jLabel5.setVisible(false);jLabel6.setVisible(false);jLabel7.setVisible(false);
        jLabel8.setVisible(false);jButton4.setVisible(false);jButton5.setVisible(true);jTextField1.setVisible(false);jTextField2.setVisible(false);
         jComboBox1.setVisible(false); jComboBox2.setVisible(false); jComboBox3.setVisible(false); jComboBox4.setVisible(false);
         loadCourse();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
exit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
String courseCode,courseTitle,courseType,lecturer,year; Integer courseUnit;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 try {
            connection();
             stm=con.createStatement();
           courseCode=jTextField1.getText().toLowerCase(); courseTitle=jTextField2.getText().toLowerCase();
             courseUnit=Integer.valueOf(jComboBox1.getSelectedItem().toString()); courseType=jComboBox2.getSelectedItem().toString().toLowerCase();
             year=jComboBox3.getSelectedItem().toString().toLowerCase();lecturer=jComboBox4.getSelectedItem().toString().toLowerCase();
             if (courseCode.isEmpty()||courseTitle.isEmpty()) {
                jp.showMessageDialog(rootPane,"Empty Fields Cannot Be Submitted to the Database");
            }else{
                 query="INSERT INTO CourseTable (CourseCode, CourseTitle, CourseUnit, CourseType, Year, Lecturer) VALUES ( '"+courseCode+"','"+courseTitle
                         +"','"+courseUnit+"','"+courseType+"','"+year+"','"+lecturer+"');";
                      stm.executeUpdate(query);
                      stm=con.createStatement();
                      query="ALTER TABLE Students ADD `"+courseCode.toUpperCase()+"` INT(10) NOT NULL DEFAULT  '0';";
                      stm.execute(query);
//                      con.commit();
                  jp.showMessageDialog(rootPane,"Course Successfully Added");
                  clear();
             }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:"+e, "ERROR MESSAGE", erm);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   try {
            connection();
             stm=con.createStatement();
           courseCode=jComboBox5.getSelectedItem().toString().toLowerCase(); courseTitle=jComboBox6.getSelectedItem().toString().toLowerCase();
             courseUnit=Integer.valueOf(jComboBox1.getSelectedItem().toString()); courseType=jComboBox2.getSelectedItem().toString().toLowerCase();
             year=jComboBox3.getSelectedItem().toString().toLowerCase();lecturer=jComboBox4.getSelectedItem().toString().toLowerCase();
             if (courseCode.isEmpty()||courseTitle.isEmpty()) {
                jp.showMessageDialog(rootPane,"Empty Fields Cannot Be Submitted to the Database");
            }else{
                 query="UPDATE CourseTable SET CourseUnit='"+courseUnit+"', CourseType='"+courseType+"', Year='"+year+"', Lecturer='"+lecturer
                         +"' WHERE CourseCode='"+courseCode+"'AND CourseTitle='"+courseTitle+"'";
                      stm.executeUpdate(query);
                  jp.showMessageDialog(rootPane,"Course Successfully Updated");
             }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:"+e, "ERROR MESSAGE", erm);
        }
    loadCourse();
       loadlec();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try {
            connection();
             stm=con.createStatement();
           courseCode=jComboBox5.getSelectedItem().toString().toLowerCase(); courseTitle=jComboBox6.getSelectedItem().toString().toLowerCase();
             courseUnit=Integer.valueOf(jComboBox1.getSelectedItem().toString()); courseType=jComboBox2.getSelectedItem().toString().toLowerCase();
             year=jComboBox3.getSelectedItem().toString().toLowerCase();lecturer=jComboBox4.getSelectedItem().toString().toLowerCase();
             if (courseCode.isEmpty()||courseTitle.isEmpty()) {
                jp.showMessageDialog(rootPane,"Empty Fields Cannot Be Submitted to the Database");
            }else{
                 query="DELETE FROM courseTable  WHERE CourseCode='"+courseCode+"'AND CourseTitle='"+courseTitle+"'";
                      stm.executeUpdate(query);
                       stm=con.createStatement();
                       query="ALTER TABLE Students DROP `"+courseCode.toUpperCase()+"`;";
                      stm.execute(query);
                      con.commit();
                  jp.showMessageDialog(rootPane,"Course Successfully Removed");
             }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:"+e, "ERROR MESSAGE", erm);
        }
       loadCourse();
       loadlec();
    }//GEN-LAST:event_jButton5ActionPerformed

   private void exit(){
        ver=jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation",yesNo, confirm);
     if(ver.equals(sure)){
        System.exit(0);
     }else if(ver==never){
     return;
     }
    }
  private void connection(){
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "attendance";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                con = DriverManager.getConnection(url + dbName, userName, password);
                stm = con.createStatement();
                //System.out.println("Connected to the database");
            } catch (Exception e) {
                int chk = jp.showConfirmDialog(null, "Connection Off: Click Yes to Reconnect\nIf you are rounning on localhost\nMake sure server has been started", "RE-CONNECT", jp.YES_NO_CANCEL_OPTION);
                if (chk == 0) {
                    new DbConnect();
                } else {
                    System.exit(0);
                }
            }
 }
   
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
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagement().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
