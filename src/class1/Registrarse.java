/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

/**
 *
 * @author erikc
 */
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        lblConfirmar = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        pfContraseña = new javax.swing.JPasswordField();
        lblCorreo = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsename = new javax.swing.JTextField();
        pfConfirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class1/dbR.jpeg"))); // NOI18N

        btnCrear.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(51, 255, 153));
        btnCrear.setText("Crear");

        lblConfirmar.setBackground(new java.awt.Color(102, 102, 255));
        lblConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(51, 102, 255));
        lblConfirmar.setText("Confirmar contraseña");

        lblContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 102, 255));
        lblContraseña.setText("Contraseña");

        btnAtras.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(51, 255, 153));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblCorreo.setBackground(new java.awt.Color(102, 102, 255));
        lblCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(51, 102, 255));
        lblCorreo.setText("Corero Electronico");

        lblUsername.setBackground(new java.awt.Color(102, 102, 255));
        lblUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 102, 255));
        lblUsername.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(btnCrear)
                                .addGap(126, 126, 126)
                                .addComponent(btnAtras))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsename, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(pfContraseña)
                                    .addComponent(pfConfirmar, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsename, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnAtras))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        Inicio atras = new Inicio();
        atras.setVisible(true);

    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pfConfirmar;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtUsename;
    // End of variables declaration//GEN-END:variables
}
