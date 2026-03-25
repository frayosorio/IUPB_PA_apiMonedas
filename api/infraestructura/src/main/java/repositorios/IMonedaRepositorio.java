package monedas.api.infraestructura.repositorios;

import monedas.api.dominio.entidades.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonedaRepositorio extends JpaRepository<Moneda, Integer> {

}

