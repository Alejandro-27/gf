package Entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MovimientoDinero")

public class MovimientoDinero {

    //ATRIBUTOS
    private double montoDelMovimiento;
    private String conseptoMovimiento;

    //CONSTRUCTOR
    public MovimientoDinero() {
    }

    public MovimientoDinero(double montoDelMovimiento, String conseptoMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
        this.conseptoMovimiento = conseptoMovimiento;
    }

    //GET AND SET

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

    //METODOS
    public void crearMontos(){

    }

    public void usuarioEncargadoRegistrarMovimiento(){

    }
}
