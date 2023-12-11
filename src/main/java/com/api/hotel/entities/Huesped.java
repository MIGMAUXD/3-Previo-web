package com.api.hotel.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Huesped {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	    private String nombre;
	    private String apellido;
	    private String fechaNacimiento;
	    private String nacionalidad;
	    private String telefono;

	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Reserva> reservas = new ArrayList<>();

}
