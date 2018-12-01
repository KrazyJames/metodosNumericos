package Controllers;

import Metodos.Funcion;
import Metodos.Secante;
import javax.swing.JTextField;

/**
 *
 * @author _
 */
public class ControllerSec {

    /**
     * Resuelve por metodo de secante
     *
     * @param ecuacion la ecuacion
     * @param txtRaiz el textfield
     * @param x0 intervalo inferior
     * @param x1 intervalo superior
     * @param error el error permitido (0-100)
     */
    public void solve(String ecuacion, JTextField txtRaiz, double x0, double x1, double error) {
        String sol;
        Funcion funcion = new Funcion(ecuacion);
        Secante secante = new Secante();
        sol = String.valueOf(secante.raiz(funcion, x0, x1, error));
        txtRaiz.setText("");
        txtRaiz.setText(sol);
    }

}
