package br.com.poo.estruturaif;

import java.util.Scanner;

public class Estruturaif1 {
	public static void main(String args[]) {
		System.out.println("================ Valor Par ou Impar =================");
		System.out.println("\nEntre com um valor Numerico:");
		// declaração da variavel
		int numero;
		// Permite a entrada de dados via teclado pelo terminal
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		
		// vamos testar se o numero digitado é par ou impar
		if(numero % 2 == 0) {
			System.out.println("O numero: "+numero+" é Par");
	
		}
		else {
			System.out.println("O numero: "+numero+" é Impar");
		}
		
	}
}
