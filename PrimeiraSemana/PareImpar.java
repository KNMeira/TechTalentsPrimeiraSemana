package PrimeiraSemana;
import java.util.Scanner;
public class PareImpar {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia um n�mero inteiro e diga se ele � par ou �mpar.

		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		System.out.println("Digite um n�mero");
		
		if(numero % 2 == 0 ) {
			System.out.println("� um n�mero par");
		}else {
			System.out.println("� um n�mero �mpar");
		}
		in.close();
	}
	

}
