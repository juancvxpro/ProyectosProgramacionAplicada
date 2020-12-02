/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Docente;
import ec.edu.ups.modelo.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorUsuario extends AbstractControlador<Usuario> {
    
    private Usuario usuario;
    
    public controladorUsuario(String ruta) {
        super(ruta);
        
    }
    
    @Override
    public boolean validar(Usuario objeto) {
        
        return true;
        
    }
    
    @Override
    public int generarId() {
        return 0;
        
    }
    
    public List<Usuario> usuarios() {
        
        List<Usuario> lista = new ArrayList();
        Usuario u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (Usuario) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public boolean iniciarSesion(String correo, String pass) {
        
        for (Usuario usu : super.getLista()) {
            Usuario u = (Usuario) usu;
            if (u.getCorreo().equals(correo) && u.getPass().equals(pass)) {
                this.usuario = u;
                return true;
            }
        }
        return false;
        
    }
    
    public Usuario buscarU(Docente docente) {
        
        for (Usuario usu : super.getLista()) {
            Usuario u = (Usuario) usu;
            if (docente.equals(u.getDocente())) {
                this.usuario = u;
                
            }
        }
        return null;
        
    }
}
