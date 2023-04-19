package br.com.poo.objetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Processos {

	public static void main(String[] args) {
		
		try {
			/*
			 * O comando process executa um comando do sistema operacional,
			 * neste caso o sistema é no Windows.
			 * O comando Runtime(Tempo de Execução) getRuntime(Chamar para Executar)
			 * são utilizados para executar um comando do sistema operacional. E, este
			 * comando será executado quando a aplicação do java for executada(Runtime).
			 * Abaixo estamos abrindo a calculadora.
			 * */
			Process pr = Runtime.getRuntime().exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe http://127.0.0.1:8888");
			/*
			 * O comando BefferReader(a classe BufferReader) é um leitor que trabalha
			 * com os dados de memória. Elee é responsável para ler os dados em memória.
			 * Abaixo é feita uma inserção de leitura de dados com o comando 
			 * InputStreamReader(Inserir um dado de leitura). Neste caso, foi inserido e 
			 * lido o processo que executa o comando que abre a calculadora
			 * */
			BufferedReader leitor = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			/*
			 * Para exibir as informações retornadas pelo Buffer, podemos usar uma variável no formato 
			 * de String para armazenar estas informações e depois exibi-las. 
			 *  */
			String rs = "";
			/*
			 * Para pegar todos os dados em memória e exibir em tela, foi utilizado o comando while e os 
			 * dados foram passados para a variável rs.
			 * Assim foi possível exibir no console.
			 * */
			while((rs = leitor.readLine())!= null){
				System.out.println(rs);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
