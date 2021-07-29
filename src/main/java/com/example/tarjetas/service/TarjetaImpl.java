package com.example.tarjetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.example.tarjetas.dao.TarjetaDAO;
import com.example.tarjetas.entity.Tarjetas;


@Service
public class TarjetaImpl implements ITarjeta {
	/*@Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private TarjetaDAO tarjetaDAO;

	@Override
	public List<Tarjetas> obtenerTarjetas() {
		// TODO Auto-generated method stub
		return (List<Tarjetas>)tarjetaDAO.findAll();
	}
}
