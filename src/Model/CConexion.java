
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {
    Connection conectar;
    
    String url="jdbc:mysql://localhost/bd_preguntas";
    String usuario="root";
    String password="";
    
    
    
    
    
    public Connection estableceConexion(){
    
        try {
            //driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //conexion a la base de datos
            conectar = DriverManager.getConnection(url, usuario, password);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Problemas en la conexion"+ e.toString());
        }
        return conectar;
        
    }
    
    
}
