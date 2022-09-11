package EDMaster.Proyecto.Servicios;


import EDMaster.Proyecto.Entidades.Empresa;
import EDMaster.Proyecto.Entidades.MovimientoDinero;
import EDMaster.Proyecto.Repositorio.MovimientosRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;


@Service
public class serviciosMD {

    private EmpresaServicios empresaServicios;
    private MovimientosRepositorio repositorio;

    public serviciosMD(MovimientosRepositorio repositorio, EmpresaServicios empresaServicios) {
        this.repositorio = repositorio;
        this.empresaServicios = empresaServicios;
    }

    public Set<MovimientoDinero> ListaMovimiento(Long id){
        Empresa emp = this.empresaServicios.buscarEmpresa(id).get();
        return emp.getMovimientoDineros();
    }


    public MovimientoDinero BuscarP(Long id, int index) {
        Empresa emp = this.empresaServicios.buscarEmpresa(id).get();
        MovimientoDinero mov = null;
        for(MovimientoDinero p: emp.getMovimientoDineros()){
            if (p.getId() == index){
                mov = new MovimientoDinero(p.getId(), p.getConcepto(), p.getMonto(), p.getEmpleado());
                break;
            }
        }
        
        return mov;
    }

    public String crearMD(MovimientoDinero x, Long id) {
        Empresa emp = this.empresaServicios.buscarEmpresa(id).get();
        MovimientoDinero mov = null;
        for(MovimientoDinero p: emp.getMovimientoDineros()){
            if (p.getId() == x.getId()){
                mov = new MovimientoDinero(p.getId(), p.getConcepto(), p.getMonto(), p.getEmpleado());
                break;
            }
        }

        if (mov == null){
            emp.getMovimientoDineros().add(x);
            return"Se crea el movimiento exitosamente";

        }
        else{
            return"No se creo el movimiento";
        }
    }

    public String eliminarMovimiento(int index, Long id) {
        Empresa emp = this.empresaServicios.buscarEmpresa(id).get();
        MovimientoDinero mov = null;
        for(MovimientoDinero p: emp.getMovimientoDineros()){
            if (p.getId() == index){
                mov = new MovimientoDinero(p.getId(), p.getConcepto(), p.getMonto(), p.getEmpleado());
                
            }
        }

        if (mov != null){
            emp.getMovimientoDineros().remove(mov);
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