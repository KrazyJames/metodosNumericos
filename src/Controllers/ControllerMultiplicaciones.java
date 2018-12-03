package Controllers;

import Metodos.Multiplicacion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author _
 */
public class ControllerMultiplicaciones {

    public void crearTablas(int row1, int col1, int row2, int col2, JTable tbl1, JTable tbl2) {
        crearTabla(row1, col1, tbl1);
        crearTabla(row2, col2, tbl2);

    }

    public void crearTabla(int rows, int cols, JTable tabla) {
        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
        m.setNumRows(rows);
        m.setColumnCount(cols);
        Object[][] matriz = new Object[rows][cols];
        String[] titles = new String[cols];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < titles.length; i++) {
            titles[i] = "X" + (i + 1);
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(matriz, titles) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
    }

    public void multiplicarMatrices(JTable tbl1, JTable tbl2, JTable tbl3) {
        DefaultTableModel m1 = (DefaultTableModel) tbl1.getModel();
        DefaultTableModel m2 = (DefaultTableModel) tbl2.getModel();
        double[][] A1 = new double[m1.getRowCount()][m1.getColumnCount()];
        double[][] A2 = new double[m2.getRowCount()][m2.getColumnCount()];
        A1 = rellenarMatriz(A1, m1);
        A2 = rellenarMatriz(A2, m2);
        double[][] m = new Multiplicacion().multiplicar(A1, A2);
        crearTabla(m.length, m[0].length, tbl3);
        DefaultTableModel m3 = (DefaultTableModel) tbl3.getModel();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m3.setValueAt(String.valueOf(m[i][j]), i, j);
            }
        }

    }

    public double[][] rellenarMatriz(double[][] A, DefaultTableModel m) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = Double.parseDouble(String.valueOf(m.getValueAt(i, j)));
            }
        }
        return A;
    }
}
