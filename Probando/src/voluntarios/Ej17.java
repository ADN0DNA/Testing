package voluntarios;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		/*17. Realiza un programa que lea y acepte �nicamente aquellos que sean mayores que el �ltimo
dado. La introducci�n de n�meros finaliza con la introducci�n de un 0. Al final se mostrar�:
El total de n�meros introducidos, excluido el 0.
El total de n�meros fallados.
*/
		
		//num=2 ant=1
		System.out.print("Escribe el primer n�mero: ");
		
		int num;
		int ant;
		int cont=0;
		int fallo=0;
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		
		while (num!=0) {
			ant=num;
			System.out.print("Escribe un numero: ");
			cont++;
			num=pin.nextInt();
			if (num<ant&&num!=0) {
				System.out.println("Fallo es menor");
				fallo++;
			}
		}
		System.out.println("Total de numeros introducidos: "+cont);
		System.out.println("N�meros fallados: "+fallo);
	}

}
