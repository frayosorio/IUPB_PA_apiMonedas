package monedas.api.infraestructura.repositorios;

import monedas.api.dominio.entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepositorio extends JpaRepository<Pais, Integer> {

}

