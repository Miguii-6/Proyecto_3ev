package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CLogin {
    private List<Observador> observadores = new ArrayList<>();
    
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
    
    public void validaUsuario(JTextField tfUsuario, JPasswordField pfPassword){
    
        try {
            //para volver conectar a base de datos
            ResultSet rs=null;   
            //para a consulta de despois
            PreparedStatement ps= null;
            
            Model.CConexion objetoConexion = new Model.CConexion();
            
            //creamos a consulta
            String consulta="select * from login where Usuario =(?) and Contraseña=(?)";
            //preparamos a consulta
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            // O getPassword non e unha cadena asique, cambiamoslle o formato de chad a unha cadena
            String password = String.valueOf(pfPassword.getPassword());
            
            ps.setString(1, tfUsuario.getText());
            ps.setString(2,password);
            
            //que execute a consulta
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null,"El Usuario es Correcto");
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El Usuario es INCORRECTO, VUELVA A INTENTAR");
            }
            
      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e.toString());
        }
    }
    
}