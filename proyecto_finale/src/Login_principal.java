
import conexion.conexion_oracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelos.usuario;


public class Login_principal extends javax.swing.JFrame {
    
    
    
    
    public Login_principal() {
        initComponents();
        this.setTitle("LABORATORIO MEDICO LA BENDICIÓN");
        this.setLocation(400, 240);
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_loggin_titulo = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lbl_img_candado = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nit");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbl_loggin_titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_loggin_titulo.setText("Login");
        getContentPane().add(lbl_loggin_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 220, 40));

        txt_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 40));

        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 250, 40));

        btn_login.setBackground(new java.awt.Color(0, 102, 255));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_login.setText("Ingresar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, -1));

        btn_registrar.setBackground(new java.awt.Color(0, 102, 102));
        btn_registrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, -1));

        lbl_img_candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.png"))); // NOI18N
        lbl_img_candado.setText("jLabel4");
        getContentPane().add(lbl_img_candado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 310, 300));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/292ddcf1fdbcff99169b93d6507b59bf.jpg"))); // NOI18N
        lbl_fondo.setText("jLabel1");
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 850, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        usuarios usu=new  usuarios ();
        usu.setVisible (true);       //// codigo para llamar la pantalla  registrar usuarios////
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
    
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_img_candado;
    private javax.swing.JLabel lbl_loggin_titulo;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_nit;
    // End of variables declaration//GEN-END:variables

    private Statement Conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
}
}