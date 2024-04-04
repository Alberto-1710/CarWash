package hn.unah.lenguajes1900.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.entities.TipoCliente;

@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente, Long>{

    void save(String crearTipoCliente);

}
