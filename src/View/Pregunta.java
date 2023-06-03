package View;

import com.proyecto.preguntas.Preguntas;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Pregunta extends javax.swing.JFrame {

  private final ArrayList<Integer>Usados = new ArrayList<>();
    
    // Arrays con las preguntas, respuesta y opciones
    private final com.proyecto.preguntas.Pregunta[] array_local = Preguntas.crear_Array_preguntas();   
    
    
    private String respuesta;
    
    private int x;
    
    
    public Pregunta() {
        
        initComponents();
        
        
        
        Inicio in=new Inicio();
        in.dispose();
        
         x = numero_random(46);
        Pregunta.setText(array_local[x].getPregunta());
        
        OpcionA.setText(array_local[x].getOpcionA());
        OpcionB.setText(array_local[x].getOpcionB());
        OpcionC.setText(array_local[x].getOpcionC());
        OpcionD.setText(array_local[x].getOpcionD());
        
    }
    
        private void comprobar(String respuesta, int x){
            
            
            
             if (array_local[x].getRespuesta().equals(respuesta)){
                Correcto cor = new Correcto();
                cor.show();
                 
             }else{
                 Incorrecto inc = new Incorrecto();
                 inc.show();
         }
      
        }
         public int numero_random(int z){
        
        int num;
        
        int y;
        
        do{
            
            y = 1;
            
            // Numero aleatorio entre 0 y x
            num = ThreadLocalRandom.current().nextInt(0, z);
                        
            for(Integer i: Usados){
                if (i == num) {
                    y = 0;
                }
            }
            
        }while(y<1);
        
        // Añadirlo al ArrayList de numeros que ya se han usado
        Usados.add(num);
        
        return num;
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        OpcionB = new javax.swing.JButton();
        OpcionA = new javax.swing.JButton();
        OpcionC = new javax.swing.JButton();
        OpcionD = new javax.swing.JButton();
        Pregunta = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OpcionB.setBackground(new java.awt.Color(255, 0, 0));
        OpcionB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        OpcionB.setText("Opción B");
        OpcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionBActionPerformed(evt);
            }
        });
        jPanel1.add(OpcionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 226, 399, 150));

        OpcionA.setBackground(new java.awt.Color(0, 153, 255));
        OpcionA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        OpcionA.setText("Opción A");
        OpcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionAActionPerformed(evt);
            }
        });
        jPanel1.add(OpcionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, 403, 150));

        OpcionC.setBackground(new java.awt.Color(255, 255, 0));
        OpcionC.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        OpcionC.setText("Opción C");
        OpcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionCActionPerformed(evt);
            }
        });
        jPanel1.add(OpcionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 394, 403, 150));

        OpcionD.setBackground(new java.awt.Color(0, 255, 51));
        OpcionD.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        OpcionD.setText("Opción D");
        OpcionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionDActionPerformed(evt);
            }
        });
        jPanel1.add(OpcionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 394, 399, 150));

        Pregunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pregunta.setText("Pregunta");
        jPanel1.add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 838, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OpcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionAActionPerformed
        
        respuesta = "A";
        comprobar(respuesta,x);
        dispose();
    }//GEN-LAST:event_OpcionAActionPerformed

    private void OpcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionBActionPerformed
        
        respuesta = "B";
        comprobar(respuesta,x);
        dispose();
    }//GEN-LAST:event_OpcionBActionPerformed

    private void OpcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionCActionPerformed
        
        respuesta = "C";
        comprobar(respuesta,x);
        dispose();
    }//GEN-LAST:event_OpcionCActionPerformed

    private void OpcionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionDActionPerformed
        
        respuesta = "D";
        comprobar(respuesta,x);
        dispose();
    }//GEN-LAST:event_OpcionDActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpcionA;
    private javax.swing.JButton OpcionB;
    private javax.swing.JButton OpcionC;
    private javax.swing.JButton OpcionD;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
