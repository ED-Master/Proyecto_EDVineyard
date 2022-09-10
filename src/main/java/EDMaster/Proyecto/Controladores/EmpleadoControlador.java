package EDMaster.Proyecto.Controladores;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import EDMaster.Proyecto.Entidades.Empleado;
import EDMaster.Proyecto.Servicios.EmpleadoServicio;

@RestController
public class EmpleadoControlador {
    private EmpleadoServicio servicios;


    public EmpleadoControlador(EmpleadoServicio servicios){
        this.servicios = servicios;        
    }

    @GetMapping("/employees")
    public ArrayList<Empleado> listarEmpleados(){
        return this.servicios.listarEmpleados();
    }

    @GetMapping("/employees/{id}")
    public Optional<Empleado> buscarEmpleado(@PathVariable("id") Long id){
        return this.servicios.buscarEmpleado(id);       
    }

    @PostMapping("/employees")
    public String crearEmpleado(@RequestBody Empleado empleado){
        return this.servicios.crearEmpleado(empleado);
    } 

    @PatchMapping("/employees/{id}")
    public Empleado actualizarCampo(@PathVariable("id") Long id, @RequestBody Map<Object, Object> mapeoEmpleado){
        return this.actualizarCampo(id, mapeoEmpleado);        
    }

    @DeleteMapping("/employees/{id}")
    public String eliminarEmpleado(@PathVariable Long id){
        return this.servicios.eliminarEmpleado(id);
    }
}
