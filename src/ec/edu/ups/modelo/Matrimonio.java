package ec.edu.ups.modelo;

import java.util.Date;

public class Matrimonio {

    private int codigoM;

    private String lugar;
    private Date fecha;

    private Persona contrayente1;
    private Persona contreyente2;

    private Persona testigo1;
    private Persona testigo2;

    private Autoridad autoridad;

    public Matrimonio(int codigoM, String lugar, Date fecha, Persona contrayente1, Persona contreyente2, Persona testigo1, Persona testigo2, Autoridad autoridad) {
        this.codigoM = codigoM;
        this.lugar = lugar;
        this.fecha = fecha;
        this.contrayente1 = contrayente1;
        this.contreyente2 = contreyente2;
        this.testigo1 = testigo1;
        this.testigo2 = testigo2;
        this.autoridad = autoridad;
    }

    public int getCodigoM() {
        return codigoM;
    }

    public void setCodigoM(int codigoM) {
        this.codigoM = codigoM;
    }

    public Persona getContrayente1() {
        return contrayente1;
    }

    public void setContrayente1(Persona contrayente1) {
        this.contrayente1 = contrayente1;
    }

    public Persona getContreyente2() {
        return contreyente2;
    }

    public void setContreyente2(Persona contreyente2) {
        this.contreyente2 = contreyente2;
    }

    public Persona getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(Persona testigo1) {
        this.testigo1 = testigo1;
    }

    public Persona getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(Persona testigo2) {
        this.testigo2 = testigo2;
    }

    public Persona getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(Autoridad autoridad) {
        this.autoridad = autoridad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigoM;
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
        final Matrimonio other = (Matrimonio) obj;
        if (this.codigoM != other.codigoM) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matrimonio{codigoM=").append(codigoM);
        sb.append(", lugar=").append(lugar);
        sb.append(", fecha=").append(fecha);
        sb.append(", contrayente1=").append(contrayente1);
        sb.append(", contreyente2=").append(contreyente2);
        sb.append(", testigo1=").append(testigo1);
        sb.append(", testigo2=").append(testigo2);
        sb.append(", autoridad=").append(autoridad);
        sb.append('}');
        return sb.toString();
    }

}
