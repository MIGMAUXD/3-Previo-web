package com.api.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.hotel.entities.Huesped;
import com.api.hotel.repository.HuespedRepository;

@Service
public class HuespedService {

	@Autowired
	private HuespedRepository huespedRepository;

	
	public List<Huesped> getAllHuespedes() {
		return huespedRepository.findAll();
	}

	public Huesped createHuesped(Huesped huesped) {
		return huespedRepository.save(huesped);
	}

	public Huesped updateHuesped(Huesped huesped) {
		return huespedRepository.save(huesped);
	}

	public void deleteHuespedById(Long id) {
		huespedRepository.deleteById(id);
	}

}
