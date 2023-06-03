package View;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bStart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bAjustes = new javax.swing.JButton();
        bLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Feito por Miguel e Samuel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 240, 59));

        bStart.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        bStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/start.png"))); // NOI18N
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });
        getContentPane().add(bStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 300, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Benvido ao xogo de cultura general");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 656, 221));

        bAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        bAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjustesActionPerformed(evt);
            }
        });
        getContentPane().add(bAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, 70));

        bLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login-PNG.png"))); // NOI18N
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 160, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        
        Dificultade x = new Dificultade();
        x.show();
        
        dispose();
    }//GEN-LAST:event_bStartActionPerformed

    private void bAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjustesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAjustesActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        Login lg = new Login();
        lg.show();
        
        
    }//GEN-LAST:event_bLoginActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAjustes;
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
