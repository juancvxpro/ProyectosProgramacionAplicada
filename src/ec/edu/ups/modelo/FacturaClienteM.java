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
public class FacturaClienteM implements Serializable {

    private int id;

    private Calendar Fecha;

    private String nombres;

    private String drireccion;

    private String cedula;

    private String telefono;

    private TicketClienteMomentaneo ticket;

    public FacturaClienteM() {
    }

    public FacturaClienteM(int id, Calendar Fecha, String nombres, String drireccion, String cedula, String telefono, TicketClienteMomentaneo ticket) {
        this.id = id;
        this.Fecha = Fecha;
        this.nombres = nombres;
        this.drireccion = drireccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.ticket = ticket;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDrireccion() {
        return drireccion;
    }

    public void setDrireccion(String drireccion) {
        this.drireccion = drireccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TicketClienteMomentaneo getTicket() {
        return ticket;
    }

    public void setTicket(TicketClienteMomentaneo ticket) {
        this.ticket = ticket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final FacturaClienteM other = (FacturaClienteM) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
