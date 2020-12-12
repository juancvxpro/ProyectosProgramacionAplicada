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
public class TicketClienteMomentaneo  {
    
    
  private int id;
  
  private String nombre;
  
  private String tipoVehiculo;
  
  private Calendar fechaHoraIngreso;
  
  private Calendar fechaHoraSalida;
  
  private int espacioParqueo;
  
  private Double minutos;
  
  private Double tarifa;
  
  private boolean estado;

    public TicketClienteMomentaneo() {
    }

    public TicketClienteMomentaneo(int id, String nombre, String tipoVehiculo, Calendar fechaHoraIngreso, Calendar fechaHoraSalida, int espacioParqueo, Double minutos, Double tarifa, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.tipoVehiculo = tipoVehiculo;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.fechaHoraSalida = fechaHoraSalida;
        this.espacioParqueo = espacioParqueo;
        this.minutos = minutos;
        this.tarifa = tarifa;
        this.estado = estado;
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

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
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

    public Double getMinutos() {
        return minutos;
    }

    public void setMinutos(Double minutos) {
        this.minutos = minutos;
    }
 

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
  
    
  

    public int getEspacioParqueo() {
        return espacioParqueo;
    }

    public void setEspacioParqueo(int espacioParqueo) {
        this.espacioParqueo = espacioParqueo;
    }
  
  

 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
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
        final TicketClienteMomentaneo other = (TicketClienteMomentaneo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
   
  
    
    
    
}
