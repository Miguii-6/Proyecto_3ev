
package Model;

import Model.*;
import java.sql.*;

public class Query {
    
    static Conexion connection;
    static String Query;
    
    
    /**
     * Método que dada una conexión y una tabla de la BBDD devuelve todas sus entradas
     * @param connection
     * @param tabla
     * @return array bidimensional con los resultados de la query
     */
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
                
                resultSet.close();

                return preguntas;

            }catch(Exception e){ 
                System.out.println("ERROR: "+e);
            }            

            return null;
        
    }
    
    /**
     * Método que dados unos parámetros busca una entrada correspondiente en la BBDD
     * @param connection Conexion a la BBDD
     * @param ID parámetro de la BBDD
     * @param Pregunta parámetro de la BBDD
     * @param Respuesta parámetro de la BBDD
     * @param OpcionA parámetro de la BBDD
     * @param OpcionB parámetro de la BBDD
     * @param OpcionC parámetro de la BBDD
     * @param OpcionD parámetro de la BBDD
     * @param tabla tabla en la que se ejecutará la query
     * @return array bidimensional con los resultados de la query
     */
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
            
            resultSet.close();
                        
            return resultados;
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return null;
        
    }
    
    /**
     * 
     * @param connection
     * @param Pregunta
     * @param Respuesta
     * @param OpcionA
     * @param OpcionB
     * @param OpcionC
     * @param OpcionD
     * @param tabla
     * @return 
     */
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
                        
            return resultados;
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return null;
        
    }
    
    /**
     * Método que dados los datos de una entrada en la BBDD
     * hace una consulta DELETE para borrarlos
     * @param connection Conexion a la BBDD
     * @param Pregunta parámetro de la BBDD
     * @param Respuesta parámetro de la BBDD
     * @param OpcionA parámetro de la BBDD
     * @param OpcionB parámetro de la BBDD
     * @param OpcionC parámetro de la BBDD
     * @param OpcionD parámetro de la BBDD
     * @param tabla tabla en la que se ejecutarán los cambios
     * @return mensaje
     */
    public String Delete_Query(Connection connection, String Pregunta, String Respuesta, 
            String OpcionA, String OpcionB, String OpcionC, String OpcionD, String tabla){
        
        String mensaje = null;
        
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
            
            // Dependiendo de las filas que se borren envia un mensaje o no
            if (filasAfectadas > 0) {
                mensaje = ("Se han eliminado " + filasAfectadas + " filas.");
            } else {
                mensaje = "No se ha eliminado ninguna fila.";
            }
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return mensaje;
        
    }
    
    /**
     * Método que dados los datos de una entrada en la BBDD y a los que se desea actualizar
     * hace una consulta de UPDATE a la BBDD       
     * 
     * @param connection Conexion a la BBDD
     * @param Pregunta parámetro de la entrada original
     * @param Respuesta parámetro de la entrada original
     * @param OpcionA parámetro de la entrada original
     * @param OpcionB parámetro de la entrada original
     * @param OpcionC parámetro de la entrada original
     * @param OpcionD parámetro de la entrada original
     * @param tabla tabla en la que se ejecutarán los cambios
     * @param Pregunta2 parámetro actualizado
     * @param Respuesta2 parámetro actualizado
     * @param OpcionA2 parámetro actualizado
     * @param OpcionB2 parámetro actualizado
     * @param OpcionC2 parámetro actualizado
     * @param OpcionD2 parámetro actualizado 
     * @return mensaje 
     */
    public String Update_Query(Connection connection, String Pregunta, String Respuesta, 
            String OpcionA, String OpcionB, String OpcionC, String OpcionD, String tabla, 
            String Pregunta2, String Respuesta2, String OpcionA2, String OpcionB2, String OpcionC2, String OpcionD2){
    
        String mensaje = null;
        
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
        
        // Creamos la consulta de actualización
        Query = "UPDATE " + tabla + " SET " +
                "Pregunta = '" + Pregunta2 + "', " +
                "Respuesta = '" + Respuesta2 + "', " +
                "OpcionA = '" + OpcionA2 + "', " +
                "OpcionB = '" + OpcionB2 + "', " +
                "OpcionC = '" + OpcionC2 + "', " +
                "OpcionD = '" + OpcionD2 + "' " +
                "WHERE " +
                "Pregunta = '" + Pregunta + "' AND " +
                "Respuesta = '" + Respuesta + "' AND " +
                "OpcionA = '" + OpcionA + "' AND " +
                "OpcionB = '" + OpcionB + "' AND " +
                "OpcionC = '" + OpcionC + "' AND " +
                "OpcionD = '" + OpcionD + "'";
                
        try{       
            // Ejecutar la consulta de actualización
            Statement statement = connection.createStatement();

            // Ejecuta la consulta
            int filasAfectadas = statement.executeUpdate(Query);
            
            // Dependiendo de las filas que se actualicen envia un mensaje o no
            if (filasAfectadas > 0) {
                mensaje = ("Se han actualizado con éxito.");
            } else {
                mensaje = "No se han hecho cambios.";
            }
                                    
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return mensaje;
        
    }
    
    /**
     * 
     */
    public String[] Select_Pregunta(Connection connection, int ID, String tabla){
        
        
        // Construimos nuestra query parametrizada
        Query = "SELECT * FROM "+tabla+" WHERE ID = '"+ID+"'";        
        
        try{      
            
            // Statement permite mandar consultas SQL a la BBDD
            Statement statement = connection.createStatement();
            // ResultSet nos permite recoger el resultado de nuestra consulta
            ResultSet resultSet = statement.executeQuery(Query);
            
            // Crear el array bidimensional para llenar con los resultados
            String[] resultado = new String[6];
        
            if (resultSet.next()) {
                resultado[0] = resultSet.getString(1); // Pregunta
                resultado[1] = resultSet.getString(2); // Respuesta
                resultado[2] = resultSet.getString(3); // Opcion A
                resultado[3] = resultSet.getString(4); // Opcion B
                resultado[4] = resultSet.getString(5); // Opcion C
                resultado[5] = resultSet.getString(6); // Opcion B
            }
            
            resultSet.close();
            
            return resultado;
            
        }catch(Exception e){ 
            System.out.println("ERROR: "+e);
        }
        
        return null;
        
    }
}
