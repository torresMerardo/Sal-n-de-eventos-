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
public class Seventh extends javax.swing.JFrame {

    /**
     * Creates new form Seventh
     */
    public Seventh() {
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

        CreditMoney = new javax.swing.JPanel();
        CreditBank = new javax.swing.JLabel();
        CreditUnit = new javax.swing.JLabel();
        MOneyCredit = new javax.swing.JLabel();
        TYpeDebt = new javax.swing.JLabel();
        CReditBank = new javax.swing.JTextField();
        CReditUnit = new javax.swing.JTextField();
        MoneyCredit = new javax.swing.JTextField();
        TypeDedt = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Behind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreditMoney.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit money"));

        CreditBank.setText("Credit bank:");

        CreditUnit.setText("Credit unit:");

        MOneyCredit.setText("Money on credit:");

        TYpeDebt.setText("Type of debt:");

        TypeDedt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeDedtActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Behind.setText("Behind");
        Behind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BehindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreditMoneyLayout = new javax.swing.GroupLayout(CreditMoney);
        CreditMoney.setLayout(CreditMoneyLayout);
        CreditMoneyLayout.setHorizontalGroup(
            CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditMoneyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreditBank)
                    .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MOneyCredit)
                        .addComponent(CreditUnit, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TYpeDebt, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreditMoneyLayout.createSequentialGroup()
                        .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CReditBank, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeDedt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoneyCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CReditUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(CreditMoneyLayout.createSequentialGroup()
                        .addComponent(Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Behind)
                        .addGap(52, 52, 52))))
        );
        CreditMoneyLayout.setVerticalGroup(
            CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditMoneyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreditBank)
                    .addComponent(CReditBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreditUnit)
                    .addComponent(CReditUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MOneyCredit)
                    .addComponent(MoneyCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TYpeDebt)
                    .addComponent(TypeDedt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(CreditMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Behind)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreditMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreditMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BehindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BehindActionPerformed
        // TODO add your handling code here:
        Third obj= new  Third();
            obj.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_BehindActionPerformed

    private void TypeDedtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeDedtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeDedtActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        if (Save.getText().equalsIgnoreCase("New")){
         saveInterfaz();
       }
       else
           saveInterfaz(); 
             
                         
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(Seventh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seventh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seventh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seventh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seventh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Behind;
    private javax.swing.JTextField CReditBank;
    private javax.swing.JTextField CReditUnit;
    private javax.swing.JLabel CreditBank;
    private javax.swing.JPanel CreditMoney;
    private javax.swing.JLabel CreditUnit;
    private javax.swing.JLabel MOneyCredit;
    private javax.swing.JTextField MoneyCredit;
    private javax.swing.JButton Save;
    private javax.swing.JLabel TYpeDebt;
    private javax.swing.JTextField TypeDedt;
    // End of variables declaration//GEN-END:variables
private void saveInterfaz() {
         if(CReditBank.getText().equals("")
               ||CReditUnit.getText().equals("") 
               || MoneyCredit.getText().equals("")
               || TypeDedt.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Plaese fill the requiered fields","Error",JOptionPane.ERROR_MESSAGE);
       }
    }
}
