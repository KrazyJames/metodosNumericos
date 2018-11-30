package Metodos;

/**
 *
 * @author _
 */
public class Secante {

    public double raiz(Funcion f, double x0, double x1, int iteraciones, double error) {
        double raiz = Double.NaN;
        double x2 = x0;
        int k = 0;
        while (Math.abs(f.evaluate(x2)) > error && k < iteraciones) {
            x2 = x1 - f.evaluate(x1) * (x1 - x0) / (f.evaluate(x1) - f.evaluate(x0));
            x0 = x1;
            x1 = x2;
            k++;
            System.out.println("x" + k + " = " + x0);
            System.out.println("x" + (k + 1) + " = " + x1);
            System.out.println(k);
            System.out.println(x2);
        }
        System.out.println(k);
        if (k < iteraciones) {
            raiz = x2;
        }
        return raiz;
    }

}
