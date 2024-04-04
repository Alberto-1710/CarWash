package hn.unah.lenguajes1900.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.entities.Vehiculos;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculos, Long> {
    
}
