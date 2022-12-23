package ejerciciosLogica9;

import java.util.HashMap;
import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) {
		try (
		Scanner scanner = new Scanner(System.in)) {
			HashMap<String, String> Palabras = new HashMap<>();
			Palabras.put("Perro", "Dog");
			Palabras.put("Gato", "Cat");
			Palabras.put("Agua", "Water");
			Palabras.put("Jugo", "Juice");
			Palabras.put("Flor", "Flower");
			Palabras.put("Viento", "Wind");
			Palabras.put("Sol", "Sun");
			Palabras.put("Césped", "Grass");
			Palabras.put("Nadar", "Swim");
			Palabras.put("Árbol", "Tree");
			Palabras.put("Libro", "Book");
			Palabras.put("Cuaderno", "Notenook");
			Palabras.put("Imprimir", "Print");
			Palabras.put("Zapato", "Show");
			Palabras.put("Mano", "Hand");
			Palabras.put("Mango", "Mango");
			Palabras.put("Oso", "Bear");
			Palabras.put("Rompecabezas", "Puzzle");
			Palabras.put("Serpiente", "Snake");
			Palabras.put("Cama", "Bed");
			Palabras.put("Tenedor", "Fork");
			Palabras.put("Globo", "Balloon");
			Palabras.put("Hielo", "Ice");
			Palabras.put("Chocolate", "Chocolate");
			Palabras.put("Dark", "Oscuro");
			
			String trans = "";
			System.out.println("Introduce una palabra en español para traducirla a inglés."  + trans);
			trans = scanner.nextLine();
			trans = trans.toLowerCase();
			
			if(Palabras.containsKey(trans)) {
				String diccionario = Palabras.get(trans).toString();
				//System.out.println(traduccion.toLowerCase());
				System.out.println("Su traducción es: "  + diccionario);
			}else {
				System.out.println("Palabra desconocida.");
				
			}
		}	
		
	}
}
