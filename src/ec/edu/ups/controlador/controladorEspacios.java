/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;


import java.util.ArrayList;
import ec.edu.ups.modelo.Espacios;
import java.util.List;




/**
 *
 * @author user
 */
public  class controladorEspacios extends AbstractControlador<Espacios> {

   @Override
    public boolean validar(Espacios objeto) {
        return true;
    }


    public boolean AsignarEspacio(int id, String cedula){
       
    
       Espacios e = new Espacios();
       
       e=super.buscar(id);
       
       e.setNombre(cedula);
       
      return super.actualizar(e);
       
  }

    public List<Espacios> espaciosDisponibles() {
        List<Espacios> esp = new ArrayList();
          for(Espacios e : super.buscarTodo()){
          if(e.getNombre()==null){
              esp.add(e);
          }
          }
          
          
        return esp;

    }

   

    

}
