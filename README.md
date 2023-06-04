# Programa preguntas cultura general

---
Este programa recreativo tiene como objetivo la resolución de preguntas mediante 4 opciones dadas. También implementa una forma de iniciar sesión en una base de datos y la administración (inserción, borrado actualizado, consulta) de entradas en otra BBDD. Todo esto implementando el patrón de diseño MVC, Modelo-Vista-Controlador en Java.

### Arquitectura MVC

---
Nuestro programa sigue la arquitectura Modelo Vista Controlador para definir y separar las funcionalidades de cada elemento del código. Esto facilita su lectura, mantenimiento y posible escalabilidad.

El patrón de diseño sigue el siguiente esquema:

```mermaid
graph LR
    A[Modelo] --> B[Controlador]
    B --> C[Vista]
    C --> B
    B --> A
```

El modelo (Model). Engloba toda la lógica del proyecto. Eligiendo que preguntas mostrar y haciendo consultas a la BBDD.
La vista (View). La parte del proyecto con la que el usuario interactúa y proporciona datos a los métodos.
El controlador (Controler). Actua de intermediario gestionando las interacciones. Contiene la clase Main.

### Diagrama de clases

---

```mermaid
classDiagram
    class Main {
        + main(String[]): void
    }
    class CConexion {
        - conectar: Connection
        - url: String
        - usuario: String
        - password: String
        + estableceConexion(): Connection
    }
    class CDificil {
        + preguntasDificiles(): void
    }
    class CMedia {
        + preguntasMedias(): void
    }
    class CFacil {
        + preguntasFaciles(): void
    }
    class CLogin {
        - obs: List<Observador>
        + agregarObservador(observador: Observador): void
        - notificarObs(): void
        + validaUsuario(tfUsuario: JTextField, pfPassword: JPasswordField): void
    }
    class Conexion {
        - URL: String
        - USER: String
        - PASS: String
        - connection: Connection
        + getConnection(): Connection
    }
    class Logica {
        - connection: Connection
        - numsUsados: ArrayList<Integer>
        + numero_random(bound: int): int
        + preguntaRandom(connection: Connection, tabla: String): String[]
    }
    class ObsLogin {
        - vistaLogin: Login
        + update(o: Observable, arg: Object): void
    }
    class Observador {
        + actualizar(): void
    }
    class Query {
        - connection: Conexion
        - Query: String
        + SelectAllFromTable(connection: Connection, tabla: String): String[][]
        + Select_Query(connection: Connection, ID: String, Pregunta: String, Respuesta: String, OpcionA: String, OpcionB: String, OpcionC: String, OpcionD: String, tabla: String): String[][]
    }

    Main --> Inicio
    Main "1" --> "*" CConexion
    Main --> "1" CLogin
    CConexion --> "1" Conexion
    CDificil --> CConexion
    CMedia --> CConexion
    CFacil --> CConexion
    CLogin --> "1" CConexion
    CLogin --> "1" ObsLogin
    CLogin --> "*" Observador
    CLogin --> "1" JTextField
    CLogin --> "1" JPasswordField
    Conexion --> "1" Connection
    Logica --> Conexion
    Logica --> "1" Query
    ObsLogin --> "1" Login
    Observador <|-- ObsLogin
    Query --> Conexion
```

### Diagrama de secuencias

---

```mermaid
sequenceDiagram
    participant Main
    participant Inicio
    participant CConexion
    participant CDificil
    participant CMedia
    participant CFacil
    participant CLogin
    participant Observador
    participant Query
    participant Conexion
    participant Logica
    participant ObsLogin
    
    Main->>+Inicio: main(String[] args)
    Inicio-->>-Main: setVisible(true)
    
    Main->>+CConexion: estableceConexion()
    CConexion-->>-Main: Connection
    
    Main->>+CLogin: validaUsuario(JTextField, JPasswordField)
    CLogin-->>-Main: -
    
    CLogin->>+CConexion: estableceConexion()
    CConexion-->>-CLogin: Connection
    
    Main->>+Query: SelectAllFromTable(Connection, String)
    Query-->>-Main: String[][]
    
    Main->>+Logica: numero_random(int)
    Logica-->>-Main: int
    
    Main->>+Query: SelectAllFromTable(Connection, String)
    Query-->>-Main: String[][]
    
    Logica->>+Query: SelectAllFromTable(Connection, String)
    Query-->>-Logica: String[][]
    
    Logica->>+Query: SelectAllFromTable(Connection, String)
    Query-->>-Logica: String[][]
    
    Logica->>+Query: Select_Query(Connection, String, String, String, String, String, String, String, String)
    Query-->>-Logica: String[][]
    
    Logica->>+Query: SelectAllFromTable(Connection, String)
    Query-->>-Logica: String[][]
    
    Logica->>+Query: SelectAllFromTable(Connection, String)
    Query-->>-Logica: String[][]
    
    CLogin->>+JOptionPane: showMessageDialog(null, "El Usuario es Correcto")
    CLogin->>+JOptionPane: showMessageDialog(null, "El Usuario es INCORRECTO, VUELVA A INTENTAR")
    
    CLogin->>+Observador: actualizar()
    Observador-->>-CLogin: -
    
    ObsLogin->>+JOptionPane: showMessageDialog(null, "Se ha validado el usuario correctamente")
    
    ObsLogin->>+JOptionPane: showMessageDialog(null, "Se ha validado el usuario correctamente")
```
