/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class HistorialTickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     
     @Column (name="FechaHora")
    @Temporal(javax.persistence.TemporalType.DATE)
     private Calendar FechaHora;
     @Column (name="descricion")
    private String descripcion;
     
     @JoinColumn (name="ticketClienteM")
    
    @OneToOne
    private TicketClienteMomentaneo clienteM;

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
     
     
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialTickets)) {
            return false;
        }
        HistorialTickets other = (HistorialTickets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.HistorialTickets[ id=" + id + " ]";
    }
    
}
