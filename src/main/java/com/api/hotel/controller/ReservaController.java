package com.api.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.hotel.entities.Reserva;
import com.api.hotel.service.ReservaService;

@RestController
@RequestMapping("hotel/reservas")
public class ReservaController {

	@Autowired
	private ReservaService serviceR;

	// GET
	@GetMapping
	public List<Reserva> listarTodo() {
		return serviceR.getAllReservas();
	}

	// POST
	@PostMapping
	public Reserva crear(@RequestBody Reserva reserva) {
		return serviceR.createReserva(reserva);
	}

	// PUT
	@PostMapping("editar/{id}")
	public Reserva actualizar(@RequestBody Reserva reserva, @PathVariable Long id) {
		reserva.setId(id);
		return serviceR.updateReserva(reserva);
	}

	// DELETE
	@DeleteMapping("eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		serviceR.deleteReservaById(id);
	}

}
