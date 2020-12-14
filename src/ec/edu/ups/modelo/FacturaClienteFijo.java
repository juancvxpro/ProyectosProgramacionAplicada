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
public class FacturaClienteFijo implements Serializable {

    int id;

    private ClienteFijo clientefijo;

    private String descripcion;

    public FacturaClienteFijo() {
    }

    public FacturaClienteFijo(int id, ClienteFijo clientefijo, String descripcion) {
        this.id = id;
        this.clientefijo = clientefijo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteFijo getClientefijo() {
        return clientefijo;
    }

    public void setClientefijo(ClienteFijo clientefijo) {
        this.clientefijo = clientefijo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final FacturaClienteFijo other = (FacturaClienteFijo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FacturaClienteFijo{" + "id=" + id + ", clientefijo=" + clientefijo + ", descripcion=" + descripcion + '}';
    }

}
