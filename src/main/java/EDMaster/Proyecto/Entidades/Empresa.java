package EDMaster.Proyecto.Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Empresa")
public class Empresa {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nombre, nit, telefono, direccion;
    
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<Empleado> empleados;

    //@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private ArrayList<MovimientoDinero> movimientoDineros;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @PrePersist
    public void fechaActual(){
        this.fecha = new Date();
    }


    //Constructores
    public Empresa(long id, String nombre, String nit, String telefono, String direccion, List<Empleado>  empleados, ArrayList<MovimientoDinero> movimientoDineros) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleados = empleados;
        this.movimientoDineros = movimientoDineros;
    }

    public Empresa(){
    }

    //Getters y setters
    public long getId() {
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

    public List<Empleado>  getEmpleados() {
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
