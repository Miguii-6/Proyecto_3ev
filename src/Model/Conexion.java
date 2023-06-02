
package Model;

import java.sql.*;
import java.util.ArrayList;

public class Conexion {
    
    static String URL = "jdbc:mysql://localhost:3306/preguntas";
    static String USER = "root";
    static String PASS = "";  
    static String QUERY = "";
    
    Connection connection;
        
    public Connection getConnection(){
        
        try{
        
            // Driver especifico para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");  

            // Iniciar conexion con BBDD
            connection = DriverManager.getConnection(URL,USER,PASS);      
            
            System.out.println("Se ha establecido la conexión.");
        
        }catch(Exception e){             
            System.out.println("No se ha podido establecer conexion con la base de datos.\n"
                    + "ERROR: "+e);        
        }
        
        return connection;
    }
     
}