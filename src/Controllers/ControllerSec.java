package Controllers;

import Metodos.Funcion;
import Metodos.Secante;
import javax.swing.JTextField;

/**
 *
 * @author _
 */
public class ControllerSec {

    public void solve(String ecuacion, JTextField txtRaiz, double x0, double x1, double error) {
        String sol;
        Funcion funcion = new Funcion(ecuacion);
        Secante secante = new Secante();
        sol = String.valueOf(secante.raiz(funcion, x0, x1, error));
        txtRaiz.setText("");
        txtRaiz.setText(sol);
    }
    
}
