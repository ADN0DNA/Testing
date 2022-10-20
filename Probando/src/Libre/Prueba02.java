package Libre;

import java.util.Scanner;

public class Prueba02 {
	public static void main(String[] args) {
		// 
		System.out.println("escribe numero");
		int num;
		int cont;
		int mul=1;
		Scanner pin=new Scanner(System.in);
		num=pin.nextInt();
		
		for(cont=1;cont<=10;cont++) {
			mul=cont*num;
			System.out.println(mul);
		}
		
	}

}



