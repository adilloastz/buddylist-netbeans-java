
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


    public class UserHomePageFrame extends javax.swing.JFrame {
    private int userId;

    public UserHomePageFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasksTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        taskNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        taskDescriptionField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dueDateField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        statusBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        searchData = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuddyList");
        setBackground(new java.awt.Color(65, 109, 109));

        jPanel2.setBackground(new java.awt.Color(65, 109, 109));

        tasksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Task Name", "Description", "Due Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tasksTable.setPreferredSize(new java.awt.Dimension(500, 400));
        jScrollPane1.setViewportView(tasksTable);
        if (tasksTable.getColumnModel().getColumnCount() > 0) {
            tasksTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        taskNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Task Name");

        taskDescriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDescriptionFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Description");

        dueDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueDateFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Due Date (YYYY-MM-DD)");

        submit.setText("Create");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel6.setText("Status");

        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed", "Not Completed" }));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(65, 109, 109));
        jLabel5.setText("Form Task Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taskNameField)
                            .addComponent(jLabel3)
                            .addComponent(taskDescriptionField)
                            .addComponent(jLabel4)
                            .addComponent(dueDateField)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(delete)
                                .addGap(18, 18, 18)
                                .addComponent(Clear))
                            .addComponent(jLabel2)
                            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dueDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        searchData.setText("Search by ID");
        searchData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchDataMouseClicked(evt);
            }
        });
        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BuddyList: Task Management to Enhance Productivity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskNameFieldActionPerformed

    private void taskDescriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskDescriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskDescriptionFieldActionPerformed

    private void dueDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dueDateFieldActionPerformed
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
    }
    
    public void loadTasks(){
      try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/taskmanagement";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            String query = "SELECT * FROM tasks WHERE user_id = " + this.userId;
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Task Name", "Description", "Due Date", "Status"}, 0);
            while (rs.next()) {
                int id = rs.getInt("id");
                String taskName = rs.getString("task_name");
                String taskDescription = rs.getString("task_description");
                String dueDate = rs.getString("due_date");
                String status = rs.getString("status");
                model.addRow(new Object[]{id, taskName, taskDescription, dueDate, status});
            }
            tasksTable.setModel(model);

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String taskName = taskNameField.getText();
        String taskDescription = taskDescriptionField.getText();
        String dueDate = dueDateField.getText();
        String status = statusBox.getSelectedItem().toString();

        if (taskName.isEmpty() || dueDate.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/taskmanagement";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "INSERT INTO tasks (user_id, task_name, task_description, due_date, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, this.userId);
            pst.setString(2, taskName);
            pst.setString(3, taskDescription);
            pst.setString(4, dueDate);
            pst.setString(5, status);

            pst.executeUpdate();
            pst.close();
            con.close();
            loadTasks();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int selectedRow = tasksTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a task to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int taskId = (int) tasksTable.getValueAt(selectedRow, 0);
        String taskName = taskNameField.getText();
        String taskDescription = taskDescriptionField.getText();
        String dueDate = dueDateField.getText();
        String status = statusBox.getSelectedItem().toString();

        if (taskName.isEmpty() || dueDate.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/taskmanagement";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "UPDATE tasks SET task_name = ?, task_description = ?, due_date = ?, status = ? WHERE id = ? AND user_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, taskName);
            pst.setString(2, taskDescription);
            pst.setString(3, dueDate);
            pst.setString(4, status);
            pst.setInt(5, taskId);
            pst.setInt(6, this.userId);

            pst.executeUpdate();
            pst.close();
            con.close();
            loadTasks();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String taskId;
    int notFound = 0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/taskmanagement";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        taskId = searchData.getText();
        if ("".equals(taskId)) {
            JOptionPane.showMessageDialog(new JFrame(), "Task ID is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "SELECT * FROM tasks WHERE id=" + taskId + " AND user_id=" + this.userId;
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                taskNameField.setText(rs.getString("task_name"));
                taskDescriptionField.setText(rs.getString("task_description"));
                dueDateField.setText(rs.getString("due_date"));
                statusBox.setSelectedItem(rs.getString("status"));
                notFound = 1;
            }
            rs.close();
            st.close();
            con.close();

            if (notFound == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Task ID", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception e) {
        System.out.println("Error " + e.getMessage());
    }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       int selectedRow = tasksTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a task to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int taskId = (int) tasksTable.getValueAt(selectedRow, 0);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/taskmanagement";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "DELETE FROM tasks WHERE id = ? AND user_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, taskId);
            pst.setInt(2, this.userId);

            pst.executeUpdate();
            pst.close();
            con.close();
            loadTasks();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
        
    }//GEN-LAST:event_searchDataActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
    taskNameField.setText("");
    taskDescriptionField.setText("");
    dueDateField.setText("");
    statusBox.setSelectedItem("");
    }//GEN-LAST:event_ClearActionPerformed

    private void searchDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchDataMouseClicked
        // TODO add your handling code here:
        searchData.setText("");
    }//GEN-LAST:event_searchDataMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();

    // Kembali ke halaman login
    Login loginFrame = new Login();
    loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        UserHomePageFrame frame = new UserHomePageFrame();
         frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomePageFrame().setVisible(true);
            }
        });
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                UserHomePageFrame x = new UserHomePageFrame();
                x.loadTasks();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dueDateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchData;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JButton submit;
    private javax.swing.JTextField taskDescriptionField;
    private javax.swing.JTextField taskNameField;
    private javax.swing.JTable tasksTable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
