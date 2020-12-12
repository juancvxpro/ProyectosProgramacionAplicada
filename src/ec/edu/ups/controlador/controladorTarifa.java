/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Tarifa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorTarifa extends AbstractControlador<Tarifa>{
    
    private Tarifa tarifa;

    public controladorTarifa(String ruta, Tarifa tarifa) {
        super(ruta);
        this.tarifa=tarifa;
        
    }
    
    

    @Override
    public boolean validar(Tarifa objeto) {
        return false;
        
    }

    @Override
    public int generarId() {
         List<Tarifa> temp = new ArrayList();
         super.getLista().stream().map(a -> (Tarifa) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }
       
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    
}
