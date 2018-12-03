package Metodos;

/**
 *
 * @author _
 */
public class MinCuad {

    /**
     * Resuleve por minimos cuadrados
     *
     * @param x la posicion
     * @param y el vector
     * @return la Y en la posicion X
     */
    public double getY(int x, double[] y) {
        double eX = 0;
        double eX2 = 0;
        double eY = 0;
        double eXY = 0;
        for (int i = 0; i < y.length; i++) {
            double x2 = i + 1;
            eX += x2;
            eY += y[i];
            eXY += (x2 * y[i]);
            eX2 += Math.pow(x2, 2);
        }
        double d = (y.length * eX2) - (Math.pow(eX, 2));
        double m = ((y.length * eXY) - (eX * eY)) / d;
        double b = ((eY * eX2) - (eX * eXY)) / d;
        double Y = (m * x) + b;
        return Y;
    }

}
