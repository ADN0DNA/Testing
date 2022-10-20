package voluntarios;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/* 15. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
		introducimos por teclado.
		*/
		
		System.out.println("Inserta un numero mayor que tres");
		int num;
		int cont=0;
		int pos=1;
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		if (num<3) {
			System.out.println( num +" no es mayor a 3");
		}
		else {
			while (pos*3<=num) {
				pos++;
				cont++;
			}
			System.out.println(cont + " es el numero de multiplos de 3 entre el 1 y "+ num);
		}
		
	}

}
