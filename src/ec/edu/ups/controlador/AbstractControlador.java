/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author user
 * @param <E>
 */
public abstract class AbstractControlador<E> {

    private String ruta;
    private List<E> lista;

    public AbstractControlador(String ruta) {
        lista = new ArrayList();
        this.ruta = ruta;
        //cargarDatos();

    }

    public void cargarDatos() throws ClassNotFoundException, IOException {
        ObjectInputStream datos = null;
        try {
            File f = new File(ruta);
            FileInputStream a = new FileInputStream(f);
            datos = new ObjectInputStream(a);

            lista = (List<E>) datos.readObject();

        } catch (IOException e) {

        }

    }

    public void guardarDatos(String ruta) throws IOException {
        ObjectOutputStream datos = null;
        File f = new File(ruta);
        FileOutputStream archivo = new FileOutputStream(f);
        datos = new ObjectOutputStream(archivo);
        datos.writeObject(lista);

    }

    public boolean crear(E objeto) {

        if (validar(objeto) == true) {
            return lista.add(objeto);
        }
        return false;

    }

    public Optional<E> buscar(E comparar) {
        return lista.stream().filter(objeto -> objeto.equals(comparar)).findFirst();

    }

    public int posicion(E objetoC) {
        for (int i = 0; i < lista.size(); i++) {
            E objetoL = lista.get(i);
            if (objetoL.equals(objetoC)) {
                return i;
            }
        }
        return -1;

    }

    public boolean eliminar(E objeto) {
        Optional<E> buscar = buscar(objeto);
        E objetoE = buscar.get();
        if (objetoE != null) {
            System.out.println("Verdadero");
            return lista.remove(objetoE);

        }
        System.out.println("Falso");
        return false;

    }

    public boolean actualizar(E objetoA) {
        int pos = posicion(objetoA);
        if (pos >= 0) {
            lista.set(pos, objetoA);
            System.out.println("TRUE");
            return true;

        }
        System.out.println("FALSE");
        return false;

    }

    public abstract boolean validar(E objeto);

    public abstract int generarId();

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

}
