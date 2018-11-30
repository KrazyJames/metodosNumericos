package Metodos;

/**
 *
 * @author _
 */
public class Jordan {

    private final int N;
    private final double[][] a;
    private static double[] sol;
    private static final double EPSILON = 1e-10;
    private boolean e = false;
    
    /**
     *
     * @param A La matriz
     * @param b las constantes
     */
    public Jordan(double[][] A, double[] b) {
        N = b.length;

        //Matriz aumentada
        a = new double[N][N + N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = A[i][j];
            }
        }
        //Rellena identidad
        for (int i = 0; i < N; i++) {
            a[i][N + i] = 1.0;
        }
        //Rellena constantes
        for (int i = 0; i < N; i++) {
            a[i][N + N] = b[i];
        }
        solve();
        assert check(A, b);
    }

    /**
     * Resuelve por gauss jordan
     */
    private void solve() {
        for (int p = 0; p < N; p++) {
            int max = p;
            for (int i = p + 1; i < N; i++) {
                if (Math.abs(a[i][p]) > Math.abs(a[max][p])) {
                    max = i;
                }
            }
            swap(p, max);
            if (Math.abs(a[p][p]) < EPSILON) {
                e = true;
                break;
            }
            pivot(p, p);
        }
    }

    /**
     * Intercambia las lineas
     *
     * @param row1
     * @param row2
     */
    private void swap(int row1, int row2) {
        double[] temp = a[row1];
        a[row1] = a[row2];
        a[row2] = temp;
    }

    /**
     * Haya el pivote
     *
     * @param p
     * @param q
     */
    private void pivot(int p, int q) {
        for (int i = 0; i < N; i++) {
            double alfa = a[i][q] / a[p][q];
            for (int j = 0; j <= N + N; j++) {
                if (i != p && j != q) {
                    a[i][j] -= alfa * a[p][j];
                }
            }
        }
        // Hacer cero
        for (int i = 0; i < N; i++) {
            if (i != p) {
                a[i][q] = 0.0;
            }
        }

        for (int j = 0; j <= N + N; j++) {
            if (j != q) {
                a[p][j] /= a[p][q];
            }
        }
        a[p][q] = 1.0;
    }

    /**
     * Extrae la solucion para Ax=b
     *
     * @return la solucion
     */
    public double[] primal() {
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i][i]) > EPSILON) {
                x[i] = a[i][N + N] / a[i][i];
            } else if (Math.abs(a[i][N + N]) > EPSILON) {
                return null;
            }
        }
        return x;
    }

    /**
     * Estrae la solucion para yA = 0, yb != 0
     *
     * @return null o no
     */
    public double[] dual() {
        double[] y = new double[N];
        for (int i = 0; i < N; i++) {
            if ((Math.abs(a[i][i]) <= EPSILON) && (Math.abs(a[i][N + N]) > EPSILON)) {
                for (int j = 0; j < N; j++) {
                    y[j] = a[i][N + j];
                }
                return y;
            }
        }
        return null;
    }

    /**
     * Comprueba si tiene solucion
     *
     * @return factibilidad
     */
    public boolean isFactible() {
        return primal() != null;
    }

    /**
     * Demuestra si Ax=b o yA=0, yb != 0
     *
     * @param A Matriz
     * @param b constantes
     * @return Si es factible
     */
    private boolean check(double[][] A, double[] b) {
        if (isFactible()) {
            double[] x = primal();
            for (int i = 0; i < N; i++) {
                double suma = 0.0;
                for (int j = 0; j < N; j++) {
                    suma += A[i][j] * x[j];
                }
                if (Math.abs(suma - b[i]) > EPSILON) {
                    System.out.println("No factible");
                    System.out.println(i + " = " + b[i] + ", suma = " + suma + "\n");
                    return false;
                }
            }
            return true;
        } else {
            double[] y = dual();
            for (int j = 0; j < N; j++) {
                double sum = 0.0;
                for (int i = 0; i < N; i++) {
                    sum += A[i][j] * y[i];
                }
                if (Math.abs(sum) > EPSILON) {
                    System.out.println("Certificado de infactibilidad invalido");
                    System.out.println("suma = " + sum + "\n");
                    return false;
                }
            }
            double sum = 0.0;
            for (int i = 0; i < N; i++) {
                sum += y[i] * b[i];
            }
            if (Math.abs(sum) < EPSILON) {
                System.out.println("Certificado de infactibilidad invalido");
                System.out.println("yb  = " + sum + "\n");

                return false;
            }
            return true;
        }
    }
//
//    /**
//     * Prueba si es factible antes de resolver
//     *
//     * @param A Matriz
//     * @param b constantes
//     */
//    public static void probar(double[][] A, double[] b) {
//        Jordan gj = new Jordan(A, b);
//        if (gj.isFactible()) {
//            System.out.println("Solucion para Ax=b");
//            double[] x = gj.primal();
//            for (int i = 0; i < x.length; i++) {
//                sol[i] = x[i];
//            }
//        } else {
//            System.out.println("Comprobación de infactibilidad");
//            double[] y = gj.dual();
//            for (int j = 0; j < y.length; j++) {
//                System.out.println(" " + y[j] + "\n");
//            }
//        }
//    }

    public boolean hasError() {
        return e;
    }

}
