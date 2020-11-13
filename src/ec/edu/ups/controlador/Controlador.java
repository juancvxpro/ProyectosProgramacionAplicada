
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
        
import java.util.Iterator;
import java.util.List;

public  class Controlador <E> {

 
    private List<E> listado;

    public Controlador() {
        listado= new ArrayList();
    }

 
   

    public boolean crear (E obj){
        
        return listado.add(obj); 
    }
     
    public E buscar (E ob){

        return this.listado.stream().filter(obj -> ob.equals(obj)).findFirst().get() ;

    }
    public Telefono buscarTelf (int id){
       List <Telefono> listaT = (List <Telefono>)  List.copyOf(listado);
        
        return (Telefono) listaT.stream().filter(Telefono -> Telefono.getCodigo()==id).findFirst().get();
    
    
    }
    public Telefono buscarTelfUsu (String  cedula){
        List <Telefono> listaT = (List <Telefono>)  List.copyOf(listado);
        
        return (Telefono) listaT.stream().filter(Telefono -> Telefono.getUsuario().getCedula().equals(cedula)).findFirst().get();
    
    }
   
    public Usuario buscarUsuarios (String cedula){
        
         List <Usuario> listaU = (List <Usuario>)  List.copyOf(listado);
        return (Usuario) listaU.stream().filter(Usuario -> Usuario.getCedula().equals(cedula)).findFirst().get();
    
    }
    public boolean eliminar(E obj) {
       return listado.remove(obj);
    } 
    
   public void actualizar(E obj, E obj2) {

        int posicion = (listado.indexOf(obj2));
        listado.remove(posicion);
        
       listado.add(posicion, obj);
      

    }
   
public Usuario iniciarSesion(String correo, String pass){
    List <Usuario> listaU = (List <Usuario>)  List.copyOf(listado);
        return (Usuario) listaU.stream().filter(Usuario -> Usuario.getCorreo().equals(correo)&&Usuario.getContrasena().equals(pass)).findFirst().get();
       

}
  public List<E> findAll() {
        return listado;
    }
   public List<Telefono> telefonos (){
      List <Telefono> listaT= new ArrayList();
       Telefono telefono;
       Iterator i  = listado.iterator();
        while(i.hasNext()){
   telefono = (Telefono)i.next(); 
  listaT.add(telefono);
 
}
        return listaT;
   
   }
   public List<Usuario> usuarios(){
       List <Usuario> listaU= new ArrayList();
       Usuario usuario;
       Iterator i  = listado.iterator();
        while(i.hasNext()){
  usuario = (Usuario)i.next(); 
  listaU.add(usuario);
 
}
        return listaU;
   
   }
     public int generarId() {
        if(this.listado.size()>0){
            
            return (int) listado.size()-1;
        }
            
        return 1;
    }
    public List<E> getListado() {
        return listado;
    }

    public void setListado(List<E> listado) {
        this.listado = listado;
    }
  
}



