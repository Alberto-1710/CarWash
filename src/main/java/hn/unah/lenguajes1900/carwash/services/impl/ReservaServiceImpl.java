package hn.unah.lenguajes1900.carwash.services.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.entities.Reserva;
import hn.unah.lenguajes1900.carwash.entities.Vehiculos;
import hn.unah.lenguajes1900.carwash.repositories.ReservaRepository;
import hn.unah.lenguajes1900.carwash.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.carwash.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public String crearReserva(long idCliente, long idVehiculo, long dias) {
        Vehiculos vehiculos = vehiculoRepository.findById(idVehiculo).get();

        if(vehiculos.isDisponible()){
        Reserva nvaReserva = new Reserva();
        nvaReserva.setIdCliente(idCliente);
        nvaReserva.setIdVehiculo(idVehiculo);
        nvaReserva.setFecha(LocalDate.now());
        nvaReserva.setDias(dias);
        nvaReserva.setTotal(vehiculos.getTipoVehiculo().getPrecioXhora()*24*dias);
        this.reservaRepository.save(nvaReserva);
        vehiculos.setDisponible(false);
        vehiculoRepository.save(vehiculos);
        return "Su reserva se realizó exitosamente.";
        }
        return "Vehiculo esta rentado.";

    }
    
}
