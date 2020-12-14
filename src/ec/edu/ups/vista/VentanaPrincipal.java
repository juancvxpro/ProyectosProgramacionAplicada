/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorClienteFijo;
import ec.edu.ups.controlador.controladorEgreso;
import ec.edu.ups.controlador.controladorEspacios;
import ec.edu.ups.controlador.controladorFacturaClienteFijo;
import ec.edu.ups.controlador.controladorFacturaClienteM;
import ec.edu.ups.controlador.controladorHistorialClienteM;
import ec.edu.ups.controlador.controladorHistorialClientesF;
import ec.edu.ups.controlador.controladorIngreso;
import ec.edu.ups.controlador.controladorTarifa;
import ec.edu.ups.controlador.controladorTicketCliente;
import ec.edu.ups.controlador.controladorUsuario;

import java.io.IOException;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaIniciarSesion ventanaIniciarSesion;
    private GestionUsuarios gestionUsuarios;
    private Tarifas tarifas;
    private GestionClientesFijos gestionClienteFijo;
    private Tickets tickets;
    private ConsultaMulta consultaMulta;
    private ClientesFijosPuesto clientesFijosPuesto;
    private Reportes reportes;

    private controladorUsuario controladorUsuario;
    private controladorTarifa controladorTarifa;
    private controladorClienteFijo controladorClienteFijo;
    private controladorEspacios controladorEspacios;
    private controladorTicketCliente controladorTicketCliente;
    private controladorHistorialClienteM controladorHistorialClienteM;
    private controladorHistorialClientesF controladorHistorialClienteF;
    private controladorFacturaClienteFijo controladorFacturaClienteFijo;
    private controladorFacturaClienteM controladorFacturaClienteM;
    private controladorIngreso controladorIngresos;
    private controladorEgreso controladorEgreso;

    public VentanaPrincipal() {
        initComponents();

        controladorEspacios = new controladorEspacios();
        controladorIngresos= new controladorIngreso("datos/Ingresos.obj");
        controladorEgreso= new controladorEgreso("datos/Egresos.obj");
        controladorFacturaClienteM = new controladorFacturaClienteM("datos/FacturaClienteM");
        controladorFacturaClienteFijo = new controladorFacturaClienteFijo("datos/FacturaClienteFijo.obj");
        controladorHistorialClienteF = new controladorHistorialClientesF ("datos/HistorialClienteF.obj");
        controladorHistorialClienteM = new controladorHistorialClienteM ("datos/HistorialClienteM.obj");
        controladorClienteFijo = new controladorClienteFijo("datos/ClienteFijo.obj");
        controladorUsuario = new controladorUsuario("datos/Usuario.obj");
        controladorTarifa = new controladorTarifa("datos/Tarifa.obj");
        controladorTicketCliente = new controladorTicketCliente("datos/Ticket.obj", controladorTarifa);
        ventanaIniciarSesion = new VentanaIniciarSesion(this, controladorUsuario);
        gestionUsuarios = new GestionUsuarios(controladorUsuario);
        tarifas = new Tarifas(controladorTarifa);
        gestionClienteFijo = new GestionClientesFijos(controladorClienteFijo, controladorTarifa, controladorEspacios,controladorIngresos);
        tickets = new Tickets(controladorTicketCliente, controladorEspacios, controladorTarifa);
        consultaMulta = new ConsultaMulta(controladorEspacios,controladorClienteFijo,controladorTicketCliente);
        clientesFijosPuesto = new ClientesFijosPuesto(controladorClienteFijo,controladorHistorialClienteF);
        reportes= new Reportes(controladorIngresos,controladorEgreso);
        
        
        
        menuFacturas.setVisible(false);
        RegistrosMonetariosMenuItem.setVisible(false);
        VerTablasMenu.setVisible(false);
        HistorialMenu.setVisible(false);
        CerrarSesionMenuItem.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        ArchivosMenu = new javax.swing.JMenu();
        VerTablasMenu = new javax.swing.JMenu();
        ClientesMenu = new javax.swing.JMenu();
        ClientesFijosMenuItem = new javax.swing.JMenuItem();
        TicketsMenuItem = new javax.swing.JMenuItem();
        MultasMenuItem = new javax.swing.JMenuItem();
        TarifasMenuItem = new javax.swing.JMenuItem();
        UsuariosMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        HistorialMenu = new javax.swing.JMenu();
        ClientesFijosHistorialMenuItem = new javax.swing.JMenuItem();
        RegistrosMonetariosMenuItem = new javax.swing.JMenuItem();
        IniciarSesionMenuItem = new javax.swing.JMenuItem();
        CerrarSesionMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuFacturas = new javax.swing.JMenu();
        FacturaClienteFijoMenuItem = new javax.swing.JMenuItem();
        facturaClienteMomentaneoMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(new java.awt.FlowLayout());

        desktopPane.setLayout(new java.awt.BorderLayout());
        getContentPane().add(desktopPane);

        ArchivosMenu.setMnemonic('f');
        ArchivosMenu.setText("Inicio");

        VerTablasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/verTablas.png"))); // NOI18N
        VerTablasMenu.setText("Ver Tablas");

        ClientesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Clientes.png"))); // NOI18N
        ClientesMenu.setText("Clientes");

        ClientesFijosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ClientesFijosMenuItem.setText("Clientes Fijos");
        ClientesFijosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesFijosMenuItemActionPerformed(evt);
            }
        });
        ClientesMenu.add(ClientesFijosMenuItem);

        TicketsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        TicketsMenuItem.setText("Tickets");
        TicketsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsMenuItemActionPerformed(evt);
            }
        });
        ClientesMenu.add(TicketsMenuItem);

        MultasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MultasMenuItem.setText("Multas");
        MultasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultasMenuItemActionPerformed(evt);
            }
        });
        ClientesMenu.add(MultasMenuItem);

        VerTablasMenu.add(ClientesMenu);

        TarifasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        TarifasMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Tarifas.png"))); // NOI18N
        TarifasMenuItem.setText("Tarifas");
        TarifasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarifasMenuItemActionPerformed(evt);
            }
        });
        VerTablasMenu.add(TarifasMenuItem);

        UsuariosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        UsuariosMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/user.png"))); // NOI18N
        UsuariosMenuItem.setText("Usuarios");
        UsuariosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosMenuItemActionPerformed(evt);
            }
        });
        VerTablasMenu.add(UsuariosMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Parqueadero");
        VerTablasMenu.add(jMenuItem1);

        ArchivosMenu.add(VerTablasMenu);

        HistorialMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Historial.png"))); // NOI18N
        HistorialMenu.setText("Historial");

        ClientesFijosHistorialMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ClientesFijosHistorialMenuItem.setText("Clientes Fijos");
        ClientesFijosHistorialMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesFijosHistorialMenuItemActionPerformed(evt);
            }
        });
        HistorialMenu.add(ClientesFijosHistorialMenuItem);

        ArchivosMenu.add(HistorialMenu);

        RegistrosMonetariosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        RegistrosMonetariosMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/moneda.png"))); // NOI18N
        RegistrosMonetariosMenuItem.setMnemonic('s');
        RegistrosMonetariosMenuItem.setText("Registros Monetarios");
        RegistrosMonetariosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosMonetariosMenuItemActionPerformed(evt);
            }
        });
        ArchivosMenu.add(RegistrosMonetariosMenuItem);

        IniciarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        IniciarSesionMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Log.png"))); // NOI18N
        IniciarSesionMenuItem.setText("Iniciar Sesion");
        IniciarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionMenuItemActionPerformed(evt);
            }
        });
        ArchivosMenu.add(IniciarSesionMenuItem);

        CerrarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CerrarSesionMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/logOut.png"))); // NOI18N
        CerrarSesionMenuItem.setText("Cerrar Sesion");
        CerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionMenuItemActionPerformed(evt);
            }
        });
        ArchivosMenu.add(CerrarSesionMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Salir.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        ArchivosMenu.add(exitMenuItem);

        menuBar.add(ArchivosMenu);

        menuFacturas.setMnemonic('e');
        menuFacturas.setText("Facturas");

        FacturaClienteFijoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        FacturaClienteFijoMenuItem.setMnemonic('t');
        FacturaClienteFijoMenuItem.setText("Facturar Cliente Fijo");
        FacturaClienteFijoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaClienteFijoMenuItemActionPerformed(evt);
            }
        });
        menuFacturas.add(FacturaClienteFijoMenuItem);

        facturaClienteMomentaneoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        facturaClienteMomentaneoMenuItem.setMnemonic('y');
        facturaClienteMomentaneoMenuItem.setText("Facturar Cliente Momentaneo");
        menuFacturas.add(facturaClienteMomentaneoMenuItem);

        menuBar.add(menuFacturas);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void TicketsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsMenuItemActionPerformed
        desktopPane.add(tickets);
        tickets.setVisible(true);
    }//GEN-LAST:event_TicketsMenuItemActionPerformed

    private void FacturaClienteFijoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaClienteFijoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacturaClienteFijoMenuItemActionPerformed

    private void CerrarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionMenuItemActionPerformed
        menuFacturas.setVisible(false);
        RegistrosMonetariosMenuItem.setVisible(false);
        VerTablasMenu.setVisible(false);
        HistorialMenu.setVisible(false);
        CerrarSesionMenuItem.setVisible(false);
        IniciarSesionMenuItem.setVisible(true);
        exitMenuItem.setVisible(true);

    }//GEN-LAST:event_CerrarSesionMenuItemActionPerformed

    private void MultasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultasMenuItemActionPerformed
        desktopPane.add(consultaMulta);
        consultaMulta.setVisible(true);
    }//GEN-LAST:event_MultasMenuItemActionPerformed

    private void IniciarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionMenuItemActionPerformed
        desktopPane.add(ventanaIniciarSesion);
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_IniciarSesionMenuItemActionPerformed

    private void UsuariosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosMenuItemActionPerformed
        desktopPane.add(gestionUsuarios);
        gestionUsuarios.setVisible(true);
    }//GEN-LAST:event_UsuariosMenuItemActionPerformed

    private void TarifasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarifasMenuItemActionPerformed
        desktopPane.add(tarifas);
        tarifas.setVisible(true);
    }//GEN-LAST:event_TarifasMenuItemActionPerformed

    private void ClientesFijosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesFijosMenuItemActionPerformed
        desktopPane.add(gestionClienteFijo);
        gestionClienteFijo.setVisible(true);
    }//GEN-LAST:event_ClientesFijosMenuItemActionPerformed

    private void ClientesFijosHistorialMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesFijosHistorialMenuItemActionPerformed
        desktopPane.add(clientesFijosPuesto);
        clientesFijosPuesto.setVisible(true);
    }//GEN-LAST:event_ClientesFijosHistorialMenuItemActionPerformed

    private void RegistrosMonetariosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosMonetariosMenuItemActionPerformed
        desktopPane.add(reportes);
        reportes.setVisible(true);
    }//GEN-LAST:event_RegistrosMonetariosMenuItemActionPerformed

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

    public JMenu getArchivosMenu() {
        return ArchivosMenu;
    }

    public JMenuItem getCerrarSesionMenuItem() {
        return CerrarSesionMenuItem;
    }

    public JMenuItem getClientesFijosHistorialMenuItem() {
        return ClientesFijosHistorialMenuItem;
    }

    public JMenuItem getClientesFijosMenuItem() {
        return ClientesFijosMenuItem;
    }

    public JMenu getClientesMenu() {
        return ClientesMenu;
    }

  

    public JMenuItem getFacturaClienteFijoMenuItem() {
        return FacturaClienteFijoMenuItem;
    }

    public JMenu getHistorialMenu() {
        return HistorialMenu;
    }

    public JMenuItem getIniciarSesionMenuItem() {
        return IniciarSesionMenuItem;
    }

    public JMenuItem getMultasMenuItem() {
        return MultasMenuItem;
    }

    public JMenuItem getRegistrosMonetariosMenuItem() {
        return RegistrosMonetariosMenuItem;
    }

    public JMenuItem getTarifasMenuItem() {
        return TarifasMenuItem;
    }

    public JMenuItem getTicketsMenuItem() {
        return TicketsMenuItem;
    }

    public JMenuItem getUsuariosMenuItem() {
        return UsuariosMenuItem;
    }

    public JMenu getVerTablasMenu() {
        return VerTablasMenu;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public JMenuItem getFacturaClienteMomentaneoMenuItem() {
        return facturaClienteMomentaneoMenuItem;
    }

    public JMenu getMenuFacturas() {
        return menuFacturas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ArchivosMenu;
    private javax.swing.JMenuItem CerrarSesionMenuItem;
    private javax.swing.JMenuItem ClientesFijosHistorialMenuItem;
    private javax.swing.JMenuItem ClientesFijosMenuItem;
    private javax.swing.JMenu ClientesMenu;
    private javax.swing.JMenuItem FacturaClienteFijoMenuItem;
    private javax.swing.JMenu HistorialMenu;
    private javax.swing.JMenuItem IniciarSesionMenuItem;
    private javax.swing.JMenuItem MultasMenuItem;
    private javax.swing.JMenuItem RegistrosMonetariosMenuItem;
    private javax.swing.JMenuItem TarifasMenuItem;
    private javax.swing.JMenuItem TicketsMenuItem;
    private javax.swing.JMenuItem UsuariosMenuItem;
    private javax.swing.JMenu VerTablasMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem facturaClienteMomentaneoMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFacturas;
    // End of variables declaration//GEN-END:variables

}
