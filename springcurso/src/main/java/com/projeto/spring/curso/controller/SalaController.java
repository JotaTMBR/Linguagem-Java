package com.projeto.spring.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring.curso.domain.Sala;
import com.projeto.spring.curso.repository.SalaRepository;

@RestController
public class SalaController {
	
	@Autowired
	private SalaRepository sr;
	
	@GetMapping("/sala/listar")
	public List<Sala> listar(){
		return sr.findAll();
	}
	@GetMapping("/sala/listar/{id}")
	public Optional<Sala> listar(@PathVariable Long id){
		return sr.findById(id);
	}
	
	@PostMapping("/sala/cadastrar")
	public String cadastrar(@RequestBody Sala sala) {
		sr.save(sala);
		return "Adicionado";
	}
	@PutMapping("/sala/atualizar/{id}")
	public String atualizar(@PathVariable Long id, @RequestBody Sala sala) {
		String msg = "";
		Optional<Sala> s = sr.findById(id);
		
		if(s.isPresent()) {
			sala.setIdsala(id);
			sr.save(sala);
			msg = "Sala Atualizada";
		}
		else {
			msg = "Sala não Encontrada";
		}
		return msg;
	}
	
	@DeleteMapping("/sala/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		String msg = "";
		Optional<Sala> s = sr.findById(id);
		
		if(s.isPresent()) {
			sr.deleteById(id);
			msg = "Sala Apagada";
		}
		else {
			msg = "Sala não Encontrada";
		}
		return msg;
	}

}
