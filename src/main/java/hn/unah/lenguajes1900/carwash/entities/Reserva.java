package hn.unah.lenguajes1900.carwash.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reserva")
@Data
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private long idReserva;

    @Column(name = "idcliente")
    private long idCliente;

    @Column(name = "idvehiculo")
    private long idVehiculo;

    private LocalDate fecha;

    private long dias;

    private double total;
}
