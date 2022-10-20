package Ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe tu edad");
		int edad;
		Scanner pin=new Scanner(System.in);
		edad=pin.nextInt();
		if (edad<18) {
			System.out.println("Eres menor de edad");
			
		}
		else {
			System.out.println("Eres mayor de edad");
			
		}
		
	}

	
}
