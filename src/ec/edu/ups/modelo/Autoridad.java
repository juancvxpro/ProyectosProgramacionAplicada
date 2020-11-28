/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author user
 */
public class Autoridad extends Persona {

    private String cargo;

    private String correo;

    private String pass;

    public Autoridad(String cedula, String nombre, String apellido, String direccion, String genero, 
            Date fechaNacimiento, String estadoCivil, String rol, String cargo, String correo, String pass) {
        super(cedula, nombre, apellido, direccion, genero, fechaNacimiento, estadoCivil, rol);
        this.cargo = cargo;
        this.correo = correo;
        this.pass = pass;
    }

    public Autoridad() {

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Autoridad{" + super.getNombres() + " " + super.getApellidos() + " " + super.getCedula() + " " + super.getDireccion() + " " + super.getGenero() + " " + super.getRol() + "cargo=" + cargo + ", correo=" + correo + ", pass=" + pass + '}';
    }

}
