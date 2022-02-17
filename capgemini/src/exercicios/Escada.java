package exercicios;

import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//registrar o número de degraus
		System.out.println("Quantos degraus tem a escada?");
		int n = input.nextInt();
		
		//caractere
		String string = "*";
		
		//construção da escada
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print('\u00a0');
			}
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print(string);
			}
			System.out.println();
		}
		
		input.close();
		
	}

}