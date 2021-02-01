/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;


import ec.edu.ups.modelo.Usuario;



/**
 *
 * @author user
 */
public class controladorUsuario extends AbstractControlador<Usuario> {
    
    private Usuario usuario;
    
  
    
    @Override
    public boolean validar(Usuario objeto) {
        
        return true;
        
    }
    
    
    
    public boolean iniciarSesion(String correo, String pass) {
        
        for (Usuario usu : super.getLista()) {
            Usuario u = (Usuario) usu;
            if (u.getUsername().equals(correo) && u.getPassword().equals(pass)) {
                this.usuario = u;
                return true;
            }
        }
        return false;
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

   
    

}
