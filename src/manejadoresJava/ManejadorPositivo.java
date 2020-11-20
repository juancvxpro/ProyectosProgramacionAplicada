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
public class ManejadorPositivo extends Manejador {

    public ManejadorPositivo() {
    }
   
    @Override
     public void comprobar(int numero)
    {
         if( numero>0 ) {
            System.out.println("El número es positivo");
         }
         if( this.getSiguiente() != null ) {
             this.getSiguiente().comprobar( numero );
         }
    }
    
}
