package hn.unah.lenguajes1900.carwash.entities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tipovehiculo")
@Data
public class TipoVehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipovehiculo")
    private long idTipoVehiculo;

    private String descripcion;

    @Column(name = "precioxhora")
    private double precioXhora;

    @OneToMany(mappedBy = "tipoVehiculo")
    @JsonIgnore
    private List<Vehiculos> vehiculos;

}
