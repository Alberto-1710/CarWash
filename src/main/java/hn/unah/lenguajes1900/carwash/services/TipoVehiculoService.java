package hn.unah.lenguajes1900.carwash.services;

import hn.unah.lenguajes1900.carwash.entities.TipoVehiculo;

public interface TipoVehiculoService {
    
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    public String eliminarPorId(long idTipoVehiculo);
    
}
