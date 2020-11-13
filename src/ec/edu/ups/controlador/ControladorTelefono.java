/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author user
 */
public class ControladorTelefono extends AbstractControlador<Telefono> {

    @Override
    public boolean validar(Telefono objeto) {
        return true;
    }

    @Override
    public int generarId() {
        List<Telefono> temp = new ArrayList();
        for (Telefono telefono : super.getLista()) {
            Telefono t = (Telefono) telefono;
            temp.add(t);

        }

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }

    }

    public List<Telefono> listaTlfsUsers(Usuario usuario) {
        List<Telefono> temp = new ArrayList();
        for (Telefono telefono : super.getLista()) {
            Telefono t = (Telefono) telefono;
            if (t.getUsuario().getCedula().equals(usuario.getCedula())) {
                temp.add(t);
            }

        }

        return temp;

    }

    public Iterable<Telefono> listaTlfsUsers(Optional<Usuario> usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
