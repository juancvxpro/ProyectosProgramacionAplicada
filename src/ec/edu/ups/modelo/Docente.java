/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author user
 */
public class Docente extends Persona {

    private String titulo;

    private String tipTitulo;

    private Curso curso;

    private Usuario usuario;

    public Docente(String cedula, String nombre, String apellido, int edad, String direccion) {
        super(cedula, nombre, apellido, edad, direccion);
    }

    public Docente(String cedula, String nombre, String apellido, int edad, String direccion, String titulo, String tipTitulo) {
        super(cedula, nombre, apellido, edad, direccion);
        this.titulo = titulo;
        this.tipTitulo = tipTitulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipTitulo() {
        return tipTitulo;
    }

    public void setTipTitulo(String tipTitulo) {
        this.tipTitulo = tipTitulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Docente{titulo=").append(titulo);
        sb.append(", tipTitulo=").append(tipTitulo);
        sb.append(", curso=").append(curso);
        sb.append('}');
        return sb.toString();
    }

}
