/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package admin_panel;

import bl.user_data;
import javax.swing.JOptionPane;

/**
 *
 * @author Khizar Fayyaz
 */
public class paragraph_management extends javax.swing.JFrame {

    /**
     * Creates new form paragraph_management
     */
    public paragraph_management() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_so1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_del = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_upd = new javax.swing.JButton();
        txt_para = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_ins = new javax.swing.JButton();
        btn_so = new javax.swing.JButton();

        btn_so1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_so1.setForeground(new java.awt.Color(0, 0, 255));
        btn_so1.setText("Sign Out");
        btn_so1.setBorderPainted(false);
        btn_so1.setContentAreaFilled(false);
        btn_so1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_so1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        btn_del.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_del.setText("Delete");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Paragraph:");

        btn_upd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_upd.setText("Update");
        btn_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Paragraph Management");

        btn_ins.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_ins.setText("Insert");
        btn_ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insActionPerformed(evt);
            }
        });

        btn_so.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_so.setForeground(new java.awt.Color(0, 0, 255));
        btn_so.setText("Sign Out");
        btn_so.setBorderPainted(false);
        btn_so.setContentAreaFilled(false);
        btn_so.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_so.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_para, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ins, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_upd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_so))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btn_so)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_para, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ins)
                    .addComponent(btn_upd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_del)
                    .addComponent(btn_back))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        admin_panel ap= new admin_panel();
        ap.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_so1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        admin_login ag=new admin_login();
        ag.setVisible(true);
    }//GEN-LAST:event_btn_so1ActionPerformed

    private void btn_soActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        admin_login ag=new admin_login();
        ag.setVisible(true);
    }//GEN-LAST:event_btn_soActionPerformed

    private void btn_insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insActionPerformed
        // TODO add your handling code here:
        int p_id=0;
        String para="";
        try{
         p_id = Integer.parseInt(txt_id.getText());
         para=txt_para.getText();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        }
        if(para.length()>80)
             JOptionPane.showMessageDialog(null, "Paragraph too long");
        else{
        user_data ud=new user_data();
        if(ud.insert_paragraph(p_id, para))
       JOptionPane.showMessageDialog(null, "Successfully Entered");
        }
    }//GEN-LAST:event_btn_insActionPerformed

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed
        // TODO add your handling code here:
        int p_id=0;
        String para="";
        try{
        p_id = Integer.parseInt(txt_id.getText());
        para=txt_para.getText();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        }
        if(para.length()>80)
             JOptionPane.showMessageDialog(null, "Paragraph too long");
        else{
        user_data ud=new user_data();
        if(ud.update_paragraph(p_id, para))
       JOptionPane.showMessageDialog(null, "Successfully Updated");
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        int p_id =0;
        try{
        p_id = Integer.parseInt(txt_id.getText());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        }
         user_data ud=new user_data();
        if(ud.delete_paragraph(p_id))
       JOptionPane.showMessageDialog(null, "Successfully Deleted");
    }//GEN-LAST:event_btn_delActionPerformed

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
            java.util.logging.Logger.getLogger(paragraph_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paragraph_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paragraph_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paragraph_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paragraph_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_ins;
    private javax.swing.JButton btn_so;
    private javax.swing.JButton btn_so1;
    private javax.swing.JButton btn_upd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_para;
    // End of variables declaration//GEN-END:variables
}
