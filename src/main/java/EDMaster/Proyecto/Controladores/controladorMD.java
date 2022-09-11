package EDMaster.Proyecto.Controladores;


import EDMaster.Proyecto.Entidades.MovimientoDinero;
import EDMaster.Proyecto.Servicios.serviciosMD;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class controladorMD {


   private serviciosMD servicio;

    public controladorMD(serviciosMD servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/enterprises/movements")
    public ArrayList<MovimientoDinero> ListaMD(){
    return this.servicio.ListaMovimiento();

}
@GetMapping("/enterprises/{id}/movements")
    public MovimientoDinero ConsultarMD(@PathVariable("id") Integer index){
    return this.servicio.BuscarP(index);
}
@PostMapping("/enterprises/movements")
    public String crearMD(@RequestBody MovimientoDinero x){
        return  this.servicio.crearMD(x);
}
@DeleteMapping("/enterprises/{id}/movements")
    public  String eliminarMovimiento(@PathVariable("id") Integer index){
      return this.servicio.eliminarMovimiento(index);
}
@PatchMapping("/enterprises/{id}/movements")
    public MovimientoDinero actualizarMovimientos(@PathVariable("id")long id, @RequestBody Map<Object,Object> p){
      return  this.actualizarMovimientos(id,p);
}

}
