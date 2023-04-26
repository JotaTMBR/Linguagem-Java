package br.com.projeto.testeinicio.dao;

import br.com.projeto.testeinicio.domain.Pessoa;

public class DAOPessoa {
	
	/**
	 * 
	 * @param pessoa
	 * @return Retorna uma de 2 frases: Os campos devem ser preenchidos ou Seus dados foram recebidos
	 */
	public String salvar(Pessoa pessoa) {
		String msg = "";
		
		if(pessoa.getId()<1 || pessoa.getNome().equals("") || pessoa.getEmail().equals("")) {
			msg = "Os campos devem ser preenchidos";
		}
		else {
			msg = "Seus dados foram recebidos";
		}
		
		return msg;
	}
	public Pessoa pessoaAtualizada(Pessoa pessoa) {
		Pessoa pe = pessoa;
		
		if(pe.getId()<1||pe.getNome().equals("")||pe.getEmail().equals("")) {
			new Exception("Preencha todos os campos");
		}
		return pe;
	}
	
}
