package EDMaster.Proyecto.Servicios;

import EDMaster.Proyecto.Empleado;
import EDMaster.Proyecto.MovimientoDinero;
import EDMaster.Proyecto.Perfil;

import java.util.ArrayList;
import java.util.Map;

public class serviciosMD {

    ArrayList<MovimientoDinero> lista = new ArrayList<MovimientoDinero>();

    public serviciosMD() {
        this.datosMD();
    }

    public ArrayList<MovimientoDinero> getLista() {
        return lista;
    }

    public void datosMD() {

        lista.add(new MovimientoDinero(123245, "Venta de pro", 1000000, new Empleado(10287362, "carlos@yahoo.com", new Perfil("Carlos Sepulveda", "url/tal", "3116543261"), "Administrador")));
        lista.add(new MovimientoDinero(5677435, "Ventas", 2334356, new Empleado(656656467, "andrea.solan@yahoo.com", new Perfil("Andrea solan", "url/tal", "3434345566"), "Operador")));
        lista.add(new MovimientoDinero(343434, "Compra ", 1232400, new Empleado(34344444, "edu.s@yahoo.com", new Perfil("Eduardo Barrios", "url/tal", "44343434421"), "Operador")));
    }

    public MovimientoDinero BuscarP(int index) {
        return lista.get(index);
    }

    public String crearMD(MovimientoDinero x) {
        lista.add(x);
        return "Movimiento Registrado";
    }

    public String eliminarMovimiento(int index) {
        lista.remove(index);
        return "Movimiento Eliminado";
    }

    public MovimientoDinero actualizarMovimientos(long index, Map<Object,Object> p) {
        lista.set(index, p);
        return "Producto modificado";

    }
}