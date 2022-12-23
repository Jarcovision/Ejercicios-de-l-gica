package ejerciciosLogica6;

import java.util.Scanner;

public class Texto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase.");
		String texto = scanner.nextLine();
		StringBuilder textoInv = new StringBuilder(texto);
		
		for (int i = textoInv.length()-1; i>=0; i--) {
			System.out.print(texto.charAt(i));
		}
	}

}
