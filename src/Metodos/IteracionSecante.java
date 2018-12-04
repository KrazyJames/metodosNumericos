package Metodos;

/**
 *
 * @author _
 */
public class IteracionSecante {
    
    private int iteracion;
    private double x;
    private double error;

    public IteracionSecante() {
    }

    public IteracionSecante(int iteracion, double x, double error) {
        this.iteracion = iteracion;
        this.x = x;
        this.error = error;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
}
