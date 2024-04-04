package hn.unah.lenguajes1900.carwash.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.entities.Vehiculos;
import hn.unah.lenguajes1900.carwash.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.carwash.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculos crearVehiculos(Vehiculos vehiculos) {
        return this.vehiculoRepository.save(vehiculos);
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
        return (List<Vehiculos>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculos buscarVehiculo(long idVehiculo) {
        if(this.vehiculoRepository.findById(idVehiculo).isPresent()){
            return this.vehiculoRepository.findById(idVehiculo).get();
        }
        return null;
    }
}
