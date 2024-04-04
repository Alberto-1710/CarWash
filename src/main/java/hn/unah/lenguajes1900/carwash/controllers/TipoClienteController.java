package hn.unah.lenguajes1900.carwash.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.entities.TipoCliente;
import hn.unah.lenguajes1900.carwash.services.impl.TipoClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/carwash")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/tipocliente/crear")
    public TipoCliente crearTipoCliente(@RequestParam String descripcion) {    
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }
    
    
}
