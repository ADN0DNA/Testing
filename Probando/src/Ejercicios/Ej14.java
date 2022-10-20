package Ejercicios;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe un número");
		int num1;
		Scanner pin=new Scanner(System.in);
		num1=pin.nextInt();
		System.out.println("Escribe otro número");
		int num2;
		num2=pin.nextInt();
		
		if (num1==num2) {
			System.out.println(num1 +" es igual que "+ num2);
		}
		else if (num1<num2) {
			System.out.println(num2 + " es mayor");
		}
		else {
			System.out.println(num1 +" es mayor");
		}
	
	}
	

}
