package PrimeiraSemana;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		// area do ret�ngulo

				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Esse algoritimo calcular� �rea de um ret�ngulo");
				
				System.out.print("Digite a base do ret�ngulo:");
				
				double base = scanner.nextFloat();
				
				System.out.print("Digite a altura do ret�ngulo:");
				double altura = scanner.nextFloat();
				
				double area = base * altura;
				
				System.out.print("A �rea do ret�ngulo �: " + area);
				
				scanner.close();

	}

}
