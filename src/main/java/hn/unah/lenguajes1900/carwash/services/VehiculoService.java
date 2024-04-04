package hn.unah.lenguajes1900.carwash.services;

import java.util.List;

import hn.unah.lenguajes1900.carwash.entities.Vehiculos;

public interface VehiculoService {
    
    public Vehiculos crearVehiculos(Vehiculos vehiculos);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos buscarVehiculo(long idVehiculo);
}
