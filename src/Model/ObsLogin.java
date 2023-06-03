
package Model;

import View.Login;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class ObsLogin implements Observer {
    private Login vistaLogin;

    public ObsLogin(Login vistaLogin) {
        this.vistaLogin = vistaLogin;
    }


    @Override
    public void update(Observable o, Object arg) {
        //Mensaje para si se validou o usuario correctamente
        JOptionPane.showMessageDialog(null, "Se ha validado el usuario correctamente");

    }

}
