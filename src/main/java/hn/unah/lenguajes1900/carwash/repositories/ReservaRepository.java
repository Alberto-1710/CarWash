package hn.unah.lenguajes1900.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.entities.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Long> {
    
}
