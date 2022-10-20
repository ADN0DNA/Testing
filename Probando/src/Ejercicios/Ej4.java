package Ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inserta un número");
		int num1;
		int num2;
		int sum;
		int mul;
		int div;
		int res;
		Scanner pin=new Scanner(System.in);
		num1=pin.nextInt();
		System.out.println("Pon otro número");
		num2=pin.nextInt();
		res=num1-num2;
		sum=num1+num2;
		div=num1/num2;
		mul=num1*num2;
		System.out.println("sumando "+ sum+ " restando "+ res + " multiplicando "+ mul + " dividiendo "+ div );
		
		
		
		
	}

}
