package Entidades;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Empleado")

public class Empleado {

//ATRIBUTOS
    private String nombre;
    private String correo;
    private String empresaPerteneciente;
    private String rol;


    //CONSTRUCTOR
    public Empleado() {
    }

    public Empleado(String nombre, String correo, String empresaPerteneciente, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.rol = rol;
    }


    //GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(String empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
