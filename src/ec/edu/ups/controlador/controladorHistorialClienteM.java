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

    public controladorHistorialClienteM(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(HistorialTickets objeto) {
        return false;
        
    }

    @Override
   
       public int generarId() {
        List<HistorialTickets> temp = new ArrayList();
         super.getLista().stream().map(a -> (HistorialTickets) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
       
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
