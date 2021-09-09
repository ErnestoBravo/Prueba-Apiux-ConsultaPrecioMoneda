package com.banco.consultaprecio.service;

import org.springframework.stereotype.Service;

import com.banco.consultaprecio.model.ConsultaPrecioRq;

@Service
public class ConsultaPrecioImpl  implements IConsultaPrecio{

	
	public String getValormoneda(ConsultaPrecioRq request) {
		
		String valor = "0";
		
		if (request.getCode().equals("USD")) {
			valor = "789";
		}else if (request.getCode().equals("EUR")) {
			valor = "957";
		}else {
			valor = "666";
		}
		
		return valor;
	}
	
}
