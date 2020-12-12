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

    public controladorIngreso(String ruta) {
        super(ruta);
    }
     
    
    
    
    @Override
    public boolean validar(Ingresos objeto) {
        return false;
       
    }

    @Override
    public int generarId() {
       List<Ingresos> temp = new ArrayList();
         super.getLista().stream().map(a -> (Ingresos) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
        
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
