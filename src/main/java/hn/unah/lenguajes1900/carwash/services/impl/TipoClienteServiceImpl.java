package hn.unah.lenguajes1900.carwash.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.entities.TipoCliente;
import hn.unah.lenguajes1900.carwash.repositories.TipoClienteRepository;
import hn.unah.lenguajes1900.carwash.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nvoTipoCliente = new TipoCliente();
        nvoTipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(nvoTipoCliente);
        
    }

    
}
