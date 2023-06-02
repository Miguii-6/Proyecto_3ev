
package Model;

import Model.*;
import java.sql.*;

public class Query {
    
    static Conexion connection;
    static String Query;
    
    
    public String[][] SelectAllFromTable(Connection connection, String tabla){
            
            // Construimos la query que se va a lanzar a la BBDD
            switch (tabla) {
                case "Preguntas nivel fácil":
                    Query = "SELECT * FROM PREGUNTAS_F";                      
                    break;
                case "Preguntas nivel medio":
                    Query = "SELECT * FROM PREGUNTAS_M";                      
                    break;
                case "Preguntas nivel difícil":
                    Query = "SELECT * FROM PREGUNTAS_D";                      
                    break;
            }
            
            try{  

                // Statement permite mandar consultas SQL a la BBDD
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  

                // ResultSet nos permite recoger el resultado de nuestra consulta
                ResultSet resultSet = statement.executeQuery(Query);

                // Obtener el número de filas y columnas del resultado
                resultSet.last(); // Nos situamos en la ultima fila
                int filas = resultSet.getRow(); // Tomamos nota de su numero
                resultSet.beforeFirst(); // Nos situamos antes de la primera fila
                int columnas = resultSet.getMetaData().getColumnCount(); // Tomamos nota del numero de columnas

                // Crear el array bidimensional para llenar con los resultados
                String[][] preguntas = new String[filas][columnas];

                // Situar filas en el primer resultado
                int fila = 0;

                // Llenar el array con los datos del resultado
                while (resultSet.next()) {                
                    for (int columna = 0; columna < columnas; columna++) {
                        preguntas[fila][columna] = resultSet.getString(columna + 1);
                    }
                    fila++;                
                }

                // Cerramos conexión
                connection.close();   

                return preguntas;

            }catch(Exception e){ 
                System.out.println("ERROR: "+e);
            }            

            return null;
        
    }
    
    public String[][] Select_Query(Connection connection, String ID, String Pregunta, String Respuesta, 
            String OpcionA, String OpcionB, String OpcionC, String OpcionD, String tabla){
        
        //Seleccionamos la tabla en la que haremos la query.
        switch (tabla) {
            case "Preguntas nivel fácil":
                tabla = "PREGUNTAS_F";                      
                break;
            case "Preguntas nivel medio":
                tabla = "PREGUNTAS_M";                      
                break;
            case "Preguntas nivel difícil":
                tabla = "PREGUNTAS_D";                      
                break;
        }
        
        // Construimos nuestra query parametrizada
        Query = "SELECT * FROM "+tabla+" WHERE 1=1";        
        
        if (ID != null && !ID.isEmpty()) {
            // Si el valor es distinto de nulo y no está en blanco añade esto a la consulta
            Query += " AND ID = ?"; 
        }
        if (Pregunta != null && !Pregunta.isEmpty()) {
            Query += " AND Pregunta = ?"; 
        }
        if (Respuesta != null && !Respuesta.isEmpty()) {
            Query += " AND Respuesta = ?";
        }
        if (OpcionA != null && !OpcionA.isEmpty()) {
            Query += " AND OpcionA = ?";
        }
        if (OpcionB != null && !OpcionB.isEmpty()) {
            Query += " AND OpcionB = ?";
        }
        if (OpcionC != null && !OpcionC.isEmpty()) {
            Query += " AND OpcionC = ?";
        }
        if (OpcionD != null && !OpcionD.isEmpty()) {
            Query += " AND OpcionD = ?";
        }
        
        try{                          
            // Statement permite mandar consultas SQL a la BBDD
            PreparedStatement statement = connection.prepareStatement(Query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            int parametroIndex = 1;
            
            if (ID != null && !ID.isEmpty()) {
                statement.setString(parametroIndex, ID);
                parametroIndex++;
            }

            if (Pregunta != null && !Pregunta.isEmpty()) {
                statement.setString(parametroIndex, Pregunta);
                parametroIndex++;
            }

            if (Respuesta != null && !Respuesta.isEmpty()) {
                statement.setString(parametroIndex, Respuesta);
                parametroIndex++;
            }

            if (OpcionA != null && !OpcionA.isEmpty()) {
                statement.setString(parametroIndex, OpcionA);
                parametroIndex++;
            }

            if (OpcionB != null && !OpcionB.isEmpty()) {
                statement.setString(parametroIndex, OpcionB);
                parametroIndex++;
            }

            if (OpcionC != null && !OpcionC.isEmpty()) {
                statement.setString(parametroIndex, OpcionC);
                parametroIndex++;
            }
            
            if (OpcionD != null && !OpcionD.isEmpty()) {
                statement.setString(parametroIndex, OpcionD);
                parametroIndex++;
            }
            // ResultSet nos permite recoger el resultado de nuestra consulta
            ResultSet resultSet = statement.executeQuery();
            
            // Obtener el número de filas y columnas del resultado
            resultSet.last(); // Nos situamos en la ultima fila
            int filas = resultSet.getRow(); // Tomamos nota de su numero
            resultSet.beforeFirst(); // Nos situamos antes de la primera fila
            int columnas = resultSet.getMetaData().getColumnCount(); // Tomamos nota del numero de columnas

            // Crear el array bidimensional para llenar con los resultados
            String[][] resultados = new String[filas][columnas];
            // Situar filas en el primer resultado
            int fila = 0;

            // Llenar el array con los datos del resultado
            while (resultSet.next()) {                
                for (int columna = 0; columna < columnas; columna++) {
                    resultados[fila][columna] = resultSet.getString(columna + 1);
                }
                fila++;                
            }
            
            // Cerramos conexión
            connection.close();   
            
            return resultados;
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return null;
        
    }
    
    public String[][] Insert_Query(Connection connection, String Pregunta, String Respuesta, 
            String OpcionA, String OpcionB, String OpcionC, String OpcionD, String tabla){
    
        //Seleccionamos la tabla en la que haremos la query.
        switch (tabla) {
            case "Preguntas nivel fácil":
                tabla = "PREGUNTAS_F";                      
                break;
            case "Preguntas nivel medio":
                tabla = "PREGUNTAS_M";                      
                break;
            case "Preguntas nivel difícil":
                tabla = "PREGUNTAS_D";                      
                break;
        }
        
        Query = "INSERT INTO "+tabla+" (`Pregunta`, `Respuesta`, `OpcionA`, `OpcionB`, `OpcionC`, `OpcionD`) VALUES ('"+Pregunta+"', '"+Respuesta+"', '"+OpcionA+"', '"+OpcionB+"', '"+OpcionC+"', '"+OpcionD+"')";       
        
        try{       
            // Realiza la inserción en la base de datos
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.executeUpdate();
            
            String ID = null;
            String[][] resultados = Select_Query(connection, ID, Pregunta, Respuesta, OpcionA, OpcionB, OpcionC, OpcionD, tabla);
            
            // Cerramos conexión
            connection.close();
            
            return resultados;
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return null;
        
    }
    
    public String Delete_Query(Connection connection, String Pregunta, String Respuesta, 
            String OpcionA, String OpcionB, String OpcionC, String OpcionD, String tabla){
        
        //Seleccionamos la tabla en la que haremos la query.
        switch (tabla) {
            case "Preguntas nivel fácil":
                tabla = "PREGUNTAS_F";                      
                break;
            case "Preguntas nivel medio":
                tabla = "PREGUNTAS_M";                      
                break;
            case "Preguntas nivel difícil":
                tabla = "PREGUNTAS_D";                      
                break;
        }
        
        Query = "DELETE FROM "+tabla+" WHERE Pregunta = '"+Pregunta+"' AND Respuesta = '"+Respuesta+
                "' AND OpcionA = '"+OpcionA+"' AND OpcionB = '"+OpcionB+"' AND OpcionC = '"+OpcionC+"' AND OpcionD = '"+OpcionD+"'";  
        
        try{       
            // Crea un objeto Statement para ejecutar la consulta
            Statement statement = connection.createStatement();

            // Ejecuta la consulta
            int filasAfectadas = statement.executeUpdate(Query);

            String resultado;
            
            // Dependiendo de las filas que se borren envia un mensaje o no
            if (filasAfectadas > 0) {
                resultado = ("Se han eliminado " + filasAfectadas + " filas.");
            } else {
                resultado = "No se ha eliminado ninguna fila.";
            }
            
            // Cerramos conexión
            connection.close();
            
            return resultado;
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return null;
        
    }
        
    public void Update_Query(Connection connection, String Pregunta, String Respuesta, 
            String OpcionA, String OpcionB, String OpcionC, String OpcionD, String tabla, 
            String Pregunta2, String Respuesta2, String OpcionA2, String OpcionB2, String OpcionC2, String OpcionD2){
    
        //Seleccionamos la tabla en la que haremos la query.
        switch (tabla) {
            case "Preguntas nivel fácil":
                tabla = "PREGUNTAS_F";                      
                break;
            case "Preguntas nivel medio":
                tabla = "PREGUNTAS_M";                      
                break;
            case "Preguntas nivel difícil":
                tabla = "PREGUNTAS_D";                      
                break;
        }
        
        Query = "";
                
        try{       
            // Realiza la inserción en la base de datos
            //Statement statement = connection.executeUpdate(Query);
            // Cerramos conexión
            connection.close();
                        
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
    }
    
        
}
