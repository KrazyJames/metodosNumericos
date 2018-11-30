package Controllers;

import Metodos.Funcion;
import Metodos.Secante;
import javax.swing.JTextField;

/**
 *
 * @author _
 */
public class ControllerSec {

    public void solve(String text, JTextField txtRaiz, double e, double x0, double x1) {
        String sol;
        Funcion f = new Funcion(text);
        Secante s = new Secante();
        int i =20;
        sol = String.valueOf(s.raiz(f, x0, x1, i, e));
        txtRaiz.setText(sol);
    }
    
}
