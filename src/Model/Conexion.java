package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static String URL = "jdbc:mysql://localhost:3306/preguntas";
    private static String USER = "root";
    private static String PASS = "";
    
    // Variable estática para almacenar la única instancia
    private static Connection connection; 
    
    private Conexion() {} // Constructor privado
    
    /**
     * Metodo que cuando es llamado abre una conexión con la bbdd
     * @return Connection
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Driver específico para MySQL
                connection = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Se ha establecido la conexión.");
            } catch (Exception e) {
                System.out.println("No se ha podido establecer conexión con la base de datos.\nERROR: " + e);
            }
        }
        return connection;
    }
}
