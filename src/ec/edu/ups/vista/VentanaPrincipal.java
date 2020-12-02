/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorActividad;
import ec.edu.ups.controlador.controladorAlumno;
import ec.edu.ups.controlador.controladorCurso;
import ec.edu.ups.controlador.controladorDocente;
import ec.edu.ups.controlador.controladorPersona;
import ec.edu.ups.controlador.controladorUsuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private GestionEstudiantes gestionEstudiantes;
    private GestionDocentes gestionDocentes;
    private GestionCursos gestionCursos;
    private GestionActividades gestionActividades;

    private controladorPersona controladorPersona;
    private controladorActividad controladorActividad;
    private controladorAlumno controladorAlumno;
    private controladorCurso controladorCurso;
    private controladorDocente controladorDocente;
    private controladorUsuario controladorUsuario;

    public VentanaPrincipal() {
        try {
            initComponents();

            controladorPersona = new controladorPersona("datos/Persona.obj");
            controladorActividad = new controladorActividad("datos/Actividad.obj");
            controladorAlumno = new controladorAlumno(controladorPersona, "datos/Alumno.obj");
            controladorCurso = new controladorCurso("datos/Curso.obj");
            controladorDocente = new controladorDocente(controladorPersona, "datos/Docente.obj");
            controladorUsuario = new controladorUsuario("datos/Usuario.obj");

            ventanaIniciarSesion = new VentanaIniciarSesion(this, controladorUsuario);
            gestionEstudiantes = new GestionEstudiantes(controladorAlumno, controladorCurso);
            gestionDocentes = new GestionDocentes(controladorDocente, controladorCurso, controladorUsuario);
            gestionCursos = new GestionCursos(controladorCurso);
            gestionActividades = new GestionActividades(controladorActividad);

            EstudiantesMenu.setVisible(false);
            DocentesMenu.setVisible(false);
            CursoMenu.setVisible(false);
            CerrarSesionMenuItem.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        IniciarSesionMenuItem = new javax.swing.JMenuItem();
        CerrarSesionMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        EstudiantesMenu = new javax.swing.JMenu();
        GestionEstMenuItem = new javax.swing.JMenuItem();
        ActividadesMenuItem = new javax.swing.JMenuItem();
        DocentesMenu = new javax.swing.JMenu();
        GestionDocMenuItem = new javax.swing.JMenuItem();
        CursoMenu = new javax.swing.JMenu();
        GestionMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        IniciarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        IniciarSesionMenuItem.setMnemonic('o');
        IniciarSesionMenuItem.setText("Iniciar  Sesion");
        IniciarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(IniciarSesionMenuItem);

        CerrarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CerrarSesionMenuItem.setText("Cerrar Sesion");
        CerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(CerrarSesionMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        EstudiantesMenu.setMnemonic('e');
        EstudiantesMenu.setText("Estudiantes");

        GestionEstMenuItem.setMnemonic('t');
        GestionEstMenuItem.setText("Gestion Estudiantes");
        GestionEstMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionEstMenuItemActionPerformed(evt);
            }
        });
        EstudiantesMenu.add(GestionEstMenuItem);

        ActividadesMenuItem.setText("Gestion Actividades");
        ActividadesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadesMenuItemActionPerformed(evt);
            }
        });
        EstudiantesMenu.add(ActividadesMenuItem);

        menuBar.add(EstudiantesMenu);

        DocentesMenu.setMnemonic('h');
        DocentesMenu.setText("Docentes");

        GestionDocMenuItem.setMnemonic('c');
        GestionDocMenuItem.setText("Gestion Docentes");
        GestionDocMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionDocMenuItemActionPerformed(evt);
            }
        });
        DocentesMenu.add(GestionDocMenuItem);

        menuBar.add(DocentesMenu);

        CursoMenu.setText("Cursos");

        GestionMenuItem.setText("Gestion Cursos");
        GestionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionMenuItemActionPerformed(evt);
            }
        });
        CursoMenu.add(GestionMenuItem);

        menuBar.add(CursoMenu);

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

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void CerrarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionMenuItemActionPerformed
        IniciarSesionMenuItem.setVisible(true);
        EstudiantesMenu.setVisible(false);
        DocentesMenu.setVisible(false);
        CursoMenu.setVisible(false);
        exitMenuItem.setVisible(true);
    }//GEN-LAST:event_CerrarSesionMenuItemActionPerformed

    private void GestionEstMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionEstMenuItemActionPerformed
        desktopPane.add(gestionEstudiantes);
        gestionEstudiantes.setVisible(true);
    }//GEN-LAST:event_GestionEstMenuItemActionPerformed

    private void IniciarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionMenuItemActionPerformed
        desktopPane.add(ventanaIniciarSesion);
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_IniciarSesionMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /* controladorPersona.guardarDatos("datos/Persona.obj");
        controladorActividad.guardarDatos("datos/Actividad.obj");
        controladorAlumno.guardarDatos("datos/Alumno.obj");
        controladorCurso.guardarDatos("datos/Curso.obj");
        controladorUsuario.guardarDatos("datos/Usuario.obj");
        controladorDocente.guardarDatos("datos/Docente.obj");*/

    }//GEN-LAST:event_formWindowClosing

    private void GestionDocMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionDocMenuItemActionPerformed
        desktopPane.add(gestionDocentes);
        gestionDocentes.setVisible(true);
    }//GEN-LAST:event_GestionDocMenuItemActionPerformed

    private void ActividadesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadesMenuItemActionPerformed
        desktopPane.add(gestionActividades);
        gestionActividades.setVisible(true);
    }//GEN-LAST:event_ActividadesMenuItemActionPerformed

    private void GestionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionMenuItemActionPerformed
        desktopPane.add(gestionCursos);
        gestionCursos.setVisible(true);
    }//GEN-LAST:event_GestionMenuItemActionPerformed

    public JMenuItem getCerrarSesionMenuItem() {
        return CerrarSesionMenuItem;
    }

    public void setCerrarSesionMenuItem(JMenuItem CerrarSesionMenuItem) {
        this.CerrarSesionMenuItem = CerrarSesionMenuItem;
    }

    public JMenu getCursoMenu() {
        return CursoMenu;
    }

    public void setCursoMenu(JMenu CursoMenu) {
        this.CursoMenu = CursoMenu;
    }

    public JMenu getDocentesMenu() {
        return DocentesMenu;
    }

    public void setDocentesMenu(JMenu DocentesMenu) {
        this.DocentesMenu = DocentesMenu;
    }

    public JMenu getEstudiantesMenu() {
        return EstudiantesMenu;
    }

    public void setEstudiantesMenu(JMenu EstudiantesMenu) {
        this.EstudiantesMenu = EstudiantesMenu;
    }

    public JMenuItem getGestionDocMenuItem() {
        return GestionDocMenuItem;
    }

    public void setGestionDocMenuItem(JMenuItem GestionDocMenuItem) {
        this.GestionDocMenuItem = GestionDocMenuItem;
    }

    public JMenuItem getGestionEstMenuItem() {
        return GestionEstMenuItem;
    }

    public void setGestionEstMenuItem(JMenuItem GestionEstMenuItem) {
        this.GestionEstMenuItem = GestionEstMenuItem;
    }

    public JMenuItem getGestionMenuItem() {
        return GestionMenuItem;
    }

    public void setGestionMenuItem(JMenuItem GestionMenuItem) {
        this.GestionMenuItem = GestionMenuItem;
    }

    public JMenuItem getIniciarSesionMenuItem() {
        return IniciarSesionMenuItem;
    }

    public void setIniciarSesionMenuItem(JMenuItem IniciarSesionMenuItem) {
        this.IniciarSesionMenuItem = IniciarSesionMenuItem;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public void setExitMenuItem(JMenuItem exitMenuItem) {
        this.exitMenuItem = exitMenuItem;
    }

    public JMenu getFileMenu() {
        return fileMenu;
    }

    public void setFileMenu(JMenu fileMenu) {
        this.fileMenu = fileMenu;
    }

    public JMenuItem getActividadesMenuItem() {
        return ActividadesMenuItem;
    }

    public void setActividadesMenuItem(JMenuItem ActividadesMenuItem) {
        this.ActividadesMenuItem = ActividadesMenuItem;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActividadesMenuItem;
    private javax.swing.JMenuItem CerrarSesionMenuItem;
    private javax.swing.JMenu CursoMenu;
    private javax.swing.JMenu DocentesMenu;
    private javax.swing.JMenu EstudiantesMenu;
    private javax.swing.JMenuItem GestionDocMenuItem;
    private javax.swing.JMenuItem GestionEstMenuItem;
    private javax.swing.JMenuItem GestionMenuItem;
    private javax.swing.JMenuItem IniciarSesionMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
