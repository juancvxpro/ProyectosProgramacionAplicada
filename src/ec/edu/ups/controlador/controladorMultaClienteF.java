/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.ClienteFijo;
import ec.edu.ups.modelo.MultaClienteFijo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorMultaClienteF extends AbstractControlador<MultaClienteFijo> {

    public controladorMultaClienteF(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(MultaClienteFijo objeto) {
        return false;
        
    }

    @Override
    public int generarId() {
       List<MultaClienteFijo> temp = new ArrayList();
         super.getLista().stream().map(a -> (MultaClienteFijo) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }
       
    }
       public double generarMulta(ClienteFijo cliente){
        
       double valorMulta=0;
        
       Calendar fechaExpiracion =cliente.getFechaExpiracion();
       Calendar fechaActual = new GregorianCalendar();
       int dias=-1;
       
       while(fechaExpiracion.before(fechaActual)|| fechaExpiracion.equals(fechaActual)){
       dias++;
       fechaExpiracion.add(Calendar.DATE,1);
       }
       //si han transcurrido 7 dias ( una semana) de la fecha, se le aumenta un 10% al bono a pagar
       if(dias==7){
     valorMulta= cliente.getAbono()+(cliente.getAbono()*0.1);
       }
        return valorMulta;
    
    }
    
    
    public List<MultaClienteFijo> MultasclientesF() {
        
        List<MultaClienteFijo> lista = new ArrayList();
        MultaClienteFijo u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (MultaClienteFijo) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
