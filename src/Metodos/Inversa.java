package Metodos;

/**
 *
 * @author _
 */
public class Inversa {

    private static boolean e = true;

    public boolean isFactible() {
        return e;
    }

    /**
     * Obtiene la determinante de una matriz
     *
     * @param matriz la matriz
     * @param i la posición
     * @return la determinante
     */
    public static double determinante(double[][] matriz, int i) {
        switch (matriz.length) {
            case 1: {
                double det = matriz[0][0];
                return det;
            }
            case 2: {
                double det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
                return det;
            }
            default: {
                double det = 0;
                for (int j = 0; j < matriz.length; j++) {
                    double[][] temp = subMatriz(i, j, matriz);
                    det = det + Math.pow(-1, (i + j)) * matriz[i][j] * determinante(temp, i);
                }
                return det;
            }
        }
    }

    /**
     * Obtiene la submatriz de una amtriz
     *
     * @param i la fila
     * @param j la columna
     * @param matriz la matriz
     * @return la sub matriz
     */
    public static double[][] subMatriz(int i, int j, double[][] matriz) {
        double[][] temp = new double[matriz.length - 1][matriz.length - 1];
        int x = 0, y = 0;
        for (int k = 0; k < matriz.length; k++) {
            if (k != i) {
                y = 0;
                for (int l = 0; l < matriz.length; l++) {
                    if (l != j) {
                        temp[x][y] = matriz[k][l];
                        y++;
                    }
                }
                x++;
            }

        }
        return temp;
    }

    /**
     * Obtiene la adjunta de la matriz
     *
     * @param matriz la matriz
     * @return la adjunta
     */
    public static double[][] adjunta(double[][] matriz) {
        double[][] adjunta = new double[matriz.length][matriz.length];
        for (int i = 0; i < adjunta.length; i++) {
            for (int j = 0; j < adjunta.length; j++) {
                double[][] temp = subMatriz(i, j, matriz);
                double e = Math.pow(-1, i + j) * determinante(temp, 0);
                adjunta[i][j] = e;
            }

        }
        return adjunta;
    }

    /**
     * Obtiene la matriz transpuesta
     *
     * @param matriz la matriz
     * @return la transpuesta
     */
    public static double[][] transpuesta(double[][] matriz) {
        double[][] transpuesta = new double[matriz.length][matriz.length];
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta.length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }

        }
        return transpuesta;
    }

    /**
     * Calcula la inversa de la matriz
     *
     * @param matriz la matriz
     * @return la matriz inversa
     */
    public static double[][] inversa(double[][] matriz) {
        double det = determinante(matriz, 0);
        if (det == 0) {
            e = false;
            return matriz;
        } else {
            double[][] adjunta = adjunta(matriz);
            double[][] transpuesta = transpuesta(adjunta);
            double[][] inversa = new double[matriz.length][matriz.length];
            for (int i = 0; i < inversa.length; i++) {
                for (int j = 0; j < inversa.length; j++) {
                    inversa[i][j] = transpuesta[i][j] / det;
                }

            }
            return inversa;
        }
    }

    /**
     * Multiplica por inversion de matrices
     *
     * @param inversa
     * @param b
     * @return la solucion
     */
    public static double[] solucion(double[][] inversa, double[] b) {
        double[] x = new double[b.length];
        for (int i = 0; i < inversa.length; i++) {
            for (int j = 0; j < inversa.length; j++) {
                x[i] += inversa[i][j] * b[j];
            }
        }
        return x;
    }

    public double[] solve(double[][] A, double[] b) {
        double[][] inversa = inversa(A);
        double[] x = solucion(inversa, b);
        return x;
    }
}
