
package Model;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CFacil {
    public void preguntasFaciles(){
        
        try {
            //para volver conectar a base de datos
            ResultSet rs=null;   
            //para a consulta de despois
            PreparedStatement ps= null;
            
            Model.CConexion objetoConexion = new Model.CConexion();
            
            //creamos a consulta
            String consulta="select * from preguntasfaciles";
            //preparamos a consulta
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            //que execute a consulta
            rs = ps.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e.toString());
        }
    }
}
