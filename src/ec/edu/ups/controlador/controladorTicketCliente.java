/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.ClienteFijo;
import ec.edu.ups.modelo.Tarifa;
import ec.edu.ups.modelo.TicketClienteMomentaneo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
           Tarifa tarifa1=null;
        for (Tarifa tarifa : controladorTarifa.tarifas()) {
                tarifa1=tarifa;
            }
        
        double total=0;
        int fraccion;
       
        // Valores de las tarifas
        double mediaHoraT;
    
        
        //Asignamos las tarifas segun el tipo de vehiculo del cliente Momentaneo
        if (ticket.getTipoVehiculo().equalsIgnoreCase("Motocicleta")) {
          mediaHoraT=tarifa1.getMediaHoraM();
        }else if(ticket.getTipoVehiculo().equalsIgnoreCase("Automovil")){
        mediaHoraT=tarifa1.getMediaHoraA();
        
        
        }else {
            // Tarifa para vehivulos pesados
        mediaHoraT=tarifa1.getMediaHoraP();
      
        
        }
        //obtenenemos horas y minutos
       
     
        double minutos =  ( ticket.getFechaHoraSalida().getTimeInMillis()-ticket.getFechaHoraIngreso().getTimeInMillis()) / 60000;
        fraccion = (int) (minutos / 60);
        if(fraccion<1){
        total=mediaHoraT;
        fraccion=1;
        }else{
        total = (minutos*mediaHoraT)/30;
        }

        return total;
    }
    public int calcularIntervaloTiempo(TicketClienteMomentaneo ticket){
      
        int fraccion;
  
     
        double minutos =  ( ticket.getFechaHoraSalida().getTimeInMillis()-ticket.getFechaHoraIngreso().getTimeInMillis()) / 60000;
        fraccion = (int) (minutos / 60);
       
        return fraccion;
    
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
     public double generarMulta(TicketClienteMomentaneo cliente){
        
       double valorMulta=0;
        
       Calendar fechaExpiracion =cliente.getFechaHoraSalida();
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
}
