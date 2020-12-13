/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class MultaClienteMomentaneo implements Serializable {

    private int codigo;

    private double cantidad;

    private TicketClienteMomentaneo clienteM;

    public MultaClienteMomentaneo() {
    }

    public MultaClienteMomentaneo(int codigo, double cantidad, TicketClienteMomentaneo clienteM) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.clienteM = clienteM;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public TicketClienteMomentaneo getClienteM() {
        return clienteM;
    }

    public void setClienteM(TicketClienteMomentaneo clienteM) {
        this.clienteM = clienteM;
    }

}
