package com.banco.consultaprecio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.consultaprecio.model.ConsultaPrecioRq;
import com.banco.consultaprecio.model.ConsultaPrecioRs;
import com.banco.consultaprecio.service.ConsultaPrecioImpl;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	ConsultaPrecioImpl consultaPrecioService;

	@PostMapping(path = "/consultaPrecio", produces = MediaType.APPLICATION_JSON_VALUE)
	public ConsultaPrecioRs consultaValorMoneda(@RequestBody final ConsultaPrecioRq request) {

		ConsultaPrecioRs result = new ConsultaPrecioRs();

		try {
			String monto = consultaPrecioService.getValormoneda(request);
			result.setMonto(monto);
		} catch (Exception e) {
			return null;
		}

		return result;
	}

}
