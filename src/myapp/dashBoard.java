package myapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import internalPages.*;
import internalPages.dashBoardPage;

/**
 *
 * @author SCC-MIKE
 */
public class dashBoard extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
        initComponents();
        
        dashBoardPage dbp = new dashBoardPage();
        maindesktop.add(dbp).setVisible(true);
        
    }
    
    Color navcolor = new Color(0,51,153);
    Color headcolor = new Color(102,102,255);
    Color bodycolor = new Color(0,102,204);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        students = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        department = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        enrollees = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(0, 51, 153));
        navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbarMouseEntered(evt);
            }
        });
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(0, 51, 153));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-dashboard-50.png"))); // NOI18N
        jLabel1.setText("DASHBOARD");
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 40));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 60));

        students.setBackground(new java.awt.Color(0, 51, 153));
        students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentsMouseExited(evt);
            }
        });
        students.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-worker-50.png"))); // NOI18N
        jLabel2.setText("WORKERS");
        students.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 50));

        navbar.add(students, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 60));

        users.setBackground(new java.awt.Color(0, 51, 153));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-applicant-50.png"))); // NOI18N
        jLabel3.setText("APPLICANTS");
        users.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 40));

        navbar.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 60));

        account.setBackground(new java.awt.Color(0, 51, 153));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-account-50.png"))); // NOI18N
        jLabel4.setText("ACCOUNT");
        account.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, 50));

        navbar.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 170, 70));

        department.setBackground(new java.awt.Color(0, 51, 153));
        department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                departmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                departmentMouseExited(evt);
            }
        });
        department.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-file-50.png"))); // NOI18N
        jLabel5.setText("FILES");
        department.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 50));

        navbar.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 70));

        enrollees.setBackground(new java.awt.Color(0, 51, 153));
        enrollees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrolleesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enrolleesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enrolleesMouseExited(evt);
            }
        });
        enrollees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-approve-50.png"))); // NOI18N
        jLabel6.setText("APPROVEMENT");
        enrollees.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 50));

        navbar.add(enrollees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 60));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 170, 540);

        header.setBackground(new java.awt.Color(0, 102, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 40));

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jPanel1.add(header);
        header.setBounds(170, 0, 760, 40);

        maindesktop.setBackground(new java.awt.Color(0, 102, 204));
        maindesktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maindesktopMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(170, 40, 760, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
            dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
            dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void studentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseEntered
            students.setBackground(bodycolor);
    }//GEN-LAST:event_studentsMouseEntered

    private void studentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseExited
            students.setBackground(navcolor);
    }//GEN-LAST:event_studentsMouseExited

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setBackground(bodycolor);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(navcolor);
    }//GEN-LAST:event_usersMouseExited

    private void studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseClicked
        workerPage up = new workerPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_studentsMouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        dashBoardPage dbp = new dashBoardPage();
        maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void maindesktopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maindesktopMouseEntered
       
    }//GEN-LAST:event_maindesktopMouseEntered

    private void navbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMouseEntered

    }//GEN-LAST:event_navbarMouseEntered

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(bodycolor);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setBackground(navcolor);
    }//GEN-LAST:event_accountMouseExited

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        settingsPage set = new settingsPage();
       maindesktop.add(set).setVisible(true);
    }//GEN-LAST:event_accountMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        userPage up = new userPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_usersMouseClicked

    private void departmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseClicked
        filePage up = new filePage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_departmentMouseClicked

    private void departmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseEntered
       department.setBackground(bodycolor);
    }//GEN-LAST:event_departmentMouseEntered

    private void departmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseExited
        department.setBackground(navcolor);
    }//GEN-LAST:event_departmentMouseExited

    private void enrolleesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolleesMouseClicked
        approvementsPage up = new approvementsPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_enrolleesMouseClicked

    private void enrolleesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolleesMouseEntered
       enrollees.setBackground(bodycolor);
    }//GEN-LAST:event_enrolleesMouseEntered

    private void enrolleesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolleesMouseExited
        enrollees.setBackground(navcolor);
    }//GEN-LAST:event_enrolleesMouseExited

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel department;
    private javax.swing.JPanel enrollees;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel students;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
