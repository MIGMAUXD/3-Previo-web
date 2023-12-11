package com.api.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.hotel.entities.Huesped;

public interface HuespedRepository extends JpaRepository<Huesped, Long> {

}
