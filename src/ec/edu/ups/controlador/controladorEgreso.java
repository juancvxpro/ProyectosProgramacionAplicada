/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Egresos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorEgreso extends AbstractControlador<Egresos> {

 
    
    
    @Override
    public boolean validar(Egresos objeto) {
        return true;
       
    }


    
     public List<Egresos> egresos() {
        
        List<Egresos> lista = new ArrayList();
        Egresos u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (Egresos) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
