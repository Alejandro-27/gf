package Entidades;


import javax.persistence.*;

@Entity
@Table(name = "Empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Empleado_id")

//ATRIBUTOS
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "empresa_perteneciente")
    private Empresa empresaPerteneciente;
    @Column(name = "rol")
    private String rol;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Empresa.class)
    @JoinColumn(name = "Empresa_id")
    private Empresa empresa;

    //CONSTRUCTOR

    public Empleado() {
    }

    public Empleado(int id, String nombre, String correo, Empresa empresaPerteneciente, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.rol = rol;
    }

    //SET AND GET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Empresa getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(Empresa empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
