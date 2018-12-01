package Metodos;

/**
 *
 * @author _
 */
public class Seidel {

    /**
     * Comprueba si tiene convergencia
     *
     * @param A la matriz
     * @return si es convergente
     */
    public static boolean hasConvergencia(double[][] A) {
        for (int i = 0; i < A.length; i++) {
            double diagonal = Math.abs(A[i][i]);
            double suma = 0;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    suma += Math.abs(A[i][j]);
                }
            }
            if (suma >= diagonal) {
                return false;
            }
        }
        return true;
    }

    /**
     * Obtiene un sistema diagonalmente dominante (No funciona al 100% = Mejorar)
     *
     * @param A la matriz
     * @return la matriz diagonalmente dominante
     */
    public static double[][] getDiagonalDominante(double[][] A) {
        double[][] dominante = new double[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (Math.abs(A[i][i]) < Math.abs(A[j][i])) {
                    for (int k = 0; k <= A.length; k++) {
                        double tmp = A[i][k];
                        A[i][k] = A[j][k];
                        A[j][k] = tmp;
                    }
                }
            }
        }
        return dominante;
    }

    /**
     * Resuelve por Gauss-Seidel
     *
     * @param precision la precision de la solución
     * @param A la matriz
     * @param b el vector
     * @return la solución
     */
    public static double[] seidel(double precision, double[][] A, double[] b) {
        double[] x = zeros(new double[b.length]);
        double[] z = zeros(new double[x.length]);
        double[] e = zeros(new double[b.length]);
        int c = 0;
        double max = 100;
        while (max > precision) {
            c++;
            for (int i = 0; i < x.length; i++) {
                double s = 0;
                double[] sumatoria = zeros(new double[b.length]);
                double[] xtemp = x;
                for (int j = 0; j < b.length; j++) {
                    if (i != j) {
                        sumatoria[j] = A[i][j] * xtemp[j];
                    }
                }
                for (int j = 0; j < sumatoria.length; j++) {
                    s += sumatoria[j];
                }
                x[i] = (b[i] - s) / A[i][i];
            }

            for (int i = 0; i < e.length; i++) {
                e[i] = getErrorPorcentual(x[i], z[i]);
            }
            max = e[0];
            for (int i = 0; i < e.length; i++) {
                if (e[i] > max) {
                    max = e[i];
                }
            }
            for (int i = 0; i < x.length; i++) {
                z[i] = x[i];
            }
//            imprimirIteracion(c, x, e);
        }
        System.out.println("Iteraciones: " + c);
        return x;
    }

    /**
     * Obtiene el error porcentual
     *
     * @param p parametro primario
     * @param p2 parametro secundario
     * @return el error
     */
    public static double getErrorPorcentual(double p, double p2) {
        double error = Math.abs((p - p2) / p) * 100;
        return error;
    }

    /**
     * Rellena con ceros un vector
     *
     * @param v el vector
     * @return el vector relleno
     */
    public static double[] zeros(double[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        return v;
    }

}
