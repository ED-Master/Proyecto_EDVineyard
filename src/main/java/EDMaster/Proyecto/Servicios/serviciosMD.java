package EDMaster.Proyecto.Servicios;


import EDMaster.Proyecto.Entidades.MovimientoDinero;
import EDMaster.Proyecto.Repositorio.MD_Repositorios;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@Service
public class serviciosMD {

 private MD_Repositorios repositorio;

    public serviciosMD(MD_Repositorios repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<MovimientoDinero> ListaMovimiento(){
        return (ArrayList<MovimientoDinero>) this.repositorio.findAll();

    }



    public Optional<MovimientoDinero> BuscarP(int index) {
        return repositorio.findById(index);
    }

    public String crearMD(MovimientoDinero x) {
        if (repositorio.findById(x.getId()).isEmpty()){
            repositorio.save(x);
            return"Se crea el movimiento exitosamente";

        }
        else{
            return"No se creo el movimiento";
        }
    }

    public String eliminarMovimiento(int index) {
        if (repositorio.findById(index).isPresent()){
            repositorio.deleteById(index);
            return"Se elimina el movimiento exitosamente";

        }
        else{
            return"No se elimino el movimiento";
        }

    }

    public MovimientoDinero actualizarMovimientos(int index, Map<Object,Object> p) {
        MovimientoDinero mov = repositorio.findById(index).get();
        p.forEach((key,value)->{
            Field campo= ReflectionUtils.findField(MovimientoDinero.class,(String)key);
            campo.setAccessible(true);
            ReflectionUtils.setField(campo,mov,value);
        });
        return repositorio.save(mov);


    }
}