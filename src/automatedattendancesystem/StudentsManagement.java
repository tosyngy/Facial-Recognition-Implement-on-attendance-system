package automatedattendancesystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Vector;

public class StudentsManagement extends javax.swing.JFrame {

    Variables var = new Variables();
    JOptionPane jp = new JOptionPane();
    Integer ver, sure = jp.YES_OPTION, never = jp.NO_OPTION, confirm = jp.QUESTION_MESSAGE, yesNo = jp.YES_NO_OPTION, erm = jp.ERROR_MESSAGE, inf = jp.INFORMATION_MESSAGE;
    Integer warm = jp.WARNING_MESSAGE;
    Class cls;
    Connection con;
    DriverManager drm;
    Statement stm;
    ResultSet rst;
    String query = new String();
    final String drive = new String("sun.jdbc.odbc.JdbcOdbcDriver"),  connect = new String("Jdbc:Odbc:attendance");

    public StudentsManagement() {
        var.setFing(0);
        initComponents();
        jButton6.setVisible(false);
        jTextField1.setText(null);
        jComboBox2.setSelectedIndex(0);
        jTextField2.setText(null);
        jTextField4.setText(null);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox2.setVisible(false);
        jTextField4.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        loadStudents();
    }

    private void clear() {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jComboBox2.setSelectedIndex(0);
        jTextField4.setText(null);
    }

    private void loadStudents() {
        try {
            jComboBox4.removeAllItems();
            jComboBox3.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT Name, MatricNumber FROM Students;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox4.addItem(rst.getString(1));
                jComboBox3.addItem(rst.getString(2));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Management");
        setMinimumSize(new java.awt.Dimension(650, 460));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(6, 10, 630, 40);

        jRadioButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jRadioButton1.setText("Add Student");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(60, 60, 113, 25);

        jRadioButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jRadioButton2.setText("Update Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(231, 56, 160, 25);

        jRadioButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jRadioButton3.setText("Remove Student");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(403, 56, 160, 25);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel3.setText("Name:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 100, 170, 30);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel4.setText("Matric Number:");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 150, 170, 30);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel5.setText("Sex:");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 180, 160, 30);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel6.setText("Phone Number:");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 220, 160, 30);

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel8.setText("LEVEL:");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 270, 160, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 310, 140, 40);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 310, 150, 40);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(260, 310, 150, 40);

        jButton4.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(560, 400, 81, 30);

        jButton5.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jButton5.setText("Return");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 400, 88, 30);

        jTextField1.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(232, 101, 190, 30);

        jTextField2.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(230, 140, 190, 30);

        jTextField4.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(230, 220, 190, 30);

        jComboBox1.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(230, 270, 190, 30);

        jComboBox3.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(230, 140, 190, 30);

        jComboBox4.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(230, 100, 190, 30);

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jButton6.setText("Take face Shoot");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(451, 240, 150, 90);

        jComboBox2.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Gender---", "Male", "Female" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(230, 180, 190, 30);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 90, 620, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-666)/2, (screenSize.height-479)/2, 666, 479);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jButton1.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton6.setVisible(true);

        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel8.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jComboBox2.setVisible(true);
        jTextField4.setVisible(true);
        jComboBox1.setVisible(true);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        loadStudents();
        jTextField1.setText(null);
        jTextField2.setText(null);
        jComboBox2.setSelectedIndex(0);
        jTextField4.setText(null);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jButton6.setVisible(true);
        jRadioButton2.setSelected(true);
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jButton2.setVisible(true);
        jButton1.setVisible(false);
        jButton3.setVisible(false);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jComboBox2.setSelectedIndex(0);
        jTextField4.setText(null);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel8.setVisible(true);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox2.setVisible(true);
        jTextField4.setVisible(true);
        jComboBox1.setVisible(true);
        jComboBox3.setVisible(true);
        jComboBox4.setVisible(true);
        loadStudents();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton3.setSelected(true);
        jRadioButton2.setSelected(false);
        jButton6.setVisible(false);
        jRadioButton1.setSelected(false);
        jButton3.setVisible(true);
        jButton2.setVisible(false);
        jButton1.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox2.setVisible(false);
        jTextField4.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox3.setVisible(true);
        jComboBox4.setVisible(true);
        loadStudents();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        exit();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    String name, matricNumber, sex, phone, courseCodes[], year;
    Integer g;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (var.getFing() < 2) {
            JOptionPane.showMessageDialog(rootPane, "please authenticate your biometric");
            return;
        }

        try {
            connection();
            stm = con.createStatement();
            name = jTextField1.getText().toLowerCase();
            matricNumber = jTextField2.getText().toLowerCase();
            sex = jComboBox2.getSelectedItem().toString().toLowerCase();
            phone = jTextField4.getText().toLowerCase();
            year = jComboBox1.getSelectedItem().toString().toLowerCase();
            if (name.isEmpty() || matricNumber.isEmpty() || sex.isEmpty() || phone.isEmpty()) {
                jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database", "WARNING", warm);
            } else {
                query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
                rst = stm.executeQuery(query);
                g = 0;
                while (rst.next()) {
                    g = g + 1;
                }
                courseCodes = new String[g];
                g = 0;
                query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
                rst = stm.executeQuery(query);
                while (rst.next()) {
                    courseCodes[g] = rst.getString(1);
                    System.out.println(courseCodes[g]);
                    g = g + 1;
                }
                stm = con.createStatement();
                query = "INSERT INTO Students (Name, MatricNumber, Sex, Phone, Year";
                for (int i = 0; i < courseCodes.length; i++) {
                    query = query + ", `" + courseCodes[i] + "`";
                }
                query = query + ") VALUES ('" + name + "','" + matricNumber + "','" + sex + "','" + phone + "','" + year + "'";
                for (int i = 0; i < courseCodes.length; i++) {
                    query = query + ",'0'";
                }
                query = query + ");";
                stm.executeUpdate(query);
                jp.showMessageDialog(rootPane, "Student Successfully Added", "WARNING", inf);
                clear();
            }
            ;
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please select your gender");
            jComboBox2.requestFocus();
            return;
        }

        try {
            connection();
            stm = con.createStatement();
            name = jComboBox4.getSelectedItem().toString().toLowerCase();
            matricNumber = jComboBox3.getSelectedItem().toString().toLowerCase();
            sex = jComboBox2.getSelectedItem().toString().toLowerCase();
            phone = jTextField4.getText().toLowerCase();
            year = jComboBox1.getSelectedItem().toString().toLowerCase();
            if (sex.isEmpty() || phone.isEmpty()) {
                jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database", "WARNING", warm);
            } else {
                query = "UPDATE Students SET Sex='" + sex + "', Phone='" + phone + "',  Year='" + year + "' WHERE Name='" + name + "' AND MatricNumber='" + matricNumber + "';";

                stm.executeUpdate(query);
                jp.showMessageDialog(rootPane, "Student Successfully Updated", "WARNING", inf);
                clear();
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
        loadStudents();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            name = jComboBox4.getSelectedItem().toString().toLowerCase();
            matricNumber = jComboBox3.getSelectedItem().toString().toLowerCase();
            query = "DELETE FROM Students WHERE Name='" + name + "' AND MatricNumber='" + matricNumber + "';";

            stm.executeUpdate(query);
            jp.showMessageDialog(rootPane, "Student Successfully Deleted", "WARNING", inf);
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
        loadStudents();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
//new UserReg().setVisible(true);        // TODO add your handling code here:
            Recognizer rec = new Recognizer(null);
            Vector<String> vec = new Vector<String>();
            vec.addElement(jTextField2.getText());
            rec.writeFile("c:\\faces\\image.txt", jTextField2.getText());
            rec.recognize(new String[]{"c:\\faces\\bin\\Debug\\dictector.exe"});
            if ((rec.readFile("c:\\faces\\image.txt")).equalsIgnoreCase(jTextField2.getText() + " 1")) {
                var.setFing(2);
                rec.writeFile("c:\\faces\\image.txt", "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }//GEN-LAST:event_jButton6ActionPerformed

    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesNo, confirm);
        if (ver.equals(sure)) {
            System.exit(0);
        } else if (ver == never) {
            return;
        }
    }

    private void connection() {
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
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(StudentsManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StudentsManagement().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
