
package View;

import Model.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class Insertar extends javax.swing.JFrame {
    
    Connection connection = Conexion.getConnection(); 
    static Query query = new Query();
    
    public Insertar() {
        initComponents();
        
    }
    
    public void mostrarDatos(){  
        
        // Array lleno con la respuesta de la query
        String[][] data = query.Insert_Query(Conexion.getConnection(), 
                jTextFieldPregunta.getText(), 
                jComboBoxRespuesta.getSelectedItem().toString(), 
                jTextFieldOpcionA.getText(),
                jTextFieldOpcionB.getText(), 
                jTextFieldOpcionC.getText(), 
                jTextFieldOpcionD.getText(),
                jComboBoxBBDD.getSelectedItem().toString());
        
        // Crear los nombres de las columnas
        String[] nombresColumnas = {"ID", "Pregunta", "Respuesta",
            "Opcion A", "Opcion B", "Opcion C", "Opcion D"};
        
        // Configurar el modelo de la tabla
        jTable.setModel(new DefaultTableModel(data,nombresColumnas));
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextFieldOpcionD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxRespuesta = new javax.swing.JComboBox<>();
        jComboBoxBBDD = new javax.swing.JComboBox<>();

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

        jLabel6.setText("NUEVA ENTRADA:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pregunta", "Respuesta", "Opcion A", "Opcion B", "Opcion C", "Opcion D"
            }
        ));
        jScrollPane2.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel8.setText("Opcion D:");

        jComboBoxRespuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A", "B", "C", "D" }));
        jComboBoxRespuesta.setToolTipText("");

        jComboBoxBBDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preguntas nivel fácil", "Preguntas nivel medio", "Preguntas nivel difícil" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(557, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBoxBBDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(jTextFieldPregunta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOpcionA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOpcionB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOpcionC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bEnviar))
                            .addComponent(jTextFieldOpcionD))
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(306, 306, 306))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAtras)
                    .addComponent(bEnviar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_bEnviarActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAtras;
    private javax.swing.JToggleButton bEnviar;
    private javax.swing.JComboBox<String> jComboBoxBBDD;
    private javax.swing.JComboBox<String> jComboBoxRespuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldOpcionA;
    private javax.swing.JTextField jTextFieldOpcionB;
    private javax.swing.JTextField jTextFieldOpcionC;
    private javax.swing.JTextField jTextFieldOpcionD;
    private javax.swing.JTextField jTextFieldPregunta;
    // End of variables declaration//GEN-END:variables
}
