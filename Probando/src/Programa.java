import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		//esto es un comentario de una línea
		/*y esto
		  de dos lineas*/
		final float pi=(float) 3.14;

		/*byte edad=20;
		char letra;
		letra='a';
		System.out.println("I'm " +args[0] + " " +args[1] +" "+edad);
		*/
		/*
		byte dias=20;
		int salario=1200;
		boolean a=false;
		boolean b=false;
		System.out.println(a||b);
		System.out.println(a&&b);
		System.out.println(!a);
		System.out.println(salario>dias);
		System.out.println(salario+=dias);
		System.out.println(salario);
		System.out.println(Math.pow (2,64));
		System.out.println("escribe y salta linea");
		System.out.print("otra \n");
		System.out.println("sin ln");
		System.out.println("ahora \"salta\" otra");
		*/
		
		System.out.println("dame tu edad");
		byte edad;
		byte nuevo=0;
		Scanner teclado=new Scanner(System.in);
		edad=teclado.nextByte();
		System.out.println("has introducido " + edad);
		if (edad>18)
			{
				System.out.println("eres mayor");
			}
		else
			{
			System.out.println("eres menor, te quedan " + (18-edad) + " años");
			if (edad<5)
			{
				System.out.println("eres infantil");	
			}
			
			}
		
		
	}

}