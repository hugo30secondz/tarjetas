package com.example.tarjetas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.tarjetas.entity.Tarjetas;
import com.example.tarjetas.service.TarjetaImpl;

@RestController
public class TarjetaController {
	
	@Autowired 
	TarjetaImpl tarjetaService;
	
	@GetMapping("/obtener-tarjetas")
	public List<Tarjetas> obtenerTarjetas(){
		return tarjetaService.obtenerTarjetas();
	}

}
