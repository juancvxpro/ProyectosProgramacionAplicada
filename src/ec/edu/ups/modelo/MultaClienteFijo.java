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
public class MultaClienteFijo implements Serializable {

    private int codigo;

    private double cantidad;

    private ClienteFijo clienteF;

    public MultaClienteFijo() {
    }

    public MultaClienteFijo(int codigo, double cantidad, ClienteFijo clienteF) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.clienteF = clienteF;
    }

    public ClienteFijo getClienteF() {
        return clienteF;
    }

    public void setClienteF(ClienteFijo clienteF) {
        this.clienteF = clienteF;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MultaClienteFijo other = (MultaClienteFijo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultaClienteFijo{codigo=").append(codigo);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", clienteF=").append(clienteF);
        sb.append('}');
        return sb.toString();
    }

}
