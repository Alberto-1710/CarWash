package hn.unah.lenguajes1900.carwash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.entities.Vehiculos;
import hn.unah.lenguajes1900.carwash.services.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/carwash")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    
    @PostMapping("/vehiculo/crear")
    public Vehiculos crearVehiculos(@RequestBody Vehiculos vehiculos) {    
        return this.vehiculoServiceImpl.crearVehiculos(vehiculos);
    }

    @GetMapping("/vehiculo/obtener")
    public List<Vehiculos> obtenerClientes(){
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }
    
    @GetMapping("/vehiculo/buscar")
    public Vehiculos buscarCliente(@RequestParam long idVehiculo) {
        return this.vehiculoServiceImpl.buscarVehiculo(idVehiculo);
    }
}
