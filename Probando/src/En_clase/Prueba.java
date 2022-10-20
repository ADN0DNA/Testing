package En_clase;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		
		//pide numeros al usuario hasta que ponga un 0 muestra la suma
		
		
		int num=0;
		int sum=0;
		System.out.println("Pon un numero");
		
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		
		while (num!=0) {
			System.out.println("Pon un numero");
			num=pin.nextInt();
			
			num=pin.nextInt();
			
		}
		
		
	}
	
	

}
