package EDMaster.Proyecto.Servicios;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import EDMaster.Proyecto.Repositorio.EmpleadoRepositorio;
import EDMaster.Proyecto.Entidades.Empleado;


@Service
public class EmpleadoServicio {

    private EmpleadoRepositorio repositorio;

    public EmpleadoServicio (EmpleadoRepositorio repositorio) {
        this.repositorio = repositorio;    
    }

    public ArrayList<Empleado> listarEmpleados(){
        return (ArrayList<Empleado>) this.repositorio.findAll();
    }

    public Optional<Empleado> buscarEmpleado(long id){
        return this.repositorio.findById(id);
    }

    public String crearEmpleado(Empleado empleado){
        if (empleado.getId() == null || !this.repositorio.existsById(empleado.getId())){
            this.repositorio.save(empleado);
            return "Se crea el empleado exitosamente";             
        }else{
            return "Ya existe un empleado con ese Id";    
        }
    }
    

    public Empleado actualizarCampo(long id, Map<Object, Object> empleadoMapeo){
        Empleado empleado = this.repositorio.findById(id).get();

        empleadoMapeo.forEach((key,value)->{
            Field campo = ReflectionUtils.findField(Empleado.class, (String) key);
            campo.setAccessible(true);
            ReflectionUtils.setField(campo, empleado, value);            
        });
        return this.repositorio.save(empleado);
    }

    public String eliminarEmpleado(long id){
        if (this.repositorio.findById(id).isPresent()){
            this.repositorio.deleteById(id);
            return "Se eliminó exitosamente el empleado";
        }else{
            return "No existe un empleado con tal Id para ser eliminado";
        }
    }

}

