/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Excepciones;

/**
 *
 * @author user
 */
public class ExcepcionLogin extends Exception
{
    public ExcepcionLogin() {
        super("Usuario o contraseña incorrectro");
        
    }
    
}
