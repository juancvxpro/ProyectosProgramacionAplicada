/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorUsuario;

import ec.edu.ups.modelo.Usuario;

import javax.swing.JOptionPane;

/**
 *
 * @author Juanc
 */
public final class VentanaIniciarSesion extends javax.swing.JInternalFrame {

    private VentanaPrincipal ventanaPrincipal;
    private controladorUsuario controladorUsuario;

    /**
     * Creates new form VentanaIniciarSesion
     *
     * @param ventanaPrincipal
     * @param controladorUsuario
     */
    public VentanaIniciarSesion(VentanaPrincipal ventanaPrincipal, controladorUsuario controladorUsuario) {
        initComponents();

        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorUsuario = controladorUsuario;

        //generarAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCorreo = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 204, 255));
        setClosable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblCorreo.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo: ");

        lblContra.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        lblContra.setText("Contraseña:");

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIAR SESION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCorreo)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIniciarSesion)
                        .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContra)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        //
        String pass = "";
        char[] pass1 = txtPass.getPassword();
        for (int i = 0; i < pass1.length; i++) {
            pass = pass + pass1[i];
        }

        if (controladorUsuario.iniciarSesion(txtCorreo.getText().trim(), pass)) {
            ventanaPrincipal.getIniciarSesionMenuItem().setVisible(false);
            ventanaPrincipal.getCerrarSesionMenuItem().setVisible(true);
            ventanaPrincipal.getMenuFacturas().setVisible(true);
            ventanaPrincipal.getRegistrosMonetariosMenuItem().setVisible(true);
            ventanaPrincipal.getVerTablasMenu().setVisible(true);
            ventanaPrincipal.getHistorialMenu().setVisible(true);
            ventanaPrincipal.getExitMenuItem().setVisible(false);

            if (controladorUsuario.getUsuario().getRol().equals("user")) {
                ventanaPrincipal.getUsuariosMenuItem().setVisible(false);

            } else {

                ventanaPrincipal.getUsuariosMenuItem().setVisible(true);
            }
            this.dispose();
            Limpiar();
            JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso");
        } else {

            JOptionPane.showMessageDialog(this, "Usuario o contrasena incorrecta ");
            Limpiar();
        }
//String cedula, String nombre, String apellido, String direccion, String telefono, String rol, String correo, String pass
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    public void generarAdmin() {
        //Usuario admin = new Usuario("1303753618","PABLO","NIETO","EL VECINO","0987645328","admin","pnieto@hotmail.com","admin");
        Usuario admin = new Usuario();
        admin.setCedula("1303753618");
        admin.setNombre("PABLO");
        admin.setApellido("NIETO");
        admin.setDireccion("EL VECINO");
        admin.setTlf("0987645328");
        admin.setRol("admin");
        admin.setCorreo("pnieto@hotmail.com");
        admin.setPass("admin");

        controladorUsuario.crear(admin);
        System.out.println("ADMIN GENERADO CORRECTAMENTE");

    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated
    public void Limpiar() {
        txtCorreo.setText("");
        txtPass.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
