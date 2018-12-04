package Metodos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author _
 */
public class Secante {

    List<IteracionSecante> ArrayIteraciones = new ArrayList<>();
    
    /**
     * Obtiene la raiz de una ecuacion dada
     *
     * @param f la ecuacion
     * @param x0 el intervalo menor
     * @param x1 el intervalo mayor
     * @param error el error (0-100)
     * @return la raiz
     */
    public double raiz(Funcion f, double x0, double x1, double error) {
        double raiz;
        double x2 = 0;
        int k = 0;
        double e = 100;
        while (e > error) {
            k++;
            x2 = x1 - f.evaluate(x1) * (x1 - x0) / (f.evaluate(x1) - f.evaluate(x0));
            e = getErrorPorcentual(x2, x1);
            x0 = x1;
            x1 = x2;
            System.out.println("Iteracion: "+k);
            System.out.println("X"+k+" :"+x2);
            System.out.println("Error: "+e);
            ArrayIteraciones.add(new IteracionSecante(k,x2,e));
        }
        raiz = x2;
        return raiz;
    }

    /**
     * Obtiene el error porcentual
     *
     * @param p parametro primario
     * @param p2 parametro secundario
     * @return el error
     */
    public double getErrorPorcentual(double p, double p2) {
        double error = Math.abs((p - p2) / p) * 100;
        return error;
    }

    /**
     * Historial de iteraciones
     * @return las iteraciones
     */
    public List<IteracionSecante> getArrayIteraciones() {
        return ArrayIteraciones;
    }

}
