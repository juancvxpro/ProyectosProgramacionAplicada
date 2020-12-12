/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author user
 */
public class Tarifa {
    
    int codigo;
    
    private String tipoTarifa;
    
    //motocicletas
    private Double mediaHoraM;
    
    private Double horaM;
    
    private Double mensualM;
    
    // Automoviles 
    private Double mediaHoraA;
    
    private Double horaA;
    
    private Double mensualA;
    
    //Pesados
    
    private Double mediaHoraP;
    
    private Double horaP;
    
    private Double mensualP;

    public Tarifa() {
    }

    public Tarifa(int codigo, String tipoTarifa, Double mediaHoraM, Double horaM, Double mensualM, Double mediaHoraA, Double horaA, Double mensualA, Double mediaHoraP, Double horaP, Double mensualP) {
        this.codigo = codigo;
        this.tipoTarifa = tipoTarifa;
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

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

   
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getMediaHoraM() {
        return mediaHoraM;
    }

    public void setMediaHoraM(Double mediaHoraM) {
        this.mediaHoraM = mediaHoraM;
    }

    public Double getHoraM() {
        return horaM;
    }

    public void setHoraM(Double horaM) {
        this.horaM = horaM;
    }

    public Double getMensualM() {
        return mensualM;
    }

    public void setMensualM(Double mensualM) {
        this.mensualM = mensualM;
    }

    public Double getMediaHoraA() {
        return mediaHoraA;
    }

    public void setMediaHoraA(Double mediaHoraA) {
        this.mediaHoraA = mediaHoraA;
    }

    public Double getHoraA() {
        return horaA;
    }

    public void setHoraA(Double horaA) {
        this.horaA = horaA;
    }

    public Double getMensualA() {
        return mensualA;
    }

    public void setMensualA(Double mensualA) {
        this.mensualA = mensualA;
    }

    public Double getMediaHoraP() {
        return mediaHoraP;
    }

    public void setMediaHoraP(Double mediaHoraP) {
        this.mediaHoraP = mediaHoraP;
    }

    public Double getHoraP() {
        return horaP;
    }

    public void setHoraP(Double horaP) {
        this.horaP = horaP;
    }

    public Double getMensualP() {
        return mensualP;
    }

    public void setMensualP(Double mensualP) {
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
