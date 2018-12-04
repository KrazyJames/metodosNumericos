package Views;

import Controllers.ControllerSec;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author _
 */
public class SecanteFrame extends javax.swing.JFrame {

    ControllerSec cs = new ControllerSec();
    int xx,xy;
    /**
     * Creates new form SecanteFrame
     */
    public SecanteFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIntervalo0 = new javax.swing.JTextField();
        txtIntervalo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtEcuacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        txtRaiz = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVerMas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Secante");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Secante");

        btnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Intervalo:");

        txtIntervalo0.setBackground(new java.awt.Color(153, 0, 153));
        txtIntervalo0.setForeground(new java.awt.Color(255, 255, 255));
        txtIntervalo0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntervalo0.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        txtIntervalo0.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtIntervalo0.setSelectionColor(new java.awt.Color(204, 0, 204));

        txtIntervalo1.setBackground(new java.awt.Color(153, 0, 153));
        txtIntervalo1.setForeground(new java.awt.Color(255, 255, 255));
        txtIntervalo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntervalo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        txtIntervalo1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtIntervalo1.setSelectionColor(new java.awt.Color(204, 0, 204));
        txtIntervalo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntervalo1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Error:");

        txtError.setBackground(new java.awt.Color(153, 0, 153));
        txtError.setForeground(new java.awt.Color(255, 255, 255));
        txtError.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtError.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        txtError.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtError.setSelectionColor(new java.awt.Color(204, 0, 204));

        btnCalcular.setBackground(new java.awt.Color(0, 102, 0));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtEcuacion.setBackground(new java.awt.Color(153, 0, 153));
        txtEcuacion.setForeground(new java.awt.Color(255, 255, 255));
        txtEcuacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEcuacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 51)));
        txtEcuacion.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtEcuacion.setSelectionColor(new java.awt.Color(204, 0, 204));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ecuación:");

        lblRaiz.setForeground(new java.awt.Color(255, 255, 255));
        lblRaiz.setText("Raiz:");

        txtRaiz.setEditable(false);
        txtRaiz.setBackground(new java.awt.Color(102, 0, 102));
        txtRaiz.setForeground(new java.awt.Color(255, 255, 255));
        txtRaiz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRaiz.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        txtRaiz.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRaiz.setSelectionColor(new java.awt.Color(204, 0, 204));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(",");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");

        btnVerMas.setBackground(new java.awt.Color(0, 102, 204));
        btnVerMas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMas.setText("Ver Más");
        btnVerMas.setBorder(null);
        btnVerMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRaiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaiz))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEcuacion, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIntervalo0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIntervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(12, 12, 12))))
                    .addComponent(btnVerMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIntervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtIntervalo0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaiz)
                    .addComponent(txtRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnVerMas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            if (!txtEcuacion.getText().isEmpty()) {
                cs.solve(this.txtEcuacion.getText(), this.txtRaiz, Double.parseDouble(this.txtIntervalo0.getText()), Double.parseDouble(this.txtIntervalo1.getText()), Double.parseDouble(this.txtError.getText()));
                this.txtRaiz.setVisible(true);
                this.lblRaiz.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Inserte una ecuación", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtIntervalo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntervalo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntervalo1ActionPerformed

    private void btnVerMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMasActionPerformed
        Detalles d = new Detalles();
        cs.mostrarDetalles(d.tblDetalle);
        d.setVisible(true);
    }//GEN-LAST:event_btnVerMasActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(SecanteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecanteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecanteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecanteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecanteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnVerMas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtEcuacion;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtIntervalo0;
    private javax.swing.JTextField txtIntervalo1;
    private javax.swing.JTextField txtRaiz;
    // End of variables declaration//GEN-END:variables
}
