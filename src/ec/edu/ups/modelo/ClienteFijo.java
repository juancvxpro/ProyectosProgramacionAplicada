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
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class ClienteFijo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     
    @Column (name="cedula")
    private String cedula;
     @Column (name="nombre")
    private String nombre;
       @Column (name="apellido")
    private String apellido;
     @Column (name="direccion")
    private String direccion;
       @Column (name="tlf")
    private String tlf;
      @Column (name="tipoVehiculo")
    private String tipoVehivulo;
      @Column (name="tipoTarifa")
    private String tipoTarifa;
       @Column (name="abono")
    private Double abono;
       @Column (name="fechaExpiracion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaExpiracion;
       @Column (name="espacioParqueo")
    private int espacioParqueo;
       @Column (name="multa")
    private double multa;
     @Column (name="estado")
    private boolean estado;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getTipoVehivulo() {
        return tipoVehivulo;
    }

    public void setTipoVehivulo(String tipoVehivulo) {
        this.tipoVehivulo = tipoVehivulo;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public Double getAbono() {
        return abono;
    }

    public void setAbono(Double abono) {
        this.abono = abono;
    }

    public Calendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Calendar fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getEspacioParqueo() {
        return espacioParqueo;
    }

    public void setEspacioParqueo(int espacioParqueo) {
        this.espacioParqueo = espacioParqueo;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        if (!(object instanceof ClienteFijo)) {
            return false;
        }
        ClienteFijo other = (ClienteFijo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.ClienteFijo[ id=" + id + " ]";
    }
    
}
