package br.com.poo.estruturaif;

import java.util.Scanner;

public class Estruturaif3 {
	
	public static void main(String[] args) {
		double nota1,nota2,nota3,nota4,media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota:");
		nota1 = entrada.nextDouble();
		
		System.out.println("\nDigite a segunda nota:");
		nota2 = entrada.nextDouble();
		
		System.out.println("\nDigite a terceira nota:");
		nota3 = entrada.nextDouble();
		
		System.out.println("\nDigite a quarta nota:");
		nota4 = entrada.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\nA Media do aluno é "+media);
		
		if(media >= 7) {
			System.out.println("\nAprovado");
		}
		else if(media <= 4) {
			System.out.println("\nReprovado");
		}
		else {
			System.out.println("\nRecuperação");
		}
		
	}

}
