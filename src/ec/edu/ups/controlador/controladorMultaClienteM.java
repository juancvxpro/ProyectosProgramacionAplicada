/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.ClienteFijo;
import ec.edu.ups.modelo.MultaClienteMomentaneo;
import ec.edu.ups.modelo.TicketClienteMomentaneo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorMultaClienteM extends AbstractControlador<MultaClienteMomentaneo>{

    public controladorMultaClienteM(String ruta) {
        super(ruta);
    }
    
    

    @Override
    public boolean validar(MultaClienteMomentaneo objeto) {
        return false;
        
    }

    @Override
    public int generarId() {
       List<MultaClienteMomentaneo> temp = new ArrayList();
         super.getLista().stream().map(a -> (MultaClienteMomentaneo) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }
       
    }
    
    public double generarMulta(TicketClienteMomentaneo cliente){
        
       double valorMulta=0;
        
       Calendar fechaExpiracion =cliente.getFechaHoraIngreso();
       Calendar fechaActual = new GregorianCalendar();
       int dias=-1;
       
       while(fechaExpiracion.before(fechaActual)|| fechaExpiracion.equals(fechaActual)){
       dias++;
       fechaExpiracion.add(Calendar.DATE,1);
       }
       //si han transcurrido 7 dias ( una semana) de la fecha, se le aumenta un 10% al bono a pagar
       if(dias==7){
     valorMulta= cliente.getTarifa()+(cliente.getTarifa()*0.1);
       }
        return valorMulta;
    
    }
    
    
      public List<MultaClienteMomentaneo> MultasclientesM() {
        
        List<MultaClienteMomentaneo> lista = new ArrayList();
        MultaClienteMomentaneo u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (MultaClienteMomentaneo) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
