package exercicios;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		String senha;
	
		System.out.print("Por favor, digite sua senha: ");
		senha = input.nextLine();
		
		int senhaRestante = 6 - senha.length();
		
		if (senhaValida(senha) == true) {
			System.out.println("Sua senha é forte!");
		}
		else  {
			System.out.println("Senha fraca, adicione mais " + senhaRestante + " caractere(s).");
		}
		
		input.close();
	}
	
	public static boolean senhaValida(String senha) {
		
		boolean validarTamanho = false;
		
		//define o tamanho da senha
		if (senha.length() >= 6) {
			validarTamanho = true;
		}
		
		return validarTamanho;
		
	}
	
}