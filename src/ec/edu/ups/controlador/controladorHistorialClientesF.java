/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.HistorialClientesFijos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorHistorialClientesF  extends AbstractControlador<HistorialClientesFijos> {

    public controladorHistorialClientesF(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(HistorialClientesFijos objeto) {
        return false;
        
    }

    @Override
    public int generarId() {
        List<HistorialClientesFijos> temp = new ArrayList();
         super.getLista().stream().map(a -> (HistorialClientesFijos) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
       
    }
    
     public List<HistorialClientesFijos> listaHistorialCF() {
        
        List<HistorialClientesFijos> lista = new ArrayList();
        HistorialClientesFijos u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (HistorialClientesFijos) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
    
}
