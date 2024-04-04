package hn.unah.lenguajes1900.carwash.services;


import java.util.List;

import hn.unah.lenguajes1900.carwash.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente buscarCliente(long idCliente);
    

}
