package Controllers;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import Metodos.MinCuad;

/**
 *
 * @author _
 */
public class ControllerMC {

    MinCuad min = new MinCuad();

    /**
     * Resuelve por minimos cuadrados
     *
     * @param x la posicion a obtener
     * @param lstY la lista de Ys
     * @return la y correspondiente a X
     */
    public double solve(int x, JList lstY) {
        DefaultListModel mod = (DefaultListModel) lstY.getModel();
        double[] y = new double[mod.getSize()];
        for (int i = 0; i < y.length; i++) {
            y[i] = (double) mod.getElementAt(i);
        }
        double res = min.getY(x, y);
        return res;
    }

    /**
     * Inserta en la tabla el valor dado
     *
     * @param lista la lista
     * @param y el valor a insertar
     */
    public void addToList(JList lista, double y) {
        DefaultListModel listMod = (DefaultListModel) lista.getModel();
        listMod.addElement(y);
        lista.setModel(listMod);
    }

    /**
     * Elimina la posicion seleccionada
     *
     * @param lista la lista
     */
    public void quitarElemento(JList<String> lista) {
        DefaultListModel listMod = (DefaultListModel) lista.getModel();
        listMod.remove(lista.getSelectedIndex());
        lista.setModel(listMod);
    }
}
