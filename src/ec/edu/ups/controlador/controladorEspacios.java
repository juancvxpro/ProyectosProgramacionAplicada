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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public  class controladorEspacios {

    Map<Integer, String> espacios;

    public controladorEspacios() {
        this.espacios = new HashMap<>();
        
    }

    public void cargarEspaciosDefault() {
        for (int i = 1; i <= 50; i++) {
                espacios.put(i, "");
                
            }
        try {
          
            guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(controladorEspacios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarDatos() throws ClassNotFoundException, IOException {
        ObjectInputStream datos = null;
        try {
            File f = new File("datos/espacios.obj");
            FileInputStream a = new FileInputStream(f);
            datos = new ObjectInputStream(a);

            espacios = (Map<Integer, String>) datos.readObject();

        } catch (IOException e) {

        }

    }

    public void guardarDatos() throws IOException {
        ObjectOutputStream datos = null;
        File f = new File("datos/espacios.obj");
        FileOutputStream archivo = new FileOutputStream(f);
        datos = new ObjectOutputStream(archivo);
        datos.writeObject(espacios);

    }

    public boolean AsignarEspacio(int id, String cedula) {

        return espacios.put(id, cedula) != null;

    }

    public List<String> espaciosDisponibles() {
        List<String> esp = new ArrayList<>();
        espacios.entrySet().stream().filter(entry -> (entry.getValue().equals(""))).forEachOrdered(entry -> {
            esp.add(entry.getKey().toString());
        });
        return esp;

    }

    public String buscarEspacioAsignado(String cedula) {
        for (Map.Entry<Integer, String> entry : espacios.entrySet()) {

            if (entry.getValue().equals(cedula)) {
                return entry.getKey().toString();
            }

        }
        return null;
    }

}
