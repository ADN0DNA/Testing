package Ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce precio del articulo");
		int precio;
		int descuento;
		int precioreal;
		int total;
		int last;
		Scanner pin=new Scanner(System.in);
		precio=pin.nextInt();
		System.out.println("Introduce precio real");
		precioreal=pin.nextInt();
		total=precioreal-precio;
		last=precioreal/total;
		descuento=100/last;
		
		System.out.println(descuento);
		
		
	}

}
