package Metodos;

/**
 *
 * @author _
 */
public class test {
    public static void main(String[] args) {
        Funcion f = new Funcion("sin(x)*x");
        Secante s = new Secante();
        System.out.println(s.raiz(f, 3, 4, 100, 1e-10));
    }
}
