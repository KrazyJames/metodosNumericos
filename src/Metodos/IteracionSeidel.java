package Metodos;

/**
 *
 * @author
 */
public class IteracionSeidel {

    private int iteracion;
    private double[] x;
    private double[] errores;

    public IteracionSeidel() {
    }

    public IteracionSeidel(int iteracion, double[] x, double[] errores) {
        this.iteracion = iteracion;
        this.x = x;
        this.errores = errores;
    }

    public double[] getErrores() {
        return errores;
    }

    public void setErrores(double[] errores) {
        this.errores = errores;
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double getX(int j) {
        return x[j];
    }

    public double getErrores(int j) {
        return errores[j];
    }

    
}
