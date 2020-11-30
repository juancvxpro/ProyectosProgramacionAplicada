/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Actividad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorActividad extends AbstractControlador<Actividad> {

    public controladorActividad(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(Actividad objeto) {
        return true;

    }

    @Override
    public int generarId() {
        List<Actividad> temp = new ArrayList();
        for (Actividad a : super.getLista()) {
            Actividad m = (Actividad) a;
            temp.add(m);

        }

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }

    }

    public List<Actividad> actividades() {

        List<Actividad> lista = new ArrayList();
        Actividad actividad;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            actividad = (Actividad) i.next();
            lista.add(actividad);

        }
        return lista;

    }

}
