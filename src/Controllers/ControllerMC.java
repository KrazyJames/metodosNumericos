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

    public double solve(int x, JList lstY) {
        DefaultListModel mod = (DefaultListModel) lstY.getModel();
        double[] y = new double[mod.getSize()];
        for (int i = 0; i < y.length; i++) {
            y[i] = (double) mod.getElementAt(i);
        }
        double res = min.getY(x, y);
        return res;
    }

    public void addToList(JList lista, double y) {
        DefaultListModel listMod = (DefaultListModel) lista.getModel();
        listMod.addElement(y);
        lista.setModel(listMod);
    }

    public void quitarElemento(JList<String> lista) {
        DefaultListModel listMod = (DefaultListModel) lista.getModel();
        listMod.remove(lista.getSelectedIndex());
        lista.setModel(listMod);
    }
}
