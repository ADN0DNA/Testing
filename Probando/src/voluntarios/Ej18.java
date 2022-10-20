package voluntarios;

public class Ej18 {

	public static void main(String[] args) {
		//18.Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números naturales.
		
		int cont=1;
		int sum=0;
		int mul;
		while (cont<=5) {
			mul=cont*cont;
			sum=sum+mul;
			cont++;
			
		}
		System.out.println(sum);
	}

}
