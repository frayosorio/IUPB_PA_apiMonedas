package monedas.api.presentacion.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import monedas.api.core.servicios.*;
import monedas.api.dominio.entidades.*;

@RestController
@RequestMapping("/api/monedas")
public class MonedaControlador {

    @Autowired
    private IMonedaServicio servicio;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Moneda> listar() {
        return servicio.listar();
    }

    @GetMapping(value = "/obtener/{id}")
    public Moneda obtener(@PathVariable int id){
        return servicio.obtener(id);
    }

    @PostMapping(value = "/")
    public Moneda agregar(@RequestBody Moneda moneda){
        return servicio.agregar(moneda);
    }

    @PutMapping(value = "/")
    public Moneda modificar(@RequestBody Moneda moneda){
        return servicio.modificar(moneda);
    }

    @DeleteMapping(value = "/{id}")
    public boolean eliminar(@PathVariable int id){
        return servicio.eliminar(id);
    }

}
