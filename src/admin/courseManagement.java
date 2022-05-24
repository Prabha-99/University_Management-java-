/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

/**
 *
 * @author Anonymous
 */
public class courseManagement extends javax.swing.JFrame {

    /**
     * Creates new form courseManagement
     */
    public courseManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whitePanel1 = new javax.swing.JPanel();
        coursemanagementHeading = new javax.swing.JLabel();
        courseIDLabel = new javax.swing.JLabel();
        courseIDField = new javax.swing.JTextField();
        depIDLabel = new javax.swing.JLabel();
        depIDField = new javax.swing.JTextField();
        courseNameLabel = new javax.swing.JLabel();
        courseNameField = new javax.swing.JTextField();
        newCourseButton = new javax.swing.JButton();
        editCourseButton = new javax.swing.JButton();
        deleteCourseButton = new javax.swing.JButton();
        resetCourseButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        studentsTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coursemanagementHeading.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        coursemanagementHeading.setForeground(new java.awt.Color(0, 51, 102));
        coursemanagementHeading.setText("Manage Courses");

        courseIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        courseIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        courseIDLabel.setText("courseID :");

        depIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        depIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        depIDLabel.setText("Dep ID :");

        courseNameLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        courseNameLabel.setForeground(new java.awt.Color(0, 51, 102));
        courseNameLabel.setText("Name :");

        newCourseButton.setBackground(new java.awt.Color(0, 51, 102));
        newCourseButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        newCourseButton.setForeground(new java.awt.Color(204, 204, 204));
        newCourseButton.setText("New");
        newCourseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        editCourseButton.setBackground(new java.awt.Color(0, 51, 102));
        editCourseButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        editCourseButton.setForeground(new java.awt.Color(204, 204, 204));
        editCourseButton.setText("Edit");
        editCourseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deleteCourseButton.setBackground(new java.awt.Color(0, 51, 102));
        deleteCourseButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        deleteCourseButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteCourseButton.setText("Delete");
        deleteCourseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        resetCourseButton.setBackground(new java.awt.Color(0, 51, 102));
        resetCourseButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        resetCourseButton.setForeground(new java.awt.Color(204, 204, 204));
        resetCourseButton.setText("Reset");
        resetCourseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        closeButton.setBackground(new java.awt.Color(0, 51, 102));
        closeButton.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "Fname", "Lname", "Address", "DOB", "Gender", "Mobile", "Email", "Password", "Level"
            }
        ));
        jTable1.setRowHeight(20);
        studentsTable.setViewportView(jTable1);

        javax.swing.GroupLayout whitePanel1Layout = new javax.swing.GroupLayout(whitePanel1);
        whitePanel1.setLayout(whitePanel1Layout);
        whitePanel1Layout.setHorizontalGroup(
            whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton))
            .addGroup(whitePanel1Layout.createSequentialGroup()
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanel1Layout.createSequentialGroup()
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(depIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(studentsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursemanagementHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(whitePanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(newCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        whitePanel1Layout.setVerticalGroup(
            whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel1Layout.createSequentialGroup()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(coursemanagementHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(studentsTable, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whitePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        setVisible(false);
        new adminDashboard().setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField courseIDField;
    private javax.swing.JLabel courseIDLabel;
    private javax.swing.JTextField courseNameField;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JLabel coursemanagementHeading;
    private javax.swing.JButton deleteCourseButton;
    private javax.swing.JTextField depIDField;
    private javax.swing.JLabel depIDLabel;
    private javax.swing.JButton editCourseButton;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newCourseButton;
    private javax.swing.JButton resetCourseButton;
    private javax.swing.JScrollPane studentsTable;
    private javax.swing.JPanel whitePanel1;
    // End of variables declaration//GEN-END:variables
}
