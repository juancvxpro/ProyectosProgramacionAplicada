/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorMatrimonio;
import ec.edu.ups.modelo.Matrimonio;
import ec.edu.ups.modelo.Persona;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ListarRegistrarMatrimonio extends javax.swing.JInternalFrame {

    private controladorMatrimonio controladorMatrimonio;

    public ListarRegistrarMatrimonio(controladorMatrimonio controladorMatrimonio) {
        initComponents();
        this.controladorMatrimonio = controladorMatrimonio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();

        setTitle("Listado de registros de mstrimonios por Usuario Autoridad logeado");
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

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Lugar", "Fecha", "Contrayente 1", "Contrayente 2", "Testigo 1", "Testigo 2", "Autoridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        controladorMatrimonio.cargarDatos();
        DefaultTableModel modelo = (DefaultTableModel) tblRegistros.getModel();
        modelo.setRowCount(0);
        if (controladorMatrimonio.registros() != null) {
            for (Iterator it = controladorMatrimonio.registros().iterator(); it.hasNext();) {
                Matrimonio matrimonio = (Matrimonio) it.next();
                Object[] rowData = {matrimonio.getCodigoM(), matrimonio.getLugar(), matrimonio.getFecha().toString(), matrimonio.getContrayente1().getNombres()
                    + " " + matrimonio.getContrayente1().getApellidos(), matrimonio.getContreyente2().getNombres() + " " + matrimonio.getContreyente2().getApellidos(),
                    matrimonio.getTestigo1().getNombres().concat(matrimonio.getTestigo1().getApellidos()), matrimonio.getTestigo2().getNombres() + " " + matrimonio.getTestigo2().getApellidos(), matrimonio.getAutoridad().getNombres()
                    + " " + matrimonio.getAutoridad().getApellidos()};
                modelo.addRow(rowData);
                tblRegistros.setModel(modelo);
            }
        } else {
            System.out.println("LISTA VACIA");
        }
    }//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
