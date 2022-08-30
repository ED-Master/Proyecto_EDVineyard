package EDMaster.Proyecto.Entidades;

public class MovimientoDinero {

private int id;
private  String concepto;
private  float monto;
private Empleado empleado;
private Empresa empresa; // Eliminar atributo

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public MovimientoDinero(int id, String concepto, float monto,Empleado empleado) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado =empleado;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getId() {
        return id;
    }
    
}
