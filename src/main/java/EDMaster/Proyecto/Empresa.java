package EDMaster.Proyecto;

public class Empresa {
    private int id;
    private String nombre,nit, telefono, direccion;
    private Empleado[] empleados;
    private MovimientoDinero[] movimientoDineros;

    public Empresa(int id, String nombre, String nit, String telefono, String direccion, Empleado[] empleados, MovimientoDinero[] movimientoDineros) {
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

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public MovimientoDinero[] getMovimientoDineros() {
        return movimientoDineros;
    }

    public void setMovimientoDineros(MovimientoDinero[] movimientoDineros) {
        this.movimientoDineros = movimientoDineros;
    }
}
