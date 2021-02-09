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
public class HistorialClientesFijos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name="fechaHora")
    @Temporal(javax.persistence.TemporalType.DATE)
     private Calendar FechaHora;
    @Column (name="descripcion")
    private String descripcion;
     @JoinColumn (name="clienteF")

    @OneToOne
    private ClienteFijo clienteF;
     
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialClientesFijos)) {
            return false;
        }
        HistorialClientesFijos other = (HistorialClientesFijos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.HistorialClientesFijos[ id=" + id + " ]";
    }
    
}
