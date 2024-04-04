package hn.unah.lenguajes1900.carwash.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.entities.Cliente;
import hn.unah.lenguajes1900.carwash.repositories.ClienteRepository;
import hn.unah.lenguajes1900.carwash.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
       return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente buscarCliente(long idCliente) {
        if(this.clienteRepository.findById(idCliente).isPresent()){
            return this.clienteRepository.findById(idCliente).get();
        }
        return null;
        
    }
    


    
}
