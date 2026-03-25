package monedas.api.core.servicios;

import monedas.api.dominio.entidades.Pais;
import java.util.List;

public interface IPaisServicio {

    public List<Pais> listar();

    public Pais obtener(int id);

    public List<Pais> buscar(String nombre);

    public Pais agregar(Pais pais);

    public Pais modificar(Pais pais);

    public boolean eliminar(int id);
}
