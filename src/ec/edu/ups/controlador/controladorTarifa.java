/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Tarifa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorTarifa extends AbstractControlador<Tarifa>{
    
    private Tarifa tarifa;

    
    

    @Override
    public boolean validar(Tarifa objeto) {
        return true;
        
    }



    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    public List<Tarifa> tarifas() {
        
        List<Tarifa> lista = new ArrayList();
        Tarifa u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (Tarifa) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
