package controller;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import metodos.Gauss;
import vistas.resultado;

/**
 *
 * @author _
 */
public class controller {

    public void crearTabla(javax.swing.JTable tabla, int n) {
        n = n + 2;
        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
        m.setNumRows(n);
        m.setColumnCount(n);
        Object[][] matriz = new Object[n][n + 1];
        String[] titles = new String[n + 1];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < titles.length; i++) {
            if (i == matriz.length) {
                titles[i] = "b";
            } else {
                titles[i] = "X" + (i + 1);
            }

        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(matriz, titles) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });

    }

    public void mostrarResultado(JTable tbl, int metodo) {
        resultado r = new resultado();
        DefaultTableModel modeloT = (DefaultTableModel) tbl.getModel();
        int n = tbl.getModel().getRowCount();
        double[][] A = new double[n][n];
        double[] b = new double[n];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = Double.parseDouble(String.valueOf(modeloT.getValueAt(i, j)));
            }
            b[i] = Double.parseDouble(String.valueOf(modeloT.getValueAt(i, n)));
        }
        switch (metodo) {
            case 0: {
                try {
                    Gauss g = new Gauss();
                    double[] x = g.gauss(A, b);
                    if (g.hasError()) {
                        JOptionPane.showMessageDialog(null, "La matriz es singular o casi singular", "Atencion", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    DefaultListModel modelo = new DefaultListModel();
                    for (int i = 0; i < x.length; i++) {
                        modelo.addElement(x[i]);
                    }
                    r.listResultados.setModel(modelo);
                    r.setVisible(true);
                }catch(Exception E){
                    System.out.println(E.getMessage());
                }
                break;
            }
            case 1: {

                break;
            }
            case 2: {

                break;
            }
            case 3: {

                break;
            }
            default:
                System.out.println("Inserte el metodo");
        }
        
    }
}
