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
public class Usuario extends Persona {
    
    private int codigo;
    private String rol;
    private String correo;
    private String pass;
    
    
    public Usuario(String cedula, String nombre, String apellido, String direccion, String telefono, String rol, String correo, String pass) {
        super(cedula, nombre, apellido, direccion, telefono);
        this.rol=rol;
        this.correo=correo;
        this.pass=pass;
    }

   

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{codigo=").append(codigo);
        sb.append(", rol=").append(rol);
        sb.append(", correo=").append(correo);
        sb.append(", pass=").append(pass);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
