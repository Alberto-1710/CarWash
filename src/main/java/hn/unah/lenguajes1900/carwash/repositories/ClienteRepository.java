package hn.unah.lenguajes1900.carwash.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import hn.unah.lenguajes1900.carwash.entities.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
    
}
