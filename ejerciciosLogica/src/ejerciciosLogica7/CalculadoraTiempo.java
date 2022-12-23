package ejerciciosLogica7;

import java.util.Scanner;

public class CalculadoraTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scannerDia = new Scanner(System.in);
		System.out.println("Introduce el día de la semana en el que te encuentras: " +
							"\nLunes: 1" + "\nMartes: 2" + "\nMiércoles: 3" + 
							"\nJueves: 4" + "\nViernes: 5");
		
		int dia = scannerDia.nextInt();
		
		Scanner scannerHora = new Scanner(System.in);
		System.out.println("Introduce una hora en formato de 24 hrs.");
		int hora = scannerHora.nextInt();
		
		Scanner scannerMin = new Scanner(System.in);
		System.out.println("Introduce los minutos.");
		int min = scannerMin.nextInt();
		
		
		if (dia == 1) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Lunes y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 2) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Martes y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 3) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Miércoles y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 4) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Jueves y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 5) {
			int resultado = (6660 - ((4 * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Viernes y los minutos que restan hasta el fin de semana son:" + resultado);
		} else {
			System.out.println("Ingresa una opción valida :3");
		}	
	}
}

