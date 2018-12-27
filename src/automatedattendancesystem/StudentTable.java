package automatedattendancesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends javax.swing.JFrame {

    private void loadCourse() {
        try {
            jComboBox3.removeAllItems();
            connection();
            st = con.createStatement();
            query = "SELECT CourseCode FROM CourseTable;";
            rs = st.executeQuery(query);
            while (rs.next()) {
                jComboBox3.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }

    public StudentTable() {
        initComponents();
        loadCourse();
        jInternalFrame1.setVisible(false);
    }
    Class cls;
    Connection con, conn;
    DriverManager drm;
    Statement st, stt;
    ResultSet rs, rss;
    String query = new String();
    Boolean t = Boolean.TRUE;
    JOptionPane jp = new JOptionPane();
    String year;
    Integer i, j;
    Integer ver, sure = jp.YES_OPTION, never = jp.NO_OPTION, confirm = jp.QUESTION_MESSAGE, yesno = jp.YES_NO_OPTION, erm = jp.ERROR_MESSAGE, inf = jp.INFORMATION_MESSAGE;
    Integer warm = jp.WARNING_MESSAGE;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 535));
        setResizable(false);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Attendance Progress");
        jInternalFrame1.setVisible(true);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 24));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATTENDANCE PROCESS");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 770, 38);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Course:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(490, 60, 90, 20);

        jComboBox3.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(580, 60, 160, 30);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(490, 100, 80, 20);

        jComboBox4.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500", " " }));
        jPanel2.add(jComboBox4);
        jComboBox4.setBounds(580, 100, 160, 30);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setFont(new java.awt.Font("DejaVu Serif", 1, 10));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 790, 300);

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jButton6.setText("Fetch");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(750, 100, 60, 30);

        jButton7.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(740, 450, 70, 30);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(226, 111, 90));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 510));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 510));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 50);

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Droid Sans", 1, 14));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 80, 920, 350);

        jButton1.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 470, 92, 30);

        jButton2.setFont(new java.awt.Font("Droid Sans", 0, 12));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1050, 470, 80, 32);

        jButton3.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jButton3.setText("Refresh");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1050, 430, 80, 20);

        jButton5.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jButton5.setText("Fetch");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 380, 170, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jRadioButton1.setText("Manage Course");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(10, 120, 147, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jRadioButton2.setText("Manage User");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(10, 150, 147, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jRadioButton3.setText("Manage Students");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(10, 180, 125, 25);

        jComboBox1.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(60, 300, 120, 40);

        jButton4.setFont(new java.awt.Font("DejaVu Serif", 1, 12));
        jButton4.setText("Mark Attendance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(520, 460, 240, 40);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jRadioButton4.setText("Attendance Progress");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(10, 210, 147, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Level:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 310, 50, 30);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(830, 430, 217, 22);

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Droid Sans", 1, 12))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 90, 190, 150);

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Droid Sans", 1, 12))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 260, 190, 170);

        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 450, 1120, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1166)/2, (screenSize.height-549)/2, 1166, 549);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Logout?", "Confirmation", yesno, confirm);
        if (ver.equals(sure)) {
            this.dispose();
            new AdminLogin().setVisible(true);
        } else if (ver == never) {
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exit();
    }//GEN-LAST:event_jButton2ActionPerformed
    Integer g;
    String courseCodes[];
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection();
            year = jComboBox1.getSelectedItem().toString().toLowerCase();
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            st = con.createStatement();
            rs = st.executeQuery(query);
            g = 0;
            while (rs.next()) {
                g = g + 1;
            }
            courseCodes = new String[g];
            g = 0;
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            rs = st.executeQuery(query);
            while (rs.next()) {
                courseCodes[g] = rs.getString(1);
                g = g + 1;
            }
            query = "SELECT SerialNumber, Name, MatricNumber, Sex, Phone, Year";
            for (int k = 0; k < courseCodes.length; k++) {
                query = query + ", `" + courseCodes[k] + "`";
            }

            query = query + " FROM Students WHERE  Year='" + year + "';";
            DefaultTableModel dm = new DefaultTableModel();
            st = con.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            String c[] = new String[columns];
            for (i = 0; i < columns; i++) {
                c[i] = md.getColumnName(i + 1);
                dm.addColumn(c[i]);
            }
            Object row[] = new Object[columns];
            while (rs.next()) {
                for (j = 0; j < columns; j++) {
                    row[j] = rs.getString(j + 1);
                }
                dm.addRow(row);

            }
            jTable1.setModel(dm);
            int we = jTable1.getRowCount();
            jLabel6.setText("Number or row fetched: " + we);
            con.close();

        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            connection();
            year = jComboBox1.getSelectedItem().toString().toLowerCase();
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            st = con.createStatement();
            rs = st.executeQuery(query);
            g = 0;
            while (rs.next()) {
                g = g + 1;
            }
            courseCodes = new String[g];
            g = 0;
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            rs = st.executeQuery(query);
            while (rs.next()) {
                courseCodes[g] = rs.getString(1);
                g = g + 1;
            }
            query = "SELECT SerialNumber, Name, MatricNumber, Sex, Phone, Year";
            for (int k = 0; k < courseCodes.length; k++) {
                query = query + ", `" + courseCodes[k] + "`";
            }

            query = query + " FROM Students WHERE Year='" + year + "';";
            DefaultTableModel dm = new DefaultTableModel();
            st = con.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            String c[] = new String[columns];
            for (i = 0; i < columns; i++) {
                c[i] = md.getColumnName(i + 1);
                dm.addColumn(c[i]);
            }
            Object row[] = new Object[columns];
            while (rs.next()) {
                for (j = 0; j < columns; j++) {
                    row[j] = rs.getString(j + 1);
                }
                dm.addRow(row);

            }
            jTable1.setModel(dm);
            int we = jTable1.getRowCount();
            jLabel6.setText("Number or row fetched: " + we);
            con.close();

        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        new UserAccountMan().setVisible(true);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(true);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        new CourseManagement().setVisible(true);
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        new StudentsManagement().setVisible(true);
        jRadioButton3.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton1.setSelected(false);
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jRadioButton3.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton1.setSelected(false);
        jRadioButton4.setSelected(true);
        jInternalFrame1.setVisible(true);
        loadCourse();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jInternalFrame1.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MarkAttendance().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void attendanceProgress() {
        try {
            course = jComboBox3.getSelectedItem().toString().toUpperCase();
            year2 = jComboBox4.getSelectedItem().toString().toLowerCase();
            query = "SELECT SerialNumber,Name,MatricNumber,`" + course + "` FROM Students WHERE Year='" + year2 + "';";
            DefaultTableModel dm = new DefaultTableModel();
            connection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            String c[] = new String[columns];
            for (i = 0; i < columns; i++) {
                if (i < columns - 1) {
                    c[i] = md.getColumnName(i + 1);
                    dm.addColumn(c[i]);
                } else if (i == columns - 1) {
                    dm.addColumn("Number of Classes Attends");
                }
            }
            dm.addColumn("Required Percent");
            dm.addColumn("Attained Percent");
            dm.addColumn("Number of Classes Held");
            Object row[] = new Object[columns + 3];
            while (rs.next()) {
                String matnu = rs.getString(3);
                for (j = 0; j < columns + 3; j++) {
                    if (j >= columns && j < columns + 3) {
                        try {
                            connectio();
                            stt = conn.createStatement();
                            queryy = "SELECT `" + course + "` FROM Students WHERE MatricNumber ='" + matnu + "'";
                            rss = stt.executeQuery(queryy);
                            while (rss.next()) {
                                mrk = Double.valueOf(rss.getInt(1));
                            }
                            conn.close();
                        } catch (Exception ex) {
                            jp.showMessageDialog(rootPane, "ERROR IN QUERY4 REF: " + ex, " ERRORR MESSAGE", erm);
                        }
                        comp = (mrk / cla) * 100;
                        if (comp.equals(Double.NaN)) {
                            comp = 0.0;
                        }
                        if (j == columns) {
                            row[j] = perc;
                        }
                        if (j == columns + 1) {
                            row[j] = comp;
                        }
                        if (j == columns + 2) {
                            row[j] = cla;
                        }
                    } else {
                        row[j] = rs.getString(j + 1);
                    }
                }
                dm.addRow(row);

            }
            jTable2.setModel(dm);
            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }

    private void connectio() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "attendance";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
        } catch (Exception ex) {
            jp.showMessageDialog(null, "Error in connection: " + ex, "ERROR MESSAGE:", erm);
        }
    }
    String course, year2, queryy, progress;
    Double mrk, cla, comp;
    Integer perc;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            course = jComboBox3.getSelectedItem().toString().toLowerCase();
            year2 = jComboBox4.getSelectedItem().toString().toLowerCase();
            if (year2.equalsIgnoreCase("100")) {
                progress = "Progress1";
            }
            if (year2.equalsIgnoreCase("200")) {
                progress = "Progress2";
            }
            if (year2.equalsIgnoreCase("300")) {
                progress = "Progress3";
            }
            if (year2.equalsIgnoreCase("400")) {
                progress = "Progress4";
            }
            if (year2.equalsIgnoreCase("500")) {
                progress = "Progress5";
            }
            connection();
            st = con.createStatement();
            query = "SELECT " + progress + ", Percentage FROM Lecturers WHERE CourseCode='" + course + "';";
            rs = st.executeQuery(query);
            while (rs.next()) {
                cla = Double.valueOf(rs.getInt(1));
                perc = rs.getInt(2);
            }
            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
        attendanceProgress();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesno, confirm);
        if (ver.equals(sure)) {
            System.exit(0);
        } else if (ver == never) {
            return;
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
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JRadioButton jRadioButton3;
    public javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void connection() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "attendance";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + dbName, userName, password);
            conn = DriverManager.getConnection(url + dbName, userName, password);
            st = con.createStatement();
            stt = con.createStatement();
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
}
