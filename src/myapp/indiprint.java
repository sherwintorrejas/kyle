/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.sql.*;
import config.dbConnector;
import internalPages.workerPage;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC-MIKE
 */
public class indiprint extends javax.swing.JFrame {

    /**
     * Creates new form studentForm
     */
    public indiprint() {
        initComponents();
       EMPLOYEEREP();
    }
    

    
    public void close(){
        this.dispose();
        dashBoard dash = new dashBoard();
        dash.setVisible(true);
        workerPage up = new workerPage();
        dash.maindesktop.add(up).setVisible(true);
    }

    
        Color navcolor = new Color(0,51,153);
        Color headcolor = new Color(102,102,255);
        Color bodycolor = new Color(0,102,204);
        
      public String gender;
      public String action;

      public void EMPLOYEEREP(){

 empreport.setText("******************************************************************************\n");
 empreport.setText(empreport.getText()+"---------------------------------EMPLOYEE REPORT------------------------------------\n");
 empreport.setText(empreport.getText()+"******************************************************************************\n");
 
 java.util.Date date = new java.util.Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date);
 
 if(male.isSelected()== true){
    empreport.setText(empreport.getText()+"\nDATE:\n\t\t "+formattedDate+"\n");
 empreport.setText(empreport.getText()+"\nWorker ID:\n\t\t "+st_id.getText()+"\n");
 empreport.setText(empreport.getText()+"\nFIRST NAME:\n\t\t "+ st_fname.getText()+"\n");
 empreport.setText(empreport.getText()+"\nLASTNAME:\n\t\t "+ st_lname.getText()+"\n");
 empreport.setText(empreport.getText()+"\nGENDER:\n\t\t MALE\n");
 empreport.setText(empreport.getText()+"\nSTATUS:\n \t\t"+  st_status.getSelectedItem()+"\n");
 empreport.setText(empreport.getText()+"\nPOSITION:\n\t\t "+  st_pos.getSelectedItem()+"\n");
 empreport.setText(empreport.getText()+"\nADDRESS:\n\t\t "+  st_address.getText()+"\n");
  empreport.setText(empreport.getText()+"\nCONTACT:\n\t\t"+  st_contact.getText()+"\n");

 }else if (female.isSelected()== true){
  empreport.setText(empreport.getText()+"\nDATE:\n\t\t "+formattedDate+"\n");
 empreport.setText(empreport.getText()+"\nSTUDENT ID:\n\t\t "+st_id.getText()+"\n");
 empreport.setText(empreport.getText()+"\nFIRST NAME:\n\t\t "+ st_fname.getText()+"\n");
 empreport.setText(empreport.getText()+"\nLASTNAME:\n\t\t "+ st_lname.getText()+"\n");
 empreport.setText(empreport.getText()+"\nGENDER:\n\t\t FEMALE\n");
 empreport.setText(empreport.getText()+"\nSTATUS:\n\t\t "+  st_status.getSelectedItem()+"\n");
 empreport.setText(empreport.getText()+"\nPOSITION:\n\t\t "+  st_pos.getSelectedItem()+"\n");
 empreport.setText(empreport.getText()+"\nADDRESS:\n\t\t "+  st_address.getText()+"\n");
  empreport.setText(empreport.getText()+"\nCONTACT:\n\t\t "+  st_contact.getText()+"\n");

 }

  
 }
    //print
 public void print(){
 
     try {
         empreport.print();
         JOptionPane.showMessageDialog(this,"PRINT SUCCESSFULL");
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "print failed"+e);
     }
 }
      
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        st_fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        st_lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        st_status = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        st_address = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        st_id = new javax.swing.JTextField();
        st_contact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        st_pos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        empreport = new javax.swing.JTextArea();
        PRINT = new javax.swing.JButton();
        GENREP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE REPORT");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 300, 40);

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(830, 10, 40, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Worker ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("First Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 30));

        st_fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_fname.setOpaque(false);
        jPanel1.add(st_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Status:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 30));

        st_lname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_lname.setOpaque(false);
        jPanel1.add(st_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, 30));

        female.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 100, -1));

        male.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Last Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 30));

        st_status.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed" }));
        jPanel1.add(st_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 210, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Position:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 30));

        st_address.setColumns(20);
        st_address.setRows(5);
        jScrollPane1.setViewportView(st_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 210, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Address:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, 30));

        st_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_id.setEnabled(false);
        st_id.setOpaque(false);
        jPanel1.add(st_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 210, 30));

        st_contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_contact.setOpaque(false);
        jPanel1.add(st_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 220, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Contact:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 80, 30));

        st_pos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        st_pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TANOD", "GARBAGE COLLECTOR", "HEALTH WORKER", "MAINTENANCE WORKER", " " }));
        jPanel1.add(st_pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 210, 30));

        empreport.setColumns(20);
        empreport.setRows(5);
        empreport.setText("************************************************************************\n-------------------EMPLOYEE REPORT------------------------------------\n*********************************************************************\n\nDATE:\n\t\t \n\nWorker ID:\n\t\t \n\nFIRST NAME:\n\t\t \n\nLASTNAME:\n\t\t \n\nGENDER:\n\t\t \n\nSTATUS:\n \t\t\n\nPOSITION:\n\t\t \n\nADDRESS:\n\t\t \n\nCONTACT:\n\t\t");
        jScrollPane2.setViewportView(empreport);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 410, 460));

        PRINT.setText("PRINT");
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });
        jPanel1.add(PRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 130, 30));

        GENREP.setText("GENERATE REPORT");
        GENREP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENREPActionPerformed(evt);
            }
        });
        jPanel1.add(GENREP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        close();
    }//GEN-LAST:event_closeMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        if(male.isSelected()){
            gender = "Male";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
        if(female.isSelected()){
            gender = "Female";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void GENREPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENREPActionPerformed
     EMPLOYEEREP();
    }//GEN-LAST:event_GENREPActionPerformed

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
print();
    }//GEN-LAST:event_PRINTActionPerformed

        
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
            java.util.logging.Logger.getLogger(indiprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indiprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indiprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indiprint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new indiprint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GENREP;
    private javax.swing.JButton PRINT;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel close;
    private javax.swing.JTextArea empreport;
    public javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JRadioButton male;
    public javax.swing.JTextArea st_address;
    public javax.swing.JTextField st_contact;
    public javax.swing.JTextField st_fname;
    public javax.swing.JTextField st_id;
    public javax.swing.JTextField st_lname;
    public javax.swing.JComboBox<String> st_pos;
    public javax.swing.JComboBox<String> st_status;
    // End of variables declaration//GEN-END:variables
}
