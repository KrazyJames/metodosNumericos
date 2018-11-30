package Metodos;

/**
 *
 * @author _
 */
public class test {
    public static void main(String[] args) {
        Funcion f = new Funcion("sin(x)+cos(x)-1.1");
        Secante s = new Secante();
        System.out.println(s.raiz(f, 0, 1, 50, 0.001));
    }
}
