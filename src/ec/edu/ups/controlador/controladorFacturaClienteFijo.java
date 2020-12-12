/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.FacturaClienteFijo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorFacturaClienteFijo extends AbstractControlador<FacturaClienteFijo> {

    public controladorFacturaClienteFijo(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(FacturaClienteFijo objeto) {
        return false;
        
    }

    @Override
    public int generarId() {
        List<FacturaClienteFijo> temp = new ArrayList();
         super.getLista().stream().map(a -> (FacturaClienteFijo) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
        
    }
    
}
