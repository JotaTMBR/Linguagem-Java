package br.com.projeto.testeinicio.dao.teste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import br.com.projeto.testeinicio.dao.DAOPessoa;
import br.com.projeto.testeinicio.domain.Pessoa;


public class TesteDAOPessoa {
	
	@Test
	public void testSalvar() {
		DAOPessoa dp = new DAOPessoa();
		Pessoa pe = new Pessoa();
		pe.setId(50);
		pe.setNome("Márcia");
		pe.setEmail("marcia@hotmail.com");
		
		String rs = dp.salvar(pe);
		
		Assertions.assertEquals("Seus dados foram recebidos", rs);
		Assertions.assertEquals("Os campos devem ser preenchidos", rs);
	}
}
