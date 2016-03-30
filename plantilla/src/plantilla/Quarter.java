/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import javax.swing.JOptionPane;

/**
 *
 * @author andres
 */
public class Quarter extends javax.swing.JFrame {

    /**
     * Creates new form Quarter
     */
    public Quarter() {
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

        EventsMonth = new javax.swing.JPanel();
        OneEvent = new javax.swing.JButton();
        SecondEvent = new javax.swing.JButton();
        ThirdEvent = new javax.swing.JButton();
        QuarterEvent = new javax.swing.JButton();
        FifthEvent = new javax.swing.JButton();
        Follow = new javax.swing.JButton();
        SixthEvent = new javax.swing.JButton();
        SeventhEvent = new javax.swing.JButton();
        EighthEvent = new javax.swing.JButton();
        NinethEvent = new javax.swing.JButton();
        TenthEvent = new javax.swing.JButton();
        Behind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EventsMonth.setBorder(javax.swing.BorderFactory.createTitledBorder("Events of the month"));

        OneEvent.setText("One event");
        OneEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneEventActionPerformed(evt);
            }
        });

        SecondEvent.setText("Second event");
        SecondEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondEventActionPerformed(evt);
            }
        });

        ThirdEvent.setText("Third event");
        ThirdEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdEventActionPerformed(evt);
            }
        });

        QuarterEvent.setText("Quarter event");
        QuarterEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuarterEventActionPerformed(evt);
            }
        });

        FifthEvent.setText("Fifth event");
        FifthEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifthEventActionPerformed(evt);
            }
        });

        Follow.setText("Delete");
        Follow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FollowActionPerformed(evt);
            }
        });

        SixthEvent.setText("Sixth event");
        SixthEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixthEventActionPerformed(evt);
            }
        });

        SeventhEvent.setText("Seventh event");
        SeventhEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeventhEventActionPerformed(evt);
            }
        });

        EighthEvent.setText("Eighth event");
        EighthEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EighthEventActionPerformed(evt);
            }
        });

        NinethEvent.setText("Nineth event");
        NinethEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NinethEventActionPerformed(evt);
            }
        });

        TenthEvent.setText("Tenth event");
        TenthEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenthEventActionPerformed(evt);
            }
        });

        Behind.setText("Behind");
        Behind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BehindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EventsMonthLayout = new javax.swing.GroupLayout(EventsMonth);
        EventsMonth.setLayout(EventsMonthLayout);
        EventsMonthLayout.setHorizontalGroup(
            EventsMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsMonthLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(EventsMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NinethEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EighthEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SixthEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FifthEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuarterEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThirdEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SecondEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OneEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SeventhEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TenthEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addComponent(Follow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Behind)
                .addContainerGap())
        );
        EventsMonthLayout.setVerticalGroup(
            EventsMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsMonthLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(OneEvent)
                .addGap(18, 18, 18)
                .addComponent(SecondEvent)
                .addGap(18, 18, 18)
                .addComponent(ThirdEvent)
                .addGap(18, 18, 18)
                .addComponent(QuarterEvent)
                .addGap(18, 18, 18)
                .addComponent(FifthEvent)
                .addGap(18, 18, 18)
                .addComponent(SixthEvent)
                .addGap(18, 18, 18)
                .addComponent(SeventhEvent)
                .addGap(18, 18, 18)
                .addComponent(EighthEvent)
                .addGap(18, 18, 18)
                .addComponent(NinethEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TenthEvent)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventsMonthLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EventsMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Behind)
                    .addComponent(Follow))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EventsMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventsMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FifthEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FifthEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FifthEventActionPerformed

    private void FollowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FollowActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Are you sure to delete this record?",
                "Delete record", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
                JOptionPane.showMessageDialog(this, "Deleted record!" , "Delete record",
                JOptionPane.INFORMATION_MESSAGE);
        }
            
    }//GEN-LAST:event_FollowActionPerformed

    private void BehindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BehindActionPerformed
        // TODO add your handling code here:
        Third obj= new  Third();
            obj.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_BehindActionPerformed

    private void OneEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_OneEventActionPerformed

    private void SecondEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SecondEventActionPerformed

    private void ThirdEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ThirdEventActionPerformed

    private void QuarterEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuarterEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_QuarterEventActionPerformed

    private void SixthEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixthEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SixthEventActionPerformed

    private void SeventhEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeventhEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SeventhEventActionPerformed

    private void EighthEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EighthEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EighthEventActionPerformed

    private void NinethEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NinethEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NinethEventActionPerformed

    private void TenthEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenthEventActionPerformed
        // TODO add your handling code here:
        Fifth obj = new    Fifth();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TenthEventActionPerformed

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
            java.util.logging.Logger.getLogger(Quarter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quarter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quarter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quarter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quarter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Behind;
    private javax.swing.JButton EighthEvent;
    private javax.swing.JPanel EventsMonth;
    private javax.swing.JButton FifthEvent;
    private javax.swing.JButton Follow;
    private javax.swing.JButton NinethEvent;
    private javax.swing.JButton OneEvent;
    private javax.swing.JButton QuarterEvent;
    private javax.swing.JButton SecondEvent;
    private javax.swing.JButton SeventhEvent;
    private javax.swing.JButton SixthEvent;
    private javax.swing.JButton TenthEvent;
    private javax.swing.JButton ThirdEvent;
    // End of variables declaration//GEN-END:variables
}
