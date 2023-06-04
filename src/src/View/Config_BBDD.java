
package View;

import Model.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class Config_BBDD extends javax.swing.JFrame {
    
    Connection connection = Conexion.getConnection();     
    
    static Query query = new Query();
    static String tabla_default = "Preguntas nivel fácil";
    
    public Config_BBDD() {
        initComponents();
        
        mostrarDatos(tabla_default);
        
    }
    
    // Método que dado el nombre de una tabla muestra esa tabla por la JTable
    public void mostrarDatos(String tabla){  
        
        // Array lleno con la respuesta de la query
        String[][] data = query.SelectAllFromTable(Conexion.getConnection(), tabla);
        
        // Crear los nombres de las columnas
        String[] nombresColumnas = {"ID", "Pregunta", "Respuesta",
            "Opcion A", "Opcion B", "Opcion C", "Opcion D"};
        
        // Configurar el modelo de la tabla
        jTable.setModel(new DefaultTableModel(data,nombresColumnas));
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        bBuscar = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        bRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pregunta", "Respuesta", "Opcion A", "Opcion B", "Opcion C", "Opcion D"
            }
        ));
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bAdd.setText("Añadir");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bBorrar.setText("Borrar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preguntas nivel fácil", "Preguntas nivel medio", "Preguntas nivel difícil" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        bRefrescar.setText("Refrescar");
        bRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBuscar)
                        .addGap(24, 24, 24)
                        .addComponent(bAdd)
                        .addGap(18, 18, 18)
                        .addComponent(bActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(bBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(bRefrescar)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBuscar)
                    .addComponent(bAdd)
                    .addComponent(bActualizar)
                    .addComponent(bBorrar)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRefrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        Buscar añ = new Buscar();
        añ.show(); // Mostrar otro JFrame
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        Insertar in = new Insertar();
        in.show(); // Mostrar otro JFrame
    }//GEN-LAST:event_bAddActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        Actualizar ac = new Actualizar();
        ac.show(); // Mostrar otro JFrame
    }//GEN-LAST:event_bActualizarActionPerformed
    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        Borrar br = new Borrar();
        br.show(); // Mostrar otro JFrame
    }//GEN-LAST:event_bBorrarActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // Almacenamos en una variable el contendido de los desplegables del combobox
        String textoComboBox = jComboBox.getSelectedItem().toString();
        // Muestra una tabla diferente dependiendo del contenido del combobox
        mostrarDatos(textoComboBox);
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void bRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefrescarActionPerformed
        String textoComboBox = jComboBox.getSelectedItem().toString();
        mostrarDatos(textoComboBox);
    }//GEN-LAST:event_bRefrescarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Config_BBDD().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bRefrescar;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
