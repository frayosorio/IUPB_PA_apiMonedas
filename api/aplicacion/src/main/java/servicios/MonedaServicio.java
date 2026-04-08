package monedas.api.aplicacion.servicios;

import java.util.Optional;
import java.util.List;
import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import monedas.api.core.servicios.*;
import monedas.api.dominio.entidades.*;
import monedas.api.infraestructura.repositorios.*;

@Service
public class MonedaServicio implements IMonedaServicio {

    @Autowired
    private IMonedaRepositorio repositorio;

    public List<Moneda> listar() {
        return repositorio.findAll();
    }

    public Moneda obtener(int id) {
        var moneda = repositorio.findById(id);
        return moneda.isEmpty() ? null : moneda.get();
    }

    public List<Moneda> buscar(String nombre) {
        return null;
    }

    public Moneda buscarPorPais(String nombre) {
        return null;
    }

    public Moneda agregar(Moneda moneda) {
        moneda.setId(0);
        return repositorio.save(moneda);
    }

    public Moneda modificar(Moneda moneda) {
        var monedaEncontrada = repositorio.findById(moneda.getId());
        return monedaEncontrada.isEmpty() ? null : repositorio.save(moneda);
    }

    public boolean eliminar(Long id) {
        return false;
    }

    public List<Cambio> listarPorPeriodo(int idMoneda, LocalDate fecha1, LocalDate fecha2) {
        return null;
    }

}
