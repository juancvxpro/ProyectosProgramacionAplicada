/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.TicketClienteMomentaneo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorTicketCliente extends AbstractControlador<TicketClienteMomentaneo> {

    private final controladorTarifa controladorTarifa;

    public controladorTicketCliente(String ruta, controladorTarifa controladorTarifa) {
        super(ruta);

        this.controladorTarifa = controladorTarifa;
    }

    @Override
    public boolean validar(TicketClienteMomentaneo objeto) {
        return true;

    }

    @Override
    public int generarId() {
         List<TicketClienteMomentaneo> temp = new ArrayList();
         super.getLista().stream().map(a -> (TicketClienteMomentaneo) a).forEachOrdered(m -> {
             temp.add(m);
        });

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getId() + 1;
        } else {
            return 1;
        }

    }

    public Double calcularTotal(TicketClienteMomentaneo ticket) {
        
        double total=0;
        int fraccion;
       
        // Valores de las tarifas
        double mediaHoraT;
    
        
        //Asignamos las tarifas segun el tipo de vehiculo del cliente Momentaneo
        if (ticket.getTipoVehiculo().equalsIgnoreCase("Motocicleta")) {
          mediaHoraT=controladorTarifa.getTarifa().getMediaHoraM();
        }else if(ticket.getTipoVehiculo().equalsIgnoreCase("Automovil")){
        mediaHoraT=controladorTarifa.getTarifa().getMediaHoraA();
        
        
        }else {
            // Tarifa para vehivulos pesados
        mediaHoraT=controladorTarifa.getTarifa().getMediaHoraP();
      
        
        }
        //obtenenemos horas y minutos
       
     
        double minutos =  ( ticket.getFechaHoraIngreso().getTimeInMillis()-ticket.getFechaHoraSalida().getTimeInMillis() / 60000);
        fraccion = (int) (minutos / 10);
        if(fraccion<1){
        total=mediaHoraT;
        fraccion=1;
        }else{
        total = (fraccion * mediaHoraT)/30;
        }

        return total;
    }
    
    public List<TicketClienteMomentaneo> clientesM() {
        
        List<TicketClienteMomentaneo> lista = new ArrayList();
        TicketClienteMomentaneo u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (TicketClienteMomentaneo) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
}
