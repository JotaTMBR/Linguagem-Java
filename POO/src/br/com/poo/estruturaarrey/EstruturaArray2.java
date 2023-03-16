package br.com.poo.estruturaarrey;

public class EstruturaArray2 {

	public static void main(String[] args) {
		
		int[] numeros = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
		
		for(int i = 0 ; i < numeros.length ; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}
	}

}
