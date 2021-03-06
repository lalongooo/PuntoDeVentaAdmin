/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntodeventa.mvc.Views;

import com.puntodeventa.global.Entity.Usuario;
import com.puntodeventa.global.Util.Util;
import com.puntodeventa.global.Util.ValidacionForms;
import com.puntodeventa.mvc.Controller.UsuarioLogic;
import com.puntodeventa.services.DAO.ProductDAO;
import com.puntodeventa.services.DAO.UsuarioDAO;
import org.hibernate.HibernateException;

/**
 *
 * @author Nato
 */
public class frmUser extends javax.swing.JInternalFrame {
    static ValidacionForms val = new ValidacionForms();
    UsuarioLogic userLogic;
    static Usuario usuario;

    /**
     * Creates new form frmUser
     */
    public frmUser() {
        initComponents();
        val.centerFrame(this);
        usuario = iniUser();
    }

    private Usuario iniUser() {
        Usuario user = Util.getCurrentUser();
        this.jlblgetNombre.setText("Nombre: " + user.getNombre());
        return user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnChangePass = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpswPassword = new javax.swing.JPasswordField();
        jPassNew = new javax.swing.JPasswordField();
        jConfPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlblgetNombre = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Usuarios");

        jpnChangePass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambio de Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña Actual:");

        jpswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpswPasswordKeyTyped(evt);
            }
        });

        jPassNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPassNewKeyTyped(evt);
            }
        });

        jConfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jConfPassKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Confirmar Contraseña:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nueva Contraseña:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDone.png"))); // NOI18N
        jButton1.setText("Cambiar Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblgetNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblgetNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblgetNombre.setText("Nombre: Maria de los Angeles Gonzales");

        javax.swing.GroupLayout jpnChangePassLayout = new javax.swing.GroupLayout(jpnChangePass);
        jpnChangePass.setLayout(jpnChangePassLayout);
        jpnChangePassLayout.setHorizontalGroup(
            jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jConfPass)
                    .addComponent(jPassNew)
                    .addComponent(jpswPassword)
                    .addGroup(jpnChangePassLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jlblgetNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        jpnChangePassLayout.setVerticalGroup(
            jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblgetNombre)
                .addGap(18, 18, 18)
                .addGroup(jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            boolean ban = true;
            String msg = "* Verifica lo siguiente\n";
            if (jpswPassword.getText().equals("")) {
                ban = false;
                msg = msg + "\t - Ingrese su contraseña actual";
            }
            if (jPassNew.getText().equals("")) {
                ban = false;
                msg = msg + "\t - Ingrese su nueva contraseña";
            }
            if (this.jConfPass.getText().equals("")) {
                ban = false;
                msg = msg + "\t - Confirme la nueva contraseña";
            }

            if (ban == true) {
                String vPassActual = usuario.getContrasena();
                if (vPassActual.toString().equals(this.jpswPassword.getText())) {
                    if (this.jPassNew.getText().equals(this.jConfPass.getText())) {
                        try {
                            UsuarioDAO userDAO = new UsuarioDAO();
                            usuario.setContrasena(jPassNew.getText());
                            userDAO.updateUsuario(usuario);
                            Util.serializeUser(usuario);
                            val.msjInfo("Su contraseña ha sido actualizada correctamente...");
                            dispose();
                        } catch (HibernateException he) {
                            val.msjErr("Error: " + he.getMessage());
                        }
                    } else {
                        val.msjInfo("No coinciden las contraseñas");
                    }
                } else {
                    val.msjInfo("Su contraseña actual no es valida");
                }
            } else {
                val.msjWarn(msg);
            }
        } catch (HibernateException he) {
            System.out.println("HibernateException: " + he.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jpswPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswPasswordKeyTyped
        val.longitudCaga(jpswPassword, 15, evt);
    }//GEN-LAST:event_jpswPasswordKeyTyped

    private void jPassNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassNewKeyTyped
        val.longitudCaga(jPassNew, 15, evt);
    }//GEN-LAST:event_jPassNewKeyTyped

    private void jConfPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jConfPassKeyTyped
        val.longitudCaga(jConfPass, 15, evt);
    }//GEN-LAST:event_jConfPassKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jConfPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassNew;
    private javax.swing.JLabel jlblgetNombre;
    private javax.swing.JPanel jpnChangePass;
    private javax.swing.JPasswordField jpswPassword;
    // End of variables declaration//GEN-END:variables
}
