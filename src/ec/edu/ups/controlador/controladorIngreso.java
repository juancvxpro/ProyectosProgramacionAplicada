/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ingresos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorIngreso extends AbstractControlador<Ingresos> {

    
    @Override
    public boolean validar(Ingresos objeto) {
        return true;
       
    }

    
    public List<Ingresos> ingresos() {
        
        List<Ingresos> lista = new ArrayList();
        Ingresos u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (Ingresos) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
