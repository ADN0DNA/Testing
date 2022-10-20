package voluntarios;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		/*19. Realiza un programa que lea un número y a continuación escriba el carácter "*" tantas veces
		igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
		escribir un único asterisco.*/
		
		int num;
		int cont=0;
		System.out.print("Introduce un número: ");
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		while (cont!=num&&num>0) {
			System.out.print("* ");
			cont++;
		}
		if (num<0) {
			System.out.print("* ");
		}
	}

}
