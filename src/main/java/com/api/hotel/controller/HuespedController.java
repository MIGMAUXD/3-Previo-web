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

import com.api.hotel.entities.Huesped;
import com.api.hotel.service.HuespedService;

@RestController
@RequestMapping("hotel/huespedes")
public class HuespedController {

	@Autowired
	private HuespedService huespedService;

	@GetMapping
	public List<Huesped> listarTodo() {
		return huespedService.getAllHuespedes();
	}

	@PostMapping
	public Huesped crear(@RequestBody Huesped huesped) {

		return huespedService.createHuesped(huesped);
	}

	@PostMapping("editar/{id}")
	public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Long id) {
		huesped.setId(id);
		return huespedService.updateHuesped(huesped);
	}

	@DeleteMapping("eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		huespedService.deleteHuespedById(id);
	}

}
