

package Model;

import View.Login;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class ObsLogin implements Observer {
    private Login vistaLogin;
    
    
    /**
     * Metoodo para ver o login
     * @param vistaLogin 
     */
    public ObsLogin(Login vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    /**
     * oberva cuando se inicia o sesión o usuario
     * @param o     the observable object.
     * @param arg   an argument passed to the method.
     */
    @Override
    public void update(Observable o, Object arg) {
        //Mensaje para si se validou o usuario correctamente
        JOptionPane.showMessageDialog(null, "Se ha validado el usuario correctamente");

    }

}
