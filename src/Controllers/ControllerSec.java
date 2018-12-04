package Controllers;

import Metodos.Funcion;
import Metodos.Secante;
import Metodos.IteracionSecante;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author _
 */
public class ControllerSec {

    Secante secante = new Secante();

    /**
     * Resuelve por metodo de secante
     *
     * @param ecuacion la ecuacion
     * @param txtRaiz el textfield
     * @param x0 intervalo inferior
     * @param x1 intervalo superior
     * @param error el error permitido (0-100)
     */
    public void solve(String ecuacion, JTextField txtRaiz, double x0, double x1, double error) {
        String sol;
        Funcion funcion = new Funcion(ecuacion);
        sol = String.valueOf(secante.raiz(funcion, x0, x1, error));
        //iteraciones = secante.getArrayIteraciones();
        txtRaiz.setText("");
        txtRaiz.setText(sol);
    }

    public void mostrarDetalles(JTable tblDetalle) {
        List<IteracionSecante> iteraciones = secante.getArrayIteraciones();
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
        int cols = modelo.getColumnCount();
        int rows = iteraciones.size();
        modelo.setNumRows(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (j) {
                    case 0:
                        modelo.setValueAt(iteraciones.get(i).getIteracion(), i, j);
                        break;
                    case 1:
                        modelo.setValueAt(iteraciones.get(i).getX(), i, j);
                        break;
                    case 2:
                        modelo.setValueAt(iteraciones.get(i).getError(), i, j);
                        break;
                    default:
                        break;
                }
            }
        }
        tblDetalle.setModel(modelo);
        secante.getArrayIteraciones().clear();
    }

}
