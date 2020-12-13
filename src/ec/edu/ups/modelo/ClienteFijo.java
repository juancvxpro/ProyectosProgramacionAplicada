/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class ClienteFijo extends Persona {

    private int id;

    private String tipoVehivulo;

    private String tipoTarifa;

    private Double abono;

    private Calendar fechaExpiracion;

    private int espacioParqueo;

    public ClienteFijo(int id, String tipoVehivulo, String tarifa, Double abono, Calendar fechaExpiracion, int espacioParqueo, String cedula, String nombre, String apellido, String direccion, String telefono) {
        super(cedula, nombre, apellido, direccion, telefono);
        this.id = id;
        this.tipoVehivulo = tipoVehivulo;
        this.tipoTarifa = tarifa;
        this.abono = abono;
        this.fechaExpiracion = fechaExpiracion;
        this.espacioParqueo = espacioParqueo;
    }

    public int getEspacioParqueo() {
        return espacioParqueo;
    }

    public void setEspacioParqueo(int espacioParqueo) {
        this.espacioParqueo = espacioParqueo;
    }

    public Calendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Calendar fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final ClienteFijo other = (ClienteFijo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
