/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.ClienteFijo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorClienteFijo extends AbstractControlador<ClienteFijo> {

    
    
    

    @Override
    public boolean validar(ClienteFijo objeto) {
        return true;
        
    }

   
    
      public List<ClienteFijo> clientesFijos() {
        
        List<ClienteFijo> lista = new ArrayList();
        ClienteFijo u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (ClienteFijo) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
      
       public double generarMulta(ClienteFijo cliente){
        
       double valorMulta=0;
        
       Calendar fechaExpiracion =cliente.getFechaExpiracion();
       Calendar fechaActual = new GregorianCalendar();
       int dias=-1;
       
       while(fechaExpiracion.before(fechaActual)|| fechaExpiracion.equals(fechaActual)){
       dias++;
       fechaExpiracion.add(Calendar.DATE,dias);
       }
       //si han transcurrido 7 dias ( una semana) de la fecha, se le aumenta un 10% al bono a pagar
       if(dias==7){
     valorMulta= cliente.getAbono()+(cliente.getAbono()*0.1);
       }
        return valorMulta;
    
    }
       public ClienteFijo buscarCliente(String cedula){
           
           ClienteFijo u;
        Iterator i = super.buscarTodo().iterator();
        while (i.hasNext()) {
            u = (ClienteFijo) i.next();
            if(u.getCedula().trim().equals(cedula.trim())){
            return u;
            }
            
        }
        return null;
       
       }
       
}
