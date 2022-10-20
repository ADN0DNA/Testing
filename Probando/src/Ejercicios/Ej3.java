package Ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("escribe la longitud del lado de un cuadrado (solo numeros)");
		int lado;
		int area;
		Scanner num=new Scanner(System.in);
		lado=num.nextInt();
		area=lado*lado;
		System.out.println("el area del cuadrado es "+ area);
		
		
	}

}
