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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class controladorEspacios {

    Map<Integer, String> espacios;

    public controladorEspacios() {
        this.espacios = new HashMap<>();
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
    
    public boolean AsignarEspacio(int id, String cedula){
        
        if ( espacios.put(id, cedula)!=null){
         return true;
        }
        return false;
    
    }
}
