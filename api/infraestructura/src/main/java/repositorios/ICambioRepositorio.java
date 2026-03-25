package monedas.api.infraestructura.repositorios;

import monedas.api.dominio.entidades.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICambioRepositorio extends JpaRepository<Cambio, Integer>{

}
