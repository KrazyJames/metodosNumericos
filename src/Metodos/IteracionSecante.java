package Metodos;

/**
 *
 * @author _
 */
public class IteracionSecante {
    
    private int iteracion;
    private double x;
    private double error;

    /**
     * Nuevo IteracionSecante
     */
    public IteracionSecante() {
    }

    /**
     * Contructor
     * @param iteracion la iteracion
     * @param x el resultado
     * @param error el error
     */
    public IteracionSecante(int iteracion, double x, double error) {
        this.iteracion = iteracion;
        this.x = x;
        this.error = error;
    }

    /**
     * 
     * @return error
     */
    public double getError() {
        return error;
    }

    /**
     * Set error
     * @param error el error
     */
    public void setError(double error) {
        this.error = error;
    }

    /**
     * 
     * @return la iteracion
     */
    public int getIteracion() {
        return iteracion;
    }

    /**
     * set iteracion
     * @param iteracion la iteracion
     */
    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    /**
     * 
     * @return el resultado
     */
    public double getX() {
        return x;
    }

    /**
     * set x
     * @param x el resultado
     */
    public void setX(double x) {
        this.x = x;
    }
    
}
