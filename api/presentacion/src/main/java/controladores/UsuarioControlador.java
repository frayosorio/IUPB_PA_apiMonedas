package monedas.api.presentacion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import monedas.api.core.servicios.*;
import monedas.api.dominio.entidades.*;
import monedas.api.dominio.dtos.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    @Autowired
    private IUsuarioServicio servicio;

    @GetMapping(value = "/login/{nombreUsuario}/{clave}")
    public UsuarioLoginDto login(@PathVariable String nombreUsuario, @PathVariable String clave) {
        return servicio.login(nombreUsuario, clave);
    }

}
