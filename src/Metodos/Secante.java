package Metodos;

/**
 *
 * @author _
 */
public class Secante {

    public double raiz(Funcion f, double x0, double x1, double error) {
        double raiz;
        double x2 = 0;
        int k = 0;
        int i = 20;
        double e = 100;
        while (e > error) {
            x2 = x1 - f.evaluate(x1) * (x1 - x0) / (f.evaluate(x1) - f.evaluate(x0));
            e = getErrorPorcentual(x1, x2);
            x0 = x1;
            x1 = x2;

            System.out.println("x" + (k + 1) + " = " + x0);
            System.out.println("x" + (k + 2) + " = " + x1);
            k++;
            System.out.println(k);
            System.out.println(x2);
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

}
