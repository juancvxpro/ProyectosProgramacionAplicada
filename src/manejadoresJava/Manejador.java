/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadoresJava;

/**
 *
 * @author user
 */
public abstract class Manejador {
    
    protected Manejador siguienteManejador;
    
     public Manejador getSiguiente() {
        return this.siguienteManejador;
    }
  
    public void setSiguiente(Manejador m) {
        this.siguienteManejador = m;
    }
    
     public abstract void comprobar(int numero);
    
}
