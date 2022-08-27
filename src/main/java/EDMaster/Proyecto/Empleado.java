package EDMaster.Proyecto;

import java.util.Arrays;

public class Empleado {
    private String  email, rol;
    private int id;
    private Perfil perfil;
    private MovimientoDinero[] movimientoDineros;
    private Empresa empresa;


    public Empleado(int id, String email, Perfil perfil, String rol,Empresa empresa) {
        this.id = id;
        this.email = email;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
    }


    public int getId() {
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
    public MovimientoDinero[] getMovimientoDineros() {
        return movimientoDineros;
    }
    public void setMovimientoDineros(MovimientoDinero[] movimientoDineros) {
        if(this.rol.equalsIgnoreCase("administrador")){
            this.movimientoDineros = movimientoDineros;
        }else{
            System.out.println("Usted no es administrador, no tienes permiso.");
        }
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
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
        return "Empleado [email=" + email + ", id=" + id + ", movimientoDineros=" + Arrays.toString(movimientoDineros)
                + ", " + perfil.toString() + ", rol=" + rol + "]";
    }

    
    
}
