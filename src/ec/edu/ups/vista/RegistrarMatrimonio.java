/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorAutoridad;
import ec.edu.ups.controlador.controladorMatrimonio;
import ec.edu.ups.controlador.controladorPersona;
import ec.edu.ups.modelo.Autoridad;
import ec.edu.ups.modelo.Matrimonio;
import ec.edu.ups.modelo.Persona;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class RegistrarMatrimonio extends javax.swing.JInternalFrame {
    
    private controladorPersona controladorPersona;
    private controladorAutoridad controladorAutoridad;
    private controladorMatrimonio controladorMatrimonio;
    
    public RegistrarMatrimonio(controladorPersona controladorPersona,controladorAutoridad controladorAutoridad,controladorMatrimonio controladorMatrimonio ) {
        initComponents();
        this.controladorAutoridad=controladorAutoridad;
        this.controladorPersona=controladorPersona;
        this.controladorMatrimonio= controladorMatrimonio;
    }
   public void cargarSiguienteCodigo(){
   lblCodigoR.setText(String.valueOf(controladorAutoridad.generarId()));
   
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtTestigoCed = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblFechaN = new javax.swing.JLabel();
        lblCedulaTestigo = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lblCedulaC1 = new javax.swing.JLabel();
        txtCedulaC1 = new javax.swing.JTextField();
        btnBuscarContrayente = new javax.swing.JButton();
        lblDireccion1 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFN1 = new javax.swing.JTextField();
        txtGenero1 = new javax.swing.JTextField();
        btnBuscarTestigo2 = new javax.swing.JButton();
        lblDireccion2 = new javax.swing.JLabel();
        txtEC = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblCedulaC2 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblFechaN1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblCedulaTestigo1 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        btnBuscarContrayente1 = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtTestigoCed1 = new javax.swing.JTextField();
        btnBuscarTestigo1 = new javax.swing.JButton();
        txtCedulaC3 = new javax.swing.JTextField();
        lblDireccion3 = new javax.swing.JLabel();
        txtEC1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCodigoR = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarM = new javax.swing.JButton();
        lblAutoridad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAutoridad1 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(204, 181, 147));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 239));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombre1.setEditable(false);

        txtApellido1.setEditable(false);

        lblNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        lblFechaN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFechaN.setText("Fecha de nacimiento:");

        lblCedulaTestigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCedulaTestigo.setText("Cedula Testigo");

        lbl6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl6.setText("Nombres del testigo :");

        lbl7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl7.setText("-------------");

        lblCedulaC1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCedulaC1.setText("Cedula contrayente:");

        btnBuscarContrayente.setText("BUSCAR");
        btnBuscarContrayente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContrayenteActionPerformed(evt);
            }
        });

        lblDireccion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDireccion1.setText("Direccion:");

        lbl5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl5.setText("Genero:");

        txtDireccion.setEditable(false);

        txtFN1.setEditable(false);

        txtGenero1.setEditable(false);

        btnBuscarTestigo2.setText("BUSCAR");
        btnBuscarTestigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTestigo2ActionPerformed(evt);
            }
        });

        lblDireccion2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDireccion2.setText("Estado Civil");

        txtEC.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(lblCedulaTestigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTestigoCed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(lbl5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCedulaC1)
                                        .addComponent(lblNombre)
                                        .addComponent(lblApellido))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCedulaC1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEC, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblFechaN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFN1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarContrayente)
                            .addComponent(btnBuscarTestigo2))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion2)
                            .addComponent(lblDireccion1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaC1)
                    .addComponent(txtCedulaC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarContrayente))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDireccion1)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion2)
                    .addComponent(txtEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaN)
                    .addComponent(txtFN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedulaTestigo)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTestigoCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarTestigo2)))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(lbl7))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 239));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCedulaC2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCedulaC2.setText("Cedula contrayente:");

        lblNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombre1.setText("Nombre:");

        lblApellido1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblApellido1.setText("Apellido:");

        lblDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDireccion.setText("Direccion:");

        lblFechaN1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFechaN1.setText("Fecha de nacimiento:");

        lbl4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl4.setText("Genero:");

        lblCedulaTestigo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCedulaTestigo1.setText("Cedula Testigo");

        lbl8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl8.setText("Nombres del testigo :");

        lbl9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl9.setText("-------------");

        btnBuscarContrayente1.setText("BUSCAR");
        btnBuscarContrayente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContrayente1ActionPerformed(evt);
            }
        });

        txt3.setEditable(false);

        txt5.setEditable(false);

        txt.setEditable(false);

        txt4.setEditable(false);

        txtGenero.setEditable(false);

        btnBuscarTestigo1.setText("BUSCAR");
        btnBuscarTestigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTestigo1ActionPerformed(evt);
            }
        });

        lblDireccion3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDireccion3.setText("Estado Civil");

        txtEC1.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblDireccion3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEC1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCedulaC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCedulaC3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblApellido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl8)
                            .addComponent(lblCedulaTestigo1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(txtTestigoCed1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblFechaN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarContrayente1)
                    .addComponent(btnBuscarTestigo1))
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedulaC2)
                            .addComponent(btnBuscarContrayente1)
                            .addComponent(txtCedulaC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre1)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido1)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(lblDireccion))
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion3)
                            .addComponent(txtEC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lblFechaN1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaTestigo1)
                    .addComponent(txtTestigoCed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTestigo1))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl8)
                    .addComponent(lbl9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE MATRIMONIO");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO DE REGISTRO:");

        lblCodigoR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigoR.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoR.setText("0");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA:");

        lblFechaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaRegistro.setText("-");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LUGAR:");

        btnRegistrarM.setText("REGISTRAR");
        btnRegistrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMActionPerformed(evt);
            }
        });

        lblAutoridad.setBackground(new java.awt.Color(255, 255, 255));
        lblAutoridad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAutoridad.setForeground(new java.awt.Color(255, 255, 255));
        lblAutoridad.setText("AUTORIDAD:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        lblAutoridad1.setBackground(new java.awt.Color(255, 255, 255));
        lblAutoridad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAutoridad1.setForeground(new java.awt.Color(255, 255, 255));
        lblAutoridad1.setText("--");

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(lblAutoridad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAutoridad1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarM)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(140, 140, 140)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnLimpiar)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblCodigoR)
                    .addComponent(jLabel7)
                    .addComponent(lblAutoridad)
                    .addComponent(lblAutoridad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFechaRegistro)
                    .addComponent(jLabel5)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarM)
                    .addComponent(btnLimpiar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarContrayenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContrayenteActionPerformed
        Persona comparar = new Persona ();
        comparar.setCedula(txtCedulaC1.getText().trim());
         Optional<Persona> p= controladorPersona.buscar(comparar);
         Persona persona =p.get();
          System.out.println(""+persona);
           if (persona!=null){
            txtNombre1.setText(persona.getNombres());
            txtApellido1.setText(persona.getApellidos());
            txtDireccion.setText(persona.getDireccion());
            txtFN1.setText(persona.getFechaNacimiento().toString());
            txtGenero1.setText(persona.getGenero());
             persona.setRol("Contrayente");
             if(controladorPersona.actualizar(persona)){
            JOptionPane.showMessageDialog(this, "Datos Contrayente1");
           }
             try {
            controladorMatrimonio.guardarDatos("datos/Persona.obj");
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
         
         
        
    }//GEN-LAST:event_btnBuscarContrayenteActionPerformed

    private void btnBuscarTestigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTestigo2ActionPerformed
        Persona comparar = new Persona ();
        comparar.setCedula(txtTestigoCed.getText().trim());
         Optional<Persona> p= controladorPersona.buscar(comparar);
         Persona persona =p.get();
          System.out.println(""+persona);
      
          persona.setRol("Testigo");
           if (persona!=null){
            lbl7.setText(persona.getNombres()+" "+persona.getApellidos()+" "+persona.getCedula());
            
           if(controladorPersona.actualizar(persona)){
            JOptionPane.showMessageDialog(this, "Datos Testigo 1");
           }
           
           try {
            controladorMatrimonio.guardarDatos("datos/Persona.obj");
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
         
    }//GEN-LAST:event_btnBuscarTestigo2ActionPerformed

    private void btnBuscarContrayente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContrayente1ActionPerformed
        Persona comparar = new Persona ();
        comparar.setCedula(txtCedulaC1.getText().trim());
         Optional<Persona> p= controladorPersona.buscar(comparar);
         Persona persona =p.get();
          System.out.println(""+persona);
           if (persona!=null){
            txt3.setText(persona.getNombres());
            txt5.setText(persona.getApellidos());
            txt.setText(persona.getDireccion());
            txt4.setText(persona.getFechaNacimiento().toString());
            txtGenero.setText(persona.getGenero());
             persona.setRol("Contrayente");
             if(controladorPersona.actualizar(persona)){
            JOptionPane.showMessageDialog(this, "Datos Contrayente1");
           }
             try {
            controladorMatrimonio.guardarDatos("datos/Persona.obj");
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
    }//GEN-LAST:event_btnBuscarContrayente1ActionPerformed

    private void btnBuscarTestigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTestigo1ActionPerformed
       Persona comparar = new Persona ();
        comparar.setCedula(txtTestigoCed1.getText().trim());
         Optional<Persona> p= controladorPersona.buscar(comparar);
         Persona persona =p.get();
          System.out.println(""+persona);
      
          persona.setRol("Testigo");
           if (persona!=null){
            lbl7.setText(persona.getNombres()+" "+persona.getApellidos()+" "+persona.getCedula());
            
           if(controladorPersona.actualizar(persona)){
            JOptionPane.showMessageDialog(this, "Datos Testigo 1");
           }
           try {
            controladorMatrimonio.guardarDatos("datos/Persona.obj");
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
    }//GEN-LAST:event_btnBuscarTestigo1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       cargarSiguienteCodigo();
        lblAutoridad1.setText(controladorAutoridad.getAutoridad().getNombres()
               +" "+controladorAutoridad.getAutoridad().getApellidos()+" "+controladorAutoridad.getAutoridad().getCargo());
        Date fecha = new Date();
         lblFechaRegistro.setText(fecha.toString());
         controladorPersona.cargarDatos();
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnRegistrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMActionPerformed
        
        Persona t1 = new Persona();
        Persona t2 = new Persona();
        
        Persona Com= new Persona();
        Persona Com2 = new Persona();
        
        Com.setCedula(txtCedulaC1.getText().trim());
        Com2.setCedula(txtCedulaC3.getText().trim());
       
         Optional<Persona> p= controladorPersona.buscar(Com);
          
         Optional<Persona> p2= controladorPersona.buscar(Com2);
         t1=p.get();
         t2=p2.get();
        
         Autoridad a= controladorAutoridad.getAutoridad();
        
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         Date fN=null;
        try {
             fN = formato.parse(txtFN1.getText().trim());
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarMatrimonio.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         Date f=null;
        try {
             f = formato.parse(txt4.getText().trim());
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarMatrimonio.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date fecha = new Date();
         Persona c1= new Persona(txtCedulaC1.getText().trim(),txtNombre1.getText().trim(),txtApellido1.getText().trim(),txtDireccion.getText().trim(),txtGenero1.getText().trim(),fN,"Casado "+txt3.getText().trim()+" "+txtApellido1,"Ciudadano");
           Persona c2= new Persona(txtCedulaC3.getText().trim(),txt3.getText().trim(),txt5.getText().trim(),txt.getText().trim(),txtGenero.getText().trim(),f,"Casado "+txtNombre1.getText().trim()+" "+txt5,"Ciudadano");
         //String cedula, String nombres, String apellidos, String direccion, String genero, Date fechaNacimiento, String estadoCivil, String rol
        //int codigoM, String lugar, Date fecha, Persona contrayente1, Persona contreyente2, Persona testigo1, Persona testigo2, Persona autoridad
        Matrimonio m = new Matrimonio(Integer.parseInt(lblCodigoR.getText().trim()),txtLugar.getText().trim(),fecha,c1,c2,t1,t2,a);
        
        controladorMatrimonio.crear(m);
        
        controladorPersona.actualizar(c1);
        controladorPersona.actualizar(c2);
        
        JOptionPane.showMessageDialog(this, "MATRIMONIO REGISTRADO CON EXITO : FELICITACIONES A LOS NOVIOS");
        try {
            controladorMatrimonio.guardarDatos("datos/Persona.obj");
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            controladorMatrimonio.guardarDatos("datos/Matrimonio.obj");
        } catch (IOException ex) {
            Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRegistrarMActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    lblFechaRegistro.setText("");
    txtLugar.setText("");
    cargarSiguienteCodigo();
    txtCedulaC1.setText("");   
    txtNombre1.setText(""); 
    txtApellido1.setText(""); 
    txtDireccion.setText(""); 
    txtFN1.setText(""); 
    txtGenero1.setText(""); 
    lbl7.setText(""); 
     txtCedulaC3.setText("");   
    txt3.setText(""); 
    txt5.setText(""); 
    txt4.setText(""); 
    txtGenero.setText(""); 
    txtTestigoCed1.setText(""); 
    lbl9.setText(""); 
            
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarContrayente;
    private javax.swing.JButton btnBuscarContrayente1;
    private javax.swing.JButton btnBuscarTestigo1;
    private javax.swing.JButton btnBuscarTestigo2;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblAutoridad;
    private javax.swing.JLabel lblAutoridad1;
    private javax.swing.JLabel lblCedulaC1;
    private javax.swing.JLabel lblCedulaC2;
    private javax.swing.JLabel lblCedulaTestigo;
    private javax.swing.JLabel lblCedulaTestigo1;
    private javax.swing.JLabel lblCodigoR;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblDireccion2;
    private javax.swing.JLabel lblDireccion3;
    private javax.swing.JLabel lblFechaN;
    private javax.swing.JLabel lblFechaN1;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCedulaC1;
    private javax.swing.JTextField txtCedulaC3;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEC;
    private javax.swing.JTextField txtEC1;
    private javax.swing.JTextField txtFN1;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtGenero1;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTestigoCed;
    private javax.swing.JTextField txtTestigoCed1;
    // End of variables declaration//GEN-END:variables
}
