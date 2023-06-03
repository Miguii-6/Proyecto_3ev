package Controller;

import View.*;

public class Main {

    public static void main(String[] args) {
       Inicio in=new Inicio();
       in.setVisible(true);

        Config_BBDD config_BBDD = new Config_BBDD();
        
        // Hacer visible el JFrame
        config_BBDD.setVisible(true);
        

    }
    
}
