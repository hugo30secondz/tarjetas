package com.example.tarjetas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.example.tarjetas.entity.Tarjetas;

public interface TarjetaDAO extends JpaRepository<Tarjetas, Long>{

}
