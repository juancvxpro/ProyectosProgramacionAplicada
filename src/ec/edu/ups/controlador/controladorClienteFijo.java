/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.ClienteFijo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorClienteFijo extends AbstractControlador<ClienteFijo> {

    public controladorClienteFijo(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(ClienteFijo objeto) {
        return true;
        
    }

    @Override
    public int generarId() {
        List<ClienteFijo> temp = new ArrayList();
         super.getLista().stream().map(a -> (ClienteFijo) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
       
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
      
      
}
