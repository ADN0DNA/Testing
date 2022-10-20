package En_clase;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// 4 Sumar los números comprendidos entre dos números dados por el usuario

	int num1;
	int cont=0;
		
		Scanner pin=new Scanner(System.in);
		System.out.println("Pon un numero");
		num1=pin.nextInt();
		int num2;
		
		System.out.println("Pon otro numero");
		num2=pin.nextInt();
		
		while (num1<num2) {
			cont=cont+num1;
			System.out.println(cont);
			num1++;
			
			
		}
	}

}
