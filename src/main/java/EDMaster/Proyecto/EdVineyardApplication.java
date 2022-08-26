package EDMaster.Proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdVineyardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdVineyardApplication.class, args);

		MovimientoDinero M1=new MovimientoDinero(100000,"Compra de insumos",-200000);
		System.out.println(M1.getMonto());
		M1.setMonto(-250000);

        MovimientoDinero Venta=new MovimientoDinero(123245,"Venta de pro",1000000);
          Venta.setConcepto("Venta despues de Iva");
		  Venta.setMonto((float) (Venta.getMonto()*0.81));
		System.out.println(Venta.getMonto());
	}





}
