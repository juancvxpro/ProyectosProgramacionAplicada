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
public class JugadorRuleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
     @Column(name ="nombre")
    private String nombre;
    
    @Column(name ="numero")
    private int numero; //el número de la ruleta o 0/1
    
    @Column(name ="saldo")
     private float saldo;
    
    @Column(name ="cantidadApuesta")
    private int cantidadApuesta;
    
    @Column(name ="isPar")
     private int isPar; //Se verifica si se escogió par caso contrario, impar
    
    @Column(name ="nApuestas")
     private int nApuestas; //numero de apuestas
    
    @Column(name ="nGanadas")
     private int nWins; //numero de apuestas ganadas
    
    @Column(name ="nPerdidas")
     private int nLost; //numero de apuestas perdidas
    
    @Column(name ="dAupuesta")
     private boolean isDuplicar; //Se verifica si se escogió 'martingala' y se duplican sus proximas apuestas

   
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCantidadApuesta() {
        return cantidadApuesta;
    }

    public void setCantidadApuesta(int cantidadApuesta) {
        this.cantidadApuesta = cantidadApuesta;
    }

    public int getIsPar() {
        return isPar;
    }

    public void setIsPar(int isPar) {
        this.isPar = isPar;
    }

    public int getnApuestas() {
        return nApuestas;
    }

    public void setnApuestas(int nApuestas) {
        this.nApuestas = nApuestas;
    }

    public int getnWins() {
        return nWins;
    }

    public void setnWins(int nWins) {
        this.nWins = nWins;
    }

    public int getnLost() {
        return nLost;
    }

    public void setnLost(int nLost) {
        this.nLost = nLost;
    }

    public boolean isIsDuplicar() {
        return isDuplicar;
    }

    public void setIsDuplicar(boolean isDuplicar) {
        this.isDuplicar = isDuplicar;
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
        if (!(object instanceof JugadorRuleta)) {
            return false;
        }
        JugadorRuleta other = (JugadorRuleta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.JugadorRuleta[ id=" + id + " ]";
    }
    
}
