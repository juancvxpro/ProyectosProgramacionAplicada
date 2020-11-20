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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Manejador m1 = new ManejadorPositivo();
        Manejador m2 = new ManejadorNegativo();
        Manejador m3 = new ManejadorRangoPositivo();
         m1.setSiguiente( m2 );
         m2.setSiguiente( m3 );
         
         m1.comprobar(60);// Verificacmos con el numero 60
        m1.comprobar(-30); // Verificamos con el numero-30
        m1.comprobar(40); // Verificamos con el numero 40
    }
    
}
