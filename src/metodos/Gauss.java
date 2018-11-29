package metodos;

/**
 *
 * @author _
 */
public class Gauss {

    private static final double EPSILON = 1e-10;
    private boolean e = false;

    public boolean hasError() {
        return e;
    }
    
    /**
     * Resuelve por gauss
     * @param A la matriz a resolver
     * @param b las constantes
     * @return la solucion en vector
     */
    public double[] gauss(double[][] A, double[] b) {
        int n = b.length;
        for (int p = 0; p < n; p++) {
            //Encontrar pivote y cambiar
            int max = p;
            for (int i = p + 1; i < n; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }
            //Temporales
            double[] temp1 = A[p];
            A[p] = A[max];
            A[max] = temp1;
            double temp2 = b[p];
            b[p] = b[max];
            b[max] = temp2;
            //Singular o no
            if (Math.abs(A[p][p]) <= EPSILON) {
                e = true;
            }
            //Pivote en A y b
            for (int i = p + 1; i < n; i++) {
                double a = A[i][p] / A[p][p];
                b[i] -= a * b[p];
                for (int j = p; j < n; j++) {
                    A[i][j] -= a * A[p][j];
                }
            }
        }
        //Resolución de b
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }
        return x;
    }
}
