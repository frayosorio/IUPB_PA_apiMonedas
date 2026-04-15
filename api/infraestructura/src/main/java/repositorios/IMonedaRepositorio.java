package monedas.api.infraestructura.repositorios;

import java.util.List;

import monedas.api.dominio.entidades.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonedaRepositorio extends JpaRepository<Moneda, Integer> {

    @Query("SELECT m FROM Moneda m  WHERE m.nombre LIKE '%' || ?1 || '%'")
    List<Moneda> buscar(String nombre);
}

