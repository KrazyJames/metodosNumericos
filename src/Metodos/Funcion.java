package Metodos;

import org.nfunk.jep.JEP;

/**
 *
 * @author _
 */
public class Funcion {

    JEP jep = new JEP();

    /**
     * Define la funcion dada en string respecto a X = 0
     *
     * @param def la funcion
     */
    public Funcion(String def) {
        jep.addVariable("x", 0);
        jep.addStandardConstants();
        jep.addStandardFunctions();
        jep.parseExpression(def);
        if (jep.hasError()) {
            System.out.println(jep.getErrorInfo());
        }
    }

    /**
     * Evalua entre 0 y 1 el error
     *
     * @param x el valor
     * @return el error
     */
    public double evaluate(double x) {
        double e;
        jep.addVariable("x", x);
        e = jep.getValue();
        if (jep.hasError()) {
            System.out.println(jep.getErrorInfo());
        }
        return e;
    }

}
