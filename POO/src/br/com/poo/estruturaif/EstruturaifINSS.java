package br.com.poo.estruturaif;

import java.util.Scanner;

public class EstruturaifINSS {
	
	public static void main(String[] args) {
		double salario,desconto;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de salário: ");
		salario = entrada.nextDouble();
		
		if(salario <= 1302.00) {
			desconto = (7.5 * salario) / 100;
		}
		else if(salario <= 2571.29) {
			desconto = (9 * salario) / 100;
		}
		else if(salario <= 3856.94) {
			desconto = (12 * salario) / 100;
		}
		else if(salario <= 7507.49) {
			desconto = (14 * salario) / 100;
		}
		else {
			desconto = (14 * 7507.49) / 100;
		}
		
		System.out.println("\nO desconto do salário é de R$"+desconto);
		
	}

}
