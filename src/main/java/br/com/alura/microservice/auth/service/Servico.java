package br.com.alura.microservice.auth.service;

import org.springframework.stereotype.Service;

@Service
public class Servico implements IServico {

	@Override
	public void vamosLa() {
		System.out.println("o mano falou merda");
		System.out.println("live reload nao funciona");
	}

}

