/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public class Ingresos implements Serializable {

    private int id;

    private Date fechaHora;

    private String descripcion;

    private double ingreso;

    public Ingresos() {
    }

    public Ingresos(int id, Date fechaHora, String descripcion, double ingreso) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.ingreso = ingreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Ingresos other = (Ingresos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
