package PrimeiraSemana;
import java.util.Scanner;
public class PareImpar {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		System.out.println("Digite um número");
		
		if(numero % 2 == 0 ) {
			System.out.println("É um número par");
		}else {
			System.out.println("É um número ímpar");
		}
		in.close();
	}
	

}
