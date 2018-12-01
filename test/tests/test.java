package tests;

import Metodos.Funcion;
import Metodos.Secante;

/**
 *
 * @author _
 */
public class test {

    public static void main(String[] args) {
        Funcion f = new Funcion("sin(x)+cos(x)-1.1");
        Secante s = new Secante();
        s.raiz(f, 0, 1, 1);
    }
}
