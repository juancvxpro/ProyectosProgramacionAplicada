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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class TicketClienteMomentaneo implements Serializable {

    @OneToOne(mappedBy = "clienteM")
    private HistorialTickets historialTickets;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
     @Column (name="nombreT")
    private String nombre;
     @Column (name="tipoVehiculo")
    private String tipoVehiculo;
     @Column (name="fechahoraIngreso")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaHoraIngreso;
      @Column (name="fechaHoraSalida")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaHoraSalida;
       @Column (name="espacioParqueo")
    private int espacioParqueo;
      @Column (name="minutos")
    private int minutos;
      @Column (name="tarifa")
    private Double tarifa;
       @Column (name="estado")
    private boolean estado;
       @Column (name="multa")
    private double multa;
       
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Calendar getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(Calendar fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public Calendar getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Calendar fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public int getEspacioParqueo() {
        return espacioParqueo;
    }

    public void setEspacioParqueo(int espacioParqueo) {
        this.espacioParqueo = espacioParqueo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
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
        if (!(object instanceof TicketClienteMomentaneo)) {
            return false;
        }
        TicketClienteMomentaneo other = (TicketClienteMomentaneo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.TicketClienteMomentaneo[ id=" + id + " ]";
    }
    
}
