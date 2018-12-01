package Views;

import Controllers.Controller;

/**
 *
 * @author _
 */
public class Tabla extends javax.swing.JFrame {

    private int m;

    /**
     * Creates new form tabla
     */
    public Tabla() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setMetodo(int m) {
        this.m = m;
        if (m == 3) {
            this.lblError.setVisible(true);
            this.lblPorcentaje.setVisible(true);
            this.txtError.setVisible(true);
        } else {
            this.lblError.setVisible(false);
            this.lblPorcentaje.setVisible(false);
            this.txtError.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        lblError = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        lblPorcentaje = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Matriz");
        setUndecorated(true);
        setResizable(false);

        btnCalcular.setBackground(new java.awt.Color(0, 153, 0));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X1", "X2", "X3", "b"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMatriz);
        if (tblMatriz.getColumnModel().getColumnCount() > 0) {
            tblMatriz.getColumnModel().getColumn(0).setResizable(false);
            tblMatriz.getColumnModel().getColumn(1).setResizable(false);
            tblMatriz.getColumnModel().getColumn(3).setResizable(false);
        }

        lblError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(0, 0, 0));
        lblError.setLabelFor(txtError);
        lblError.setText("Error:");

        txtError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtError.setForeground(new java.awt.Color(0, 0, 0));
        txtError.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtErrorActionPerformed(evt);
            }
        });

        lblPorcentaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPorcentaje.setForeground(new java.awt.Color(0, 0, 0));
        lblPorcentaje.setText("%");

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPorcentaje)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(lblError)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorcentaje)
                    .addComponent(btnCancel))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int metodo = this.m;
        Controller c = new Controller();
        c.mostrarResultado(tblMatriz, metodo, this.txtError.getText());
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErrorActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancel;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPorcentaje;
    public static javax.swing.JTable tblMatriz;
    private javax.swing.JTextField txtError;
    // End of variables declaration//GEN-END:variables
}
