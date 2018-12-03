package Controllers;

import Metodos.Inversa;
import Metodos.Seidel;
import Metodos.Gauss;
import Metodos.Jordan;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Views.Resultado;
import java.awt.HeadlessException;
import javax.swing.JLabel;

/**
 *
 * @author _
 */
public class Controller {

    /**
     * Crea la tabla dependiendo el tamaño dado
     *
     * @param tabla la tabla
     * @param n el tamaño
     */
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

    public void mostrarResultado(JTable tbl, int metodo, String error, JLabel titulo, JTable detalles) {
        Resultado r = new Resultado();
        DefaultTableModel modeloT = (DefaultTableModel) tbl.getModel();
        DefaultListModel modelo = new DefaultListModel();
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
                    for (int i = 0; i < x.length; i++) {
                        modelo.addElement(x[i]);
                    }
                    r.listResultados.setModel(modelo);
                    r.setVisible(true);
                } catch (HeadlessException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 1: {
                try {
                    Jordan gj = new Jordan(A, b);
                    if (gj.hasError()) {
                        JOptionPane.showMessageDialog(null, "La matriz es singular o casi singular", "Atencion", JOptionPane.WARNING_MESSAGE);
                        break;
                    } else {
                        if (gj.isFactible()) {
                            double[] x = gj.primal();
                            for (int i = 0; i < x.length; i++) {
                                modelo.addElement(x[i]);
                            }
                            r.listResultados.setModel(modelo);
                            r.setVisible(true);
                        } else {
                            double[] y = gj.dual();
                            String contenido = "";
                            for (int j = 0; j < y.length; j++) {
                                contenido += y[j] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, contenido, "Comprobacion de infactibilidad", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                } catch (HeadlessException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 2: {
                try {
                    Inversa i = new Inversa();
                    double[] x = i.solve(A, b);
                    if (i.isFactible()) {
                        for (int j = 0; j < x.length; j++) {
                            modelo.addElement(x[j]);
                        }
                        r.listResultados.setModel(modelo);
                        r.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Determinante es 0\n>No tiene solucion aparente", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (HeadlessException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 3: {
                try {
                    Seidel s = new Seidel();
                    if (s.hasConvergencia(A)) {
                        double[] x = s.seidel(Double.parseDouble(error), A, b);
                        for (int i = 0; i < x.length; i++) {
                            modelo.addElement(x[i]);
                        }
                        r.setDetalles(s, x);
                        r.listResultados.setModel(modelo);
                        r.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Podria no tener convergencia\n Asegurese que sea diagonal dominante o pruebe con otra.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println(e.getMessage());
                }

                break;
            }
            default:
                System.out.println("Inserte el metodo");
        }

    }

    public void verDetalles(JTable detalles, Seidel s, double[]x) {
        DefaultTableModel model = (DefaultTableModel) detalles.getModel();
        model.setNumRows(0);
        int col = (x.length * 2) + 1;
        model.setColumnCount(0);
        model.setColumnCount(col);
        String[] titles = new String[col];
        for (int i = 0; i < titles.length; i++) {
            if (i == 0) {
                titles[i] = "Iteración";
            } else if (i <= x.length) {
                titles[i] = "X" + i;
            } else if (i > x.length) {
                titles[i] = "Error de X" + (i - x.length);
            }
        }
        Object[][] matriz = new Object[s.getIteraciones()][col];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0) {
                    matriz[i][j] = String.valueOf(s.getArrayIteraciones().get(i).getIteracion());
                } else if (j <= x.length) {
                    double[] xs = s.getArrayIteraciones().get(i).getX();
                    matriz[i][j] = String.valueOf(xs[j-1]);
                } else if (j > x.length) {
                    double[] e = s.getArrayIteraciones().get(i).getErrores();
                    matriz[i][j] = String.valueOf(e[j-x.length-1]);
                }
            }
        }
        detalles.setModel(new javax.swing.table.DefaultTableModel(matriz, titles) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
    }
}
