package hn.unah.lenguajes1900.carwash.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.entities.TipoVehiculo;
import hn.unah.lenguajes1900.carwash.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes1900.carwash.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{
    
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarPorId(long idTipoVehiculo) {
        if(this.tipoVehiculoRepository.findById(idTipoVehiculo).isPresent()){
            this.tipoVehiculoRepository.deleteById(idTipoVehiculo);
        return "Tipo Vehiculo eliminado exitosamente.";
        }
        return "Tipo de Vehiculo que desea eliminar no existe.";
            }
}
