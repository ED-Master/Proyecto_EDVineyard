package EDMaster.Proyecto.Entidades;

import java.util.ArrayList;
//import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import EDMaster.Proyecto.Enums.EnumTipo;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column(unique = true, nullable =  false)
    private String  email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EnumTipo rol;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nombre")
    private Perfil perfil;

    //@OneToMany
    private ArrayList<MovimientoDinero> movimientoDineros;
    
    @ManyToOne
    @JoinColumn(name = "empresaId")
    private Empresa empresa;


    public Empleado(long id, String email, Perfil perfil, EnumTipo rol,Empresa empresa) {
        this.id = id;
        this.email = email;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
    }
    public Empleado(){

    }

    public long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public ArrayList<MovimientoDinero> getMovimientoDineros() {
        return movimientoDineros;
    }
    public void setMovimientoDineros(ArrayList<MovimientoDinero> movimientoDineros) {
        if(this.rol.equals("Administrador")){
            this.movimientoDineros = movimientoDineros;
        }else{
            System.out.println("Usted no es administrador, no tienes permiso.");
        }
    }
    public EnumTipo getRol() {
        return rol;
    }
    public void setRol(EnumTipo rol) {
        this.rol = rol;
    }

    


    public Empresa getEmpresa() {
        return empresa;
    }


    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public void CambiarNombre(String cambiarNombre) {
        this.perfil.setId(cambiarNombre);
    }


    @Override
    public String toString() {
        return "Empleado [email=" + email + ", id=" + id + ", movimientoDineros=" + ", " + perfil.toString() + ", rol=" + rol + "]";
    }

    
    
}
