package voluntarios;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// 16. Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
		
		System.out.println("Elige un numero");
		int num;
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		
		if (num==2 ||num==3||num==5||num==7||num==11||num==13) {
			System.out.println(num + "  es primo");
		}
		
		else if (num%2==0) {
			System.out.println(num + " no es primo");
			
		}
		else if (num%3==0) {
			System.out.println(num + " no es primo");
			
		}
		else if (num%5==0) {
			System.out.println(num + " no es primo");
		}
		else if (num%7==0) {
		System.out.println(num + " no es primo");
		}
		else if (num%11==0) {
			System.out.println(num + " no es primo");
			}
		else if (num%13==0) {
			System.out.println(num + " no es primo");
			}
		else {
			System.out.println(num + " es primo");
		}
		
		
	}

}
