package hn.unah.lenguajes1900.carwash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.entities.Cliente;
import hn.unah.lenguajes1900.carwash.services.impl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/carwash")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return this.clienteServiceImpl.crearCliente(cliente); 
    }

    @GetMapping("/cliente/obtener")
    public List<Cliente> obtenerClientes(){
        return this.clienteServiceImpl.obtenerClientes();
    }
    
    @GetMapping("/cliente/buscar")
    public Cliente buscarCliente(@RequestParam long idCliente) {
        return this.clienteServiceImpl.buscarCliente(idCliente);
    }
    
    
}
