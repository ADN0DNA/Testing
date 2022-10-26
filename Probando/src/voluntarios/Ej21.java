package voluntarios;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		/* 21. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
		los números desde A hasta B e indicar cuantos hay que sean pares.
		*/
		System.out.println("Dime un numero: ");
		int num1;
		int num2;
		int par=0;
		int cont;
		Scanner pin=new Scanner(System.in);
		num1=pin.nextInt();
		System.out.println("Dime otro numero mayor que el anterior: ");
		num2=pin.nextInt();
		for (cont=num1;cont<=num2;cont++) {
		System.out.print(cont + " ");
			if (cont%2==0) {
			par++;
			}
		}
		System.out.println("La cantidad de pares son: "+par);
	}

}
