package Metodos;

import org.nfunk.jep.JEP;

/**
 *
 * @author _
 */
public class Funcion {

    JEP jep = new JEP();
    
    public Funcion(String def) {
        jep.addVariable("x", 0);
        jep.addStandardConstants();
        jep.addStandardFunctions();
        jep.parseExpression(def);
        if (jep.hasError()) {
            System.out.println(jep.getErrorInfo());
        }
    }
    
    public double evaluate(double x){
        double e;
        jep.addVariable("x", x);
        e = jep.getValue();
        if (jep.hasError()) {
            System.out.println(jep.getErrorInfo());
        }
        return e;
    }
    
}
