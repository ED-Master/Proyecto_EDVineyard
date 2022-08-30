package EDMaster.Proyecto.Entidades;

import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nombre,nit, telefono, direccion;
    private ArrayList<Empleado> empleados;
    private ArrayList<MovimientoDinero> movimientoDineros;

    public Empresa(int id, String nombre, String nit, String telefono, String direccion, ArrayList<Empleado>  empleados, ArrayList<MovimientoDinero> movimientoDineros) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleados = empleados;
        this.movimientoDineros = movimientoDineros;
    }

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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleado>  getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado>  empleados) {
        this.empleados = empleados;
    }

    public ArrayList<MovimientoDinero> getMovimientoDineros() {
        return movimientoDineros;
    }

    public void setMovimientoDineros(ArrayList<MovimientoDinero> movimientoDineros) {
        this.movimientoDineros = movimientoDineros;
    }
}
