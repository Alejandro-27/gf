package Entidades;

import javax.persistence.*;

@Entity
@Table(name = "MovimientoDinero")

public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Movimiento_dinero")

    //ATRIBUTOS
    private int id;
    @Column(name = "Monto_del_movimiento")
    private double montoDelMovimiento;
    @Column(name = "consepto_movimiento")
    private String conseptoMovimiento;
    @ManyToOne
    @JoinColumn ( name = " empleado_id " )
    private Empleado usuario;

    //CONSTRUCTOR
    public MovimientoDinero() {
    }

    public MovimientoDinero(double montoDelMovimiento, String conseptoMovimiento, Empleado usuario) {
        this.montoDelMovimiento = montoDelMovimiento;
        this.conseptoMovimiento = conseptoMovimiento;
        this.usuario = usuario;
    }

    //GET AND SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontoDelMovimiento() {
        return montoDelMovimiento;
    }

    public void setMontoDelMovimiento(double montoDelMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
    }

    public String getConseptoMovimiento() {
        return conseptoMovimiento;
    }

    public void setConseptoMovimiento(String conseptoMovimiento) {
        this.conseptoMovimiento = conseptoMovimiento;
    }
    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }


    //METODOS
    public void crearMontos() {

    }

    public void usuarioEncargadoRegistrarMovimiento() {

    }


}
