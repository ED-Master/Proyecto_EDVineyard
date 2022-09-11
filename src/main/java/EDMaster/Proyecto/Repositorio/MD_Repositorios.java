package EDMaster.Proyecto.Repositorio;

import EDMaster.Proyecto.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MD_Repositorios extends JpaRepository<MovimientoDinero,Integer> {

}
