package Metodos;

/**
 *
 * @author _
 */
public class Multiplicacion {

    /**
     * Multiplica dos matrices dadas
     *
     * @param m1 la primer matriz
     * @param m2 la segunda matriz
     * @return la matriz resultante
     */
    public double[][] multiplicar(double[][] m1, double[][] m2) {
        double[][] m3 = new double[m1[0].length][m2.length];
        for (int x = 0; x < m3.length; x++) {
            for (int y = 0; y < m3[0].length; y++) {
                for (int z = 0; z < m3.length; z++) {
                    m3[x][y] += m1[x][z] * m2[z][y];
                }
            }
        }
        return m3;
    }

}
