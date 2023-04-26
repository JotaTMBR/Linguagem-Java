package com.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.domain.Usuario;
import com.projeto.repository.UsuarioRepository;

@RestController
public class PrimeiroController {
	
	@Autowired
	private UsuarioRepository ur;
	
	@GetMapping("/projeto/banco/listar")
	public List<Usuario> mensagem() {
		return ur.findAll();
	}
	@PostMapping("/projeto/banco/cadastrar")
	public String cadastro(@RequestBody Usuario dados) {
		String msg = "cadastrou";
		Usuario nome = ur.save(dados);
		return msg +" "+nome.getNomeusuario();
	}
}
