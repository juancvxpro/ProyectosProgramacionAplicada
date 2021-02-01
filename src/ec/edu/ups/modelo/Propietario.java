/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author user
 */
@Entity
public class Propietario extends Persona implements Serializable {

@Column(name="direccionCasa")
 @OneToOne
private Casa casa;

@Column (name="garante")
private String garante;

@OneToMany(mappedBy="propietario",targetEntity=Hipoteca.class)
 private Set<Hipoteca> hipotecas;


    public Casa getCasa() {
        return casa;
    }
   
    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Set<Hipoteca> getHipotecas() {
        return hipotecas;
    }

    public void setHipotecas(Set<Hipoteca> hipotecas) {
        this.hipotecas = hipotecas;
    }

    public String getGarante() {
        return garante;
    }

    public void setGarante(String garante) {
        this.garante = garante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propietario{casa=").append(casa);
        sb.append(", garante=").append(garante);
        sb.append('}');
        return sb.toString();
    }




  

}
