/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icon
 */
public class hightconverter extends javax.swing.JFrame {

    /**
     * Creates new form hightconverter
     */
    public hightconverter() {
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

        jPanel1 = new javax.swing.JPanel();
        ftlbl = new javax.swing.JLabel();
        inchlbl = new javax.swing.JLabel();
        fttxt = new javax.swing.JTextField();
        inchtxt = new javax.swing.JTextField();
        convertbt = new javax.swing.JButton();
        clrbt = new javax.swing.JButton();
        xtbt = new javax.swing.JButton();
        cmtxt = new javax.swing.JTextField();
        cmlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Feet Inches Conversion to Centimeters");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        ftlbl.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        ftlbl.setText("Feet");

        inchlbl.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        inchlbl.setText("Inches");

        convertbt.setBackground(new java.awt.Color(51, 255, 255));
        convertbt.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        convertbt.setText("Convert To");
        convertbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbtActionPerformed(evt);
            }
        });

        clrbt.setBackground(new java.awt.Color(51, 255, 51));
        clrbt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clrbt.setText("Clear");
        clrbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtActionPerformed(evt);
            }
        });

        xtbt.setBackground(new java.awt.Color(255, 0, 0));
        xtbt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        xtbt.setForeground(new java.awt.Color(255, 255, 255));
        xtbt.setText("Exit");
        xtbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtbtActionPerformed(evt);
            }
        });

        cmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmtxtActionPerformed(evt);
            }
        });

        cmlbl.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        cmlbl.setText("Centimeters");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(clrbt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inchlbl)
                            .addComponent(ftlbl))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xtbt)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convertbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(cmlbl)
                .addGap(18, 18, 18)
                .addComponent(cmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inchlbl)
                    .addComponent(inchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(convertbt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrbt)
                    .addComponent(xtbt))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtxtActionPerformed

    private void xtbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtbtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_xtbtActionPerformed

    private void clrbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtActionPerformed
        
        fttxt.setText("");
        inchtxt.setText("");
        cmtxt.setText("");
    }//GEN-LAST:event_clrbtActionPerformed

    private void convertbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertbtActionPerformed
        
        double feet,inch,centm;
        
        feet = Double.parseDouble(fttxt.getText());
        inch = Double.parseDouble(inchtxt.getText());
        
        centm = (feet * 12 + inch) * 2.56;
        
        cmtxt.setText(String.valueOf(centm));
        
    }//GEN-LAST:event_convertbtActionPerformed

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
            java.util.logging.Logger.getLogger(hightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hightconverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clrbt;
    private javax.swing.JLabel cmlbl;
    private javax.swing.JTextField cmtxt;
    private javax.swing.JButton convertbt;
    private javax.swing.JLabel ftlbl;
    private javax.swing.JTextField fttxt;
    private javax.swing.JLabel inchlbl;
    private javax.swing.JTextField inchtxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton xtbt;
    // End of variables declaration//GEN-END:variables
}
