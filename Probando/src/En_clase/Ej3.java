package En_clase;
import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		// 3 Pedir dos números al usuario, comprobar que el num1 < num2 y sacar por pantalla los numero comprendidos entre ambos
		
		int num1;
		
		Scanner pin=new Scanner(System.in);
		System.out.println("Pon un numero");
		num1=pin.nextInt();
		int num2;
		
		System.out.println("Pon otro numero");
		num2=pin.nextInt();
		
		for (num1=num1;num1<num2;++num1) {
			
			System.out.println(num1);
			
			
		}
		
	}

}
