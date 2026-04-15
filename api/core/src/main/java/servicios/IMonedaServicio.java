package monedas.api.core.servicios;

import monedas.api.dominio.entidades.Moneda;
import monedas.api.dominio.entidades.Cambio;
import java.util.List;
import java.time.LocalDate;

public interface IMonedaServicio {

    public List<Moneda> listar();

    public Moneda obtener(int id);

    public List<Moneda> buscar(String nombre);

    public Moneda buscarPorPais(String nombre);

    public Moneda agregar(Moneda moneda);

    public Moneda modificar(Moneda moneda);

    public boolean eliminar(int id);
	
	public List<Cambio> listarPorPeriodo(int idMoneda, LocalDate fecha1, LocalDate fecha2);
}
