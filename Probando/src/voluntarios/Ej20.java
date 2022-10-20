package voluntarios;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		/* 20. Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
		los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su
		valor. 
		*/
		int num;
		int cont=1;
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		
		System.out.println(cont);
		for (cont=2;cont<=num;cont++) {
			for (int fix=2;fix<=cont;fix++) {
				System.out.print(cont);
			}
			System.out.println(cont);
			
			
		}
		
	}

}
