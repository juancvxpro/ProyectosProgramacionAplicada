/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.vista.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class Cliente implements Runnable{
  
    
   
    Monitor m;
  
    public Cliente( Monitor m) {
        
       
        this.m=m;
        m.clientes++;
        
        
    }

    public Cliente() {
    }
    
    @Override
    public void run() {
           while(true){
            if(Thread.currentThread().isAlive()){
                if(!m.cajero1){
                    m.ingresoCajero1();
                    break;
                }else  if(!m.cajero2){
                 m.ingresoCajero2();
                    break;
                }else if(!m.cajero3){
                 m.ingresoCajero3();
                    break;
                }
            }
        }
    }
   
    
    
}
