package ejerciciosLogica8;

import java.util.Scanner;

public class NumerosPrimos {
	public static void main (String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 boolean primo;
		 int contador = 0;
		 int cantidad;
		 int[] numero = new int[100];

		        System.out.print("Introduce cuántos números primos quieres obtener entre 1 y 100.");
		        cantidad = scanner.nextInt();     
		        scanner.close();

		        for (int n = 2; contador < cantidad; n ++) {
		            primo = true;
		            for (int i = 2; i <= Math.sqrt(n) && primo; i ++) {
		                if ((n % i) == 0) {
		                    primo = false;
		                }
		            }
		            
		        if (primo) {
		           numero[contador] = n;
		           contador ++;
		            } 
		        }

		        System.out.println("Lista descendente de números primos:");
		        for (int n = contador - 1; n >= 0; n --) {
		            System.out.println(n + 1 + "º: " + numero[n]);
		        }
		    }
	
}
