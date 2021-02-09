/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Tarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     @Column (name="mediaHoraM")
    private double mediaHoraM;
        @Column (name="horaM")
    private double horaM;
       @Column (name=" mensualM")
    private double mensualM;

     @Column (name="mediaHoraA") 
    private double mediaHoraA;
 @Column (name="horaA")
    private double horaA;
 @Column (name="mensualA")
    private double mensualA;
 @Column (name="mediaHoraP")
    //Pesados
    private double mediaHoraP;
 @Column (name="horaP")
    private double horaP;
 @Column (name="mensualP")
    private double mensualP;
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getMediaHoraM() {
        return mediaHoraM;
    }

    public void setMediaHoraM(double mediaHoraM) {
        this.mediaHoraM = mediaHoraM;
    }

    public double getHoraM() {
        return horaM;
    }

    public void setHoraM(double horaM) {
        this.horaM = horaM;
    }

    public double getMensualM() {
        return mensualM;
    }

    public void setMensualM(double mensualM) {
        this.mensualM = mensualM;
    }

    public double getMediaHoraA() {
        return mediaHoraA;
    }

    public void setMediaHoraA(double mediaHoraA) {
        this.mediaHoraA = mediaHoraA;
    }

    public double getHoraA() {
        return horaA;
    }

    public void setHoraA(double horaA) {
        this.horaA = horaA;
    }

    public double getMensualA() {
        return mensualA;
    }

    public void setMensualA(double mensualA) {
        this.mensualA = mensualA;
    }

    public double getMediaHoraP() {
        return mediaHoraP;
    }

    public void setMediaHoraP(double mediaHoraP) {
        this.mediaHoraP = mediaHoraP;
    }

    public double getHoraP() {
        return horaP;
    }

    public void setHoraP(double horaP) {
        this.horaP = horaP;
    }

    public double getMensualP() {
        return mensualP;
    }

    public void setMensualP(double mensualP) {
        this.mensualP = mensualP;
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
        if (!(object instanceof Tarifa)) {
            return false;
        }
        Tarifa other = (Tarifa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Tarfia[ id=" + id + " ]";
    }
    
}
