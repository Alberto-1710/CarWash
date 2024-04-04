package hn.unah.lenguajes1900.carwash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.entities.TipoVehiculo;
import hn.unah.lenguajes1900.carwash.services.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/carwash")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;
    
    
    @PostMapping("/tipovehiculo/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {    
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }

    @DeleteMapping("/tipovehiculo/eliminar/{idTipoVehiculo}")
    public String eliminarPorId(@PathVariable long idTipoVehiculo) {    
        return this.tipoVehiculoServiceImpl.eliminarPorId(idTipoVehiculo);
    }
    
}
