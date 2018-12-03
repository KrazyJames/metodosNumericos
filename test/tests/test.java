package tests;

import Metodos.Funcion;
import Metodos.Multiplicacion;
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
//        Multiplicacion m = new Multiplicacion();
//        double[][] m1 = {{1,0},{0,1}};
//        double[][] m2 = {{2,3},{4,5}};
//        double[][] m3 = m.multiplicar(m1,m2);
//        for (int i = 0; i < m3.length; i++) {
//            for (int j = 0; j < m3[0].length; j++) {
//                System.out.println(m3[i][j]);
//            }
//        }
        
    }
}
