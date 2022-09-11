package EDMaster.Proyecto.Entidades;

import java.util.Set;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
    private Set<MovimientoDinero> movimientoDineros;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "empresaId", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Empresa empresa;


    public Empleado(long id, String email, Perfil perfil, String rol,Empresa empresa) {
        this.id = id;
        this.email = email;
        this.perfil = perfil;
        if(rol == "Administrador"){
            this.rol = EnumTipo.Administrador;
        }else{
            this.rol = EnumTipo.Operario;
        }
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
    public Set<MovimientoDinero> getMovimientoDineros() {
        return movimientoDineros;
    }
    public void setMovimientoDineros(Set<MovimientoDinero> movimientoDineros) {
        if(this.rol.equals("Administrador")){
            this.movimientoDineros = movimientoDineros;
        }else{
            System.out.println("Usted no es administrador, no tienes permiso.");
        }
    }
    public EnumTipo getRol() {
        return rol;
    }
    public void setRol(String rol) {
        if(rol == "Administrador"){
            this.rol = EnumTipo.Administrador;
        }else{
            this.rol = EnumTipo.Operario;
        }
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
