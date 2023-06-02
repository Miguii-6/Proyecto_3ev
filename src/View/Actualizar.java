
package View;

import Model.*;
import java.sql.Connection;

public class Actualizar extends javax.swing.JFrame {
    
    Connection connection = Conexion.getConnection();        
    static Query query = new Query();
    
    public Actualizar() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAtras = new javax.swing.JToggleButton();
        bEnviar = new javax.swing.JToggleButton();
        jTextFieldPregunta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldOpcionA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldOpcionB = new javax.swing.JTextField();
        jTextFieldOpcionC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldOpcionD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxRespuesta = new javax.swing.JComboBox<>();
        jComboBoxBBDD = new javax.swing.JComboBox<>();
        jTextFieldAviso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldPregunta2 = new javax.swing.JTextField();
        jComboBoxRespuesta2 = new javax.swing.JComboBox<>();
        jTextFieldOpcionA2 = new javax.swing.JTextField();
        jTextFieldOpcionB2 = new javax.swing.JTextField();
        jTextFieldOpcionC2 = new javax.swing.JTextField();
        jTextFieldOpcionD2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bAtras.setText("Atrás");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        bEnviar.setText("Enviar");
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pregunta:");

        jLabel2.setText("Respuesta:");

        jLabel3.setText("Opcion A:");

        jLabel4.setText("Opcion B:");

        jLabel5.setText("Opcion C:");

        jLabel6.setText("BORRAR:");

        jLabel8.setText("Opcion D:");

        jComboBoxRespuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A", "B", "C", "D" }));
        jComboBoxRespuesta.setToolTipText("");

        jComboBoxBBDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preguntas nivel fácil", "Preguntas nivel medio", "Preguntas nivel difícil" }));

        jTextFieldAviso.setEditable(false);

        jLabel15.setText("Pregunta:");

        jLabel16.setText("Respuesta:");

        jLabel17.setText("Opcion A:");

        jLabel18.setText("Opcion B:");

        jLabel19.setText("Opcion C:");

        jLabel20.setText("Opcion D:");

        jComboBoxRespuesta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A", "B", "C", "D" }));
        jComboBoxRespuesta2.setToolTipText("");

        jLabel21.setText("Nuevo registro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(306, 306, 306))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jComboBoxBBDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldPregunta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldOpcionA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldOpcionB, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldOpcionC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bAtras)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldAviso)
                                        .addGap(18, 18, 18)
                                        .addComponent(bEnviar))
                                    .addComponent(jTextFieldOpcionD))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel15))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldOpcionC2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(jTextFieldOpcionB2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOpcionA2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRespuesta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPregunta2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOpcionD2))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxBBDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldOpcionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldOpcionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldOpcionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOpcionD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldOpcionA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldOpcionB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldOpcionC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOpcionD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAtras)
                    .addComponent(bEnviar)
                    .addComponent(jTextFieldAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        jTextFieldAviso.setText(query.Update_Query(Conexion.getConnection(),
                jTextFieldPregunta.getText(), 
                jComboBoxRespuesta.getSelectedItem().toString(), 
                jTextFieldOpcionA.getText(),
                jTextFieldOpcionB.getText(), 
                jTextFieldOpcionC.getText(), 
                jTextFieldOpcionD.getText(),
                jComboBoxBBDD.getSelectedItem().toString(),
                jTextFieldPregunta2.getText(), 
                jComboBoxRespuesta2.getSelectedItem().toString(), 
                jTextFieldOpcionA2.getText(),
                jTextFieldOpcionB2.getText(), 
                jTextFieldOpcionC2.getText(), 
                jTextFieldOpcionD2.getText()));
    }//GEN-LAST:event_bEnviarActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAtras;
    private javax.swing.JToggleButton bEnviar;
    private javax.swing.JComboBox<String> jComboBoxBBDD;
    private javax.swing.JComboBox<String> jComboBoxRespuesta;
    private javax.swing.JComboBox<String> jComboBoxRespuesta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldAviso;
    private javax.swing.JTextField jTextFieldOpcionA;
    private javax.swing.JTextField jTextFieldOpcionA2;
    private javax.swing.JTextField jTextFieldOpcionB;
    private javax.swing.JTextField jTextFieldOpcionB2;
    private javax.swing.JTextField jTextFieldOpcionC;
    private javax.swing.JTextField jTextFieldOpcionC2;
    private javax.swing.JTextField jTextFieldOpcionD;
    private javax.swing.JTextField jTextFieldOpcionD2;
    private javax.swing.JTextField jTextFieldPregunta;
    private javax.swing.JTextField jTextFieldPregunta2;
    // End of variables declaration//GEN-END:variables
}
