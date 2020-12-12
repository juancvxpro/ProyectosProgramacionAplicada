/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.FacturaClienteM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorFacturaClienteM extends AbstractControlador<FacturaClienteM> {

    public controladorFacturaClienteM(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(FacturaClienteM objeto) {
        return false;
        
    }

    @Override
    public int generarId() {
           List<FacturaClienteM> temp = new ArrayList();
         super.getLista().stream().map(a -> (FacturaClienteM) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }
    
    
}
}