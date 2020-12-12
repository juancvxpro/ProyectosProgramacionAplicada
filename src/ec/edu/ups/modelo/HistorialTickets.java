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
public class HistorialTickets implements Serializable {
    
    private int id;
    private Calendar FechaHora;
    
    private String descripcion;
    
    private TicketClienteMomentaneo clienteM;

    public HistorialTickets() {
    }

    public HistorialTickets(int id, Calendar FechaHora, String descripcion, TicketClienteMomentaneo clienteM) {
        this.id = id;
        this.FechaHora = FechaHora;
        this.descripcion = descripcion;
        this.clienteM = clienteM;
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

    public TicketClienteMomentaneo getClienteM() {
        return clienteM;
    }

    public void setClienteM(TicketClienteMomentaneo clienteM) {
        this.clienteM = clienteM;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final HistorialTickets other = (HistorialTickets) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HistorialTickets{id=").append(id);
        sb.append(", FechaHora=").append(FechaHora);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", clienteM=").append(clienteM);
        sb.append('}');
        return sb.toString();
    }
    
    
    

    
}
