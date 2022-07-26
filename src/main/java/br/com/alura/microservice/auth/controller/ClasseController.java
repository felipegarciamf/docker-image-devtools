package br.com.alura.microservice.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.auth.service.IServico;

@RestController
@RequestMapping("/legal")
public class ClasseController {

	
	@Autowired
	private IServico iServico;
	
	
	@GetMapping
	public void teste() {
		
		iServico.vamosLa();
		System.out.println("testamos");
		System.out.println("do que voce acha que fez");
		System.out.println("vai que vai fiote de atum");
		
	}
	
	
}
