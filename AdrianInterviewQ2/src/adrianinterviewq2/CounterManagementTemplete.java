/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrianinterviewq2;

import javax.swing.JButton;

/**
 *
 * @author looho
 */
public class CounterManagementTemplete extends javax.swing.JFrame {

    /**
     * Creates new form CounterManagementTemplete
     */
    public CounterManagementTemplete() {
        initComponents();
        setVisible(true);
    }

    public void setDisableButton(int choice) {
        
        switch(choice){
            case 1:
                this.CallNext1.setEnabled(false);
                this.CompCur1.setEnabled(false);
                this.GoOffline1.setEnabled(false);
                break;
            case 2:
                this.CallNext2.setEnabled(false);
                this.CompCur2.setEnabled(false);
                this.GoOffline2.setEnabled(false);
                break;
            case 3:
                this.CallNext3.setEnabled(false);
                this.CompCur3.setEnabled(false);
                this.GoOffline3.setEnabled(false);
                break;
            case 4:
                this.CallNext4.setEnabled(false);
                this.CompCur4.setEnabled(false);
                this.GoOffline4.setEnabled(false);
                break;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CompCur1 = new javax.swing.JButton();
        GoOffline1 = new javax.swing.JButton();
        CallNext1 = new javax.swing.JButton();
        CallNext2 = new javax.swing.JButton();
        CompCur2 = new javax.swing.JButton();
        GoOffline2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CallNext3 = new javax.swing.JButton();
        CompCur3 = new javax.swing.JButton();
        GoOffline3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CallNext4 = new javax.swing.JButton();
        CompCur4 = new javax.swing.JButton();
        GoOffline4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Counter Management");

        jLabel2.setText("Counter 1");

        CompCur1.setText("CompleteCurrent");
        CompCur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompCur1ActionPerformed(evt);
            }
        });

        GoOffline1.setText("GoOffline");
        GoOffline1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoOffline1ActionPerformed(evt);
            }
        });

        CallNext1.setText("CallNext");
        CallNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallNext1ActionPerformed(evt);
            }
        });

        CallNext2.setText("CallNext");
        CallNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallNext2ActionPerformed(evt);
            }
        });

        CompCur2.setText("CompleteCurrent");
        CompCur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompCur2ActionPerformed(evt);
            }
        });

        GoOffline2.setText("GoOffline");
        GoOffline2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoOffline2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Counter 2");

        CallNext3.setText("CallNext");
        CallNext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallNext3ActionPerformed(evt);
            }
        });

        CompCur3.setText("CompleteCurrent");
        CompCur3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompCur3ActionPerformed(evt);
            }
        });

        GoOffline3.setText("GoOffline");
        GoOffline3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoOffline3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Counter 3");

        CallNext4.setText("CallNext");
        CallNext4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallNext4ActionPerformed(evt);
            }
        });

        CompCur4.setText("CompleteCurrent");
        CompCur4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompCur4ActionPerformed(evt);
            }
        });

        GoOffline4.setText("GoOffline");
        GoOffline4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoOffline4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Counter 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CompCur1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(GoOffline1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CallNext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CompCur2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CallNext2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GoOffline2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CompCur3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(GoOffline3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CallNext3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CompCur4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(CallNext4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GoOffline4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GoOffline3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CompCur3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CallNext3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GoOffline1)
                                    .addComponent(GoOffline2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CompCur1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CallNext1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(CompCur2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CallNext2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GoOffline4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CompCur4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CallNext4)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void GoOffline1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoOffline1ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter.GoOffline();
    }//GEN-LAST:event_GoOffline1ActionPerformed

    private void CompCur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompCur1ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter.ComCur();
    }//GEN-LAST:event_CompCur1ActionPerformed

    private void GoOffline2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoOffline2ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter2.GoOffline();
    }//GEN-LAST:event_GoOffline2ActionPerformed

    private void GoOffline3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoOffline3ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter3.GoOffline();
    }//GEN-LAST:event_GoOffline3ActionPerformed

    private void GoOffline4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoOffline4ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter4.GoOffline();
    }//GEN-LAST:event_GoOffline4ActionPerformed

    private void CompCur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompCur2ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter2.ComCur();
    }//GEN-LAST:event_CompCur2ActionPerformed

    private void CompCur3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompCur3ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter3.ComCur();
    }//GEN-LAST:event_CompCur3ActionPerformed

    private void CompCur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompCur4ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter4.ComCur();
    }//GEN-LAST:event_CompCur4ActionPerformed

    private void CallNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallNext1ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter.CallNext();
    }//GEN-LAST:event_CallNext1ActionPerformed

    private void CallNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallNext2ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter2.CallNext();
    }//GEN-LAST:event_CallNext2ActionPerformed

    private void CallNext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallNext3ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter3.CallNext();
    }//GEN-LAST:event_CallNext3ActionPerformed

    private void CallNext4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallNext4ActionPerformed
        // TODO add your handling code here:
        AdrianInterviewQ2.counter4.CallNext();
    }//GEN-LAST:event_CallNext4ActionPerformed

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
            java.util.logging.Logger.getLogger(CounterManagementTemplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounterManagementTemplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounterManagementTemplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounterManagementTemplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounterManagementTemplete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CallNext1;
    private javax.swing.JButton CallNext2;
    private javax.swing.JButton CallNext3;
    private javax.swing.JButton CallNext4;
    private javax.swing.JButton CompCur1;
    private javax.swing.JButton CompCur2;
    private javax.swing.JButton CompCur3;
    private javax.swing.JButton CompCur4;
    private javax.swing.JButton GoOffline1;
    private javax.swing.JButton GoOffline2;
    private javax.swing.JButton GoOffline3;
    private javax.swing.JButton GoOffline4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
