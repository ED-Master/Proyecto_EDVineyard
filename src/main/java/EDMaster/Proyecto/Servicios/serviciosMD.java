package EDMaster.Proyecto.Servicios;


import EDMaster.Proyecto.Entidades.Empleado;
import EDMaster.Proyecto.Entidades.MovimientoDinero;
import EDMaster.Proyecto.Entidades.Perfil;
import EDMaster.Proyecto.Repositorio.MD_Repositorios;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class serviciosMD {

 private MD_Repositorios repositorio;

    public serviciosMD(MD_Repositorios repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<MovimientoDinero> ListaMovimiento(){
        return (ArrayList<MovimientoDinero>) this.repositorio.findAll();

    }



    public MovimientoDinero BuscarP(int index) {
        return repositorio.get(index);
    }

    public String crearMD(MovimientoDinero x) {
        repositorio.add(x);
        return "Movimiento Registrado";
    }

    public String eliminarMovimiento(int index) {
        repositorio.remove(index);
        return "Movimiento Eliminado";
    }

    public MovimientoDinero actualizarMovimientos(long index, Map<Object,Object> p) {
        lista.set(index, p);
        return "Producto modificado";

    }
}