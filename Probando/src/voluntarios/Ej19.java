package voluntarios;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		/*19. Realiza un programa que lea un n�mero y a continuaci�n escriba el car�cter "*" tantas veces
		igual al valor num�rico le�do. En aquellos casos en que el valor le�do no sea positivo se deber�
		escribir un �nico asterisco.*/
		
		int num;
		int cont=0;
		System.out.print("Introduce un n�mero: ");
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
