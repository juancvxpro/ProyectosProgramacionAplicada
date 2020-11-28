/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Matrimonio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class controladorMatrimonio extends AbstractControlador<Matrimonio> {

    public controladorMatrimonio(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(Matrimonio objeto) {
        if (objeto.getContrayente1().getRol().equals("Contrayente") && objeto.getContreyente2().getRol().equals("Contrayente")) {
            if (objeto.getContrayente1().getEstadoCivil() != "Casado" && objeto.getContreyente2().getEstadoCivil() != "Casado") {
                return true;
            }

        }

        return false;

    }

    @Override
    public int generarId() {
        List<Matrimonio> temp = new ArrayList();
        for (Matrimonio matrimonio : super.getLista()) {
            Matrimonio m = (Matrimonio) matrimonio;
            temp.add(m);

        }

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigoM() + 1;
        } else {
            return 1;
        }

    }

    // RETORNA LISTA DE OBJETOS DE TIPO Matrimonio
    public List<Matrimonio> registros() {

        List<Matrimonio> listaM = new ArrayList();
        Matrimonio matrimonio;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            matrimonio = (Matrimonio) i.next();
            listaM.add(matrimonio);

        }
        return listaM;

    }

}
