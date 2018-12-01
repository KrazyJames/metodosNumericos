package Metodos;

/**
 *
 * @author _
 */
public class Secante {

    public double raiz(Funcion f, double x0, double x1, int iteraciones, double error){
        double raiz = Double.NaN;
        double x2 = x0;
        int k = 0;
        while(Math.abs(f.evaluate(x2))>error){
            x2 = x0-f.evaluate(x0)*(x1-x0)/(f.evaluate(x1)-f.evaluate(x0));
            x0 = x1;
            x1 = x2;
            k++;
        }
        if (k<iteraciones) {
            raiz = x2;
        }
        return raiz;
    }
    
}
