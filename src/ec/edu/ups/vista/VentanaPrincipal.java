/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.controlador.controladorAutoridad;
import ec.edu.ups.controlador.controladorMatrimonio;
import ec.edu.ups.controlador.controladorPersona;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaIniciarSesion ventanaIniciarSesion;
    private GestionPersona registrarPersona;
    private RegistrarMatrimonio registrarMatrimonio;
    
    private RegistrarUsuario registrarUsuario;

    private controladorPersona controladorPersona;
    private controladorAutoridad controladorAutoridad;
    private controladorMatrimonio controladorMatrimonio;
    
    

    public VentanaPrincipal() {
        initComponents();
        GestionMenu.setVisible(false);
        btnCerrarSesionMenu.setVisible(false);
        controladorPersona = new controladorPersona("datos/Persona.obj");
        controladorAutoridad = new controladorAutoridad("datos/Autoridad.obj");
        controladorMatrimonio = new controladorMatrimonio("datos/Matrimonio.obj");

        ventanaIniciarSesion = new VentanaIniciarSesion(this, controladorAutoridad);
        registrarPersona = new GestionPersona(controladorPersona);
        registrarMatrimonio = new RegistrarMatrimonio(controladorPersona,controladorAutoridad,controladorMatrimonio);
        
        registrarUsuario = new RegistrarUsuario(controladorAutoridad);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        MenuInicio = new javax.swing.JMenu();
        btnMenuIniciarSesion = new javax.swing.JMenuItem();
        btnRegistrarUsuarioMenu = new javax.swing.JMenuItem();
        btnCerrarSesionMenu = new javax.swing.JMenuItem();
        btnSalirMenu = new javax.swing.JMenuItem();
        GestionMenu = new javax.swing.JMenu();
        btnRegistroMatrimonio = new javax.swing.JMenuItem();
        btnGestionPersona = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(153, 239, 210));

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MenuInicio.setMnemonic('f');
        MenuInicio.setText("Inicio");

        btnMenuIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMenuIniciarSesion.setMnemonic('o');
        btnMenuIniciarSesion.setText("IniciarSesion");
        btnMenuIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuIniciarSesionActionPerformed(evt);
            }
        });
        MenuInicio.add(btnMenuIniciarSesion);

        btnRegistrarUsuarioMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnRegistrarUsuarioMenu.setMnemonic('s');
        btnRegistrarUsuarioMenu.setText("RegistrarUsuario");
        btnRegistrarUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioMenuActionPerformed(evt);
            }
        });
        MenuInicio.add(btnRegistrarUsuarioMenu);

        btnCerrarSesionMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnCerrarSesionMenu.setMnemonic('a');
        btnCerrarSesionMenu.setText("CerrarSesion");
        btnCerrarSesionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionMenuActionPerformed(evt);
            }
        });
        MenuInicio.add(btnCerrarSesionMenu);

        btnSalirMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnSalirMenu.setMnemonic('x');
        btnSalirMenu.setText("Salir");
        btnSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMenuActionPerformed(evt);
            }
        });
        MenuInicio.add(btnSalirMenu);

        menuBar.add(MenuInicio);

        GestionMenu.setText("Gestion");

        btnRegistroMatrimonio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnRegistroMatrimonio.setText("Registro de Matrimonio");
        btnRegistroMatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroMatrimonioActionPerformed(evt);
            }
        });
        GestionMenu.add(btnRegistroMatrimonio);

        btnGestionPersona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnGestionPersona.setText("GestionPersona");
        btnGestionPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPersonaActionPerformed(evt);
            }
        });
        GestionMenu.add(btnGestionPersona);

        menuBar.add(GestionMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirMenuActionPerformed

    private void btnRegistrarUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMenuActionPerformed
        desktopPane.add(registrarUsuario);
        registrarUsuario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarUsuarioMenuActionPerformed

    private void btnMenuIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuIniciarSesionActionPerformed
        desktopPane.add(ventanaIniciarSesion);
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_btnMenuIniciarSesionActionPerformed

    private void btnCerrarSesionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionMenuActionPerformed
        btnMenuIniciarSesion.setVisible(true);
        btnRegistrarUsuarioMenu.setVisible(true);
        GestionMenu.setVisible(false);
        btnSalirMenu.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMenuActionPerformed

    private void btnRegistroMatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroMatrimonioActionPerformed
        desktopPane.add(registrarMatrimonio);
        registrarMatrimonio.setVisible(true);
    }//GEN-LAST:event_btnRegistroMatrimonioActionPerformed

    private void btnGestionPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPersonaActionPerformed
        desktopPane.add(registrarPersona);
        registrarPersona.setVisible(true);
    }//GEN-LAST:event_btnGestionPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public JMenu getGestionMenu() {
        return GestionMenu;
    }

    public void setGestionMenu(JMenu GestionMenu) {
        this.GestionMenu = GestionMenu;
    }

    public JMenu getMenuInicio() {
        return MenuInicio;
    }

    public void setMenuInicio(JMenu MenuInicio) {
        this.MenuInicio = MenuInicio;
    }

    public JMenuItem getBtnCerrarSesionMenu() {
        return btnCerrarSesionMenu;
    }

    public void setBtnCerrarSesionMenu(JMenuItem btnCerrarSesionMenu) {
        this.btnCerrarSesionMenu = btnCerrarSesionMenu;
    }

    public JMenuItem getBtnMenuIniciarSesion() {
        return btnMenuIniciarSesion;
    }

    public void setBtnMenuIniciarSesion(JMenuItem btnMenuIniciarSesion) {
        this.btnMenuIniciarSesion = btnMenuIniciarSesion;
    }

    public JMenuItem getBtnRegistrarPersonaMenu() {
        return btnRegistrarUsuarioMenu;
    }

    public void setBtnRegistrarPersonaMenu(JMenuItem btnRegistrarPersonaMenu) {
        this.btnRegistrarUsuarioMenu = btnRegistrarPersonaMenu;
    }

    public JMenuItem getBtnSalirMenu() {
        return btnSalirMenu;
    }

    public void setBtnSalirMenu(JMenuItem btnSalirMenu) {
        this.btnSalirMenu = btnSalirMenu;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public JMenuItem getjMenuItem1() {
        return btnRegistroMatrimonio;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.btnRegistroMatrimonio = jMenuItem1;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu GestionMenu;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenuItem btnCerrarSesionMenu;
    private javax.swing.JMenuItem btnGestionPersona;
    private javax.swing.JMenuItem btnMenuIniciarSesion;
    private javax.swing.JMenuItem btnRegistrarUsuarioMenu;
    private javax.swing.JMenuItem btnRegistroMatrimonio;
    private javax.swing.JMenuItem btnSalirMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
