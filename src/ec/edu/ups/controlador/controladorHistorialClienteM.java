/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.HistorialTickets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorHistorialClienteM extends AbstractControlador<HistorialTickets> {

   
    
    

    @Override
    public boolean validar(HistorialTickets objeto) {
        return true;
        
    }

 
       
    
    
     public List<HistorialTickets> listaHistorialCM() {
        
        List<HistorialTickets> lista = new ArrayList();
        HistorialTickets u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (HistorialTickets) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
