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

    public controladorEgreso(String ruta) {
        super(ruta);
    }
    
    
    @Override
    public boolean validar(Egresos objeto) {
        return false;
       
    }

    @Override
    public int generarId() {
        List<Egresos> temp = new ArrayList();
         super.getLista().stream().map(a -> (Egresos) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
        
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
