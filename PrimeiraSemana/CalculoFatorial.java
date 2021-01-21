package PrimeiraSemana;
import java.util.Scanner;
public class CalculoFatorial {

	public static void main(String[] args) {
		// Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.

		Scanner in = new Scanner(System.in);

        System.out.println("Digite o número que você deseja saber o fatorial");
        int valor = in.nextInt();
        int resultado = 1;

        while (valor > 1) {
            resultado = resultado * valor;
            valor--;
        }

        System.out.println(resultado);

        in.close();
	}

}
