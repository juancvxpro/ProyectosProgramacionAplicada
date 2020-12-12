/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class HistorialClientesFijos  implements Serializable{
    
    private int id;
    private Calendar FechaHora;
    
    private String descripcion;
    
    private ClienteFijo clienteF;

    public HistorialClientesFijos() {
    }

    public HistorialClientesFijos(int id, Calendar FechaHora, String descripcion, ClienteFijo clienteF) {
        this.id = id;
        this.FechaHora = FechaHora;
        this.descripcion = descripcion;
        this.clienteF = clienteF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(Calendar FechaHora) {
        this.FechaHora = FechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ClienteFijo getClienteF() {
        return clienteF;
    }

    public void setClienteF(ClienteFijo clienteF) {
        this.clienteF = clienteF;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
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
        final HistorialClientesFijos other = (HistorialClientesFijos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HistorialClientesFijos{id=").append(id);
        sb.append(", FechaHora=").append(FechaHora);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", clienteF=").append(clienteF);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
