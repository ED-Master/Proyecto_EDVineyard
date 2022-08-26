package EDMaster.Proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class EdVineyardApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EdVineyardApplication.class, args);

		MovimientoDinero M1=new MovimientoDinero(100000,"Compra de insumos",-200000);
		System.out.println(M1.getMonto());
		M1.setMonto(-250000);

        MovimientoDinero Venta=new MovimientoDinero(123245,"Venta de pro",1000000);
        Venta.setConcepto("Venta despues de Iva");
		Venta.setMonto((float) (Venta.getMonto()*0.81));
		System.out.println(Venta.getMonto());

		Perfil perf1 = new Perfil("Carlos Sepulveda", "url/tal", "3116543261");
		Empleado emp1 = new Empleado(10287362, "carlos@yahoo.com", perf1, "Administrador");
		System.out.println(emp1.getPerfil().getId());
		emp1.CambiarNombre("Camilo Sepulveda");
		System.out.println(emp1.getEmail());
		emp1.setEmail("camiloSvda@gmail.com");
		System.out.println(emp1.getRol());
		emp1.setRol("Operario");
		System.out.println(emp1.toString());
	}
}
