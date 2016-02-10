import java.util.Scanner;

public class trabajoenclase6_4
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int factorial, valor;
		System.out.print("Ingrese un valor: ");
		valor=teclado.nextInt();
		factorial=1;

		for (int x=1; x<=valor; x++) {
			factorial=factorial*x;

			x=x+1;
		}
		System.out.print("el factorial de los numeros ingresados es: ");
		System.out.println(factorial);
	}
}