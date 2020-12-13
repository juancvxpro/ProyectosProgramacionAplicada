/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Tarifa implements Serializable {

    int codigo;

    //motocicletas
    private double mediaHoraM;

    private double horaM;

    private double mensualM;

    // Automoviles 
    private double mediaHoraA;

    private double horaA;

    private double mensualA;

    //Pesados
    private double mediaHoraP;

    private double horaP;

    private double mensualP;

    public Tarifa() {
    }

    public Tarifa(int codigo, double mediaHoraM, double horaM, double mensualM, double mediaHoraA, double horaA, double mensualA, double mediaHoraP, double horaP, double mensualP) {
        this.codigo = codigo;

        this.mediaHoraM = mediaHoraM;
        this.horaM = horaM;
        this.mensualM = mensualM;
        this.mediaHoraA = mediaHoraA;
        this.horaA = horaA;
        this.mensualA = mensualA;
        this.mediaHoraP = mediaHoraP;
        this.horaP = horaP;
        this.mensualP = mensualP;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        int hash = 7;
        hash = 17 * hash + this.codigo;
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
        final Tarifa other = (Tarifa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarifa{codigo=").append(codigo);
        sb.append(", mediaHoraM=").append(mediaHoraM);
        sb.append(", horaM=").append(horaM);
        sb.append(", mensualM=").append(mensualM);
        sb.append(", mediaHoraA=").append(mediaHoraA);
        sb.append(", horaA=").append(horaA);
        sb.append(", mensualA=").append(mensualA);
        sb.append(", mediaHoraP=").append(mediaHoraP);
        sb.append(", horaP=").append(horaP);
        sb.append(", mensualP=").append(mensualP);
        sb.append('}');
        return sb.toString();
    }

}
